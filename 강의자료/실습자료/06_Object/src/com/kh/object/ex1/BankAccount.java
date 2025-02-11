package com.kh.object.ex1;

// 클래스명 : BankAccount
public class BankAccount {
	// 데이터 (변수)
	int balance = 0;	// 예금잔액
	
	// 기능 (메소드)
	/*
	 * 접근제한자 [예약어] 반환형 메소드명(매개변수정보) {
	 * }
	 */
	
	// 입금 기능 (예금잔액에 값을 더함)
	public void deposit(int money) {
		balance += money;
	}
	
	// 출금 기능 (예금잔액에서 값을 뺌)
	public int withdraw(int money) {
		// 예금 잔액에서 전달된 금액을 뺌
		balance -= money;
		// 예금 잔액을 반환
		return balance;
	}
	
	// 조회 기능 (예금 잔액 정보를 출력)
	public void check() {
		System.out.println("잔액 : " + balance);
	}
}





