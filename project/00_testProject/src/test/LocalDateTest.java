package test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTest {

	public static void main(String[] args) {
		// TODO: 주어진 조건에 맞게 LocalDate 객체를 생성해보자.
		LocalDate date1 = LocalDate.now();   // 현재 날짜 정보로 객체 생성
		System.out.println("date1 : " + date1);
		LocalDate date2 = LocalDate.of(2024, 12, 31);   // 개강일(2024/12/31) 정보로 객체 생성
		System.out.println("date2 : " + date2);
		LocalDate date3 = LocalDate.of(2025, 06, 18);   // 종강일(2025/06/18) 정보로 객체 생성
		System.out.println("date3 : " + date3);

		// TODO: 주어진 조건에 맞게 LocalTime 객체를 생성해보자.
		LocalTime time1 = LocalTime.now();   // 현재 시간 정보로 객체 생성
		System.out.println("time1 : " + time1);
		LocalTime time2 = LocalTime.of(9, 0);   // 수업 시작 시간(09:00) 정보로 객체 생성
		System.out.println("time2 : " + time2);
		LocalTime time3 = LocalTime.of(18, 0);   // 수업 종료 시간(18:00) 정보로 객체 생성
		System.out.println("time3 : " + time3);

		// TODO: 주어진 조건에 맞게 LocalDateTime 객체를 생성해보자.
		LocalDateTime datetime1 = LocalDateTime.now();    // 현재 날짜,시간 정보로 객체 생성
		System.out.println("datetime1 : " + datetime1);
		LocalDateTime datetime2 = LocalDateTime.of(2025, 2, 26, 9, 10);    // 자바 평가일(2025/02/26 09:10) 정보로 객체 생성
		System.out.println("datetime2 : " + datetime2);

		// * 추가 문제: 다음 코드의 결과를 예상해보자.
		System.out.println(date2.isBefore(date3));  // true
		System.out.println(time2.isAfter(time3));   // false
		System.out.println(datetime1.isEqual(datetime2));  // false
	}

}
