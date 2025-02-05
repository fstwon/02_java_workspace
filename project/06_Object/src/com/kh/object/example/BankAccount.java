package com.kh.object.example;

public class BankAccount {
	// 데이터(변수)
	int balance = 0; // 예금 잔액
	
	// 기능(메소드)
	// 입금 기능 (예금잔액에 값을 더함)
	public void deposit(int money) {
		balance += money;
	}
	// 출금 기능 (예금잔액에서 값을 뺌)
	public int withdraw(int money) {
		// 예금 잔액 차감
		balance -= money;
		// 차감 후 예금 잔액 반환
		return balance;
	}
	// 조회 기능 (예금 잔액 정보 출력)
	public void check() {
		System.out.println("잔액 : " + balance);
	}
}
