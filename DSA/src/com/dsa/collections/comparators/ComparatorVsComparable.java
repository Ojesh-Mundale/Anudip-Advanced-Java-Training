package com.dsa.collections.comparators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Vector;

public class ComparatorVsComparable {

public static void main(String[] args) {
		
		ArrayList<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee(104, "Neha", 30000.0));
		employees.add(new Employee(103, "John", 50000.0));
		employees.add(new Employee(101, "Radha", 20000.0));
		employees.add(new Employee(105, "Keshav", 10000.0));
		employees.add(new Employee(102, "Om", 70000.0));

		for (Employee employee : employees) {
			System.out.println(employee);
		}
		
		Collections.sort(employees, new SortingBasedOnId());
		System.out.println("----------------------------------");
		
		for (Employee employee : employees) {
			System.out.println(employee);
		}
		
		Collections.sort(employees,new SortingBasedOnName());
		System.out.println("----------------------------------");
		
		for (Employee employee : employees) {
			System.out.println(employee);
		}
		
		
		Collections.sort(employees, new SortingBasedOnSalary());
		System.out.println("----------------------------------");
		
		for (Employee employee : employees) {
			System.out.println(employee);
		}
	}


}
