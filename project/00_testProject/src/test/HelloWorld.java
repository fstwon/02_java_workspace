package test;

public class HelloWorld {
	public static void main(String[] args) {
		// 이클립스 실행: Ctrl + F11
		/*
		 * 자바 주석 작성 방법
		 */
//		System.out.println("한글 확인");
//		
//		System.out.println(7);
//		System.out.println("3 + 5 = " + 8);
//		System.out.println(3.15 + "는 실수입니다.");
//		System.out.println("3 + 5" + "의 연산 결과는 8입니다.");
//		System.out.println("3 + 5");
//		
//		System.out.println("-----");
//		
//		String name = "Wonil";
//		char gender = 'M';
//		
//		
//		String str = "기차" + 123 + 45 + "출발";
//		String str2 = 123 + 45 + "기차" + "출발";
//		System.out.println(str);
//		System.out.println(str2);
//		
//		char ch = 'A';
//		int chNum = ch; // 강제 형변환 적용
//		// 65
//		float f = 1.09f; // 강제 형변환 적용
//		int num = (int)f;
//		// 1
//
//		double a = 10.0;
//		float b = (float)a;
//		
//		System.out.println(chNum);
//		System.out.println(num);
//		System.out.println(b);
		
		
//		int a = 10;
//		int b = a++;
//		
//		System.out.println(a + ", " + b);
//		System.out.println(a + ", " + b);
		
		int a = 10;
		int b = 5;

//		int result = a == b ? a++ : b--; // 5
		int result = a != b ? a++ : b--; // 10
		System.out.println("result: " + result);
	}
}
