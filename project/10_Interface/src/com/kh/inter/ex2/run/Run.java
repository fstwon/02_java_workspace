package com.kh.inter.ex2.run;

import com.kh.inter.ex2.Circle;
import com.kh.inter.ex2.Rectangle;
import com.kh.inter.ex2.Shape;

public class Run {

	public static void main(String[] args) {
		// 도형 정보 저장 배열[2]
		Shape[] arr = new Shape[2];
		// [0] = 원 정보 (반지름 5)
		arr[0] = new Circle(5);
		// [1] = 사각형 정보 (가로 3, 세로 4)
		arr[1] = new Rectangle(3, 4);
		
		// 각 도형 넓이 출력
		for(Shape s : arr) {
			if(s instanceof Circle) {
				System.out.print("원의 넓이 : ");
			} else if(s instanceof Rectangle) {
				System.out.print("사각형 넓이 : ");
			}
			System.out.println(s.calculateArea());
		}
	}
}
