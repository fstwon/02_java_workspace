package com.kh.hw.shape.controller;

import com.kh.hw.shape.model.vo.Shape;

public class SquareController {
	// field
	Shape s = new Shape();
	// method
	/*
		+ calcPerimeter(height:double, width:double) : double
		+ calcArea(height:double, width:double) : double
		+ paintColor(color:String) : void
		+ print() : String
	*/
	public double calcPerimeter(double height, double width) {
		// Square = 4
		// 모양 타입 번호와 받은 매개변수를 매개변수 있는 생성자로 초기화 시킨 후 둘레 반환 
		this.s = new Shape(4, height, width);
		// 둘레: 너비*2 + 높이*2
		return (s.getWidth() * 2) + (s.getHeight() * 2);
	}
	public double calcArea(double height, double width) {
		// 모양 타입 번호와 받은 매개변수를 매개변수 있는 생성자로 초기화 시킨 후 넓이 반환
		// 넓이 : 너비 * 높이
		this.s = new Shape(4, height, width);
		return s.getWidth() * s.getHeight();
	}
	public void paintColor(String color) {
		// setter를 이용해 받아온 매개변수로 값 변경
		s.setColor(color);
	}
	public String print() {
		// 어떤 모양인지와 Shape의 information()메소드의 반환 값 합쳐 함께 반환
		return "사각형 " + s.information();
	}
}
