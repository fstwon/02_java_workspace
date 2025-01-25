package controlPractice;
import java.util.Scanner;

public class ControlPractice {

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
		practice10();
		// practice11();
	}
	public static void practice1() {
		Scanner sc = new Scanner(System.in);
		// 메뉴 번호 입력 받고 "ㅇㅇ메뉴입니다." 출력
		// 메뉴
		System.out.println("1. 입력");
		System.out.println("2. 수정");
		System.out.println("3. 조회");
		System.out.println("4. 삭제");
		System.out.println("7. 종료");
		
		System.out.print("메뉴 번호를 입력하세요 : ");
		int menuNum = sc.nextInt();
		String result = "%s 메뉴입니다.";
		
		switch(menuNum) {
			case 1:
				System.out.printf(result, "입력");
				break;
			case 2:
				System.out.printf(result, "수정");
				break;
			case 3:
				System.out.printf(result, "조회");
				break;
			case 4:
				System.out.printf(result, "삭제");
				break;
			case 7:
				System.out.printf("프로그램이 종료됩니다.");
				break;
			default:
				System.out.print("존재하지 않는 메뉴입니다.");	
		}

	}
	public static void practice2() {
		Scanner sc = new Scanner(System.in);
		// 정수 입력 
		System.out.print("숫자를 한 개 입력하세요. : ");
		int num = sc.nextInt();
		if(num < 0) {
			// 양수가 아닐 경우 "양수만 입력해주세요."
			System.out.print("양수만 입력해주세요.");
		} else {
			if(num % 2 == 0) {
				// 짝수 출력, "짝수다"
				System.out.print("짝수다");	
			} else {
				// 홀수 출력, "홀수다"
				System.out.print("홀수다");
			}
		}
	}
	public static void practice3() {
		Scanner sc = new Scanner(System.in);
		// 국어, 영어, 수학 점수 입력
		System.out.print("국어점수 : ");
		int ko = sc.nextInt();
		// 영어
		System.out.print("영어점수 : ");
		int en = sc.nextInt();
		// 수학
		System.out.print("수학점수 : ");
		int math = sc.nextInt();
		
		int cutLine = 40;
		int cutLineAvg = 60;
		// 각 40점 이상 
		if(ko >= cutLine && en >= cutLine && math >= cutLine) {
			// 합계
			int total = ko + en + math;
			// 평균
			double avg = (total / 3);
			if(avg >= cutLineAvg) {
				// 과목별 점수 출력
				System.out.println("국어 : " + ko);
				System.out.println("영어 : " + en);
				System.out.println("수학 : " + math);
				// 평균 60점 이상 합격, "축하합니다, 합격입니다!"
				System.out.printf("합계 : %d\n", total);
				System.out.printf("평균 : %.1f\n", avg);
				System.out.print("축하합니다, 합격입니다!");				
			} else {
				System.out.print("불합격입니다.");	
			}
		} else {
			// "불합격입니다."
			System.out.print("불합격입니다.");
		}
	}
	public static void practice4() {
		Scanner sc = new Scanner(System.in);
		System.out.print("1 ~ 12 사이의 정수 입력 : ");
		int month = sc.nextInt();
		/*
		 * 아래 if문 switch문으로 수정
			if(month == 1 || month == 2 || month == 12)
				{
					season = "겨울";
				} else if(month >= 3 && month <= 5) {
					season = "봄";
				} else if(month >= 6 && month <= 8) {
					season = "여름";
				} else if(month >= 9 && month <= 11) {
					season = "가을";
				} else {
					season = "해당하는 계절이 없습니다.";
			}
		*/
		switch(month) {
			case 1: case 2: case 12:
				System.out.printf("%d월은 겨울입니다.", month);
				break;
			case 3: case 4: case 5: 
				System.out.printf("%d월은 봄입니다.", month);
				break;
			case 6: case 7: case 8:
				System.out.printf("%d월은 여름입니다.", month);
				break;
			case 9: case 10: case 11:
				System.out.printf("%d월은 가을입니다.", month);
				break;
			default:
				System.out.printf("%d월은 잘못 입력된 달입니다.", month);
		}
	}
	public static void practice5() {
		Scanner sc = new Scanner(System.in);
		final String AUTH_ID = "myId";
		final String AUTH_PWD = "myPassword12";
		
		// 아이디 입력
		System.out.print("아이디 : ");
		String userId = sc.next();

		// 비밀번호 입력
		System.out.print("비밀번호 : ");
		String userPwd = sc.next();
		
		// 유효성 검사
		boolean isAuthId = AUTH_ID.equals(userId);
		boolean isAuthPwd = AUTH_PWD.equals(userPwd);

		if(isAuthId && isAuthPwd) {
			System.out.print("로그인 성공");
		} else {
			if(!isAuthId && isAuthPwd) {
				System.out.print("아이디가 틀렸습니다.");	
			} else if(isAuthId && !isAuthPwd) {
				System.out.print("비밀번호가 틀렸습니다.");
			} else {
				System.out.print("가입된 정보가 없습니다.");
			}
		}
	}
	public static void practice6() {
		Scanner sc = new Scanner(System.in);
		
		// 관리자, 회원, 비회원 중 하나 입력 
		System.out.print("권한을 확인하고자 하는 회원 등급 : ");
		String grade = sc.next();
		// 각 등급별 권한 출력
		switch(grade) {
			case "관리자":
				System.out.print("회원관리, 게시글 관리, 게시글 작성, 댓글 작성, 게시글 조회");
				break;
			case "회원":
				System.out.print("게시글 작성, 댓글 작성, 게시글 조회");
				break;
			default:
				System.out.print("게시글 조회");
		}
	}
	public static void practice7() {
		Scanner sc = new Scanner(System.in);
		// 키, 몸무게 double 자료형으로 입력
		// bmi 계산
		// bmi에 따라 분류
		
		// 키 입력
		System.out.print("키(m)를 입력해 주세요. : ");
		double height = sc.nextDouble();
		// height *= 0.01;
		// 몸무게 입력
		System.out.print("몸무게(kg)를 입력해 주세요. : ");
		double weight = sc.nextDouble();
		
		// bmi 계산, 몸무게 / 키(m) * 키(m)
		double bmi = weight / (height * height);
		System.out.printf("BMI 지수 : %f\n", bmi);
		String result;
		
		// bmi 분류
		// 18.5 미만 / 18.5 이상 23 미만 / 23 이상 25 미만 / 25 이상 30 미만 / 30 이상
		// 저체중 / 정상체중 / 과체중 / 비만 / 고도 비만
		if(bmi < 18.5) {
			result = "저체중";
		} else if(18.5 <= bmi && bmi < 23) {
			result = "정상체중";
		} else if(23 <= bmi && bmi < 25) {
			result = "과체중";
		} else if(25 <= bmi && bmi < 30) {
			result = "비만";
		} else {
			result = "고도 비만";
		}
		System.out.print(result);
	}
	public static void practice8() {
		Scanner sc = new Scanner(System.in);
		// 두 개 정수와 연산 기호 입력
		// num1
		System.out.print("피연산자1 입력 : ");
		int num1 = sc.nextInt();
		// num2
		System.out.print("피연산자2 입력 : ");
		int num2 = sc.nextInt();
		// 연산 기호 입력
		System.out.print("연산자를 입력(+,-,*,/,%) : ");
		String calcStr = sc.next();
		char calcSign = calcStr.charAt(0);
		
		// 연산 기호에 맞춰 연산 결과 출력
		double result = 0;
		
		switch(calcSign) {
			case '+':
				result = num1 + num2;
				break;
			case '-':
				result = num1 - num2;
				break;
			case '*':
				result = num1 * num2;
				break;
			case '/':
				result = num1 / num2;
				break;
			case '%':
				result = num1 % num2;
				break;
			default:
				result = 0;
		}
		
		// 두 개 정수 모두 양수 
		// 없는 연산 기호 입력 시 "잘못 입력하셨습니다. 프로그램을 종료합니다." 출력
		if(num1 > 0 && num2 > 0) {
			if(result == 0) {
				System.out.print("잘못 입력하셨습니다. 프로그램을 종료합니다.");				
			} else {
				System.out.printf("%d %c %d = %f", num1, calcSign, num2, result);				
			}
		} else {
			System.out.print("피연산자는 양수만 입력 가능합니다.");
		}
	}
	public static void practice9() {
		Scanner sc = new Scanner(System.in);
		// 중간, 기말, 과제점수, 출석회수 입력, pass/fail 출력
		
		// 중간 20%
		System.out.print("중간 고사 점수 : ");
		double middleTest = sc.nextDouble();
		middleTest *= 0.2;
		
		// 기말 30%
		System.out.print("기말 고사 점수 : ");
		double finalTest = sc.nextDouble();
		finalTest *= 0.3;
		
		// 과제 30%
		System.out.print("과제 점수 : ");
		double assignment = sc.nextDouble();
		assignment *= 0.3;
		
		// 출석 20%, 출석 비율은 입력값/20,
		System.out.print("출석 회수 : ");
		double attendance = sc.nextDouble();
		double passAtt = 20 - (20 * 0.3);
		
		System.out.println("================= 결과 =================");
		// 총 점수 70점 이상 pass, 70점 미만 또는 30% 이상 결석 fail
		if(attendance < passAtt) {
			System.out.printf("Fail [출석 회수 부족 (%.0f/20)]\n", attendance);
		} else {
			double total = middleTest + finalTest + assignment + attendance;
			System.out.printf("중간 고사 점수(20) : %.1f\n", middleTest);
			System.out.printf("기말 고사 점수(30) : %.1f\n", finalTest);
			System.out.printf("과제 점수(30) : %.1f\n", assignment);
			System.out.printf("출석 점수(20) : %.1f\n", attendance);
			System.out.printf("총점 : %.1f\n", total);
			if(total < 70) {
				System.out.printf("Fail [점수 미달]\n", attendance);
			} else {
				System.out.print("PASS");
			}			
		}
	}
	public static void practice10() {
		Scanner sc = new Scanner(System.in);
		System.out.println("실행할 기능을 선택하세요.");
		System.out.println("1. 메뉴 출력");
		System.out.println("2. 짝수/홀수");
		System.out.println("3. 합격/불합격");
		System.out.println("4. 계절");
		System.out.println("5. 로그인");
		System.out.println("6. 권한 확인");
		System.out.println("7. BMI");
		System.out.println("8. 계산기");
		System.out.println("9. P/F");
		System.out.println("11. 비밀번호 생성");
		
		System.out.print("선택 : ");
		int selMenu = sc.nextInt();
		
		if(selMenu < 11) {
			System.out.printf("(실습문제%d 실행)\n", selMenu);			
		};
		
		// 위 실습 1 ~ 9까지 선택해서 실행
		switch(selMenu) {
			case 1:
				practice1();
				break;
			case 2:
				practice2();
				break;
			case 3:
				practice3();
				break;
			case 4:
				practice4();
				break;
			case 5:
				practice5();
				break;
			case 6:
				practice6();
				break;
			case 7:
				practice7();
				break;
			case 8:
				practice8();
				break;
			case 9:
				practice9();
				break;
			case 11:
				practice11();
				break;
			default: 
				System.out.print("잘못 입력했습니다. 종료합니다.");
		}
	}
	public static void practice11() {
		// 중복 값 확인
		// 중복 값이 있으면 "중복 값 있음" 출력 
		// 제일 앞 자리 수의 값은 1 ~ 9 사이 정수. 0 < idx[0] < 10;
		// 중복 값 없는 4자리면 생성 성공
		// 정수 4자리 비밀번호 입력
		Scanner sc = new Scanner(System.in);
		System.out.print("비밀번호 입력(1000 ~ 9999) : ");
		String pwd = sc.next();
		
		if(pwd.length() > 4) {
			// 4자리 자리수가 안 맞으면 "자리 수 안 맞음" 출력
			System.out.print("자리 수 안 맞음");
		} else {
			int strIdx = 3;
			
			boolean isDup = false;
			switch(strIdx) {
				case 3: 
					char idxCh = pwd.charAt(strIdx);
					int chIdx = pwd.indexOf(idxCh);
					if(chIdx != strIdx) {
						isDup = true;
						break;
					}
					strIdx--;
				case 2: 
					idxCh = pwd.charAt(strIdx);
					chIdx = pwd.indexOf(idxCh);
					if(chIdx != strIdx) {
						isDup = true;
						break;
					}
					strIdx--;
				case 1: 
					idxCh = pwd.charAt(strIdx);
					chIdx = pwd.indexOf(idxCh);
					if(chIdx != strIdx) {
						isDup = true;
						break;
					}
					strIdx--;
				case 0:
					idxCh = pwd.charAt(strIdx);
					chIdx = pwd.indexOf(idxCh);
					if(chIdx != strIdx) {
						isDup = true;
						break;
					}
					strIdx--;
				default: break;
			}
			if(isDup) {
				System.out.print("중복 값 있음");
			} else {
				System.out.print("생성 성공");
			}
		}
	}
}
