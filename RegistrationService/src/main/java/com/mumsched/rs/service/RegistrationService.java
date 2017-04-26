package com.mumsched.rs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.mumsched.rs.Config;
import com.mumsched.rs.domain.JsonData;
import com.mumsched.rs.domain.Student;


@Component
public class RegistrationService {

	@Autowired
	RestTemplate restTemplate; 
	
  public void registrar(JsonData data){
		
      
		
		  Student student = restTemplate.getForObject(Config.usServiceURL+"/students/get/"+data.getStudentId(), Student.class);	
	      student.setEnrolledSections(data.getSections());
		  restTemplate.put(Config.usServiceURL+"/students/update", student,Student.class);  
		   
		
	  
	}
	
}
