package com.mumsched.se.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;



public class Section {
	
	private Long id;
	
	
	
	private  Course course;

	private  Block block;
	
	
	private Long FacultyId;
	
	
	private int  capacity;
	
	private int enrolled;

	private Long scheduleVersion;
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public Block getBlock() {
		return block;
	}

	public void setBlock(Block block) {
		this.block = block;
	}

	public Long getFacultyId() {
		return FacultyId;
	}

	public void setFacultyId(Long facultyId) {
		FacultyId = facultyId;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public int getEnrolled() {
		return enrolled;
	}

	public void setEnrolled(int enrolled) {
		this.enrolled = enrolled;
	}

	public Long getScheduleVersion() {
		return scheduleVersion;
	}

	public void setScheduleVersion(Long long1) {
		this.scheduleVersion = long1;
	}
}
