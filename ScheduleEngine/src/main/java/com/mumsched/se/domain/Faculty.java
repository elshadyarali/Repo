package com.mumsched.se.domain;

import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;

public class Faculty extends User{

	private String specialization ;
	
	private boolean isSelected=false;
	public boolean isSelected() {
		return isSelected;
	}

	public void setSelected(boolean isSelected) {
		this.isSelected = isSelected;
	}

	private List<Long> specializedCourses;
	
	
	private List<Long> availableBlocks;
	
	
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

	@Override
	public String toString() {
		return "Faculty [ firstName="
				+ firstName + "]";
	}
	
	
	
	
	
}
