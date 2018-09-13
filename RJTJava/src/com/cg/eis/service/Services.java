package com.cg.eis.service;

import com.cg.eis.bean.Employee;

/**
 * Lab 5
 * @author kavyakumar
 *
 *	This package will contain code for services offered 
 *	in Employee Insurance System. The service class will 
 *	have one EmployeeService Interface and its corresponding 
 *	implementation class.
 *
 *	
 */
public class Services implements EmployeeService{

	Employee e = new Employee();
	@Override
	public String getInsuranceScheme(long salary, String designation) {
		
		String insuranceScheme = "";
		if ((5000 < salary && salary < 20000) && designation.equalsIgnoreCase("System Associate")) {
			
			insuranceScheme = "Scheme C";
		} else if ((20000 <= salary && salary < 40000) && designation.equalsIgnoreCase("Programmer")) {
			
			insuranceScheme = "Scheme B";

		} else if (40000 <= salary && designation.equalsIgnoreCase("Manager")) {
			
			insuranceScheme = "Scheme A";

		} else if ( salary < 5000 && designation.equalsIgnoreCase("Clerk")){
			
			insuranceScheme = "No Scheme";
		} else {
			System.out.println("The salary and designation do not match up to an insurance scheme.");
			return insuranceScheme;
		}
		
		return insuranceScheme;
	}
	
	@Override
	public void displayEmployeedetails() {
		
		long id = e.getId();
		String name = e.getName();
		long salary = e.getSalary();
		String designation = e.getDesignation();
		
		String insuranceScheme = getInsuranceScheme(salary, designation);
		
		System.out.println("Here are the Employee Details:");
		System.out.println("-------------------------------");
		System.out.println("Employer id: " + id);
		System.out.println("Employer name: " + name);
		System.out.println("Employer salary: " + salary);
		System.out.println("Employer designation: " + designation);
		System.out.println("Employer insuranceScheme: " + insuranceScheme);

	}
	
	@Override
	public void getEmployeeDetails(long id, String name, long salary, String designation) {
		
		
		e.setId(id);
		e.setName(name);
		e.setSalary(salary);
		e.setDesignation(designation);
		
		displayEmployeedetails();
	}
}
