package com.kh.hw.person.controller;

import com.kh.hw.person.model.vo.Employee;
import com.kh.hw.person.model.vo.Student;

public class PersonController {
	// field
	/*
		- s:Student[] = new Student[3]
		- e:Employee[] = new Employee[10]
	*/
	// NOTI: 테스트 용 임시 배열 크기 수정하는 경우 
	// 배열 크기 학생: 3, 고용인: 10으로 수정해야 함 
	private Student[] s = new Student[3];
	private Employee[] e = new Employee[10];
	
	// method
	/*
		+ personCount() : int[]
		
		+ insertStudent(
			name:String, 
			age:int, 
			height:double, 
			weight:double, 
			grade:int, 
			major:String
		  ) : void
		
		+ printStudent() : Student[]
		
		+ insertEmployee(
			name:String, 
			age:int, 
			height:double, 
			weight:double, 
			salary:int, 
			dept:String
		  ) : void
		
		+ printEmployee() : Employee[]
	*/
	public int[] personCount() {
		// 각 객체배열에 저장된 객체의 수를 정수배열에 담아 반환하는 메소드
		int[] pc = new int[2];
		int sCount = 0;
		for(int i = 0; i < s.length; i++) {
			if(s[i] != null) {
				sCount++;
			}
		}
		pc[0] = sCount;
		
		int eCount = 0;
		for(int i = 0; i < e.length; i++) {
			if(e[i] != null) {
				eCount++;
			}
		}
		pc[1] = eCount;
		return pc;
	}
	
	public void insertStudet(String name, int age, double height, double weight, int grade, String major) {
		// 매개변수로 받아온 데이터를 학생 객체 배열 중 빈 곳에 저장하는 메소드
		Student std = new Student(name, age, height, weight, grade, major);
		for(int i = 0; i < s.length; i++) {
			if(s[i] == null) {
				s[i] = std;
				break;
			}
		}
	}
	public Student[] printStudent() {
		// 학생 객체 배열의 주소를 반환하는 메소드
		return s;
	}
	public void insertEmployee(String name, int age, double height, double weight, int salary, String dept) {
		// 매개변수로 받아온 데이터를 사원 객체 배열 중 빈 곳에 저장되는 메소드
		Employee emp = new Employee(name, age, height, weight, salary, dept);
		for(int i = 0; i < e.length; i++) {
			if(e[i] == null) {
				e[i] = emp;
				break;
			}
		}
	}
	
	public Employee[] printEmployee() {
		// 사원 객체 배열의 주소를 반환하는 매소드
		return e;
	}
}
