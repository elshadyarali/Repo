package com.mumsched.cs.domains;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Course {

	
	@Id
	@GeneratedValue
	private Long id;
	
	@Column(nullable = false)
	private String courseCode; 
	
	@Column(nullable = false)
	private String courseName; 
	
	
	private int SectionDefaultCapasity; 
	
	
	public int getSectionDefaultCapasity() {
		return SectionDefaultCapasity;
	}

	public void setSectionDefaultCapasity(int sectionDefaultCapasity) {
		SectionDefaultCapasity = sectionDefaultCapasity;
	}

	@ManyToOne(cascade={CascadeType.ALL})
	@JoinColumn(name="prereq_id")
	private Course preReqCourId;
	
	@ElementCollection
	List<Long>targetblocks;
	
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "course",cascade={CascadeType.ALL})
	List<Section>sectionList;
	
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
