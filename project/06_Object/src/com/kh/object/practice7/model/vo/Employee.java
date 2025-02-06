package com.kh.object.practice7.model.vo;

public class Employee {
	// field	
	// -empNo:int
	private int empNo;
	// -empName:String
	private String empName;
	// -dept:String
	private String dept;
	// -job:String
	private String job;
	// -age:int
	private int age;
	// -gender:char
	private char gender;
	// -salary:int
	private int salary;
	// -bonusPoint:double
	private double bonusPoint;
	// -phone:String
	private String phone;
	// -address: String
	private String address;

	// constructor
	// +Employee
	public Employee() {}
	// +Employee(empNo:int, empName:String)
	public Employee(int empNo, String empName) {
		this.empNo = empNo;
		this.empName = empName;
	}
	// +Employee(empNoint, empName:String, dept:String, job:String, age:int, gender:char, salary:int, bonusPoint:double, phone:String, address:String)
	public Employee(int empNo, String empName, String dept, String job, int age, char gender, int salary,
			double bonusPoint, String phone, String address) {
		this.empNo = empNo;
		this.empName = empName;
		this.dept = dept;
		this.job = job;
		this.age = age;
		this.gender = gender;
		this.salary = salary;
		this.bonusPoint = bonusPoint;
		this.phone = phone;
		this.address = address;
	}
	
	// method

	public int getEmpNo() {
		return empNo;
	}

	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public double getBonusPoint() {
		return bonusPoint;
	}

	public void setBonusPoint(double bonusPoint) {
		this.bonusPoint = bonusPoint;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
