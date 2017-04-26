package com.mumsched.cs.services;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mumsched.cs.Repository.BlockDao;
import com.mumsched.cs.Repository.CourseDao;
import com.mumsched.cs.Repository.SectionDao;
import com.mumsched.cs.domains.Block;
import com.mumsched.cs.domains.Course;
import com.mumsched.cs.domains.Section;
@Service
public class SectionServiceImpl implements SectionService {
   @Autowired
	SectionDao dao;
   @Autowired
    CourseDao cdao;
   @Autowired
    BlockDao bdao;
   
   
	public void createNewSection(Section section) {

     dao.save(section);
		
	}


	public Section getSection(Long id) {

        return  dao.findOne(id);


	}

	
	public List<Section> getAllSections() {
		
		return dao.findAll();
	}

	
	public void updateSection(Section section) {
		
		dao.save(section);
	}

	
	public void deleteSection(Long id) {
		
		dao.delete(id);
	}


	@Override
	public void createNewSection(Section section, Long courseId, Long blockId) {
		Course course=cdao.findOne(courseId);
		Block block=bdao.findOne(blockId);
		
		section.setCourse(course);
		section.setBlock(block);
		dao.save(section);
	}


	@Override
	public List<Section> getSectionBycourse(Long id) {

        
		return cdao.findOne(id).getSectionList();
      
        
	}


	@Override
	public List<Section>  getSectionByBlock(Long id) {
		
		return bdao.findOne(id).getSections();
		
	}


	@Override
	public List<Section> getSectionByFaculId(Long id) {
		// TODO Auto-generated method stub
		return dao.findByFacultyId(id);
	}




	
}
