package com.kh.object.practice5.model.vo;

public class Lotto {
	// --- 필드부 ---
	// -lotto:int[]
	private int[] lotto;
	
	// 초기화 블록 사용
	/*
	{
		// 중복하지 않는 1~45까지의 난수들로 배열 초기화(6개)
		lotto = new int[6];
		
		for(int i=0; i<lotto.length; i++) {
			lotto[i] = (int)(Math.random()*45+1);
		}
	}
	*/
	// 기본 생성자 사용
	public Lotto() {
		lotto = new int[6];
		
		for(int i=0; i<lotto.length; i++) {
			lotto[i] = (int)(Math.random()*45+1);
			
			// 중복 체크!
			for(int j=0; j<i; j++) {
				if(lotto[i] == lotto[j]) {
					i--;
					break;
				}
			}
		}
	}
	
	// ---- 메소드부 ----
	// +information():void
	public void information() {
		// 반복문을 이용하여 배열 출력
		// * for-each문 : 배열의 첫번째 위치부터 마지막 위치까지
		//				  변수를 통해서 접근
		// [표현식]   for(자료형 변수명 : 배열명) {}
		for(int value : lotto) {
			System.out.print(value + " ");
		}
		System.out.println();
	}
}





