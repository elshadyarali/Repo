package com.mumsched.cs.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mumsched.cs.Repository.ScheduleDao;
import com.mumsched.cs.domains.Schedule;
@Service
public class ScheduleServiceImpl implements ScheduleService {
	   @Autowired
		ScheduleDao dao;
		@Override
		public void createNewSchedule(Schedule schedule) {

	   dao.save(schedule);
			
		}

		@Override
		public Schedule getSchedule(Long id) {

	        return  dao.findOne(id);


		}

		@Override
		public List<Schedule> getAllSchedules() {
			
			return dao.findAll();
		}

		@Override
		public void updateSchedule(Schedule schedule) {
			
			dao.save(schedule);
		}

		@Override
		public void deleteSchedule(Long id) {
			
			dao.delete(id);
		}

}
