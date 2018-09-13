package com.cg.eis.service;
/**
 * Lab 5
 * @author kavyakumar
 *
 *	This package will contain code for services offered 
 *	in Employee Insurance System. The service class will 
 *	have one EmployeeService Interface and its corresponding 
 *	implementation class.
 *
 *	The services offered by this application currently are:
		i) Get employee details from user.
		ii) Find the insurance scheme for an employee based on salary and designation.
		iii) Display all the details of an employee.
 */

public interface EmployeeService {

	String getInsuranceScheme(long salary, String designation);
	
	void displayEmployeedetails();
	void getEmployeeDetails(long id, String name, long salary, String designation);
}
