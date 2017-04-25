package com.mumsched.us.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.mumsched.us.domain.User;

public interface UserDao extends  JpaRepository<User, Long> {

}
