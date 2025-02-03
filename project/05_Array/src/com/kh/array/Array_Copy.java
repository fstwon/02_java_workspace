package com.kh.array;

public class Array_Copy {

	public static void main(String[] args) {
		// lightCopy();
		deepCopy();
	}
	public static void deepCopy() {
		// 깊은 복사 : 새로운 배열을 할당하여 값을 복사
		int[] origin = {1, 2, 3, 4, 5};
		
		// 복사본 배열 선언 및 할당(원본 배열의 길이)
		int[] copy = new int[origin.length];
		
		// for 문 사용 복사
		/*
		for(int i = 0; i < origin.length; i++) {
			copy[i] = origin[i];
		}
		copy[3] = 888;
		*/
		
		// System.arraycopy(원본배열, 복사 시작 인덱스, 복사본 배열, 복사본 배열 시작 인덱스, 복사 원소 개수);
		// System.arraycopy(origin, 0, copy, 0, origin.length);
		copy = new int[10]; // [0, 0, 0, 0, 3, 4, 5, 0, 0, 0];
		// origin = [1, 2, 3, 4, 5];
		System.arraycopy(origin, 2, copy, 4, 3);
		
		System.out.println("=== 원본 배열 출력 ===");
		for(int i = 0; i < origin.length; i++) {
			System.out.print(origin[i] + " ");
		}
		System.out.println();
		System.out.println("=== 복사본 배열 출력 ===");
		for(int i = 0; i < copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
	}
	public static void lightCopy() {
		// 얕은 복사 : Heap 메모리의 주소 값 복사
		int[] origin = {1, 2, 3, 4, 5};
		
		System.out.println("=== 원본 배열 출력 ===");
		
		for(int i = 0; i < origin.length; i++) {
			System.out.print(origin[i] + " ");	
		}
		System.out.println();
		// 얕은 복사
		int[] copy = origin;
		
		System.out.println("=== 복사본 배열 출력 ===");
		for(int i = 0; i < copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
		System.out.println();
		copy[2] = 999;
		
		System.out.println("=== 원본 배열 출력 ===");
		for(int i = 0; i < origin.length; i++) {
			System.out.print(origin[i] + " ");
		}
	}
}
