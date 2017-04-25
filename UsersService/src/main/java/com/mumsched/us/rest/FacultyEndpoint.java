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

import com.mumsched.us.domain.Faculty;
import com.mumsched.us.services.FacultyService;
@RestController
public class FacultyEndpoint {


	
	
	
	  @Autowired
	  FacultyService service;

	 
	  @RequestMapping(value="/faculties/get/{facultyid}",method = RequestMethod.GET)
	  ResponseEntity<Faculty> getFaculty(@PathVariable("facultyid") Long id){
		  
		  return new ResponseEntity<>(service.getFaculty(id),HttpStatus.OK);
		  
	  }
	  
	    
	  @RequestMapping(value="/faculties",method = RequestMethod.GET)
	  ResponseEntity<List<Faculty>> getFacultys(){
		  //System.out.println(id);
		  return new ResponseEntity<>(service.getAllFacultys(),HttpStatus.OK);
		  
	  }
	
	  
	  
	  @RequestMapping(value="/faculties/add",method = RequestMethod.POST,consumes="application/json")
	  ResponseEntity<?>  setFaculty(@RequestBody Faculty faculty) {
		
		service.createFaculty(faculty);
		   return new ResponseEntity<>(HttpStatus.CREATED);
	  }
	  
	
	  @RequestMapping(value="/faculties/update",method = RequestMethod.PUT,consumes="application/json")
	  ResponseEntity<?>  updateFaculty(@RequestBody Faculty faculty) {
		
		service.updateFaculty(faculty);
		return new ResponseEntity<>( HttpStatus.OK);
	  }
	  
	  
	  
	  @RequestMapping(value="/faculties/delete/{facultyid}",method = RequestMethod.DELETE)
	  ResponseEntity<?>  deleteFaculty(@PathVariable("facultyid") Long id){
		  //System.out.println(id);
		   service.deleteFaculty(id);
		   return new ResponseEntity<>(HttpStatus.OK);
	  }	
	
	
	
}
