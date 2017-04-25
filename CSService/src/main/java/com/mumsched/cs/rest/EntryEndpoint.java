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

import com.mumsched.cs.domains.Entry;
import com.mumsched.cs.services.EntryService;

@RestController
public class EntryEndpoint {
	@Autowired
	  EntryService service;

	 
	  @RequestMapping(value="/entrys/get/{entryid}",method = RequestMethod.GET)
	  ResponseEntity<Entry> getEntry(@PathVariable("entryid") Long id){
		  
		  return new ResponseEntity<>(service.getEntry(id),HttpStatus.OK);
		  
	  }	

	  
	  @RequestMapping(value="/entrys/get/{entryid}/blocks",method = RequestMethod.GET)
	  ResponseEntity<?> getBlocks(@PathVariable("entryid") Long id){
		  
		  return new ResponseEntity<>(service.getBlocks(id),HttpStatus.OK);
		  
	  }
	  
	  
	  @RequestMapping(value="/entrys",method = RequestMethod.GET)
	  ResponseEntity<List<Entry>> getEntrys(){
		  //System.out.println(id);
		  return new ResponseEntity<>(service.getAllEntrys(),HttpStatus.OK);
		  
	  }
	  

	  
	  @RequestMapping(value="/entrys/add",method = RequestMethod.POST,consumes="application/json")
	  ResponseEntity<?>  setEntry(@RequestBody Entry entry) {
		
		service.createNewEntry(entry);
		   return new ResponseEntity<>(HttpStatus.CREATED);
	  }
	  
	  
	  
	  @RequestMapping(value="/entrys/update",method = RequestMethod.PUT,consumes="application/json")
	  ResponseEntity<?>  updateEntry(@RequestBody Entry entry) {
		
		service.updateEntry(entry);
		return new ResponseEntity<>( HttpStatus.OK);
	  }
	  
	  
	  
	  @RequestMapping(value="/entrys/delete/{entryid}",method = RequestMethod.DELETE)
	  ResponseEntity<?>  deleteEntry(@PathVariable("entryid") Long id){
		  //System.out.println(id);
		   service.deleteEntry(id);
		   return new ResponseEntity<>(HttpStatus.OK);
	  }	
	
}
