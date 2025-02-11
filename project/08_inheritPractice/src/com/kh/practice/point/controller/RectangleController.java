package com.kh.practice.point.controller;

import com.kh.practice.point.model.vo.Rectangle;

public class RectangleController {
	// field
	/*
		- r:Rectangle = new Rectangle()
	*/
	private Rectangle r = new Rectangle();
	
	// method
	/*
		+ calcArea(x:int, y:int, height:int, width:int):String
		+ calcPerimeter( x:int, y:int, height:int, width:int) :String
	*/
	public String calcArea(int x, int y, int height, int width) {
		// 받은 매개변수를 이용하여 필드들을 초기화하고 초기화한 정보와 면적 반환
		r.setX(x);
		r.setY(y);
		r.setHeight(height);
		r.setWidth(width);
		
		// 면적 : 너비 * 높이
		return "면적 : " + r.toString() + " / " + (width * height);
	}
	public String calcPerimeter(int x, int y, int height, int width) {
		// 받은 매개변수를 이용하여 필드들을 초기화하고 초기화한 정보와 둘레 반환
		r.setX(x);
		r.setY(y);
		r.setHeight(height);
		r.setWidth(width);
		
		// 둘레 : 2 * (너비 + 높이)
		return "둘레 : " + r.toString() + " / " + (2 * (width + height));
	}
}
