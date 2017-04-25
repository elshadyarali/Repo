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

import com.mumsched.us.domain.User;
import com.mumsched.us.services.UserService;


@RestController
public class UserEndpoint {

	
	
	
	  @Autowired
	  UserService service;

	 
	  @RequestMapping(value="/users/get/{userid}",method = RequestMethod.GET)
	  ResponseEntity<User> getUser(@PathVariable("userid") Long id){
		  
		  return new ResponseEntity<>(service.getUser(id),HttpStatus.OK);
		  
	  }
	  
	    
	  @RequestMapping(value="/users",method = RequestMethod.GET)
	  ResponseEntity<List<User>> getUsers(){
		  //System.out.println(id);
		  return new ResponseEntity<>(service.getAllUsers(),HttpStatus.OK);
		  
	  }
	
	  
	  
	  @RequestMapping(value="/users/add",method = RequestMethod.POST,consumes="application/json")
	  ResponseEntity<?>  setUser(@RequestBody User user) {
		
		service.createUser(user);
		   return new ResponseEntity<>(HttpStatus.CREATED);
	  }
	  
	
	  @RequestMapping(value="/users/update",method = RequestMethod.PUT,consumes="application/json")
	  ResponseEntity<?>  updateUser(@RequestBody User user) {
		
		service.updateUser(user);
		return new ResponseEntity<>( HttpStatus.OK);
	  }
	  
	  
	  
	  @RequestMapping(value="/users/delete/{userid}",method = RequestMethod.DELETE)
	  ResponseEntity<?>  deleteUser(@PathVariable("userid") Long id){
		  //System.out.println(id);
		   service.deleteUser(id);
		   return new ResponseEntity<>(HttpStatus.OK);
	  }	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
