package com.kh.operator;
import java.util.Scanner;
public class Practice {

	public static void main(String[] args) {
		
		// example01();
		// example02();
		example03();
	}
	public static void example03() {
		/*
		 * 산술 연산자 활용 예제_
		 * 키와 몸무게를 입력받아 BMI를 계산하여 출력
		 * * BMI: 몸무게 / (키(m) * 키(m));
		 * * BMI 판정 기준
		 * - 18.5 이하: 저체중
		 * - 18.5 < BMI <= 22.9 : 정상
		 * - 23.0 <= BMI <= 24.9 : 과체중
		 * - 25 <= BMI : 비만
		 * 
		 * 출력 예) "BMI 지수는 xx.x로 정상입니다."
		 */
		Scanner sc = new Scanner(System.in);
		
		// 키 입력 받기, 100cm = 1m; 
		System.out.print("키 입력(cm): ");
		double height = sc.nextDouble();
		
		// 키 m 단위로 환산
		height = height * 0.01;
		
		// 몸무게 입력 받기
		System.out.printf("몸무게 입력(kg): ");
		double weight = sc.nextDouble();
		
		
		// BMI 계산, 몸무게 / (키(m) * 키(m));
		double bmi = weight / (height * height);
		System.out.printf("BMI: %.1f\n", bmi);
		
		/*
		 * - 18.5 이하: 저체중
		 * - 18.5 < BMI <= 22.9 : 정상
		 * - 23.0 <= BMI <= 24.9 : 과체중
		 * - 25 <= BMI : 비만
		 */
		String result = (bmi <= 18.5) ? "저체중" :
						(18.5 < bmi && bmi <= 22.9) ? "정상" :
						(23.0 <= bmi && bmi <= 24.9) ? "과체중" : "비만";
		
		System.out.printf("BMI 지수는 %.1f로 %s입니다.", bmi, result);		
	}
	/*
	 * [2] 비교 연산자, 논리 연산자
	 * 이항 연산자
	 * 결과 값: 참(true) 또는 거짓(false)
	 */
	public static void example02() {
		/*
		 * 나이를 입력받아 초등학생, 중학생, 고등학생인지 구분하여 출력 (+ 그 외 "알수 없음")
		 * - 초등학생: 8 ~ 13
		 * - 중학생: 14 ~ 16
		 * - 고등학생: 17 ~ 19
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("나이를 입력해주세요: ");
		int inputAge = sc.nextInt();

		String result = "알수없음"; // "알수없음" 값으로 초기화
		// 초등학생 확인
		result = 8 <= inputAge && inputAge <= 13 ? "초등학생" : result;
		// 중학생 확인
		result = 14 <= inputAge && inputAge <= 16 ? "중학생" : result;
		// 고등학생 확인
		result = 17 <= inputAge && inputAge <= 19 ? "고등학생" : result;
		
		System.out.println("결과: " + result);
		
		System.out.println(
			(inputAge >= 8 && inputAge <= 13) ? "초등학생 입니다." 
			: (inputAge >= 14 && inputAge <= 16) ? "중학생 입니다." 
			: (inputAge >= 17 && inputAge <= 19) ? "고등학생 입니다." 
			: "알수 없음"
		);
		
		// ---------------------------------------------------------------
		// SCE 
		// => &&, || 연산자가 수행될 때 두 항을 모두 실행하지 않아도 결과를 알 수 있는 경우 
		// 뒤 수식 연산을 수행하지 않는다.
		// * &&: 앞 조건 연산이 false일 때 뒤 조건 연산 수행 x
		// * ||: 앞 조건 연산이 true일 때 뒤 조건 연산 수행 x
		
		int num = 10;
		int i = 3;
		boolean result2;
		
		result2 = ((num += 15) < 0) && ((i *= 2) > 2);
		System.out.println("======= && 연산 결과 =======");
		System.out.println("result2: " + result2);
		System.out.println("i: " + i);
		System.out.println("num: " + num);
		// => result2: false, i: 3, num: 25
		
		result2 = ((num += 15) < 0 || ((i *= 2) > 2));
		System.out.println("======= || 연산 결과 =======");
		System.out.println("result2: " + result2);
		System.out.println("i: " + i);
		System.out.println("num: " + num);
		// => result2: true, i: 6, num: 40
	}
	/*
	 * [1] 복합 대입 연산자
	 * 대입 연산자와 다른 연산자를 조합해 하나의 연산자처럼 사용되는 연산자
	 * n1 += 10; => n1 = n1 + 10;
	 */
	public static void example01() {
		Scanner sc = new Scanner(System.in);
		/*
		 * 사용자로부터 숫자를 입력받아 그 값에 7L을 더한 결과 출력
		 * 
		 * 숫자를 입력받을 때 short 자료형 사용 
		 */
		System.out.print("숫자를 입력해주세요(-32,768 ~ 32,767): ");
		short inputNum = sc.nextShort();
		
		// inputNum += 7L;
		
		// 복합 대입 연산자를 사용하지 않은 경우
		// 복합 대입 연산자를 사용하는 경우 아래와 같이 자동으로 강제 형변환
		// inputNum = (short)(inputNum + (short)7L);
		// 복합 대입 연산자는 아래와 같이 수행한다고 이해해야 함
		inputNum = (short)(inputNum + 7L);
		
		// System.out.printf("입력받은 값 + 7L = %d", inputNum);
		System.out.println("입력 값: " + inputNum + ", 7L을 더한 값: " + (inputNum += 7L));
	}
}
