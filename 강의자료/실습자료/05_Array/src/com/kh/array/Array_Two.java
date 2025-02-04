package com.kh.array;

public class Array_Two {
	/*
	 * 2차원 배열
	 * : "같은" 자료형의 "1차원 배열의 묶음"으로,
	 *   배열 안에 배열이 존재함!
	 * : 2차원 배열은 할당된 공간마다 인덱스 번호를 두 개 부여
	 *   ( 앞의 번호는 몇번째 1차원 배열인지(행),
	 *     뒤의 번호는 1차원 배열에서 몇번째 데이터인지(열) )
	 *     
	 * - 선언 [표현식] => 1차원 배열의 묶음을 참조하는 2차원 배열 참조변수를 만듬!
	 * 
	 * 		자료형[][] 변수명;
	 * 		-- 자료형 변수명[][];
	 * 		-- 자료형[] 변수명[];
	 * 
	 * - 할당 [표현식]
	 * 
	 * 		변수명 = new 자료형[행크기][열크기];
	 *      * 행크기 : 1차원 배열의 개수
	 *      * 열크기 : 1차원 배열의 길이 (생략 가능-> 가변길이의 1차원 배열 할당)
	 *      
	 *      1차원 배열의 참조변수 묶음을 먼저 생성
	 *      변수명 = new 자료형[n][];
	 *      변수명[0] = new 자료형[m];
	 *      변수명[1] = new 자료형[x];
	 *      변수명[n-1] = new 자료형[z];
	 *      // => 1차원 배열의 크기는 같을 수도 있고, 다를 수도 있음!
	 *      
	 * - 선언 및 할당 동시에 진행
	 * 
	 * 		자료형[][] 변수명 = new 자료형[행크기][열크기];
	 * 
	 * - 값 대입
	 * 
	 * 		변수명[배열순번][인덱스] = 값;
	 */

	public static void main(String[] args) {
		// practice1();
		practice2();
	}
	
	public static void practice2() {
		/*
			(0행 0열) (0행 1열) (0행 2열)
			(1행 0열) (1행 1열) (1행 2열)
			(2행 0열) (2행 1열) (2행 2열)
		 */
		// 위의 데이터를 저장할 2차원 배열 선언 및 할당
		// => 3행 3열의 문자열 배열
		String[][] data = new String[3][3];
		
		// 데이터 저장
//		data[0][0] = "(0행 0열)";
//		data[0][1] = "(0행 1열)";
//		data[0][2] = "(0행 2열)";
		/*
		for(int i=0; i<data[0].length; i++) {
			data[0][i] = "(0행 " + i + "열)";
		}
		for(int i=0; i<data[1].length; i++) {
			data[1][i] = "(1행 " + i + "열)";
		}
		for(int i=0; i<data[2].length; i++) {
			data[2][i] = "(2행 " + i + "열)";
		}
		*/
		for(int i=0; i<data.length; i++) {
			for(int j=0; j<data[i].length; j++) {
				data[i][j] = "(" + i + "행 " + j + "열)";
				// i=0) j=0) data[0][0] = "("+0+"행 "+0 + "열)";
				// i=0) j=1) data[0][1] = "(0행 1열)";
				// i=0) j=2) data[0][2] = "(0행 2열)";
			}
		}
		
		// 데이터 출력
		for(int i=0; i<data.length; i++) {
			for(int j=0; j<data[i].length; j++) {
				System.out.print(data[i][j] + " ");
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
		// arr = new int[3][4];		// (1)
		arr = new int[3][];			// (2)
		/*
		arr[0] = new int[4];
		arr[1] = new int[4];
		arr[2] = new int[4];
		*/
		// => 위의 코드를 반복문을 사용하여 변경
		for(int i=0; i<arr.length; i++) {
			arr[i] = new int[4];
		}
		
		// 첫번째 1차원 배열에 값을 대입
		/*
		 * arr = { {10, 20, 30, 40},
		 * 			{0, 0, 0, 0},
		 * 			{0, 0, 0, 0}
		 * 		 }; 
		 */
		/*
		arr[0][0] = 10; // 1 * 10 -> (i+1) * 10
		arr[0][1] = 20; // 2 * 10
 		arr[0][2] = 30; // 3 * 10
 		arr[0][3] = 40; // 4 * 10
 		*/
 		// => 반복문으로 변경해보자.
		for(int i=0; i < arr[0].length; i++) {
			arr[0][i] = (i+1) * 10;
			// i=0) arr[0][0] = (0+1)*10 => 1*10 => 10
			// i=1) arr[0][1] = (1+1)*10 => 2*10 => 20
			// ...
		}
		
		// * 출력
		for(int i=0; i < arr[0].length; i++) {
			System.out.print(arr[0][i] + " ");
		}
		System.out.println();
	}
	
}





