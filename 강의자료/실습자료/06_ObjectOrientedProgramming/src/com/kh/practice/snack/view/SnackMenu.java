package com.kh.practice.snack.view;

import java.util.Scanner;

import com.kh.practice.snack.controller.SnackController;

// * V(View) => 화면에 표시하기 위한 용도의 클래스
public class SnackMenu {
	// ---- 필드부 ------------
	// ** Ctrl + Shift + o => 자동 import **
	// - sc : Scanner = new Scanner(System.in)
	private Scanner sc = new Scanner(System.in);
	// - scr : SnackController = new SnackController()
	private SnackController scr = new SnackController();
	// ----------------------
	
	// ---- 생성자부 => 생략. 따라서, 기본생성자만 사용 가능! ----
	
	// --- 메소드부 ------------
	// + menu() : void
	public void menu() {
		// 사용자가 Snack객체에 데이터를 저장할 수 있도록 값을 받고
		System.out.println("스낵류를 입력하세요.");
		System.out.print("종류 : ");
		String snackKind = sc.next();	  // "빵\n" => "빵"
	
		sc.nextLine();	// "\n" 지우기! (버퍼 비우기!)
		
		System.out.print("이름 : ");
		String snackName = sc.nextLine(); // "딸기 케이크\n" -> "딸기"
		
		System.out.print("맛 : ");
		String snackFlavor = sc.next();
		
		System.out.print("개수 : ");
		int snackNum = sc.nextInt();
		
		System.out.print("가격 : ");
		int snackPrice = sc.nextInt();
		
		// SnackController 객체를 통해서 Snack객체에 데이터 저장!
		String result = scr.saveData(snackKind, snackName, snackFlavor
					, snackNum, snackPrice);
		System.out.println(result);
		
		// 저장한 정보를 확인하는 지 출력
		System.out.print("저장한 정보를 확인하시겠습니까?(y/n) : ");
		char yn = sc.next().charAt(0);
		
		// 저장한 값을 출력하는 메소드
		if(yn == 'y' || yn == 'Y') {
			String data = scr.confirmData();
			System.out.println(data);
		}
	}
	// -----------------------
}




