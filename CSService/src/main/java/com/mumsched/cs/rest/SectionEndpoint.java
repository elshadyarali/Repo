package com.mumsched.cs.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mumsched.cs.domains.Section;
import com.mumsched.cs.services.SectionService;
@RestController
public class SectionEndpoint {
	 @Autowired
	  SectionService service;

	 
	  @RequestMapping(value="/sections/get/{sectionid}",method = RequestMethod.GET)
	  ResponseEntity<Section> getSection(@PathVariable("sectionid") Long id){
		  
		  return new ResponseEntity<>(service.getSection(id),HttpStatus.OK);
		  
	  }	
	  
	  
	  @RequestMapping(value="/sections/get/bycourse/{courseid}",method = RequestMethod.GET)
	  ResponseEntity<List<Section>> getSectionBycourse(@PathVariable("courseid") Long id){
		  
		  return new ResponseEntity<>(service.getSectionBycourse(id),HttpStatus.OK);
		  
	  }
	  
	  @RequestMapping(value="/sections/get/byblock/{blockid}",method = RequestMethod.GET)
	  ResponseEntity<List<Section>> getSectionByBlock(@PathVariable("blockid") Long id){
		  
		  return new ResponseEntity<>(service.getSectionByBlock(id),HttpStatus.OK);
		  
	  }
	  
	  @RequestMapping(value="/sections/get/byfaculty/{facultyId}",method = RequestMethod.GET)
	  ResponseEntity<List<Section>> getSectionByfaculty(@PathVariable("facultyId") Long id){
		  
		  return new ResponseEntity<>(service.getSectionByFaculId(id),HttpStatus.OK);
		  
	  }
	  
	  
	  
	  

	  @RequestMapping(value="/sections",method = RequestMethod.GET)
	  ResponseEntity<List<Section>> getSections(){
		  //System.out.println(id);
		  return new ResponseEntity<>(service.getAllSections(),HttpStatus.OK);
		  
	  }
	  

	  
	  @RequestMapping(value="/sections/add/{courseId}/{blockId}/section",method = RequestMethod.POST,consumes="application/json")
	  ResponseEntity<?>  setSection(@RequestBody Section section,
			  @PathVariable("courseId") Long courseId,@PathVariable("blockId") Long blockId) {
		
		service.createNewSection(section,courseId,blockId);
		   return new ResponseEntity<>(HttpStatus.CREATED);
	  }
	  
	  @RequestMapping(value="/sections/add",method = RequestMethod.POST,consumes="application/json")
	  ResponseEntity<?>  setSection(@RequestBody Section section) {
		
		service.createNewSection(section);
		   return new ResponseEntity<>(HttpStatus.CREATED);
	  }
	  
	  
	  @RequestMapping(value="/sections/update",method = RequestMethod.PUT,consumes="application/json")
	  ResponseEntity<?>  updateSection(@RequestBody Section section) {
		
		service.updateSection(section);
		return new ResponseEntity<>( HttpStatus.OK);
	  }
	  
	  
	  
	  @RequestMapping(value="/sections/delete/{sectionid}",method = RequestMethod.DELETE)
	  ResponseEntity<?>  deleteSection(@PathVariable("sectionid") Long id){
		  //System.out.println(id);
		   service.deleteSection(id);
		   return new ResponseEntity<>(HttpStatus.OK);
	  }
}
