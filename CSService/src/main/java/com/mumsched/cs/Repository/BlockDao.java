package com.mumsched.cs.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mumsched.cs.domains.Block;
import com.mumsched.cs.domains.Course;

public interface  BlockDao extends JpaRepository<Block, Long>  {

}
