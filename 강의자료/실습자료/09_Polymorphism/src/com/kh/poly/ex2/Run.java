package com.kh.poly.ex2;

public class Run {

	public static void main(String[] args) {

		// [1] 부모타입 참조변수(레퍼런스)로 부모 객체를 다루는 경우
		Car c1 = new Car("Red", "가솔린", 2023);
		// Car  ---->   Car
		// *color		*color
		// *fuel		*fuel
		// *year		*year
		// *drive()		*drive()
		c1.drive();
		
		// [2] 자식타입 참조변수로 자식객체를 다루는 경우
		Sonata c2 = new Sonata("White", "가스", 2025);
		// Sonata    ---->    Sonata
		// *color		      *color
		// *fuel		      *fuel
		// *year		      *year
		// *drive()		      *drive()
		// *moveSonata()      *moveSonta()
		c2.drive();
		c2.moveSonata();
		System.out.println("**************************");
		// [3] 부모 타입의 참조변수로 자식 객체를 다루는 경우
		Car c3 = c2;	// => Car c3 = new Sonata();
		/*
		 *    Car      ------->   Sonata
		 *    *color			  *color
		 *    *fuel				  *fuel
		 *    *year				  *year
		 *    *drive()			  *drive()
		 *    					  *moveSonata()
		 */
		c3.drive();
		
		// c3.moveSonata();	// => 오류 발생!
		// c3변수를 사용하여 moveSonata 메소드를 호출하고 싶다면..?
		// => 강제형변환! (다운캐스팅)
		((Sonata)c3).moveSonata();
		// --------------------------------------
		/*
		 * * 다형성 : 부모 타입으로부터 파생된 여러 타입의 자식 객체들을
		 *          부모 타입 하나로 다룰 수 있는 기술!
		 *          
		 *   - 장점 : 하나의 부모 타입만으로 여러 자식 객체들을 다룰 수 있어
		 *   		 "편리"하고, "코드 길이 감소"됨!
		 *   
		 *   * 클래스 간의 형변환 (*상속 관계에서 가능*)
		 *   - Up Casting
		 *     : 자식 타입 -> 부모 타입 형변환
		 *       자동형변환
		 *       ex) Car c1 = (Car)new Sonata();
		 *       
		 *   - Down Casting
		 *     : 부모 타입 -> 자식 타입 형변환
		 *       강제형변환 필요!
		 *       ex) ((Sonata)c1).moveSonata();
		 *       
		 *   * 동적 바인딩
		 *     : 프로그램이 실행되기 전에는 컴파일 되면서 정적바인딩됨!
		 *       (=> 참조변수타입의 메소드를 가리킴)
		 *       단, 실질적으로 참조하는 자식 클래스에 해당 메소드가 "오버라이딩"되어 있으면
		 *       프로그램 실행 시 동적으로 해당 "자식 클래스의 오버라이딩된 메소드를 찾아서 실행"
		 */
		// c3.drive();
		
		// * 다형성을 사용하기 전...
		Sonata[] sArr = new Sonata[3];	// Sonata 객체를 여러 개 저장하는 배열
		sArr[0] = new Sonata("black", "가솔린", 0);
		
		Avante[] vArr = new Avante[5];	// Avante 객체를 여러 개 저장하는 배열
		vArr[0] = new Avante("blue", "가스", 2020);
		
		for(Sonata s : sArr) {
			if(s != null)
				s.drive();
		}
		
		for(Avante v : vArr) {
			if (v != null)
				v.drive();
		}
		System.out.println("**************************");
		// * 다형성을 사용한다면...?
		Car[] cArr = new Car[10];
		cArr[0] = new Car();
		cArr[1] = new Sonata("검은색", "가솔린", 2010);
		cArr[2] = new Avante("흰색", "가스", 2025);
		
		for(Car c: cArr) {
			if (c != null) {
				c.drive();

				// 해당 클래스타입으로 생성된 인스턴스인가 확인!
				// 해당 클래스타입의 인스턴스를 참조하고 있는가 확인!
				if (c instanceof Sonata) {
					// Sonata 클래스의 moveSonata 메소드 호출
					((Sonata)c).moveSonata();
				} else if (c instanceof Avante) {
					((Avante)c).moveAvante();
				}
			}
		}
		System.out.println("**************************");
		for(int i=0; i<cArr.length; i++) {
			// cArr[i]; // <= 참조변수
			if (cArr[i] != null) {
				cArr[i].drive();
				
				if (cArr[i] instanceof Sonata) {
					((Sonata)cArr[i]).moveSonata();
				} else if (cArr[i] instanceof Avante) {
					((Avante)cArr[i]).moveAvante();
				}
			}
		}
	}

}







