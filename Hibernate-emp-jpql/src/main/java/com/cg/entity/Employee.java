package com.cg.entity;

import javax.annotation.processing.Generated;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;

@Entity
@Table (name="employee_tab")
@NamedQuery(query="Select e from Employee e where e.employeeId=:id",name="find employee by id")
public class Employee {
	@Id
	@Column (name="employee_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer employeeId;
	@Column (name="employee_name")
	private String employeeName;
	@Column (name="employee_email")
	private String email;
	@Column (name="employee_salarys")
	private double salary;
	public Employee( String employeeName, String email, double salary) {
		super();
		this.employeeName = employeeName;
		this.email = email;
		this.salary = salary;
	}
	public Employee() {
		super();
	}
	public Integer getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String toString() {
		return "\nEmployee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", email=" + email
				+ ", salary=" + salary + "]";
	}
}
