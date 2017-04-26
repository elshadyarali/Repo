package com.mumsched.rs;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mumsched.rs.domain.JsonData;
import com.mumsched.rs.service.RegistrationService;


@RestController
public class RestEndpoint {
    @Autowired
	RegistrationService service;
	
	 @RequestMapping(value="/register",method = RequestMethod.POST)
	  ResponseEntity<?> getEntry(@RequestBody JsonData data){
		  
          service.registrar(data);

		  return new ResponseEntity<>(HttpStatus.OK);
		  
	  }	
}
