package com.naga.app;

public class Employee {
	private int id;
	private String department;
	private String name;
	private long sal;
	
	public Employee() {
		super();
	}

	public Employee(int id, String department, String name, long sal) {
		super();
		this.id = id;
		this.department = department;
		this.name = name;
		this.sal = sal;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getSal() {
		return sal;
	}

	public void setSal(long sal) {
		this.sal = sal;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", department=" + department + ", name=" + name + ", sal=" + sal + "]";
	}
	

	
}
