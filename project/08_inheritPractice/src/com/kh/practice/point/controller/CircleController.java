package com.kh.practice.point.controller;

import com.kh.practice.point.model.vo.Circle;

public class CircleController {
	// field
	/*
		- c:Circle = new Circle()
	*/
	private Circle c = new Circle();
	
	// method
	/*
		+ calcArea(x:int, y:int, radius:int):String
		+ calcCircum(x:int, y:int, radius:int) :String
	*/
	public String calcArea(int x, int y, int radius) {
		// 받은 매개변수를 이용하여 필드들을 초기화하고 초기화한 정보와 면적 반환
		c.setX(x);
		c.setY(y);
		c.setRadius(radius);
		
		// 면적 : PI * 반지름 * 반지름
		return "면적 : " + c.toString() + " / " + (Math.PI * radius * radius);
	}
		
	public String calcCircum(int x, int y, int radius) {
		// 받은 매개변수를 이용하여 필드들을 초기화하고 초기화한 정보와 둘레 반환
		c.setX(x);
		c.setY(y);
		c.setRadius(radius);
		
		// 둘레 : PI * 반지름 * 2
		return "둘레 : " + c.toString() + " / " + (Math.PI * radius * 2);
	}
}
