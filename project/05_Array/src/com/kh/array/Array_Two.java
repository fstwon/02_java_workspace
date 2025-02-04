package com.kh.array;

public class Array_Two {

	public static void main(String[] args) {
		// practice1();
		practice2();
	}
	public static void practice2() {
		/*
		 * (0행 0열) (0행 1열) (0행 2열)
		 * (1행 0열) (1행 1열) (1행 2열)
		 * (2행 0열) (2행 1열) (2행 2열)
		 */
		// 3행 3열 2차원 배열 선언 및 할당
		String[][] arr = new String[3][3];
		// 데이터 저장
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = "(" + i + "행 " + j + "열" + ")";
			}
		}
		// 데이터 출력
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
	public static void practice1() {
		// * 배열 선언
		// 정수형 2차원 배열 arr 선언
		int[][] arr;
		
		// * 배열 할당
		// 크기가 4인 1차원 배열 3개 묶음
		// arr = new int[3][4];
		arr = new int[3][];
		/*
		arr[0] = new int[4];
		arr[1] = new int[4];
		arr[2] = new int[4];
		*/
		// 반복문 사용하여 변경
		for(int i = 0; i < arr.length; i++) {
			arr[i] = new int[4];
		}
		
		// 첫번째 1차원 배열에 값 대입
		/*
		arr[0][0] = 10;
		arr[0][1] = 20;
		arr[0][2] = 30;
		arr[0][3] = 40;
		*/
		// 반복문 사용
		for(int i = 0; i < arr[0].length; i++) {
			arr[0][i] = (i + 1) * 10;
		}
		
		// * 출력
		for(int i = 0; i < arr[0].length; i++) {
			System.out.print(false);
		}
	}
}
