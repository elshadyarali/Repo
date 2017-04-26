package com.mumsched.cs.Repository;



	import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.mumsched.cs.domains.Section;

	public interface SectionDao  extends  JpaRepository<Section, Long> {

		@Query("select u from Section u where u.FacultyId = ?1")
		 List<Section> findByFacultyId(Long id);
	}
	

