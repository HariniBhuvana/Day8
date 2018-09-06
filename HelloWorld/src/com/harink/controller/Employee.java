package com.harink.controller;

public class Employee {
	private long empId;
	private String name;
	private int Salary;
	private String deptname;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(long empId, String name, int salary, String deptname) {
		super();
		this.empId = empId;
		this.name = name;
		Salary = salary;
		this.deptname = deptname;
	}
	public long getEmpId() {
		return empId;
	}
	public void setEmpId(long empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return Salary;
	}
	public void setSalary(int salary) {
		Salary = salary;
	}
	public String getDeptname() {
		return deptname;
	}
	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}
		
	


}
