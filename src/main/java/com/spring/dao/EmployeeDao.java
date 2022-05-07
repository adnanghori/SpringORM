package com.spring.dao;


import org.springframework.orm.hibernate5.HibernateTemplate;

import com.spring.entities.Employee;

import java.util.List;

import javax.transaction.Transactional;


public class EmployeeDao {
	private HibernateTemplate hibernateTemplate;

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	public EmployeeDao() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EmployeeDao(HibernateTemplate hibernateTemplate) {
		super();
		this.hibernateTemplate = hibernateTemplate;
	}

	@Transactional
	public int insert(Employee employee) {
		Integer i = (Integer)this.hibernateTemplate.save(employee);
		return i;
	}
	public Employee getEmployee(int employeeId)
	{
		Employee employee = this.hibernateTemplate.load(Employee.class, employeeId);
		
		return employee;
	}
	public List<Employee> getAllEmployee(){
		List<Employee> employees = this.hibernateTemplate.loadAll(Employee.class);
		return employees;
	}
	@Transactional
	public void delete(int employeeid)
	{
		Employee employee = this.hibernateTemplate.get(Employee.class,employeeid);
		this.hibernateTemplate.delete(employee);
	}
	@Transactional
	public void update(int employeeId) {
		Employee employee = this.hibernateTemplate.get(Employee.class,employeeId);
		employee.setEmployeeName("Adnan");
		this.hibernateTemplate.update(employee);
	}
}
