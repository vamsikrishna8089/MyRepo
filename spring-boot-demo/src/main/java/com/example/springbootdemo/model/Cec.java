package com.example.springbootdemo.model;

import java.util.Date;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "CEC_Demo__c")
public class Cec {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

	@Column(name = "cec_phone__c")
	private String  cecPhone;
	
	@Column(name = "cec_bgcolor__c")
	private String  cecColor;
	
	@Column(name = "createddate")
	private Date  createdDate;
	
	@Column(name = "isdeleted")
    private boolean isDeleted;
	
	@Column(name = "name")
    private String name;
    
    
	public Cec() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCecPhone() {
		return cecPhone;
	}
	public void setCecPhone(String cecPhone) {
		this.cecPhone = cecPhone;
	}
	public String getCecColor() {
		return cecColor;
	}
	public void setCecColor(String cecColor) {
		this.cecColor = cecColor;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	public boolean isDeleted() {
		return isDeleted;
	}
	public void setDeleted(boolean isDeleted) {
		this.isDeleted = isDeleted;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
  
    


}
