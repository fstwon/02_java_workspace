package com.kh.last.p3;


import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Locale;
import java.util.Scanner;

public class CalendarTest {

	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		Scanner sc = new Scanner(System.in);
		// 년
		System.out.print("년 : ");
		int year = sc.nextInt();
		// 월
		System.out.print("월 : ");
		int month = sc.nextInt() - 1;
		// 일
		System.out.print("일 : ");
		int day = sc.nextInt();
		c.set(year, month, day);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 M월 d일 E요일", Locale.KOREAN);
		boolean isLeapYear = LocalDate.of(year, month, day).isLeapYear();
		
		System.out.println();
		System.out.println("입력된 날짜에 대한 정보는 아래와 같습니다.");
		System.out.println(sdf.format(c.getTime()));
		System.out.println(year + "년은 " + (isLeapYear ? "윤년" : "평년") + "이다.");
	}

}
