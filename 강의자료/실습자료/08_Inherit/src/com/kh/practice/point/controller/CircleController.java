package com.kh.practice.point.controller;

import com.kh.practice.point.model.vo.Circle;

public class CircleController {
/*
	- c:Circle = new Circle()
	+ calcArea(x:int, y:int, radius:int):String
	+ calcCircum(x:int, y:int, radius:int) :String
 */
	private Circle c = new Circle();
	
	public String calcArea(int x, int y, int radius) {
		// 받은 매개변수를 이용하여 필드들을 초기화하고 
		// 초기화한 정보와 면적 반환
		// 면적 : PI * 반지름 * 반지름
		
		// * setter 메소드 이용
		/*
		c.setX(x);
		c.setY(y);
		c.setRadius(radius);
		*/
		// * 생성자 사용
		c = new Circle(x, y, radius);
		double area = Math.PI * radius * radius;
		// toString() => 필드들의 정보를 문자열로 반환하는 메소드
		return c.toString() + "/ 면적: " + area;
	}
	
	public String calcCircum(int x, int y, int radius) {
		// 받은 매개변수를 이용하여 필드들을 초기화하고 
		// 초기화한 정보와 둘레 반환
		// 둘레 : PI * 반지름 * 2
		c = new Circle(x, y, radius);
		double circum = Math.PI * radius * 2;
		return c.toString() + " / 둘레: " + circum;
	}
}





