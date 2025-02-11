package com.kh.object.practice2.run;

import com.kh.object.practice2.model.vo.Product;

public class Run {

	public static void main(String[] args) {
		// 기본생성자를 통해 Product 타입의 객체를 생성
		Product p1 = new Product();
		p1.information();	// 생성 후 출력 시 기본값 확인!
		
		// setter 메소드를 통해 값을 저장
		p1.setProductName("아이폰16");
		p1.setPrice(1500000);
		p1.setBrand("애플");
		
		p1.information();	// 저장된 값으로 출력됨!
		

	}

}
