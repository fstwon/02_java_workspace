package com.kh.practice.leap.controller;

import java.util.Calendar;

public class LeapController {
	public boolean isLeapYear(int year) {
		return (year % 4 == 0) && (year % 100 != 0 || year % 400 == 0);
	}
		
	public long leapDate(Calendar c) {
				
		// 1년 1월 1일부터 오늘까지의 총 날 수를 계산		
		
		int currYear = c.get(Calendar.YEAR);
		int currMonth = c.get(Calendar.MONTH);	// 0 ~ 11
		int currDay = c.get(Calendar.DAY_OF_MONTH);
		
		int totalDays = 0;
		// 직전 연도까지는 아래 기준으로 합산
		// * 해당 연도가 윤년인 경우 + 366
		// * 해당 연도가 평년인 경우 + 365
		for(int i=1; i< currYear; i++) {
			totalDays += isLeapYear(i) ? 366 : 365;
		}
		
		
		// 현재 연도에 대하여는 아래와 같이 계산
		// * 월 별로 일수 합산
		//   - 1, 3, 5, 7, 8, 10, 12월인 경우 + 31
		//   - 4, 6, 9, 11월인 경우 + 30
		//   - 2월인 경우 해당연도가 윤년이면 + 29, 평년이면 + 28
		for(int i=0; i<currMonth; i++) {
			switch(i) {
				case 1:
				case 3:
				case 5:
				case 7:
				case 8:
				case 10:
				case 12:
				totalDays+=31; break;
				case 4:
				case 6:
				case 9:
				case 11:
				totalDays+=30; break;
				case 2:
				totalDays+= isLeapYear(currYear) ? 29: 28; break;
			}
		}
		
		// * 해당 월에 대하여는 현재 날짜를 기준으로 그 일수만 계산
		totalDays+=currDay;
		
		return totalDays;
	}
}
