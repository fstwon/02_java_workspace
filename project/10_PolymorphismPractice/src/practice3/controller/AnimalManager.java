package practice3.controller;

import practice3.model.vo.*;

public class AnimalManager {

	public static void main(String[] args) {
		/*
			사이즈 5짜리 Animal 타입의 객체 배열 생성하여 
			각 인덱스별로 무작위로 Dog, Cat 클래스를 이용하여 객체 생성하고 
			반복문으로 각 인덱스별 객체의 speak() 메소드 실행
		*/
		Animal[] aArr = new Animal[5];
		
		// 모든 값에 Dog를 할당하고
		for(int i = 0; i < aArr.length; i++) {
			String[] dKinds = new String[] {"셰퍼드", "불독", "골든 리트리버", "허스키", "푸들"};
			String name = "mk-" + i;
			String kinds = dKinds[i];
			int weight = (int)(Math.random() * 20 + 1);
			aArr[i] = new Dog(name, kinds, weight);			
		}
		
		// 무작위 index에 Cat으로 덮어 씌움			
		for(int i = 0; i < aArr.length; i++) {
			String[] cKinds = new String[] {"페르시안", "샴", "메인쿤", "랙돌", "스핑크스"};
			// index random
			int index = (int)(Math.random() * (aArr.length - 1));
			if(index == i) {
				continue;
			}
			String name = "mk-" + index;
			String kinds = cKinds[i];
			String location = Cat.LOCATIONS[index];
			String color = Cat.COLORS[index];
			aArr[index] = new Cat(name, kinds, location, color);
		}
		
		for(Animal a : aArr) {
			a.speak();
		}
	}
}
