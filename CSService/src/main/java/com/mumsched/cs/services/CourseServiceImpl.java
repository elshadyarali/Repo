package com.mumsched.cs.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mumsched.cs.Repository.CourseDao;
import com.mumsched.cs.domains.Block;
import com.mumsched.cs.domains.Course;
import com.mumsched.cs.domains.Section;
@Service
public class CourseServiceImpl implements CourseService {
   @Autowired
	CourseDao dao;
	@Override
	public void createNewCourse(Course course) {

   dao.save(course);
		
	}

	@Override
	public Course getCourse(Long id) {

        return  dao.findOne(id);


	}

	@Override
	public List<Course> getAllCourses() {
		
		return dao.findAll();
	}

	@Override
	public void updateCourse(Course course) {
		
		dao.save(course);
	}

	@Override
	public void deleteCourse(Long id) {
		
		dao.delete(id);
	}

	@Override
	public List<Long> getTargetBlocks(Long id) {
		// TODO Auto-generated method stub
		return dao.getOne(id).getBlockList();
	}

	@Override
	public List<Section> getSections(Long id) {
		// TODO Auto-generated method stub
		return dao.findOne(id).getSectionList();
	}

	
}
