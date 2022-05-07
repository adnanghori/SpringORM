package com.spring.orm;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.dao.EmployeeDao;
import com.spring.entities.Employee;


public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/orm/configuration.xml");
    	EmployeeDao employeeDao = context.getBean("employeeDao",EmployeeDao.class);
    	
    	
//    	Employee employee = new Employee();
//    	//employee.setEmployeeId(102);
//    	employee.setEmployeeName("Vedant");
//    	employee.setEmployeeDepartment("FrontEnd");
//    	employee.setEmployeeSalary(360000);
//    	employee.setWorkAble(false);
////    	
//    	int insert = employeeDao.insert(employee);
//   	System.out.println(insert);
//    	
//    	
////    	Employee employee2 = employeeDao.getEmployee(101);
////    	System.out.println(employee2.getEmployeeName());
//    	
//    	List<Employee> allEmployee = employeeDao.getAllEmployee();
//    	for(Employee e : allEmployee) {
//    		System.out.println(e.getEmployeeId());
//    		System.out.println(e.getEmployeeName());
//    		System.out.println(e.getEmployeeDepartment());
//    		System.out.println(e.getEmployeeSalary());
//    		System.out.println(e.isWorkAble());
//    	}
//    	employeeDao.delete(102);
    	
    	employeeDao.update(102);
    	
    }
    
}
