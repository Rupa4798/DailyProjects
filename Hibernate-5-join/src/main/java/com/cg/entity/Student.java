package com.cg.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="student_table_per_class")
public class Student extends Person{
	@Column(name="schoolname")
	private String schoolName;
	@Column(name="sectionname")
	private String sectionName;
	@Column(name="fee")
	private double fee;
	public Student(String schoolName, String sectionName, double fee) {
		super();
		this.schoolName = schoolName;
		this.sectionName = sectionName;
		this.fee = fee;
	}
	public Student() {
		super();
	}
	public String getSchoolName() {
		return schoolName;
	}
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	public String getSectionName() {
		return sectionName;
	}
	public void setSectionName(String sectionName) {
		this.sectionName = sectionName;
	}
	public double getFee() {
		return fee;
	}
	public void setFee(double fee) {
		this.fee = fee;
	}
	
	
	

}
