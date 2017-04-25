package com.mumsched.us.domain;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;


@Entity
@Inheritance(strategy=InheritanceType.JOINED)
public class User {

	@Id
	@GeneratedValue
public 	 Long id;
public 	 String loginId;
	
public	 String firstName;
	
public	 String lastName;
	
public	 String email;
	
	
public	 String  role;
}
