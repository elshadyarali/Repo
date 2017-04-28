package com.mumsched.se.services;

import static org.assertj.core.api.Assertions.linesOf;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.apache.http.HttpStatus;
import org.bouncycastle.crypto.paddings.ZeroBytePadding;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.mumsched.se.Config;
import com.mumsched.se.domain.Block;
import com.mumsched.se.domain.Course;
import com.mumsched.se.domain.Entry;
import com.mumsched.se.domain.Faculty;
import com.mumsched.se.domain.Section;
import com.mumsched.se.entity.Schedule;
import com.mumsched.se.repository.ScheduleDao;

@Service
public class ScheduleServiceImpl implements ScheduleService {
	@Autowired
	ScheduleDao dao;
	@Autowired
	RestTemplate restTemplate;

	@Override
	public Schedule createNewSchedule(Schedule schedule) {

		return dao.save(schedule);

	}

	@Override
	public Schedule getSchedule(Long id) {

		return dao.findOne(id);
	}

	@Override
	public List<Schedule> getAllSchedules() {

		return dao.findAll();
	}

	@Override
	public void updateSchedule(Schedule schedule) {

		dao.save(schedule);
	}

	@Override
	public void deleteSchedule(Long id) {

		dao.delete(id);
	}
	
	
	 public boolean generateSchedule(Long entryId){
		
		 // Get domains from db
		   Entry entry = restTemplate.getForObject(Config.csServiceURL+"/entrys/get/"+entryId, Entry.class);	 
		   List<Block> blockList=entry.getBlockList();
		   
		   List<Course> coursesForBlock;
		   Course[] courseList =restTemplate.getForObject(Config.csServiceURL+"courses", Course[].class);
		   Faculty[] facultyList =restTemplate.getForObject(Config.usServiceURL+"faculties", Faculty[].class);
		   Schedule sch=new Schedule();sch.setEntry(entryId);sch.setName(entry.getName()+" schedule");
		   Schedule sched=createNewSchedule(sch);
		   
		   
		   // blocks 
		   blockList.stream().forEach(b->{
			   int  totalStudents=entry.getTotalMPPStudents();
			   if(b.getSeqNumber()!=1) totalStudents=+entry.getTotalFPPStudents();
			 
			   
			   //find all courses
			 List<Course> blockCourses= Arrays.stream(courseList).filter(c->
                        c.getBlockList().stream().anyMatch(x->x.equals(b.getId()))
                  ).collect(Collectors.toList());
			
			 //System.out.println(blockCourses);
			
			  ///////////////
		        //courses
				blockCourses.forEach(bc->{
				List<Faculty>facList= Arrays.stream(facultyList).filter(f->f.getSpecializedCourses()
						 .stream().anyMatch(x->x.equals(bc.getId()))
						 ).collect(Collectors.toList());
				
				//get available faculties
				List<Faculty> electedFacResult=facList.stream().filter(l->l.getAvailableBlocks().stream()
						.anyMatch(bl->bl.equals(b.getId()))).collect(Collectors.toList());
                     
				Optional<Faculty> selectedFac=  electedFacResult.stream().findAny();
				
				if(selectedFac.isPresent())
					 {
				//  declare  Sectiion object	
				Section sec= new Section();sec.setScheduleVersion(sched.getId());
				sec.setBlock(b); sec.setCourse(bc);sec.setFacultyId(selectedFac.get().getId());
				sec.setCapacity(bc.getSectionDefaultCapasity());
				restTemplate.postForObject(Config.csServiceURL+"sections/add", 
						
						sec,Section.class);
				
				
				}
				
				
				
				bc.setFacultyList(electedFacResult);
		        System.out.println(b.getId()+"---+"+electedFacResult);
					});
			   
				b.setCourses(blockCourses);
				//createNewSchedule(new Schedule(entryId));
			});
          
		   
		   
		   
		   
		 
		// System.out.println(entry);
		 
	
		 
		return false; 
	 }
	 
	 
	 
	
	
	
	
	
	
	
	
	

}
