package com.mumsched.us.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mumsched.us.domain.Student;
import com.mumsched.us.services.StudentService;

@RestController
public class StudentEndpoint {

	
	

	
	
	
	  @Autowired
	  StudentService service;

	 
	  @RequestMapping(value="/students/get/{studentid}",method = RequestMethod.GET)
	  ResponseEntity<Student> getStudent(@PathVariable("studentid") Long id){
		  
		  return new ResponseEntity<>(service.getStudent(id),HttpStatus.OK);
		  
	  }
	  
	    
	  @RequestMapping(value="/students",method = RequestMethod.GET)
	  ResponseEntity<List<Student>> getStudents(){
		  //System.out.println(id);
		  return new ResponseEntity<>(service.getAllStudents(),HttpStatus.OK);
		  
	  }
	
	  
	  
	  @RequestMapping(value="/students/add",method = RequestMethod.POST,consumes="application/json")
	  ResponseEntity<?>  setStudent(@RequestBody Student student) {
		
		service.createStudent(student);
		   return new ResponseEntity<>(HttpStatus.CREATED);
	  }
	  
	
	  @RequestMapping(value="/students/update",method = RequestMethod.PUT,consumes="application/json")
	  ResponseEntity<?>  updateStudent(@RequestBody Student student) {
		
		service.updateStudent(student);
		return new ResponseEntity<>( HttpStatus.OK);
	  }
	  
	  
	  
	  @RequestMapping(value="/students/delete/{studentid}",method = RequestMethod.DELETE)
	  ResponseEntity<?>  deleteStudent(@PathVariable("studentid") Long id){
		  //System.out.println(id);
		   service.deleteStudent(id);
		   return new ResponseEntity<>(HttpStatus.OK);
	  }	
	
	
	
}
