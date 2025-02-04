package com.kh.array.pratice;

import java.util.Scanner;

public class DimensionPractice {

	public static void main(String[] args) {
		// practice2();
		// practice4();
		// practice4_1();
		practice7();
	}
	/*
		사용자에게 행의 크기를 입력 받고 그 수만큼의 반복을 통해 열의 크기도 받아 
		문자형 가변 배열을 선언 및 할당하세요.
		
		그리고 각 인덱스에 ‘a’부터 총 인덱스의 개수만큼 하나씩 늘려 저장하고 출력하세요
	*/
	public static void practice7() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("행의 크기 : ");
		int row = sc.nextInt();
		
		if(row > 0) {
			char[][] arr = new char[row][];	// 입력받은 행의 크기만큼 가변 배열 선언 및 할당
			
			for(int i=0; i<arr.length; i++) {
				System.out.printf("%d행의 열 크기 : ", i);
				int col = sc.nextInt();
				
				arr[i] = new char[col];	     // 입력받은 열 크기로 1차원 배열 할당
			}
			
			// --------------------------------
			char ch = 'a';
			for(int i=0; i<arr.length; i++) {
				for(int j=0; j<arr[i].length; j++) {
					arr[i][j] = ch++;
					// ch++;
				}
			}
			
			// * 출력
			for(int i=0; i<arr.length; i++) {
				for(int j=0; j<arr[i].length; j++) {
					System.out.print(arr[i][j] + " ");
				}
				System.out.println();
			}
		}
		
	}
	
	/*
		4행 4열 2차원 배열을 생성하여 
		0행 0열부터 2행 2열까지는 1~10까지의 임의의 정수 값 저장 후
		아래의 내용처럼 처리하세요.

		값   값    값    0행값들합
		값   값    값    1행값들합
		값   값    값    2행값들합
		0열합 1열합 2열합  가로세로합
	 */
	public static void practice4_1() {
		// 4행 4열 2차원 배열 생성 (선언 및 할당)
		int[][] arr = new int[4][4];
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				
				// 마지막 행의 인덱스
				int lastRow = arr.length - 1;	 // 3
				// 마지막 열의 인덱스
				int lastCol = arr[i].length - 1; // 3 
				
				if (i<lastRow && j<lastCol) {
					// 0,0 ~ 2,2 위치에 랜덤값을 저장
					arr[i][j] = (int)(Math.random()*10+1);
				}
				
				// 행의 위치가 마지막행이 아닌 경우
				// 현재 값을 더해서 마지막 행에 저장
				if (i < lastRow) {
					arr[lastRow][j] += arr[i][j];
				}
				
				// 마지막 열의 위치에 현재값 저장
				if (j < lastCol) {
					arr[i][lastCol] += arr[i][j];
				}				
				
			}
		}
		
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.printf("%3d ",arr[i][j]);
			}
			System.out.println();
		}
	}
	
	public static void practice4() {
		// 4행 4열 2차원 배열 생성 (선언 및 할당)
		int[][] arr = new int[4][4];
		
		// * 0행 0열부터 2행 2열까지 1 ~ 10사이의 랜덤값을 저장
		for(int i=0; i<3; i++) {		// 0행 ~ 2행
			for(int j=0; j<3; j++) {	// 0열 ~ 2열
				arr[i][j] = (int)(Math.random()*10+1);
			}
		}
		// * 마지막행과 마지막열에 값을 더하여 저장
//		arr[3][0] = arr[0][0] + arr[1][0] + arr[2][0];
//		arr[3][1] = arr[0][1] + arr[1][1] + arr[2][1];
//		arr[3][2] = arr[0][2] + arr[1][2] + arr[2][2]; 
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				arr[3][i] += arr[j][i]; 
				// i=0) j=0) arr[3][0] = arr[3][0] + arr[0][0];
				// i=0) j=1) arr[3][0] = arr[3][0] + arr[1][0];
				// i=0) j=2) arr[3][0] = arr[3][0] + arr[2][0];
				
				// i=1) j=0) arr[3][1] = arr[3][1] + arr[0][1];
				// i=1) j=1) arr[3][1] = arr[3][1] + arr[1][1];
				// i=1) j=2) arr[3][1] = arr[3][1] + arr[2][1];
			}
		}
		
//		arr[0][3] = arr[0][0] + arr[0][1] + arr[0][2];
//		arr[1][3] = arr[1][0] + arr[1][1] + arr[1][2];
//		arr[2][3] = arr[2][0] + arr[2][1] + arr[2][2];
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				arr[i][3] += arr[i][j];
			}
		}
		
		arr[3][3] = arr[3][0] + arr[3][1] + arr[3][2]
					+ arr[0][3] + arr[1][3] + arr[2][3];
		
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.printf("%3d ",arr[i][j]);
			}
			System.out.println();
		}
	}
	
	
	
	/*
	 * 4행 4열짜리 정수형 배열을 선언 및 할당하고
	   1) 1 ~ 16까지 값을 차례대로 저장하세요.
	   2) 저장된 값들을 차례대로 출력하세요.
	 */
	public static void practice2() {
		// 4행 4열짜리 정수형 배열을 선언 및 할당
		int[][] arr = new int[4][4];
		
		// 1 ~ 16까지 값을 차례대로 저장
		/*    
		int value = 1;  // 저장할 값에 대한 변수 사용
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] = value++;
				// value++;
			}
		}
		*/
		/*
				1  2  3  4  -> 1+(4*0) 2+(4*0) 3+(4*0) 4+(4*0)
				5  6  7  8  -> 1+(4*1) 2+(4*1) 3+(4*1) 4+(4*1)
				9 10 11 12  -> 1+(4*2) 2+(4*2) 3+(4*2) 4+(4*2)
			   13 14 15 16  -> 1+(4*3) 2+(4*3) 3+(4*3) 4+(4*3)
		 */
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] = (j+1)+(4*i);
			}
		}
		
		// 출력
		for(int i = 0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.printf("%2d ", arr[i][j]);
			}
			System.out.println();
		}
	}

}





