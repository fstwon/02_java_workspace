package com.kh.object.ex1;

public class Run {

	public static void main(String[] args) {
		// BankAccount 클래스 사용
		// * 변수 선언 및 인스턴스 생성
		BankAccount ba;	// BankAccount 타입으로 변수 선언.
		ba = new BankAccount();	// 인스턴스 생성 후 할당.
		// ba 변수는 참조변수로 생성된 인스턴스의 주소값을 저장!
		
		// 입금( deposit 메소드 호출 )
		//      => 참조변수명.메소드명(전달값);
		ba.deposit(10000);
		
		// 조회( check 메소드 호출 )
		ba.check();
		
		// 출금( withdraw 메소드 호출 )
		ba.withdraw(777);
		
		ba.check();
		
		// -------------------------
		
		BankAccount ba2 = ba;
		// => ba2 변수는 ba 참조변수가 가지고 있는 인스턴스의 주소를 저장하게됨!
		//    같은 인스턴스를 참조하게 됨!
		
		ba2.deposit(50000);
		
		ba.check();
		ba2.check();
	}

}





