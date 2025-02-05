package com.kh.practice.dimension;
import java.util.Scanner;

public class DimensionPractice {

	public static void main(String[] args) {
		// practice1();
		// practice2();
		// practice3();
		// practice4();
		// practice5();
		// practice6();
		// practice7();
		practice8();
	}
	public static void practice8() {
		// [출석부]
		// 1. 강건강 2. 남나나 3. 도대담 4. 류라라 5. 문미미 6. 박보배
		// 7. 송성실 8. 윤예의 9. 진재주 10. 차천축 11. 피풍표 12. 홍하하
		// 1차원 배열에 학생 출석부 순 초기화
		String[] arr = { 
			"강건강", "남나나", "도대담", "류라라", "문미미", "박보배", 
			"송성실", "윤예의", "진재주", "차천축", "피풍표", "홍하하" 
		};
		String[][] arr2 = new String[3][2];
		String[][] arr3 = new String[3][2];
		// 2열 3행으로 2차원 배열 2개 나눠
		for(int i = 0; i < arr.length; i++) {
			
		}
		// 왼쪽부터 오른쪽, 1행에서 아래 행 순으로 자리 배치 
		
		// 데이터 출력
		
	}
	public static void practice7() {
		Scanner sc = new Scanner(System.in);
		// 사용자 행 크기 입력
		System.out.print("행의 크기 : ");
		int row = sc.nextInt();
		char[][] chArr = new char[row][];
		
		char ch = 'a';
		// 행 크기 만큼 반복하여 열 크기 입력
		for(int i = 0; i < row; i++) {
			System.out.printf("%d행의 열 크기 : ", i);
			int col = sc.nextInt();
			
			// 문자형 가변 배열 선언 및 할당
			chArr[i] = new char[col];
			for(int j = 0; j < col; j++) {
				// 각 인덱스에 'a'부터 총 인덱스의 개수만큼 하나씩 늘려 저장하고 출력 char a + 1
				chArr[i][j] = ch++;
			}
		}
		
		
		// 데이터 출력
		for(int i = 0; i < chArr.length; i++) {
			for(int j = 0; j < chArr[i].length; j++) {
				System.out.print(chArr[i][j] + " ");
			}
			System.out.println();
		}
	}
	public static void practice6() {
		// 초기화 배열 출력하기 근데 행과 열을 바꿔서
		// print 사용, 값 사이 띄어쓰기 추가
		String[][] strArr = new String[][] {
			{"이", "까", "왔", "앞", "힘"},
			{"차", "지", "습", "으", "냅"},
			{"원", "열", "니", "로", "시"},
			{"배", "심", "다", "좀", "다"},
			{"열", "히", "! ", "더", "!! "}
		};
		
		for(int i = 0; i < strArr.length; i++) {
			for(int j = 0; j < strArr[i].length; j++) {
				// 한 줄 출력 시 열 고정 행만 변경
				// j 반복문이 도는 동안 고정 값은 i
				System.out.print(strArr[j][i] + " ");
			}
			System.out.println();
		}
	}
	public static void practice5() {
		Scanner sc = new Scanner(System.in);
		int row;
		int col;
		char[][] chArr = new char[0][];
		
		do {
			// 2차원 배열의 행과 열의 크기 사용자 입력
			System.out.print("행 크기 : ");
			row = sc.nextInt();
			
			System.out.print("열 크기 : ");
			col = sc.nextInt();
			
			// 1 ~ 10사이 숫자가 아니면 "반드시 1 ~ 10 사이의 정수를 입력해야 합니다." 출력 후 다시 입력
			if(1 > row || row > 10 || 1 > col || col > 10) {
				System.out.println("반드시 1 ~ 10 사이의 정수를 입력해야 합니다.");
				continue;
			}

			chArr = new char[row][col];
			
			// 크기가 정해진 2차원 배열에 영어 대문자 랜덤 할당, A ~ Z, 65 ~ 90, 25 
			for(int i = 0; i < row; i++) {
				for(int j = 0; j < col; j++) {
					int random = (int)(Math.random() * 26); // 0 ~ 24
					char a = 'A';
					chArr[i][j] = (char)(a + random);
				}
			}
		} while(1 > row || row > 10 || 1 > col || col > 10);
		
		
		// 데이터 출력
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < col; j++) {
				System.out.printf("%-3c", chArr[i][j]);
			}
			System.out.println();
		}
	}
	public static void practice4() {
		// 4행 4열 2차원 배열 생성
		int[][] arr = new int[4][4];
		// 0행 0열 ~ 2행 2열, 1 ~ 10 중 임의 정수 할당
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				if(j < arr[i].length - 1 && i < arr.length - 1) {
					// 난수 생성
					int random = (int)(Math.random() * 10 + 1);
					// 할당
					arr[i][j] = random;
					// 열 마지막 인덱스에 이전 인덱스 값 합 복합 대입
					arr[i][arr[i].length - 1] += arr[i][j];
					// 행 마지막 인덱스에 이전 인덱스 값 합 복합 대입
					arr[arr.length - 1][j] += arr[i][j];
				} 
				if(i < arr.length - 1 && j == arr[i].length - 1){
					// i가 마지막 인덱스에 도달하지 못했을 경우
					// j문을 확인하고 마지막 인덱스에서 (arr.length - 1, arr[i].length - 1) 위치에 
					// 현재 행(i)의 마지막 열 값(arr[i].length - 1)을 합한다.
					arr[arr.length - 1][arr[i].length - 1] += arr[i][j];
				}
				if(j < arr[i].length - 1 && i == arr.length - 1) {
					// j가 마지막 인덱스에 도달하지 못했을 경우 
					// i문을 확인하고 마지막 인덱스에서 (arr.length - 1, arr[i].length - 1) 위치에 
					// 현재 행(i)의 마지막 인덱스 이전 열 값을 합한다.
					arr[arr.length - 1][arr[i].length - 1] += arr[i][j];
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
