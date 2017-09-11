package com.i.myapp.javastreamproject;

public class Employee {

	private Department dept;
	private String name;
	protected static Long empId;
	
	public Employee() {
		empId += 1;
	}
	
	public Employee(Department dept, String name) {
		this();
		this.name = name;
		this.dept=dept;
	}
}
