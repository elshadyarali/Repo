package com.mumsched.cs.services;

import java.util.List;

import com.mumsched.cs.domains.Schedule;

public interface ScheduleService {
	 void createNewSchedule(Schedule schedule);
		Schedule getSchedule(Long id);
		List<Schedule> getAllSchedules();
		void updateSchedule(Schedule schedule);
		void deleteSchedule(Long id);
}
