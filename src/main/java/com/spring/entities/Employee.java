package com.spring.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.annotations.Proxy;

@Entity
@Proxy(lazy=false)
public class Employee {
	@Id
	private int employeeId;
	private String employeeName;
	private String employeeDepartment;
	private double employeeSalary;
	private boolean workAble;
	
	// Constructors
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Employee(int employeeId, String employeeName, String employeeDepartment, double employeeSalary,
			boolean workAble) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeDepartment = employeeDepartment;
		this.employeeSalary = employeeSalary;
		this.workAble = workAble;
	}

	// Getters And Setters
	
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getEmployeeDepartment() {
		return employeeDepartment;
	}
	public void setEmployeeDepartment(String employeeDepartment) {
		this.employeeDepartment = employeeDepartment;
	} 
	public double getEmployeeSalary() {
		return employeeSalary;
	}
	public void setEmployeeSalary(double employeeSalary) {
		this.employeeSalary = employeeSalary;
	}
	public boolean isWorkAble() {
		return workAble;
	}
	public void setWorkAble(boolean workAble) {
		this.workAble = workAble;
	}


	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeDepartment="
				+ employeeDepartment + ", employeeSalary=" + employeeSalary + ", workAble=" + workAble + "]";
	}
	
	
}
