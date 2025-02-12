package com.kh.poly.ex2;

public class Run {

	public static void main(String[] args) {
		// 부모 타입 참조 변수(레퍼런스)로 부모 객체를 다루는 경우
		Car c1 = new Car("white", "Gasoline", 2019);
		c1.drive();
		
		// 자식 타입 참조 변수로 자식 객체 다루는 경우
		Sonata c2 = new Sonata("blue", "Gasoline", 2020);
		
		c2.drive();
		c2.moveSonata();
		
		// 부모 타입의 참조 변수로 자식 객체를 다루는 경우 
		Car c3 = c2; // Car c3 = new Sonata();
		c3.drive();
		// c3.moveSonata(); c3가 참조하고 있는 Car의 참조 범위만 참조 가능하므로 에러 발생한다.
		((Sonata)c3).moveSonata();
		
		// * 다형성 사용하기 전
		Sonata[] sArr = new Sonata[3];
		sArr[0] = new Sonata("black", "Gasoline", 2020);
		
		Avante[] vArr = new Avante[3];
		vArr[0] = new Avante("black", "Gasoline", 2020);
		
		for(Sonata s : sArr) {
			if(s != null) {
				s.drive();
			}
		}
		for(Avante a : vArr) {
			if(a != null) {
				a.drive();
			}
		}
		
		// * 다형성 적용
		Car[] cArr = new Car[] {
			new Sonata("black", "Gasoline", 2020),
			null,
			null,
			new Avante("black", "Gasoline", 2020),
			null
		};
		
		/*
		cArr[0] = new Sonata("black", "Gasoline", 2020);
		cArr[1] = new Avante("black", "Gasoline", 2020);
		*/
		
		for(Car c : cArr) {
			if(c != null) {
				c.drive();
				// Down-casting
				if(c instanceof Sonata) {
					((Sonata)c).moveSonata();
				} else if(c instanceof Avante) {
					((Avante)c).moveAvante();
				}
			}
		}
		
		for(int i = 0; i < cArr.length; i++) {
			Car c = cArr[i];
			if(c != null) {
				c.drive();
				// Down-casting
				if(c instanceof Sonata) {
					((Sonata)c).moveSonata();
				} else if(c instanceof Avante) {
					((Avante)c).moveAvante();
				}
			}
		}
		
		
	}
}
