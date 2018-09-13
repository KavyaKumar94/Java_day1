package com.cg.eis.pl;

import java.util.Scanner;

import com.cg.eis.bean.Employee;
import com.cg.eis.service.Services;

public class InvokeServices {

	void getEmployeeDetails(long id, String name, long salary, String designation) {
		

	Services s = new Services();
	s.getEmployeeDetails(id, name, salary, designation);
	}
	
	private void displayEmployeedetails() {

		Services s = new Services();
		s.displayEmployeedetails();
	}
	public static void main(String[] args) {
		
		InvokeServices is = new InvokeServices();
		
		System.out.println("Enter Employee Id:");
		Scanner sc = new Scanner(System.in);
		long id = sc.nextLong();
		System.out.println("Enter Employee Name:");
		String name = sc.next();
		System.out.println("Enter Employee salary:");
		long salary = sc.nextLong();
		System.out.println("Enter Employee designation:");
		String designation = sc.next();
		
//		System.out.println(designation);
		is.getEmployeeDetails(id, name, salary, designation);
		
	}

	
}
