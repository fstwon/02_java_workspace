package com.kh.set;

import java.util.Objects;

public class Student {
	private String name;
	private int age;
	private int score;
	public Student() {
	}
	public Student(String name, int age, int score) {
		super();
		this.name = name;
		this.age = age;
		this.score = score;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", score=" + score + "]";
	}
	@Override
	public int hashCode() {
		// 1. Objects.hash();
		// return Objects.hash(name, age, score);
		
		// 2. String의 hashCode 이용
		// return (name + age + score).hashCode();
		return super.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student std = (Student)obj;
			if(this.name.equals(std.getName())
			   && this.age == std.getAge()		
			   && this.score == std.getScore()
			){
				return true;
			}
		}
		return false;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}
}
