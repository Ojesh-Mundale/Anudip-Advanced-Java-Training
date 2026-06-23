package com.dsa.collections.comparators;
public class Employee implements Comparable<Employee> {

	private int id;
	private String name;
	private double salary;

	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

	@Override
	public int compareTo(Employee obj) {

		// return obj.getId()-getId();
		// return getName().compareTo(obj.getName());
		// return obj.getName().compareTo(getName());
		// return (int)(getSalary()-obj.getSalary());
		return (int) (obj.getSalary() - getSalary());
	}

}
