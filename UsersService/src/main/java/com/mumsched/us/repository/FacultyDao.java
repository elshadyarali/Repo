package com.mumsched.us.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mumsched.us.domain.Faculty;


public interface FacultyDao extends  JpaRepository<Faculty, Long>{

}
