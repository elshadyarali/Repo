package com.mumsched.se.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.mumsched.se.domain.Entry;

@Entity
public class Schedule {

	

	@Id
	@GeneratedValue
	private Long Id;
	
	@Column
	private String name;

	private boolean  isApproved=false; 
	
    public Schedule(Long entryId) {
		this.entry=entryId;
	}

	public Schedule(Entry entry2) {
		// TODO Auto-generated constructor stub
	}

	public boolean isApproved() {
		return isApproved;
	}

	public void setApproved(boolean isApproved) {
		this.isApproved = isApproved;
	}

	private Long entry;

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getEntry() {
		return entry;
	}

	public void setEntry(Long entry) {
		this.entry = entry;
	}
    

    
    
}
