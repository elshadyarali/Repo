package com.mumsched.se.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mumsched.se.entity.Schedule;


public interface ScheduleDao extends  JpaRepository<Schedule, Long> {

}
