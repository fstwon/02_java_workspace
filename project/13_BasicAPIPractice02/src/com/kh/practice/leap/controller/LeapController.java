package com.kh.practice.leap.controller;

import java.util.Calendar;
import java.util.Date;

public class LeapController {
	// method
	/*
	 * + isLeapYear(year:int) : boolean 
	 * + leapDate(c:Calendar) : long
	 */
	public boolean isLeapYear(int year) {
		// year가 윤년이면 true,
		// 평년이면 false 리턴
		// (윤년: 연도가 4의 배수이면서, 100의 배수가 아니거나 400의 배수가 되는 해)
		// year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)
		return year % 4 == 0 && (year % 100 != 0 || year % 400 == 0);
	}
	public long leapDate(Calendar c) {
		/*
		 * 1년 1월 1일부터 오늘까지의 총 날 수를 계산
		 *  
		 * 1년부터 현재 연도까지 각 연도가
		 *  
		 * 윤년이면 총 날수에 366일을, 평년이면 365일을 더함
		 */
		long result = 0;
		
		Calendar firstCalendar = Calendar.getInstance();
		firstCalendar.set(1, 0, 1);
		
		int firstYear = firstCalendar.get(Calendar.YEAR);
		int currentYear = c.get(Calendar.YEAR);
		// 24년까지 날짜 합
		for(int i = firstYear; i < currentYear; i++) {
			if(isLeapYear(i)) {
				result += 366;
			} else {
				result += 365;
			}
		}
		
		// 현재까지 날짜 합
		int currentMonth = c.get(Calendar.MONTH);

		// 현재 연도 첫 월부터 현재 월까지 반복
		for(int i = 0; i <= currentMonth; i++) {
			// 현재 연도 첫 월의 날부터 현재 날짜까지 반복
			/* [현재 연도에 대한 설명]
			 * 해당 현재 연도가 윤년이면 2월을 29일로 
			 * 평년이면 28일로 더함
			 * 
			 * **월의 날짜 수를 더함**
			 * (31일: 1, 3, 5, 7, 8, 10, 12 / 30일: 4, 6, 9, 11)
			 * 0, 2, 4, 6, 9, 11 / 3, 5, 8, 10
			*/
			// 현재 월의 총 날짜 계산
			int date = 30;
			
			switch(i) {
				case 0:
				case 2:
				case 4:
				case 6:
				case 7:
				case 9:
				case 11:
					date = 31;
			}
			if(i == 1) {
				if(isLeapYear(currentYear)) {
					date = 29;
				} else {
					date = 28;
				}
			}
			// i가 현재 월과 같으면 date = 현재 일
			if(i == currentMonth) {
				date = c.get(Calendar.DATE);
			}
			result += date;
		}
		
		return result;
	}
}
