package com.kh.hw.person.run;

import com.kh.hw.person.view.PersonMenu;

public class Run {
	/*
		이름  나이  신장  몸무게 학년 전공
		강건강 20 178.2 70.0 1 정보시스템공학과
		남나눔 21 187.3 80.0 2 경영학과
		류라라 23 167.0 45.0 4 정보통신공학과
		
		이름 나이 신장 몸무게 급여 부서
		박보배 26 180.3 72.0 100000000 영업부
		송성실 38 182.0 76.0 200000000 기획부
	*/
	public static void main(String[] args) {
		// PersonMenu클래스의 mainMenu() 메소드를 호출
		PersonMenu pm = new PersonMenu();
		pm.mainMenu();
	}
}
