package com.mumsched.rs.domain;

import java.util.List;


import com.fasterxml.jackson.annotation.JsonIgnore;

public class Course {

	
	
	private Long id;
	
	
	private String courseCode; 
	
	
	private String courseName; 
	
	
	private int SectionDefaultCapasity; 
	
	
	public int getSectionDefaultCapasity() {
		return SectionDefaultCapasity;
	}

	public void setSectionDefaultCapasity(int sectionDefaultCapasity) {
		SectionDefaultCapasity = sectionDefaultCapasity;
	}

	private Course preReqCourId;
	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCourseCode() {
		return courseCode;
	}

	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public Course getPreReqCourId() {
		return preReqCourId;
	}

	public void setPreReqCourId(Course preReqCourId) {
		this.preReqCourId = preReqCourId;
	}


	
	
}
