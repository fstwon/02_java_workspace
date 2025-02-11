package com.kh.object.ex4;

/*
 * 학생 정보
 * 이름 -name:String
 * 나이 -age:int
 * 수학 점수 -math:int
 * 영어 점수 -eng:int
 * 국어 점수 -kor:int
 */
// 1. 데이터에 간접적으로 접근할 수 있도록 정의
// 2. 모든 데이터를 매개변수로 받아 초기화하면서 객체 생성자 정의
public class Student {
	private String name;
	private int age;
	private int math;
	private int eng;
	private int kor;
	
	public Student() {}
	
	public Student(String name, int age, int math, int eng, int kor) {
		this.name = name;
		this.age = age;
		this.math = math;
		this.eng = eng;
		this.kor = kor;
	}
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public int getMath() {
		return math;
	}
	public int getEng() {
		return eng;
	}
	public int getKor() {
		return kor;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	
	public String toString() {
		return "name: " + name + ", " +
				"age: " + age + ", " +
				"math: " + math + ", " +
				"eng: " + eng + ", " +
				"kor: " + kor;
	}
	// 모든 과목의 평균 계산 
	public double getAvg() {
		return (math + eng + kor) / 3;
	}
}








