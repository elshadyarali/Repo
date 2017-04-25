package com.mumsched.us.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mumsched.us.domain.Faculty;
import com.mumsched.us.repository.FacultyDao;

@Service
public class FacultyServiceImpl implements FacultyService{

	  @Autowired
		 FacultyDao facultydao;
	     
		@Override
		public void createFaculty(Faculty faculty) {

	      facultydao.save(faculty);
			
		}

		@Override
		public Faculty getFaculty(Long id) {
			
			return facultydao.findOne(id);
		}

		@Override
		public List<Faculty> getAllFacultys() {
			
			return facultydao.findAll();
		}

		@Override
		public void updateFaculty(Faculty faculty) {
			facultydao.save(faculty);
			
		}

		@Override
		public void deleteFaculty(Long id) {
			facultydao.delete(id);
			
		}

}
