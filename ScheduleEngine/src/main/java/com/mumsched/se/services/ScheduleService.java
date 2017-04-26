package com.mumsched.se.services;

import java.util.List;

import com.mumsched.se.entity.Schedule;


public interface ScheduleService {
	Schedule createNewSchedule(Schedule schedule);
		Schedule getSchedule(Long id);
		List<Schedule> getAllSchedules();
		void updateSchedule(Schedule schedule);
		void deleteSchedule(Long id);
		boolean generateSchedule(Long entryId);
}
