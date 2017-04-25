package com.mumsched.cs.rest;
import java.io.IOException;
import java.net.URI;
import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.mumsched.cs.domains.Course;
import com.mumsched.cs.services.CourseService;
@RestController
public class CourseEndpoint {

	  @Autowired
	  CourseService service;

	 
	  @RequestMapping(value="/courses/get/{courseid}",method = RequestMethod.GET)
	  ResponseEntity<Course> getCourse(@PathVariable("courseid") Long id){
		  
		  return new ResponseEntity<>(service.getCourse(id),HttpStatus.OK);
		  
	  }
	  
	  
	  @RequestMapping(value="/courses/get/{courseid}/sections",method = RequestMethod.GET)
	  ResponseEntity<?> getSections(@PathVariable("courseid") Long id){
		  
		  return new ResponseEntity<>(service.getSections(id),HttpStatus.OK);
		  
	  }	
	  
	  @RequestMapping(value="/courses",method = RequestMethod.GET)
	  ResponseEntity<List<Course>> getCourses(){
		  //System.out.println(id);
		  return new ResponseEntity<>(service.getAllCourses(),HttpStatus.OK);
		  
	  }
	
	  
	  
	  @RequestMapping(value="/courses/add",method = RequestMethod.POST,consumes="application/json")
	  ResponseEntity<?>  setCourse(@RequestBody Course course) {
		
		service.createNewCourse(course);
		   return new ResponseEntity<>(HttpStatus.CREATED);
	  }
	  
	  @RequestMapping(value="/courses/add/{preregId}/coursedata",method = RequestMethod.POST,consumes="application/json")
	  ResponseEntity<?>  setCourse(@RequestBody Course course,@PathVariable("preregId") Long id) {
		
		    Course prereqCourse= service.getCourse(id) ; 
			course.setPreReqCourId(prereqCourse);
		    service.createNewCourse(course);
		
		
		   return new ResponseEntity<>(HttpStatus.CREATED);
	  }
	  
	  
	  
	  
	  
	  
	  
	  @RequestMapping(value="/courses/add/{courseid}/targetblocks",method = RequestMethod.GET)
	  ResponseEntity<?> setTargetBlocks(@PathVariable("courseid") Long id){
		  
		  /////  ADD 
		  
		  
		  return new ResponseEntity<>(null,HttpStatus.OK);
		  
	  }	
	  
	  @RequestMapping(value="/courses/update",method = RequestMethod.PUT,consumes="application/json")
	  ResponseEntity<?>  updateCourse(@RequestBody Course course) {
		
		service.updateCourse(course);
		return new ResponseEntity<>( HttpStatus.OK);
	  }
	  
	  
	  
	  @RequestMapping(value="/courses/delete/{courseid}",method = RequestMethod.DELETE)
	  ResponseEntity<?>  deleteCourse(@PathVariable("courseid") Long id){
		  //System.out.println(id);
		   service.deleteCourse(id);
		   return new ResponseEntity<>(HttpStatus.OK);
	  }	
	
}
