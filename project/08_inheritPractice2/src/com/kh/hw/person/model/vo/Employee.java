package com.kh.hw.person.model.vo;

public class Employee extends Person {
	// field
	/*
		- salary : int // 급여
		- dept : String // 부서
	*/
	private int salary;
	private String dept;
	
	// constructor
	/*
		+ Employee()
		+ Employee(name:String, age:int, height:double, weight:double, salary:int, dept:String)
	*/
	public Employee() {}
	public Employee(String name, int age, double height, double weight, int salary, String dept) {
		super(name, age, height, weight);
		this.salary = salary;
		this.dept = dept;
	}
	
	// method
	/*
		+ getter/setter()
		+ toString() : String
	*/
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getSalary() {
		return this.salary;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getDept() {
		return this.dept;
	}
	
	public String toString() {
		return super.toString() + ", salary : " + salary + ", dept : " + dept;
	}
}
