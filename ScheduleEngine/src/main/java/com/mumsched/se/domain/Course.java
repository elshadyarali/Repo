package com.mumsched.se.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;


public class Course {

	

	private Long id;
	

	private String courseCode; 
	
	
	private String courseName; 
	

	private Course preReqCourId;
	
	int  sectionSize=1;
	public int getSectionSize() {
		return sectionSize;
	}

	public void setSectionSize(int sectionSize) {
		this.sectionSize = sectionSize;
	}
	private int SectionDefaultCapasity; 
	
	
	public int getSectionDefaultCapasity() {
		return SectionDefaultCapasity;
	}

	public void setSectionDefaultCapasity(int sectionDefaultCapasity) {
		SectionDefaultCapasity = sectionDefaultCapasity;
	}
	@JsonIgnore
    List<Long>targetblocks;
	
	@JsonIgnore
	List<Section>sectionList;
	
	@JsonIgnore
	List<Faculty>facultyList;
	
	public List<Faculty> getFacultyList() {
		return facultyList;
	}

	public void setFacultyList(List<Faculty> facultyList) {
		this.facultyList = facultyList;
	}

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

	public List<Long> getBlockList() {
		return targetblocks;
	}

	
	@Override
	public String toString() {
		return "Course [id=" + id + ", courseCode=" + courseCode + ", courseName=" + courseName + ", preReqCourId="
				+ preReqCourId + ", targetblocks=" + targetblocks + ", sectionList=" + sectionList + "]";
	}

	public void setBlockList(List<Long> blockList) {
		this.targetblocks = blockList;
	}

	public List<Section> getSectionList() {
		return sectionList;
	}

	public void setSectionList(List<Section> sectionList) {
		this.sectionList = sectionList;
	}
	
	
}
