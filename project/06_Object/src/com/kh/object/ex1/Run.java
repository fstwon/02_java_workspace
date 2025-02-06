package com.kh.object.ex1;

public class Run {

	public static void main(String[] args) {
		// BankAccount class 사용
		// 변수 선언 및 BankAccount 인스턴스 생성
		
		// BankAccount 타입의 변수 선언
		BankAccount ba;
		
		// BankAccount 인스턴스 생성
		ba = new BankAccount();
		
		// ba 인스턴스 메소드 호출 
		// 입금 메소드
		ba.deposit(2000000);
		
		// 잔액 조회 메소드
		ba.check();
		
		// 출금 메소드
		ba.withdraw(800000);
		
		// 잔액 조회 메소드
		ba.check();
		
		BankAccount ba2 = ba;
		// ba2 변수에 ba 참소변수가 가지고 있는 주소 값이 할당하여 같은 인스턴스 참조
		
		ba2.deposit(3000000);
		
		ba.check();
	}

}
