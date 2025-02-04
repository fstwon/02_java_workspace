package com.kh.array;

public class Array_Copy {

	public static void main(String[] args) {
		// lightCopy();
		deepCopy();
	}
	
	// 깊은 복사: 새로운 배열을 할당하여 값을 복사
	public static void deepCopy() {
		int[] origin = { 1, 2, 3, 4, 5 };
		// 복사본(copy) 배열 선언 및 할당(원본배열의 길이만큼)
		int[] copy = new int[origin.length];
		
		/*
		// * for문을 사용하여 복사하기 *
		for(int i = 0; i < copy.length ;i++) {
			copy[i] = origin[i];
		}
		*/
		
		// * System.arraycopy(원본배열, 복사를시작할인덱스, 
						// 복사본배열, 복사본배열의시작인덱스, 복사할갯수);
		// System.arraycopy(origin, 0, copy, 0, origin.length);
		copy = new int[10]; // [0, 0, 0, 0, 3, 4, 5, 0, 0, 0]
		System.arraycopy(origin, 2, copy, 4, 3);
		
		// * copy 배열 값 출력
		System.out.println("=== 복사본 배열 출력 ===");
		for(int i=0; i<copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
		System.out.println();
		
		copy[3] = 888;
		
		// origin 배열 값 출력
		System.out.println("=== 원본 배열 출력 ===");
		for(int i=0; i<origin.length; i++) {
			System.out.print(origin[i] + " ");
		}
		System.out.println();
		
		System.out.println("=== 복사본 배열 출력 ===");
		for(int i=0; i<copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
		System.out.println();
	}

	// 얕은복사: 주소값 복사 
	public static void lightCopy() {
		int[] origin = { 1, 2, 3, 4, 5 };

		System.out.println("=== 원본 배열 출력 ===");
		for (int i = 0; i < origin.length; i++) {
			System.out.print(origin[i] + " ");
		}
		System.out.println();

		int[] copy = origin;
		// => 얕은 복사 : 주소값 복사!
		System.out.println("=== 복사본 배열 출력 ===");
		for (int i = 0; i < copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
		System.out.println();

		copy[2] = 999;

		System.out.println("=== 원본배열 출력 ===");
		for (int i = 0; i < origin.length; i++) {
			System.out.print(origin[i] + " ");
		}
		System.out.println();

		System.out.println("=== 복사본배열 출력===");
		for (int i = 0; i < copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
		System.out.println();
	}

}
