package com.mumsched.us.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.mumsched.us.domain.User;

public interface UserDao extends  JpaRepository<User, Long> {

	@Query("select u from User u where u.loginId=?1 ")
	User findByLoginId(String Id);
}
