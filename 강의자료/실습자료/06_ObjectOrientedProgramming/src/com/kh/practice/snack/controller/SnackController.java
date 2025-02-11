package com.kh.practice.snack.controller;

import com.kh.practice.snack.model.vo.Snack;

// * C(Controller) => 화면(view)으로부터 전달받은 요청에 대한 처리용 클래스
public class SnackController {
	// ---- 필드부 ------------
	// - s : Snack = new Snack()
	private Snack s = new Snack();
	// ----------------------
	// ---- 생성자부 ----------
	// + SnackController()
	public SnackController() {}
	// ----------------------
	// --- 메소드부 -----------
	// + saveData(kind:String, name:String, flavor:String, numOf:int, price:int) : String
	public String saveData(String kind, String name, String flavor
							, int numOf, int price) {
		// 데이터를 setter를 이용해 저장하고 
		s.setKind(kind);
		s.setName(name);
		s.setFlavor(flavor);
		s.setNumOf(numOf);
		s.setPrice(price);
		// 저장완료 되었다는 결과를 반환 하는 메소드
		return "저장 완료되었습니다.";
	}
	// + confirmData() : String
	public String confirmData() {
		// 저장된 데이터를 반환 하는 메소드
		// => 데이터를 Snack 객체에 저장했음! 
		//    따라서 Snack를 통해서 저장된 데이터를 반환해주면 됨!
		String data = s.information();
		return data;
		// return s.information();
	}
}
