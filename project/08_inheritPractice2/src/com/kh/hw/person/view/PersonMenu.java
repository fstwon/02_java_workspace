package com.kh.hw.person.view;

import java.util.Scanner;

import com.kh.hw.person.controller.PersonController;
import com.kh.hw.person.model.vo.Employee;
import com.kh.hw.person.model.vo.Student;

public class PersonMenu {
	// field
	/*
		- sc:Scanner = new Scanner(System.in)
		- pc:PersonController = new PersonController()
	*/
	private Scanner sc = new Scanner(System.in);
	private PersonController pc = new PersonController();
	
	// method
	/*
		+ mainMenu() : void
		+ studentMenu() : void
		+ employeeMenu() : void
		+ insertStudent() : void
		+ printStudent() : void
		+ insertEmployee() : void
		+ printEmployee() : void
	*/
	public void mainMenu() {
		// 메인 메뉴를 출력하는 메소드
		/*
			학생은 최대 3명까지 저장할 수 있습니다.
			현재 저장된 학생은 M명입니다.
			사원은 최대 10명까지 저장할 수 있습니다.
			현재 저장된 사원은 N명입니다.
		*/
		// M과 N에 들어가는 숫자는 PersonController(pc)클래스에 있는 personCount()메소드의 반환 값을 이용하여 출력
		System.out.printf("학생은 최대 %d명 까지 저장할 수 있습니다.\n", pc.printStudent().length);
		System.out.printf("현재 저장된 학생은 %d명입니다.\n", pc.personCount()[0]);
		System.out.printf("사원은 최대 %d명 까지 저장할 수 있습니다.\n", pc.printEmployee().length);
		System.out.printf("현재 저장된 학생은 %d명입니다.\n", pc.personCount()[1]);
		System.out.println();
				
		while(true) {
			// 1. 학생 메뉴 ➔ studentMenu()
			System.out.println("1. 학생 메뉴");
			
			// 2. 사원 메뉴 ➔ employeeMenu()
			System.out.println("2. 사원 메뉴");
			
			// 9. 끝내기
			System.out.println("9. 끝내기");
			
			// 메뉴 번호 :
			System.out.print("메뉴 번호 : ");
			int menuNum = sc.nextInt();
			switch(menuNum) {
				case 1:
					studentMenu();
					break;
				case 2:
					employeeMenu();
					break;
				case 9:
					// “종료합니다.” 출력 후 종료
					System.out.println("종료합니다.");
					return;
				default:
					// 잘못 입력했을 경우 “잘못 입력하셨습니다. 다시 입력해주세요.” 출력 후 반복
					System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}	
		}
	}
	public void studentMenu() {
		// 학생 메뉴를 출력하는 메소드
		
		
		while(true) {
			// 1. 학생 추가 ➔ insertStudent()
			System.out.println("1. 학생 추가");
			// 2. 학생 보기 ➔ printStudent()
			System.out.println("2. 학생 보기");
			// 9. 메인으로 ➔ “메인으로 돌아갑니다.” 출력 후 메인으로
			System.out.println("9. 메인으로");
			
			boolean isFullCount = pc.personCount()[0] == pc.printStudent().length;
			if(isFullCount) {
				// 만일 학생 객체 배열에 담긴 데이터의 수가 3개 일 때
				// “학생을 담을 수 있는 공간이 꽉 찼기 때문에 학생 추가 메뉴는 더 이상
				// 활성화 되지 않습니다.”를 출력 후 메뉴 번호를 담음
				System.out.println("학생을 담을 수 있는 공간이 꽉 찼기 때문에 학생 추가 메뉴는 더 이상 활성화 되지 않습니다.");
			}
			
			// 학생 객체 배열에 담긴 데이터의 수가 3개가 아닐 때는
			// 위에 출력한 메뉴 모두 받을 수 있게 함
			
			// 메뉴 번호 :
			System.out.print("메뉴 번호 : ");
			int menuNum = sc.nextInt();
			if(isFullCount && menuNum == 1) {
				// 실제로 1번을 누르면 “잘못 입력하셨습니다. 다시 입력해주세요.”를 출력
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
				continue;
			}
			switch(menuNum) {
				case 1:
					insertStudent();
					break;
				case 2:
					printStudent();
					break;
				case 9:
					System.out.println("메인으로 돌아갑니다.");
					return;
				default:
					// 잘못 입력했을 경우, “잘못 입력하셨습니다. 다시 입력해주세요.” 출력 후 반복
					System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}
			
		}	
	}
	public void employeeMenu() {
		// 사원 메뉴를 출력하는 메소드
		while(true) {
			// 1. 사원 추가 ➔ insertEmployee()
			System.out.println("1. 사원 추가");
			// 2. 사원 보기 ➔ printEmployee()
			System.out.println("2. 사원 보기");
			// 9. 메인으로 ➔ “메인으로 돌아갑니다.” 출력 후 메인으로
			System.out.println("9. 메인으로");
			// 만일 사원 객체 배열에 담긴 데이터의 수가 10개 일 때
			boolean isFullCount = pc.personCount()[1] == pc.printEmployee().length;
			if(isFullCount) {
				// “사원을 담을 수 있는 공간이 꽉 찼기 때문에 사원 추가 메뉴는 더 이상
				// 활성화 되지 않습니다.”를 출력 후 메뉴 번호를 담음
				System.out.println("사원을 담을 수 있는 공간이 꽉 찼기 때문에 사원 추가 메뉴는 더 이상 활성화 되지 않습니다.");
			}
			
			// 사원 객체 배열에 담긴 데이터의 수가 10개가 아닐 때는
			// 위에 출력한 메뉴 모두 받을 수 있게 함
			// 메뉴 번호 :
			System.out.print("메뉴 번호 : ");
			int menuNum = sc.nextInt();
			if(isFullCount && menuNum == 1) {
				// 실제로 1번을 누르면 “잘못 입력하셨습니다. 다시 입력해주세요.”를 출력
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
				continue;
			}
			switch(menuNum) {
				case 1:
					insertEmployee();
					break;
				case 2: 
					printEmployee();
					break;
				case 9:
					System.out.println("메인으로 돌아갑니다.");
					return;
				default:
					// 잘못 입력했을 경우, “잘못 입력하셨습니다. 다시 입력해주세요.” 출력 후 반복
					System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}
		}
	}
	public void insertStudent() {
		// 사용자에게 객체배열에 저장할 학생 데이터를 받는 메소드
		char answer = '\0';
		while(answer != 'n' && answer != 'N') {
			// 학생 이름 :
			System.out.print("학생 이름: ");
			String name = sc.next();
			// 학생 나이 :
			System.out.print("학생 나이: ");
			int age = sc.nextInt();
			// 학생 키 :
			System.out.print("학생 키: ");
			double height = sc.nextDouble();
			// 학생 몸무게 :
			System.out.print("학생 몸무게: ");
			double weight = sc.nextDouble();
			// 학생 학년 :
			System.out.print("학생 학년: ");
			int grade = sc.nextInt();
			// 학생 전공 :
			System.out.print("학생 전공: ");
			String major = sc.next();
			
			// 위의 데이터를 모두 사용자에게 입력 받아 pc의 insertStudent()메소드의 매개변수로 넘겨 줌
			pc.insertStudet(name, age, height, weight, grade, major);

			if(pc.personCount()[0] == pc.printStudent().length) {
				// 만일 학생 객체 배열에 담긴 데이터의 수가 3이 되었을 때는
				// “학생을 담을 수 있는 공간이 꽉 찼기 때문에 학생 추가를 종료하고
				// 학생 메뉴로 돌아갑니다.”를 출력 후 반복 종료
				System.out.println("학생을 담을 수 있는 공간이 꽉 찼기 때문에 학생 추가를 종료하고 학생 메뉴로 돌아갑니다.");
				break;
			}
			// 이 때 학생 객체 배열에 담긴 데이터의 수가 3개가 되지 않았을 때는
			// “그만하시려면 N(또는 n), 이어하시려면 아무 키나 누르세요 : “를 출력해
			// N 또는 n이 아니면 위의 데이터를 받는 것을 반복하고
			// N 또는 n이라면 반복을 멈춤
			System.out.print("그만하시려면 N(또는 n), 이어하시려면 아무 키나 누르세요 : ");
			answer = sc.next().charAt(0);				
		}
	}
	public void printStudent() {
		// 객체배열에 저장된 학생 데이터를 출력하는 메소드
		// pc의 printStudent() 메소드의 반환 값을 이용하여 학생 객체 배열에 저장된
		// 모든 데이터 출력
		Student[] ps = pc.printStudent();
		for(int i = 0; i < ps.length; i++) {
			if(ps[i] != null) {
				System.out.println(ps[i].toString());
			}
		}
	}
	public void insertEmployee() {
		// 사용자에게 객체배열에 저장할 사원 데이터를 받는 메소드
		char answer = '\0';
		while(answer != 'n' && answer != 'N') {
			// 사원 이름 :
			System.out.print("사원 이름: ");
			String name = sc.next();
			// 사원 나이 :
			System.out.print("사원 나이: ");
			int age = sc.nextInt();
			// 사원 키 :
			System.out.print("사원 키: ");
			double height = sc.nextDouble();
			// 사원 몸무게 :
			System.out.print("사원 몸무게: ");
			double weight = sc.nextDouble();
			// 사원 급여 :
			System.out.print("사원 급여: ");
			int salary = sc.nextInt();
			// 사원 부서 :
			System.out.print("사원 부서: ");
			String dept = sc.next();
			
			// 위의 데이터를 모두 사용자에게 입력 받아 pc의 insertEmployee()메소드의
			// 매개변수로 넘겨 줌
			pc.insertEmployee(name, age, height, weight, salary, dept);
			
			if(pc.personCount()[1] == pc.printEmployee().length) {
				// 만일 사원 객체 배열에 담긴 데이터의 수가 10이 되었을 때는
				// “사원을 담을 수 있는 공간이 꽉 찼기 때문에 사원 추가를 종료하고
				// 사원 메뉴로 돌아갑니다.”를 출력 후 반복 종료
				System.out.println("사원을 담을 수 있는 공간이 꽉 찼기 때문에 사원 추가를 종료하고 사원 메뉴로 돌아갑니다.");
				break;
			}
			
			// 이 때 사원 객체 배열에 담긴 데이터의 수가 10개가 되지 않았을 때는
			// “그만하시려면 N(또는 n), 이어하시려면 아무 키나 누르세요 : “를 출력해
			// N 또는 n이 아니면 위의 데이터를 받는 것을 반복하고
			// N 또는 n이라면 반복을 멈춤
			System.out.print("그만하시려면 N(또는 n), 이어하시려면 아무 키나 누르세요 : ");
			answer = sc.next().charAt(0);
		}

	}
	public void printEmployee() {
		// 객체배열에 저장된 사원 데이터를 출력하는 메소드
		Employee[] pe = pc.printEmployee();
		for(int i = 0; i < pe.length; i++) {
			if(pe[i] != null) {
				System.out.println(pe[i].toString());
			}
		}
	}
}
