package com.mumsched.cs.Repository;



	import org.springframework.data.jpa.repository.JpaRepository;

	import com.mumsched.cs.domains.Course;
import com.mumsched.cs.domains.Section;

	public interface SectionDao  extends  JpaRepository<Section, Long> {

	}
	

