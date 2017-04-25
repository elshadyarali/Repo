package com.mumsched.us.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mumsched.us.domain.Student;
import com.mumsched.us.repository.StudentDao;

@Service
public class StudentServiceImpl implements StudentService{
	  @Autowired
		 StudentDao studentdao;
	     
		@Override
		public void createStudent(Student student) {
           
	      studentdao.save(student);
			
		}

		@Override
		public Student getStudent(Long id) {
			
			return studentdao.findOne(id);
		}

		@Override
		public List<Student> getAllStudents() {
			
			return studentdao.findAll();
		}

		@Override
		public void updateStudent(Student student) {
			studentdao.save(student);
			
		}

		@Override
		public void deleteStudent(Long id) {
			studentdao.delete(id);
			
		}

}
