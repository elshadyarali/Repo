package com.mumsched.us.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mumsched.us.domain.Student;



public interface StudentDao extends  JpaRepository<Student, Long> {

}
