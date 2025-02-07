package com.kh.practice.snack.run;
import com.kh.practice.snack.view.SnackMenu;

public class Run {

	public static void main(String[] args) {
		/*
		 * MVC 구조
		 * M(Model) => 데이터 저장용도 => Snack
		 * V(View) => 화면 표시 용도 => SnackMenu
		 * C(Controller) => 요청을 받아 처리 => SnackController
		*/
		SnackMenu sm = new SnackMenu();
		sm.menu();
	}

}
