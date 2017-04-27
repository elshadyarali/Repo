package com.mumsched.rs.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.mumsched.rs.Config;
import com.mumsched.rs.domain.Course;
import com.mumsched.rs.domain.JsonData;
import com.mumsched.rs.domain.Student;
import com.mumsched.rs.domain.Section;

@Component
public class RegistrationService {

	@Autowired
	RestTemplate restTemplate; 
	
  public void registrar(JsonData data){
		
      
		//get Student
		  Student student = restTemplate.getForObject(Config.usServiceURL+"/students/get/"+data.getStudentId(), Student.class);	
	      
		  List<Section> sectionList= new ArrayList();
		  //Get Sections
		  data.getSections().stream().forEach(x->{
			  Section section = restTemplate.getForObject(Config.csServiceURL+"/sections/get/"+x, Section.class);	
			
			 if( checkSectionAvalability(section,student))
			 {
				 student.setEnrolledSections(data.getSections());
				 restTemplate.put(Config.usServiceURL+"/students/update", student,Student.class);
				 section.setEnrolled(section.getEnrolled()+1);
				 restTemplate.put(Config.csServiceURL+"/sections/update", section,Student.class);
				 
			 }
			  
			  });
		  
		 
	}
	
  boolean checkSectionAvalability(Section section,Student student){
	 
	  //Check seats availability 
	 if( (section.getCapacity()- section.getEnrolled())>0){
		   

		/*   //check prepreq course if taken or enrolled 
		   if(section.getCourse().getPreReqCourId()!=null)
		   if(courseCheck(student.getTakenSections(), section.getCourse().getPreReqCourId()))
		      if( courseCheck(student.getEnrolledSections(), section.getCourse().getPreReqCourId()))*/
		         return true;
	 }
	  
  return false;
  }
  
   boolean  courseCheck(List<Long> sectionIdList, Course course){
	  
	   for(Long id:sectionIdList){
	   Section section = restTemplate.getForObject(Config.csServiceURL+"/sections/get/"+id, Section.class);
	  if( section.getCourse().getId()==course.getId())
	  { return false;}
	   }
	  return true; 
   }
  
}
  

