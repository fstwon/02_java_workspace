package com.kh.practice.leap.view;

import java.util.Calendar;

import com.kh.practice.leap.controller.LeapController;

public class LeapView {
	// constructor
	// + LeapView
	public LeapView() {
		// 기본생성자로 이 안에 평년인지 윤년인지
		Calendar c = Calendar.getInstance();
		int current = c.get(Calendar.YEAR);
		String isLeapStr = new LeapController().isLeapYear(current) ? "윤년" : "평년";
		System.out.printf("%d년은 %s입니다.\n", current, isLeapStr);
		// 1년 1월 1일부터 지금까지 며칠이 지났는지 모두 출력
		System.out.println("총 날짜 수 : " + new LeapController().leapDate(c));
	}
}
