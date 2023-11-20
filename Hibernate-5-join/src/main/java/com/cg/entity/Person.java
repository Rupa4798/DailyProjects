package com.cg.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.Table;
import jakarta.persistence.InheritanceType;

@Entity
@Table(name="person_table_perclass")
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS) 

public class Person {
	
	@Id
	@Column(name="person_id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	@Column(name="person_name")
	private String name;
	@Column(name="person_gender")
	private String gender;

	
	public Person() {
		super();
	}
	public Person(String name, String gender) {
		super();
		this.name = name;
		this.gender = gender;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String toString() {
		return id+" "+name+" "+gender;
	}

}
