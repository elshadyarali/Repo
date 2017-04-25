package com.mumsched.cs.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mumsched.cs.domains.Course;

public interface CourseDao extends  JpaRepository<Course, Long> {

}
