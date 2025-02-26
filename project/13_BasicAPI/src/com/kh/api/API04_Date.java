package com.kh.api;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class API04_Date {

	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date); // 현재 날짜 + 시간
		
		// * 원하는 날짜 지정
		// - 연도 : 지정연도 - 1900
		// - 월 : 지정월 - 1
		Date date2 = new Date((2024 - 1900), (12 - 1), 31);
		System.out.println(date2);
		
		// SimpleDateFormat
		// 날짜 또는 시간의 포멧을 지정하는 객체
		String format = "yyyy년 MM월 dd일 hh시 mm분 ss초";
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		System.out.println(sdf.format(date));
		
		// LocalDateTime
		// now() : 현재 날짜 시간 기준으로 생성
		LocalDateTime date3 = LocalDateTime.now();
		// getMonth() : 월 정보 반환 (영어)
		System.out.println(date3.getMonth());
		// getMonthValue() : 월 정보 반환 (숫자)
		System.out.println(date3.getMonthValue());
		// getDayOfMonth() : 월 기준 일 정보 반환
		System.out.println(date3.getDayOfMonth());
		// getDayOfYear() : 년 기준 일 정보 반환
		System.out.println(date3.getDayOfYear());
		
		// 올해 남은 일 수 
		System.out.println(365 - date3.getDayOfYear());
	
		// getHour() : 시 정보 반환
		System.out.println(date3.getHour());
		
		// 퇴근까지 시간 
		System.out.println(18 - date3.getHour());
		
		// * LocalDateTime format
		// DateTimeFormatter
		// LocalDateTime.format(DateTimeFormatter.ofPatter(format))
		
		String format2 = date3.format(DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss"));
		System.out.println(format2);
		
		
		
		
		
	}
}

