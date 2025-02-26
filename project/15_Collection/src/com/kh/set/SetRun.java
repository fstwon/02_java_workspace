package com.kh.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class SetRun {

	public static void main(String[] args) {
		HashSet hSet1 = new HashSet();
		hSet1.add("오늘은 금요일"); // 0
		hSet1.add(new String("오늘은 금요일")); // 1
		//
		hSet1.add(new String("아메리카노"));
		hSet1.add(new String("라떼"));
		hSet1.add(new String("아메리카노"));
		
		System.out.println(hSet1);
		/*
		 * * String
		 * - hashCode() : "실제 담긴 문자열"을 10진수 형태로 변환하여 리턴
		 * - equals() : hashCode 결과가 같으면, "실제 담긴 문자열"을 가지고 동등 비교. 일치 여부에 따라 true/false 반환
		*/
		
		HashSet<Student> hSet2 = new HashSet<>();
		hSet2.add(new Student("영훈", 30, 90));
		hSet2.add(new Student("준민", 16, 85));
		hSet2.add(new Student("성원", 19, 100));
		
		System.out.println(hSet2);
		// * Hash는 index라는 개념이 없어서 get 메소드를 사용할 수 없다. 
		for(Student s : hSet2) {
			System.out.println(s);
		}
		
		// * Iterator(반복자) 사용
		Iterator<Student> it = hSet2.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next().getName());
		}
		
		// * Set -> List 
		ArrayList<Student> list = new ArrayList<>();
		list.addAll(hSet2);
		for(int i = 0; i < list.size(); i++) {
			System.out.println(i + "] " + list.get(i));
		}
	}

}
