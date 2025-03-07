package com.kh.practice.array;
import java.util.Scanner;

public class ArrayPractice {

	public static void main(String[] args) {
		// practice1();
		// practice2();
		// practice3();
		// practice4();
		// practice5();
		// practice6();
		// practice7();
		// practice8();
		// practice9();
		// practice10();
		// practice11();
		// practice12();
		// practice13();
		// practice14();
		// practice15();
		practice16();
	}
	public static void practice16() {
		Scanner sc = new Scanner(System.in);
		// 사용자가 입력한 배열의 길이 만큼 문자열 배열 선언 및 할당;
		System.out.print("배열의 크기를 입력하세요 : ");
		int num = sc.nextInt();
		sc.nextLine();
		
		String[] strArr = new String[num];
		
		// 배열의 인덱스에 넣을 값 사용자 입력 초기화
		for(int i = 0; i < num; i++) { 
			// 추가 인덱스에 값 입력
			System.out.printf("%d번째 문자열 : ", i + 1);
			strArr[i] = sc.nextLine();
			if(i == strArr.length - 1) {
				System.out.print("더 값을 입력하시겠습니까?(Y/N) : ");
				char answer = sc.next().charAt(0);
				if(answer == 'Y' || answer == 'y') {
					// 배열에 값 추가할지 질문 후 추가 개수 입력
					System.out.print("더 입력하고 싶은 개수 : ");
					num += sc.nextInt();
					String[] copyArr = new String[strArr.length];
					System.arraycopy(strArr, 0, copyArr, 0, strArr.length);
					strArr = new String[num];
					System.arraycopy(copyArr, 0, strArr, 0, copyArr.length);
					sc.nextLine();
				}
			}
		}
		// 더 이상 출력 안할 시 배열 전체 값 출력
		for(int i = 0; i < strArr.length; i++) {
			if(i == 0) {
				System.out.print("[");
			}
			System.out.print(strArr[i]);
			if(i < strArr.length - 1) {
				System.out.print(", ");	
			}
			if(i == strArr.length - 1) {
				System.out.print("]");
			}
		}
		
	}
	public static void practice15() {
		Scanner sc = new Scanner(System.in);
		// 문자열 입력
		System.out.print("문자열 : ");
		String str = sc.next();
		int strLength = str.length();
		
		char[] chArr = new char[strLength];
		int idx = 0;
		// 초기화
		for(int i = 0; i < strLength; i++) {
			boolean isDup = false;
			for(int j = 0; j < i; j++) {
				if(str.charAt(i) == chArr[j]) {
					isDup = true;
					break;
				}
			}
			if(!isDup) {
				chArr[idx++] = str.charAt(i);
			}
		}
		
		// 문자 개수랑 문자 출력
		System.out.print("문자열에 있는 문자 : ");
		for(int i = 0; i < idx; i++) {
			System.out.print(chArr[i]);
			if(i < idx - 1) {
				System.out.print(", ");	
			}
		}
		System.out.println();
		System.out.print("문자 개수 : " + (idx));
	}
	public static void practice14() {
		// 로또 번호 생성
		// 1 ~ 45, 6자리
		// 중복 값 없음
		// 오름차순 정렬 후 출력
		// 배열 선언 및 할당
		int[] lotto = new int[6];
		// 중복 검사
		for(int i = 0; i < lotto.length; i++) {
			lotto[i] = (int)(Math.random() * 45 + 1);
			for(int j = 0; j < i; j++) {
				if(lotto[i] == lotto[j]) {
					i--;
					break;
				}
			}
		}
		// 오름차순 정렬
		// * 배열 오름차순 정렬 메소드 java.util.Arrays, Arrays.sort(대상 배열);
		for(int i = 0; i < lotto.length; i++) {
			for(int j = 0; j < lotto.length; j++) {
				if(i != j) {
					if(lotto[i] < lotto[j]) {
						int tmp = lotto[i];
						lotto[i] = lotto[j];
						lotto[j] = tmp;
					}
				}
			}
		}
		
		for(int i = 0; i < lotto.length; i++) {
			System.out.print(lotto[i] + " ");			
		}
		

	}
	public static void practice13() {
		Scanner sc = new Scanner(System.in);
		// 10개 정수형 배열 선언 및 할당
		int[] arr = new int[10];
		
		// 1 ~ 10 사이 난수 중 중복 값이 없게 배열에 초기화 후 출력
		// 인덱스 초기화
		for(int i = 0; i < arr.length; i++) {
			int random = (int)(Math.random() * 10 + 1);
			arr[i] = random;
		}
		boolean isContains = true;
		
		do {
			isContains =false;
			for(int i = 0; i < arr.length; i++) {
				// 중복 검사
				for(int j = 0; j < arr.length; j++) {
					if(i != j && arr[i] == arr[j]) {
						int random = (int)(Math.random() * 10 + 1);
						arr[i] = random;
						isContains = true;
					}
				}
			}
		} while(isContains);
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	public static void practice12() {
		Scanner sc = new Scanner(System.in);
		// 10개 정수형 배열 선언 및 할당
		// 1 ~ 10 사이의 난수를 배열에 초기화 후 출력
		
		int[] arr = new int[10];
		int min = 10;
		int max = 1;
		
		for(int i = 0; i < arr.length; i++) {
			int random = (int)(Math.random() * 10 + 1);
			arr[i] = random;
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
			if(arr[i] < min) {
				min = arr[i];
			} 
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println();
		System.out.printf("최대값 : %d ", max);
		System.out.printf("최소값 : %d", min);
	}
	public static void practice11() {
		Scanner sc = new Scanner(System.in);
		// 10개 정수형 배열 선언 및 할당
		// 1 ~ 10 사이의 난수를 배열에 초기화 후 출력
		
		int[] arr = new int[10];
		
		for(int i = 0; i < arr.length; i++) {
			int random = (int)(Math.random() * 10 + 1);
			arr[i] = random;
		}
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	public static void practice10() {
		Scanner sc = new Scanner(System.in);
		// 주민등록번호 입력
		System.out.print("주민등록번호(-포함) : ");
		String str = sc.next();
		char[] chArr = new char[str.length()];
		// 원본 배열 값 변경 없이 배열 복사본 변경
		for(int i = 0; i < chArr.length; i++) {
			chArr[i] = str.charAt(i);
		}
		// 성별 자리 이후부터 *로 표시
		char[] chArr2 = new char[chArr.length];
		for(int i = 0; i < chArr2.length; i++) {
			// 8번째부터 *로 표시
			if(i >= 8) {
				chArr2[i] = '*';
			} else {
				chArr2[i] = chArr[i];				
			}
		}
		
		for(int i = 0; i < chArr2.length; i++) {
			System.out.print(chArr2[i]);
		}
	}
	public static void practice9() {
		Scanner sc = new Scanner(System.in);
		// 사용자 입력
		System.out.print("치킨 이름을 입력하세요 : ");
		String str = sc.next();
		
		// 치킨 메뉴가 들어가 있는 배열은 자유
		String[] arr = new String[] {"양념", "후라이드"};
		boolean isPos = false;
 		// 입력 값이 배열에 있는지 확인 
		for(int i = 0; i < arr.length; i++) {
			if(arr[i].equals(str)) {
				isPos = true;
				break;
			}
		}
		if(isPos) {
			System.out.printf("%s치킨 배달 가능", str);
		} else {
			System.out.printf("%s치킨은 없는 메뉴입니다.", str);
		}
	}
	public static void practice8() {
		Scanner sc = new Scanner(System.in);
		int num;
		do {
			// 3 이상인 홀수 자연수 입력 
			System.out.print("정수 : ");
			num = sc.nextInt();
			if(num < 3 || num % 2 == 0) {
				// 입력한 정수가 홀수가 아니거나 3미만인 경우 "다시 입력하세요" 출력 후 다시 입력
				System.out.println("다시 입력하세요");
			} else {
				int[] arr = new int[num];
				int midIdx = (arr.length - 1) / 2;
				for(int i = 0; i < num; i++) {
					if(i <= midIdx) {
						// 배열의 중간까지 1부터 1씩 오름차순 값 할당
						arr[i] = i + 1;
					} else {
						// 중간 이후 1씩 내림 차순 값 할당 출력
						arr[i] = arr.length - i;
					}
				}
				for(int i = 0; i < arr.length; i++) {
					System.out.print(arr[i]);
					if(i < arr.length - 1) {
						System.out.print(", ");	
					}
				}
			}
		} while(num < 3 || num % 2 == 0);
	}
	public static void practice7() {
		Scanner sc = new Scanner(System.in);
		// 사용자가 배열 길이 입력
		System.out.print("정수 : ");
		int num = sc.nextInt();
		// 입력 값 만큼 정수형 배열 선언 및 할당
		int[] arr = new int[num];
		// 배열의 크기만큼 사용자가 직접 입력한 값 할당
		for(int i = 0; i < arr.length; i++) {
			System.out.printf("배열 %d번째 인덱스에 넣을 값 : ", i);
			arr[i] = sc.nextInt();
		}
		
		// 배열 전체 값 나열 후 각 인덱스에 저장된 값들의 합 출력
		int total = 0;
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
			total += arr[i];
		}
		System.out.println();
		System.out.print("총 합 : " + total);
	}
	public static void practice6() {
		Scanner sc = new Scanner(System.in);
		// 월 ~ 일 까지 초기화된 문자열 배열 생성
		String[] week = new String[] {"월", "화", "수", "목", "금", "토", "일"};
		
		// 0 ~ 6까지 숫자 입력
		System.out.print("0 ~ 6 사이 숫자 입력 : ");
		int num = sc.nextInt();
		// 범위에 없는 숫자 입력 시 "잘못 입력하셨습니다" 출력
		if(6 < num || num < 0) {
			System.out.println("잘못 입력하셨습니다.");
		} else {
			// 입력한 숫자와 같은 인덱스에 있는 요일 출력
			for(int i = 0; i < week.length; i++) {
				if(i == num) {
					System.out.printf("%s요일", week[i]);
				}
			}			
		}
	}
	public static void practice5() {
		Scanner sc = new Scanner(System.in);
		
		// 문자열 입력
		System.out.print("문자열 : ");
		String str = sc.next();
		System.out.print("문자 : ");
		String str2 = sc.next();
		char ch = str2.charAt(0);
		
		// 문자 하나씩 배열 각 인덱스에 할당
		char[] arr = new char[str.length()];
		// 검색할 문자가 문자열에 몇 개 들어가 있는지 개수와 위치 인덱스 출력 
		for(int i = 0; i < arr.length; i++) {
			arr[i] = str.charAt(i);
		}
		
		System.out.printf("%s에 %c가 존재하는 위치(인덱스) : ", str, ch);
		int count = 0;
		for(int i = 0; i < arr.length; i++) {
			if(ch == arr[i]) {
				System.out.print(i + " ");
				count++;
			}
		}
		System.out.println();
		System.out.printf("%c 개수 : ", ch);
		System.out.print(count);
	}
	public static void practice4() {
		// 길이가 5인 String 배열 선언
		String[] arr = new String[5];
		// "사과", "귤", "포도", "참외"로 초기화
		arr[0] = "사과";
		arr[1] = "귤";
		arr[2] = "포도";
		arr[3] = "복숭아";
		arr[4] = "참외";
		// 배열 인덱스 사용해서 "귤" 출력
		System.out.println(arr[1]);
	}
	public static void practice3() {
		Scanner sc = new Scanner(System.in);
		// 사용자 정수 입력 
		System.out.print("양의 정수 : ");
		int num = sc.nextInt();
		// 입력 정수 만큼 배열 크기 할당
		int[] arr = new int[num];
		// 1 ~ 입력 받은 값까지 배열에 초기화 후 출력
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
		}
		System.out.println();
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	public static void practice2() {
		// 길이가 10인 배열 선언
		int[] arr = new int[10];
		// 1부터 10까지 반복문 사용하여 각 인덱스에 역순으로 값 할당
		// 인덱스는 0 ~ 9
		for(int i = 0; i < arr.length; i++) {
			arr[i] = arr.length - i;
		}
		// 값 출력
		System.out.println();
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	public static void practice1() {
		// 길이가 10인 배열 선언
		int[] arr = new int[10];
		// 1부터 10까지 반복문 사용하여 각 인덱스에 순서대로 값 할당
		// 인덱스는 0 ~ 9
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
		}
		// 값 출력
		System.out.println();
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
