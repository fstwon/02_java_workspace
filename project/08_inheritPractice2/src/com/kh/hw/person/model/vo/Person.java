package com.kh.hw.person.model.vo;

public class Person {
	// field
	/*	
		- name : String
		- age : int
		- height : double
		- weight : double
	*/
	private String name;
	private int age;
	private double height;
	private double weight;
	
	// constructor
	/*
		+ Person()
		+ Person(name:String, age:int, height:double, weight:double)
	*/
	public Person() {}
	
	public Person(String name, int age, double height, double weight) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
	
	
	// method
	/*
		+ getter/setter()
		+ toString() : String
	*/
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return this.age;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getHeight() {
		return this.height;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public double getWeight() {
		return this.weight;
	}
	
	public String toString() {
		return "name : " + name + ", age : " + age + ", height : " + height + ", weight : " + weight;
	}
	
}
