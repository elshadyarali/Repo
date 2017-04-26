package com.mumsched.rs.domain;

import java.util.List;



public class Student  extends User{

	

	private List<Long> enrolledSections;
	
	
	private List<Long> takenSections;
	
	private boolean isFixed;

	public List<Long> getEnrolledSections() {
		return enrolledSections;
	}

	public void setEnrolledSections(List<Long> enrolledSections) {
		this.enrolledSections = enrolledSections;
	}

	public List<Long> getTakenSections() {
		return takenSections;
	}

	public void setTakenSections(List<Long> takenSections) {
		this.takenSections = takenSections;
	}

	public boolean isFixed() {
		return isFixed;
	}

	public void setFixed(boolean isFixed) {
		this.isFixed = isFixed;
	}

	
}
