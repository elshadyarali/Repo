package com.mumsched.us.domain;

import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;

@Entity
public class Faculty extends User {

	private String specialization ;
	
	@ElementCollection
	private List<Long> specializedCourses;
	
	@ElementCollection
	private List<Long> availableBlocks;
	
	@ElementCollection
	private List<Long> assignedSections;

	public String getSpecialization() {
		return specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}

	public List<Long> getSpecializedCourses() {
		return specializedCourses;
	}

	public void setSpecializedCourses(List<Long> specializedCourses) {
		this.specializedCourses = specializedCourses;
	}

	public List<Long> getAvailableBlocks() {
		return availableBlocks;
	}

	public void setAvailableBlocks(List<Long> availableBlocks) {
		this.availableBlocks = availableBlocks;
	}

	public List<Long> getAssignedSections() {
		return assignedSections;
	}

	public void setAssignedSections(List<Long> assignedSections) {
		this.assignedSections = assignedSections;
	}
	
	
	
	
	
}
