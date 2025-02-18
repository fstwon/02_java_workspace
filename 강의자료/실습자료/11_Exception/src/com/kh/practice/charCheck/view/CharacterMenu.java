package com.kh.practice.charCheck.view;

import java.util.Scanner;

import com.kh.practice.charCheck.controller.CharacterController;
import com.kh.practice.charCheck.exception.CharCheckException;

public class CharacterMenu {
	// +menu():void
	/**
	 * 사용자에게 받은 값에 있는 영문자 개수 출력
	 */
	public void menu() {
		// 사용자에게 문자열을 입력 받아
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 : ");
		String str = sc.nextLine();
				
		// CharacterController의 countAlpha()에
		CharacterController cc = new CharacterController();
		// 매개변수로 넘겨주어 반환 값을 출력함
		try {
			int count = cc.countAlpha(str);
			// 이 때 countAlpha()메소드를 호출하는 부분부터 try~catch를 이용하여 예외 처리
			System.out.printf("'%s'에 포함된 영문자 개수 : %d\n",
								str, count);
		} catch (CharCheckException e) {
			e.printStackTrace();
			//=> 오류 내용, 발생 지점 정보를 출력해주는 메소드
		}
	}
}
