package com.mumsched.rs.domain;

import java.util.List;

public class JsonData {

	private Long studentId;
	
	private List<Long> sections;
	
	
	
	public Long getStudentId() {
		return studentId;
	}

	public void setStudentId(Long studentId) {
		this.studentId = studentId;
	}

	public List<Long> getSections() {
		return sections;
	}

	public void setSections(List<Long> sections) {
		this.sections = sections;
	}


	
}
