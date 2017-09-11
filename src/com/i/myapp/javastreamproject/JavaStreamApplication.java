package com.i.myapp.javastreamproject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class JavaStreamApplication {

	
	public static void main (String[] args) {	
		
		Employee emp1 = new Employee(Department.MMA, "Scott Adkins");
		Employee emp2 = new Employee(Department.MMA, "Michael Jay White");
		Employee emp3 = new Employee(Department.MMA, "Tony Ja");
		Employee emp4 = new Employee(Department.ARTS, "Harrison Ford");
		Employee emp5 = new Employee(Department.NATURAL_HISTORY, "David Attenborough");
		Employee emp6 = new Employee(Department.ARTS, "TOMY LEE JONES");
		Employee emp7 = new Employee(Department.ARTS, "CHRISTINA AMANPOOR");
		Employee emp8 = new Employee(Department.PHYSICS, "Stephen Hawkins");
		
		List<Employee> empz = new ArrayList<>();
		empz.add(emp1);
		empz.add(emp2);
		empz.add(emp3);
		empz.add(emp4);
		empz.add(emp5);
		empz.add(emp6);
		empz.add(emp7);
		empz.add(emp8);
		
		Map<Department, List<Employee>> groupedEmpz = empz.stream().collect(Collectors.groupingBy(Employee::getDepartment));

		System.out.println(groupedEmpz);
		
	}
}
