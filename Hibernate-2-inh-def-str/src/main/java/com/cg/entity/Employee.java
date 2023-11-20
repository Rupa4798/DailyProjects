package com.cg.entity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
@Entity
@Table(name="employeeinh")
public class Employee extends Person{
	
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public double getBonus() {
		return bonus;
	}
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public Employee() {
		super();
	}
	public Employee(double salary, String deptName, double bonus, String emailId) {
		super();
		this.salary = salary;
		this.deptName = deptName;
		this.bonus = bonus;
		this.emailId = emailId;
	}
	@Column(name="emp_salary")
	private double salary;
	@Column(name="emp_deptname")
	private String deptName;
	@Column(name="emp_bonus")
	private double bonus;
	@Column(name="emp_email")
	private String emailId;
	
	
}