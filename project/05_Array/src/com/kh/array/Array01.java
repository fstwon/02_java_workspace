package com.kh.array;

public class Array01 {
	public static void main(String[] args) {
		// 배열 선언 : 정수형 배열 변수 arr 선언
		int[] arr; // 또는 int arr[];
		
		// 할당 : arr 변수에 5개 크기의 배열 할당
		arr = new int[5];
		
		// 값 대입 
		/*
		arr[0] = 0;
		arr[1] = 1;
		arr[2] = 2;
		arr[3] = 3;
		arr[4] = 4;
		*/
		
		// 반복문 활용하여 대입
		for(int i = 0; i < arr.length; i++) {
			// arr[i] = i; // 0 ~ 4
			arr[i] = i + 1;
			System.out.print(arr[i]);
		}
	}
}
