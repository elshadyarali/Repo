package com.mumsched.us.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
@Entity
public class Student  extends User{

	
	@ElementCollection
	private List<Long> enrolledSections;
	
	@ElementCollection
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
