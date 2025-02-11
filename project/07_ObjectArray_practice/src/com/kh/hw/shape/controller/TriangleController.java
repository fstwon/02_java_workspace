package com.kh.hw.shape.controller;

import com.kh.hw.shape.model.vo.Shape;

public class TriangleController {
	// field 
	/*
		- s : Shape = new Shape()		
	*/
	Shape s = new Shape();
	
	// method 
	/*
		+ calcArea(height:double, width:double) : double
		+ paintColor(color:String) : void
		+ print() : String
	*/
	public double calcArea(double height, double width) {
		// 모양 타입 번호와 받은 매개변수를 매개변수 있는 생성자로 초기화 시킨 후 넓이 반환
		// 넓이 : 너비 * 높이 / 2
		s = new Shape(3, height, width);
		return s.getWidth() * s.getHeight() / 2;
	}
	
	public void paintColor(String color) {
		// setter를 이용해 받아온 매개변수로 값 변경
		s.setColor(color);
	}
	
	public String print() {
		// 어떤 모양인지와 Shape의 information()메소드의 반환 값 합쳐 함께 반환
		return "삼각형 " + s.information();
	}
}
