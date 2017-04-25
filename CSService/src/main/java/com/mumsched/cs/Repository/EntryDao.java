package com.mumsched.cs.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mumsched.cs.domains.Course;
import com.mumsched.cs.domains.Entry;

public interface EntryDao extends  JpaRepository<Entry, Long>  {

}
