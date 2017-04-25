package com.mumsched.us.services;

import java.util.List;

import com.mumsched.us.domain.Student;


public interface StudentService {

	void createStudent(Student student);
	Student getStudent(Long id);
	List<Student> getAllStudents();
	void updateStudent(Student student);
	void deleteStudent(Long id);
	
}
