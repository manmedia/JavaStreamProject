package com.i.myapp.javastreamproject;

import java.lang.reflect.Field;
import java.math.BigInteger;
import java.util.Base64;
import java.util.Random;

public class Employee {

	private Department dept;
	private String name;
	protected static Long empId = 0L;
	private Long employeeId;
	
	public Employee() {
		empId += 1;
		this.employeeId = new Long(empId);
		this.dept = Department.MMA;
	}
	
	public Employee(Department dept, String name) {
		this();
		this.name = name;
		this.dept=dept;
	}
	
	public void setDepartment(Department dept) {
		this.dept = dept;
	}
	
	public Department getDepartment() {
		return this.dept;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	
	public Long getEmployeeId() {
		return this.employeeId;
	}
	
	public int hashCode() {
		return (this.name.toString().length()+this.dept.name().length()+new Long(this.employeeId).hashCode());
	}
	
	public boolean equals(Object o) {
		if (!(o instanceof Employee)) {
			return false;
		} else {
			if (!(((Employee)(o)).getEmployeeId().equals(this.getEmployeeId()))) {
				return false;
			}
			
			if (!(((Employee)(o)).getName().equals(this.getName()))) {
				return false;
			}
			
			if (!(((Employee)(o)).getName().equals(this.getName()))) {
				return false;
			}
			
			if (!(((Employee)(o)).getDepartment().equals(this.getDepartment()))) {
				return false;
			}
			
			return true;
			
		}
	}
	
	public String toString() {
		StringBuffer sb = new StringBuffer();
		Field[] fields = this.getClass().getDeclaredFields();
		sb.append("Employee[");
		try {
		for (Field f : fields) {
			if (f.getDeclaringClass().equals(this.getClass())) {
			sb = sb.append(f.getName()).append("=").append(f.get(this));
			sb = sb.append(";");
			}
		}
		} catch (Exception e) {
			e.printStackTrace();
		}
		sb.append("]");
		return sb.toString();
	}
	
}
