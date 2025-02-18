package com.kh.practice.point.controller;

import com.kh.practice.point.model.vo.Rectangle;

public class RectangleController {
/*
	- r:Rectangle = new Rectangle()
	+ calcArea(x:int, y:int, height:int, width:int):String
	+ calcPerimeter( x:int, y:int, height:int, width:int):String
 */
	private Rectangle r = new Rectangle();
	
	public String calcArea(int x, int y, int height, int width) {
		// 받은 매개변수를 이용하여 필드들을 초기화하고 
		// 초기화한 정보와 면적 반환
		// 면적 : 너비 * 높이
		r = new Rectangle(x, y, width, height);
		double area = width * height;
		// => 자동 형변환 : 연산 결과는 int형이나 double으로 자동형변환
		
		return r.toString() + " / 면적 : " + area;
	}
	
	public String calcPerimeter(int x, int y, int height, int width) {
		// 받은 매개변수를 이용하여 필드들을 초기화하고 
		// 초기화한 정보와 둘레 반환
		// 둘레 : 2 * (너비 + 높이)
		r = new Rectangle(x, y, width, height);
		double peri = 2 * ( width + height );
		// => 연산자 우선순위 : 산술연산자는 * / % 가 + - 보다 우선순위가 높음!
		
		return r.toString() + " / 둘레 : " + peri;
	}
}




