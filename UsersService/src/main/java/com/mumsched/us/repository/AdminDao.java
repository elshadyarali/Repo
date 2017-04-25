package com.mumsched.us.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mumsched.us.domain.Admin;


public interface AdminDao extends  JpaRepository<Admin, Long> {

}
