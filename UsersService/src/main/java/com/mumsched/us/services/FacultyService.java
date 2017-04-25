package com.mumsched.us.services;

import java.util.List;

import com.mumsched.us.domain.Faculty;

public interface FacultyService {

	void createFaculty(Faculty faculty);
	Faculty getFaculty(Long id);
	List<Faculty> getAllFacultys();
	void updateFaculty(Faculty faculty);
	void deleteFaculty(Long id);
	
}
