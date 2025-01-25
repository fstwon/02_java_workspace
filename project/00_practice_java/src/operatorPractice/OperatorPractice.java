package operatorPractice;
import java.util.Scanner;

public class OperatorPractice {

	public static void main(String[] args) {
		// practice01();
		// practice02();
		// practice03();
		// practice04();
		// practice05();
		// practice06();
		// practice07();
		// practice08();
		practice09();
		// practice10();
		// practice11();
	}
	public static void practice01() {
		System.out.println("practice 01");
		Scanner sc = new Scanner(System.in);
		
		// 정수 입력 받기
		System.out.print("정수: ");
		int num = sc.nextInt();
		String result = num > 0 ? "양수다" : "양수가 아니다";
		
		System.out.print(result);
	}
	public static void practice02() {
		System.out.println("practice 02");
		Scanner sc = new Scanner(System.in);
		
		// 정수 입력 받기
		System.out.print("정수: ");
		int num = sc.nextInt();
		String result = (num <= 0) ? (num == 0) ? "0이다" : "음수다" : "양수가 아니다";
		
		System.out.print(result);
	}
	public static void practice03() {
		System.out.println("practice 03");
		Scanner sc = new Scanner(System.in);
		
		// 정수 입력 받기
		System.out.print("정수: ");
		int num = sc.nextInt();
		String result = num % 2 == 0 ? "짝수다" : "홀수다";
		
		System.out.print(result);
	}
	public static void practice04() {
		System.out.println("practice 04");
		Scanner sc = new Scanner(System.in);
		// 인원수 입력
		System.out.print("인원 수: ");
		int peopleNum = sc.nextInt();
		
		// 사탕 개수 입력 
		System.out.print("사탕 개수: ");
		int totalCandy = sc.nextInt();
		
		// 나눠가진 사탕 개수, 남은 사탕 개수 출력
		// 입력 사탕 수 / 입력 인원 수 
		int candyPer1 = totalCandy / peopleNum;
		System.out.println("1인당 사탕 개수: " + candyPer1);
		int leftCandy = totalCandy % peopleNum;
		System.out.println("남는 사탕 개수: " + leftCandy);
	}
	public static void practice05() {
		System.out.println("practice 05");
		Scanner sc = new Scanner(System.in);
		// 이름
		System.out.print("이름: ");
		String name = sc.nextLine();
		
		// 학년(숫자만)
		System.out.print("학년(숫자만): ");
		int grade = sc.nextInt();
		
		// 반(숫자만)
		System.out.print("반(숫자만): ");
		int classes = sc.nextInt();
		
		// 번호(숫자만)
		System.out.print("번호(숫자만): ");
		int number = sc.nextInt();
		
		// 성별(M/F)
		System.out.print("성별(M/F): ");
		String genderStr = sc.next();
		char gender = genderStr.charAt(0);
		gender = gender == 'M' ? '남' : '여';
		
		// 성적(소수점 아래 둘째자리까지)
		System.out.print("성적(소수점 아래 둘째자리까지): ");
		double achievement = sc.nextDouble();
		System.out.println(" ");
				
		// 0학년 0반 00번 000 0학생의 성적은 00.00이다.
		System.out.printf("%d학년 %d반 %d번 %s %c학생의 성적은 %.2f이다.", grade, classes, number, name, gender, achievement);
	}
	public static void practice06() {
		System.out.println("practice 06");
		Scanner sc = new Scanner(System.in);
		// 나이 입력
		System.out.print("나이: ");
		int age = sc.nextInt();
		
		// 나이 <= 13, 어린이
		// 13 < 나이 <= 19, 청소년
		// 성인		
		String result = (age <= 13) ? "어린이" :
						(13 < age && age <= 19) ? "청소년" :
						(19 < age) ? "성인" : "알수없음";
		System.out.print(result);
	}
	public static void practice07() {
		System.out.println("practice 07");
		Scanner sc = new Scanner(System.in);
		// 국어
		System.out.print("국어: ");
		int langKo = sc.nextInt();
		// 영어
		System.out.print("영어: ");
		int langEn = sc.nextInt();
		// 수학
		System.out.print("수학: ");
		int math = sc.nextInt();
		System.out.print("\n");
		
		// 합계
		int total = langKo + langEn + math;
		System.out.printf("합계: %d\n", total);
		
		// 평균
		double avg = total / 3;
		System.out.printf("평균: %.1f\n", avg);
		
		// 합격 여부
		// 세 과목 모두 40점 이상이고 평균이 60점 이상이면 합격
		String result = (langKo >= 40 && langEn >= 40 && math >= 40 && avg >= 60) ? "합격" : "불합격";  
		System.out.print(result);
	}
	public static void practice08() {
		System.out.println("practice 08");
		Scanner sc = new Scanner(System.in);
		// 주민번호를 입력하세요(- 포함)
		System.out.print("주민번호를 입력하세요(-포함)");
		String rn = sc.nextLine();
		char genderNum = rn.charAt(7);
		// genderNum == 1 이면 남자 아니면 여
		String result = genderNum == '1' ? "남자" : "여자";
		System.out.print(result);
	}
	public static void practice09() {
		System.out.println("practice 09");
		Scanner sc = new Scanner(System.in);
		// 정수 두 개 입력
		// num1
		System.out.print("정수1: ");
		int num1 = sc.nextInt();
		
		// num2
		System.out.print("정수2: ");
		int num2 = sc.nextInt();
		
		// pivot
		System.out.print("입력: ");
		int pivot = sc.nextInt();
		System.out.print("\n");
		
		// num1이 num2보다 작고 입력 값이 <= num1 이하  > num2 초과
		boolean result = (num1 < num2) && (num2 < pivot || pivot <= num1);
		// num1과 num2의 사이 값이라고만 생각하고 작업. 
		// 문제가 이해 안되면 그림으로 표현
		System.out.print(result);
	}
	public static void practice10() {
		System.out.println("practice 10");
		Scanner sc = new Scanner(System.in);
		// 3개의 수 입력
		// num1
		System.out.print("입력1 :");
		int num1 = sc.nextInt();
		
		// num2
		System.out.print("입력2 :");
		int num2 = sc.nextInt();
		
		// num3
		System.out.print("입력3 :");
		int num3 = sc.nextInt();
		
		// 모두 같으면 true 아니면 false
		boolean result = num1 == num2 && num2 == num3;
		
		System.out.print(result);
	}
	public static void practice11() {
		System.out.println("practice 10");
		Scanner sc = new Scanner(System.in);
		int pivot = 3000;
		// a, b, c 사원 연봉 입력
		
		// a
		System.out.print("A사원의 연봉: ");
		int salA = sc.nextInt();
		// a 인센티브
		double incenA = salA * 0.4;
		// a 총 연봉
		double totalSalA = salA + incenA;
		String isOver3000A = totalSalA >= pivot ? "3000 이상" : "3000 미만";
		
		// b
		System.out.print("B사원의 연봉: ");
		int salB = sc.nextInt();
		// b 인센티브
		double incenB = salB * 0;
		// b 총 연봉
		double totalSalB = salB + incenB;
		String isOver3000B = totalSalB >= pivot ? "3000 이상" : "3000 미만";
		
		// c
		System.out.print("C사원의 연봉: ");
		int salC = sc.nextInt();
		// c 인센티브
		double incenC = salC * 0.15;
		double totalSalC = salC + incenC;
		// c 총 연봉
		String isOver3000C = totalSalC >= pivot ? "3000 이상" : "3000 미만";
		
		System.out.print("\n");
		
		// 3000 이상이면 "3000 이상" 미만이면 "3000 미만"
		System.out.printf("A사원의 연봉/연봉+a: %d/%.1f\n", salA, totalSalA);
		System.out.println(isOver3000A);
		System.out.printf("B사원의 연봉/연봉+a: %d/%.1f\n", salB, totalSalB);
		System.out.println(isOver3000B);
		System.out.printf("C사원의 연봉/연봉+a: %d/%f\n", salC, totalSalC);
		System.out.println(isOver3000C);
	}
}
