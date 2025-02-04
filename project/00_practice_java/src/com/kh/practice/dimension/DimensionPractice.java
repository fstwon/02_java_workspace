package com.kh.practice.dimension;

public class DimensionPractice {

	public static void main(String[] args) {
		// practice1();
		// practice2();
		// practice3();
		practice4();
	}
	public static void practice4() {
		// 4행 4열 2차원 배열 생성
		int[][] arr = new int[4][4];
		// 0행 0열 ~ 2행 2열, 1 ~ 10 중 임의 정수 할당
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				if(j < arr[i].length - 1) {
					// 난수 생성
					int random = (int)(Math.random() * 10 + 1);
					// 할당
					arr[i][j] = random;
					// 행 마지막 인덱스에 이전 인덱스 값 합 복합 대입
					arr[i][arr[i].length - 1] += arr[i][j];
				}
				// 열 마지막 인덱스에 이전 인덱스 값 합 복합 대입
				if(i >= arr.length - 1) {
					System.out.printf("(%d, %d) : %-3d", j, i, arr[j][i]);
					System.out.println();
					arr[arr.length - 1][j] += arr[j][i];
				}
			}
		}
		
		// 데이터 출력
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.printf("(%d, %d) : %-3d", i, j, arr[i][j]);
			}
			System.out.println();
		}
	}
	public static void practice3() {
		// 4행 4열 정수형 배열 선언 할당
		int [][] dimInt = new int[4][4];
		
		// 16 ~ 1과 같이 값을 역순으로 저장
		/*
		 * 16 - 0, 16 - 1, 16 - 2, 16 - 3 // 16, 4 x 4
		 * 12 - 0, 12 - 1, 12 - 2, 12 - 3 // 12, 4 x 3
		 * 8 - 0, 8 - 1, 8 - 2, 8 - 3 // 8, 4 x 2
		 * 4 - 0, 4 - 2, 4 - 2, 4 - 3 // 4, 4 x 1
		 */
		for(int i = 0; i < dimInt.length; i++) {
			for(int j = 0; j < dimInt[i].length ; j++) {
				// (dimInt[i].length * (dimInt.length - i)) - j;
				dimInt[i][j] = (dimInt[i].length * (dimInt.length - i)) - j;
			}
		}
						
		// 데이터 출력
		for(int i = 0; i < dimInt.length; i++) {
			for(int j = 0; j < dimInt[i].length; j++) {
				System.out.printf("%3d", dimInt[i][j]);
			}
			System.out.println();
		}
	}
	public static void practice2() {
		// 4행 4열짜리 정수형 배열 선언 및 할당
		int[][] dimInt = new int[4][4];
		
		// 1 ~ 16까지 값을 차례대로 할당
		for(int i = 0; i < dimInt.length; i++) {
			for(int j = 0; j < dimInt[i].length; j++) {
				dimInt[i][j] = (j + 1) + (dimInt[i].length * i);
			}
		}
		
		/*
		int value = 1;
		for(int i = 0; i < dimInt.length; i++) {
			for(int j = 0; j < dimInt[i].length; j++) {
				dimInt[i][j] = value++; 
			}
		}
		*/
		// 데이터 출력
		for(int i = 0; i < dimInt.length; i++) {
			for(int j = 0; j < dimInt[i].length; j++) {
				int num = dimInt[i][j];
				System.out.printf("%3d", num);
			}
			System.out.println();
		}
	}
	public static void practice1() {
		// 3행 3열 문자열 배열 선언 및 할당
		String[][] dimStr = new String[3][3];
		// 0행 0열 ~ 2행 2열까지 접근
		for(int i = 0; i < dimStr.length; i++) {
			for(int j = 0; j < dimStr[i].length; j++) {
				// "(0, 0)" 과 같은 문자열 데이터 할당
				dimStr[i][j] = "(" + i + ", " + j + ")";
			}
		}
		
		// 데이터 출력
		for(int i = 0; i < dimStr.length; i++) {
			for(int j = 0; j < dimStr[i].length; j++) {
				String str = dimStr[i][j];
				System.out.print(str);
			}
			System.out.println();
		}
	}
}
