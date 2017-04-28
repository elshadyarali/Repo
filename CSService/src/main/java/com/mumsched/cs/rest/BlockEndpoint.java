package com.mumsched.cs.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mumsched.cs.domains.Block;
import com.mumsched.cs.services.BlockService;
@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class BlockEndpoint {
	@Autowired
	  BlockService service;

	 
	  @RequestMapping(value="/blocks/get/{blockid}",method = RequestMethod.GET)
	  ResponseEntity<?> getBlock(@PathVariable("blockid") Long id){
		  
		  return new ResponseEntity<>(service.getBlock(id),HttpStatus.OK);
		  
	  }	
      
	  @RequestMapping(value="/blocks/get/{blockid}/entry",method = RequestMethod.GET)
	  ResponseEntity<?> getEntryByBlock(@PathVariable("blockid") Long id){
		  
		  return new ResponseEntity<>(service.getEntry(id),HttpStatus.OK);
		  
	  }	
	  
	  
	  
	  
	  @RequestMapping(value="/blocks",method = RequestMethod.GET)
	  ResponseEntity<List<Block>> getBlocks(){
		  //System.out.println(id);
		  return new ResponseEntity<>(service.getAllBlocks(),HttpStatus.OK);
		  
	  }
	  

	  
	  @RequestMapping(value="/blocks/add",method = RequestMethod.POST,consumes="application/json")
	  ResponseEntity<?>  setBlock(@RequestBody Block block) {
		
		service.createNewBlock(block);
		   return new ResponseEntity<>(HttpStatus.CREATED);
	  }
	
	  
	  
	  
	  @RequestMapping(value="/blocks/update",method = RequestMethod.PUT,consumes="application/json")
	  ResponseEntity<?>  updateBlock(@RequestBody Block block) {
		
		service.updateBlock(block);
		return new ResponseEntity<>( HttpStatus.OK);
	  }
	  
	  
	  
	  @RequestMapping(value="/blocks/delete/{blockid}",method = RequestMethod.DELETE)
	  ResponseEntity<?>  deleteBlock(@PathVariable("blockid") Long id){
		  //System.out.println(id);
		   service.deleteBlock(id);
		   return new ResponseEntity<>(HttpStatus.OK);
	  }	
	
}
