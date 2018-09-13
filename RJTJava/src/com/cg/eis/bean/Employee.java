package com.cg.eis.bean;
/**
 * Lab 5
 * @author kavyakumar
 *	
 *	In this package, create “Employee” class 
 *	with different attributes such as id, name, salary, designation, insuranceScheme.
 */
public class Employee {

	long id;
	String name;
	long salary;
	String designation;
	String insuranceScheme;
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getInsuranceScheme() {
		return insuranceScheme;
	}

	public void setInsuranceScheme(String insuranceScheme) {
		this.insuranceScheme = insuranceScheme;
	}
	
	
}
