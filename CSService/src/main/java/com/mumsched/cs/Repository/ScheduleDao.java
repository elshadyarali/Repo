package com.mumsched.cs.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mumsched.cs.domains.Entry;
import com.mumsched.cs.domains.Schedule;

public interface ScheduleDao extends  JpaRepository<Schedule, Long> {

}
