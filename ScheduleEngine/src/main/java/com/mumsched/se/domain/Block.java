package com.mumsched.se.domain;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonView;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

public class Block {

	private Long id;
	
	private String name;
	
	private int seqNumber;
	
	 @JsonIgnore
	 private Entry entry;
	 

 private Date startDate ;

 private Date endDate;


	@JsonIgnore
	private List<Section> sections ;

	@JsonIgnore
	private List<Course> courses ;
	
	public List<Course> getCourses() {
		return courses;
	}

	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}

	public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getSeqNumber() {
			return seqNumber;
		}

		public void setSeqNumber(int seqNumber) {
			this.seqNumber = seqNumber;
		}

		public Date getStartDate() {
			return startDate;
		}

		public void setStartDate(Date startDate) {
			this.startDate = startDate;
		}

		public Date getEndDate() {
			return endDate;
		}

		public void setEndDate(Date endDate) {
			this.endDate = endDate;
		}

		public List<Section> getSections() {
			return sections;
		}

		public void setSections(List<Section> sections) {
			this.sections = sections;
		}

		public Entry getEntry() {
			return entry;
		}

		public void setEntry(Entry entry) {
			this.entry = entry;
		} 
		 @Override
		 public String toString() {
		 	return "Block [id=" + id + ", name=" + name + ", seqNumber=" + seqNumber + ", entry=" + entry + ", startDate="
		 			+ startDate + ", endDate=" + endDate + ", sections=" + sections + "]";
		 }

}
