package com.mumsched.cs.domains;
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

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Entry {


	
	@Id
	@GeneratedValue
  private Long Id;
	
	@Column(nullable = false)
  private String name ;
	 @Temporal(TemporalType.DATE)
	 @Column
  private Date startDate ;
	 @Temporal(TemporalType.DATE)
	 @Column
  private Date endDate;
  @Column
  private int totalMPPStudents;
  @Column
  private int totalFPPStudents;
  
    @JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "entry")
	List<Block>blockList;

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

	public int getTotalMPPStudents() {
		return totalMPPStudents;
	}

	public void setTotalMPPStudents(int totalMPPStudents) {
		this.totalMPPStudents = totalMPPStudents;
	}

	public int getTotalFPPStudents() {
		return totalFPPStudents;
	}

	public void setTotalFPPStudents(int totalFPPStudents) {
		this.totalFPPStudents = totalFPPStudents;
	}

	public List<Block> getBlockList() {
		return blockList;
	}

	public void setBlockList(List<Block> blockList) {
		this.blockList = blockList;
	}
	
  
  
}
