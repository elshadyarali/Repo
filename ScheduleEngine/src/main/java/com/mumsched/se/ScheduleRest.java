package com.mumsched.se;

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

import com.mumsched.se.entity.Schedule;
import com.mumsched.se.services.ScheduleService;



@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class ScheduleRest {
      @Autowired
	  ScheduleService service;
	
	
	  @RequestMapping(value="/schedule/generate/{entryId}",method = RequestMethod.GET)
	  ResponseEntity<?> generateSchedule(@PathVariable("entryId") Long entryId){
		    service.generateSchedule(entryId);
		  return new ResponseEntity<>(HttpStatus.OK);
	 }
	  
	  
	  
	  @RequestMapping(value="/schedules/get/{scheduleid}",method = RequestMethod.GET)
	  ResponseEntity<Schedule> getSchedule(@PathVariable("scheduleid") Long id){
		  
		  return new ResponseEntity<>(service.getSchedule(id),HttpStatus.OK);
		  
	  }
	  
	    
	  @RequestMapping(value="/schedules",method = RequestMethod.GET)
	  ResponseEntity<List<Schedule>> getSchedules(){
		  //System.out.println(id);
		  return new ResponseEntity<>(service.getAllSchedules(),HttpStatus.OK);
		  
	  }
	
	  
	  
	  @RequestMapping(value="/schedules/add",method = RequestMethod.POST,consumes="application/json")
	  ResponseEntity<?>  setSchedule(@RequestBody Schedule schedule) {
		
		service.createNewSchedule(schedule);
		   return new ResponseEntity<>(HttpStatus.CREATED);
	  }
	  
	
	  @RequestMapping(value="/schedules/update",method = RequestMethod.PUT,consumes="application/json")
	  ResponseEntity<?>  updateSchedule(@RequestBody Schedule schedule) {
		
		service.updateSchedule(schedule);
		return new ResponseEntity<>( HttpStatus.OK);
	  }
	  
	  
	  
	  @RequestMapping(value="/schedules/delete/{scheduleid}",method = RequestMethod.DELETE)
	  ResponseEntity<?>  deleteSchedule(@PathVariable("scheduleid") Long id){
		  //System.out.println(id);
		   service.deleteSchedule(id);
		   return new ResponseEntity<>(HttpStatus.OK);
	  }
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
}
