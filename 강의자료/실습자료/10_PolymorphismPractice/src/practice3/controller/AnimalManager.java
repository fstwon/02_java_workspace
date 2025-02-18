package practice3.controller;

import practice3.model.vo.Animal;
import practice3.model.vo.Cat;
import practice3.model.vo.Dog;

public class AnimalManager {

	public static void main(String[] args) {
		// Animal 타입의 객체배열 크기 5로 생성
		Animal[] aniArr = new Animal[5];
		// * 자료형[] 변수명 = new 자료형[배열크기];
		
		// 각 인덱스에 무작위로 Dog객체 또는 Cat객체로 생성
		// (이때, 매개변수 생성자를 이용하여 생성)
		aniArr[0] = new Dog("초코", "푸들", 5);
		// 변수명[0] --> 자료형 변수명 와 같은 것임!
		// Animal a1 = new Animal();	
		// => x. Animal 는 추상클래스이기 때문에 객체 생성 불가!
		// Animal a2 = new Dog(); 
		// => o. 상속관계에서는 업캐스팅에 의해 
		//       자식 객체를 부모타입의 참조변수에 할당할 수 있음! (다형성)
		aniArr[1] = new Cat("나비", "러시안블루", "안방", "노란색");
		aniArr[2] = new Dog("밀크", "말티즈", 3);
		aniArr[3] = new Dog("뽀삐", "불독", 8);
		aniArr[4] = new Cat("하양이", "먼치킨", "다락방", "연노랑");
		
		// aniArr[5] = new Dog();
		// => 인덱스 범위가 벗어나 오류 발생!!
		
		// 반복문을 통해서 해당 배열의 0번 인덱스부터 마지막 인덱스까지의
		// 객체의 speak() 메소드 호출
		
		// * 배열 길이 : 배열명.length
		// * 문자열 길이 : 문자열.length()
		for(int i=0; i<aniArr.length; i++) {
			aniArr[i].speak();
			// => 컴파일 단계에서는 참조변수타입(부모타입)의 메소드를 가리킴!
			// => 실행 시 생성된 객체(클래스)에서 재정의된 메소드가 실행됨! (동적바인딩)
		}
		// ---- 
		System.out.println("=========================");
		// 배열을 "자료형[] 배열명" 선언했다면
		// for-each문에는 "for(자료형 변수명 : 배열명)" 와 같이 작성!
		for(Animal animal : aniArr) {
			animal.speak();
			/*
			// 현재 문제 기준 Dog, Cat 클래스에서
			// speak 메소드를 모두 오버라이딩 했기 때문에 타입체크 생략가능!
			if (animal instanceof Dog)
				animal.speak();
			*/
			// => 오버라이딩된 메소드로 호출 가능!
		}
	}

}
