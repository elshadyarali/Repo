package com.mumsched.us.rest;

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

import com.mumsched.us.domain.User;
import com.mumsched.us.services.UserService;


@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class UserEndpoint {

	
	
	
	  @Autowired
	  UserService service;

	  @RequestMapping(value="/users/login/{loginId}/{password}",method = RequestMethod.GET)
	  ResponseEntity<User> login(@PathVariable("loginId") String loginId,@PathVariable("password") String password){
		  
		  User user=service.login(loginId, password);
		  if(user !=null) 
			  return new ResponseEntity<>(user,HttpStatus.OK);
		  return new ResponseEntity<>(null,HttpStatus.BAD_REQUEST);
		  
	  }
	  @RequestMapping(value="/users/get/{userid}",method = RequestMethod.GET)
	  ResponseEntity<User> getUser(@PathVariable("userid") Long id){
		  
		  return new ResponseEntity<>(service.getUser(id),HttpStatus.OK);
		  
	  }
/*	  @RequestMapping(value="/users/get/byloginid/{loginId}",method = RequestMethod.GET)
	  ResponseEntity<User> getUserByLogin(@PathVariable("loginId") String id){
		  
		  return new ResponseEntity<>(service.getUserbyLoginId(id),HttpStatus.OK);
		  
	  }*/
	    
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
