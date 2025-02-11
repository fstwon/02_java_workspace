package com.kh.hw.member.view;

import java.util.Scanner;

import com.kh.hw.member.controller.MemberController;
import com.kh.hw.member.model.vo.Member;

public class MemberMenu {
	// field
	/*
		- sc : Scanner = new Scanner(System.in)
		- MemberController mc = new MemberController
	*/
	private Scanner sc = new Scanner(System.in);
	private MemberController mc = new MemberController();
	
	// constructor
	/*
		+ MemberMenu ()
	*/
	public MemberMenu() {}
	
	// method
	/*
		+ mainMenu() : void
		+ insertMember() : void
		+ searchMember() : void
		+ searchId() : void
		+ searchName() : void
		+ searchEmail() : void
		+ updateMember() : void
		+ updatePassword() : void
		+ updateName() : void
		+ updateEmail() : void
		+ deleteMember() : void
		+ deleteOne() : void
		+ deleteAll() : void
		+ printAll() : void
	*/
	public void mainMenu() {
		// 메인 메뉴 출력 메소드
		// 최대 등록 가능 회원 수 출력
		
		// 몇 명이 등록되어 있는지 출력
		
		// 현재 회원 수에 따라 메인 메뉴 다르게 출력
		System.out.printf("최대 등록 가능한 회원 수는 %d명입니다.", MemberController.SIZE);
		System.out.println();
		int existMembers = mc.existMemberNum();
		System.out.printf("현재 등록된 회원 수는 %d명입니다.", existMembers);
		System.out.println();
		while(true) {
			// 등록된 회원 수 < 10
			// 1. 새 회원 등록 ➔ insertMember()
			if(existMembers < MemberController.SIZE) {
				System.out.println("1. 새 회원 등록");
			}
			// 2. 회원 검색 ➔ searchMember()
			System.out.println("2. 회원 검색");
			// 3. 회원 정보 수정 ➔ updateMemner()
			System.out.println("3. 회원 정보 수정");
			// 4. 회원 삭제 ➔ deleteMember()
			System.out.println("4. 회원 삭제");
			// 5. 모두 출력 ➔ printAll()
			System.out.println("5. 모두 출력");
			// 9. 끝내기
			System.out.println("9. 끝내기");
			
			System.out.print("메뉴 번호 : ");
			int selMenuNum = sc.nextInt();
			switch(selMenuNum) {
				case 1: 
					insertMember();
					break;
				case 2: 
					searchMember();
					break;
				case 3: 
					updateMember();
					break;
				case 4: 
					deleteMember();
					break;
				case 5:
					printAll();
					break;
				case 9: 
					System.out.println("프로그램을 종료합니다");
					return;
				default:
					System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}
		}
	}
	public void insertMember() {
		// 회원 등록에 필요한 아이디, 이름, 비밀번호, 이메일, 성별, 나이를
		System.out.println("새 회원을 등록합니다.");
		// 사용자에게 직접 입력 받되 아이디의 경우 기존 회원의 아이디와
		// 중복되지 않도록 mc의 checkId()메소드를 통해서 중복 검사를 함
		String id;
		do {
			 System.out.print("아이디 : ");
			 id = sc.next();
			 if(mc.checkId(id)) {
				 // 있으면 “중복된 아이디입니다. 다시 입력해주세요.”라는 문구를 출력 후 다시 아이디를 받도록 함
				 System.out.println("중복된 아이디입니다. 다시 입력해주세요.");
			 }
		} while(mc.checkId(id));
		
		// 중복 검사를 한 결과 값에 따라 중복 값이 없으면 다음으로 넘어가고
		
		System.out.print("이름 : ");
		String name = sc.next();
		System.out.print("비밀번호 : ");
		String password = sc.next();
		System.out.print("이메일 : ");
		String email = sc.next();
		char gender = '\0';
		do {
			// 성별의 경우 M이나 m, F나 f가 아니면 “성별을 다시 입력하세요.”를 출력 후 다시 성별을 입력하도록 함
			System.out.print("성별(M/F) : ");
			gender = sc.next().charAt(0);
			if(gender == 'M' || gender == 'm' || gender == 'F' || gender == 'f') {
				break;
			}
			System.out.println("성별을 다시 입력하세요.");
		} while(gender != 'M' || gender != 'm' || gender != 'F' || gender != 'f');
		
		System.out.print("나이 : ");
		int age = sc.nextInt();
		
		// 아이디부터 나이까지 모든 데이터를 받았으면 mc의 insertMember메소드의 매개변수로 넘김
		mc.insertMember(id, name, password, email, gender, age);
		Member[] members = mc.printAll();
		for(int i = 0; i < members.length; i++) {
			if(members[i] != null) {
				System.out.println(members[i].inform());
			}
		}
	}
	public void searchMember() {
		// 1. 아이디로 검색하기 ➔ searchId()
		System.out.println("1. 아이디로 검색하기");
		// 2. 이름으로 검색하기 ➔ searchName()
		System.out.println("2. 이름으로 검색하기");
		// 3. 이메일로 검색하기 ➔ searchEmail)_
		System.out.println("3. 이메일로 검색하기");
		// 9. 메인으로 돌아가기
		System.out.println("9. 메인으로 돌아가기");
		// 메뉴 번호 :
		System.out.print("메뉴 번호 : ");
		int selMenuNum = sc.nextInt();
		switch(selMenuNum) {
			case 1:
				searchId();
				break;
			case 2:
				searchName();
				break;
			case 3:
				searchEmail();
				break;
			case 9:
				System.out.println("메인으로 돌아갑니다.");
				return;
			default:
				System.out.println("잘못 입력하셨습니다.");
				break;
		}
	}
	public void searchId() {
		// 검색할 아이디를 사용자에게 입력 받고 입력 받은 데이터를
		// mc의 searchId() 메소드의 매개변수로 넘김, 반환 값에 따라
		System.out.print("검색할 아이디 : ");
		String id = sc.next();
		String idInfo = mc.searchId(id);
		// 검색 결과 없으면 “검색 결과가 없습니다.” 출력 후 mainMenu()로 돌아감
		if(idInfo == null) {
			System.out.println("검색 결과가 없습니다.");
			return;
		}
		// 검색 결과가 있으면 “찾으신 회원 조회 결과입니다.” 출력 후
		System.out.println("찾으신 회원 조회 결과입니다.");
		// 회원 검색 결과 출력
		System.out.println(idInfo);
	}
	public void searchName() {
		// 검색할 이름을 사용자에게 입력 받고 입력 받은 데이터를
		// mc의 searchName() 메소드의 매개변수로 넘김, 반환 값에 따라
		System.out.print("검색할 이름 : ");
		String name = sc.next();
		Member[] members = mc.searchName(name);
		// 검색 결과 없으면 “검색 결과가 없습니다.” 출력 후 mainMenu()로 돌아감
		if(members.length == 0) {
			System.out.println("검색 결과가 없습니다.");
			return;
		} else {
			// 검색 결과가 있으면 “찾으신 회원 조회 결과입니다.” 출력 후
			System.out.println("찾으신 회원 조회 결과입니다.");
			// 회원 검색 결과 출력
			for(int i = 0; i < members.length; i++) {
				System.out.println(members[i].inform());	
			}
		}
	}
	public void searchEmail() {
		// 검색할 아이디를 사용자에게 입력 받고 입력 받은 데이터를
		System.out.print("검색할 이메일 : ");
		String email = sc.next();
		// mc의 searchEmail() 메소드의 매개변수로 넘김, 반환 값에 따라
		Member[] members = mc.searchEmail(email); 
		// 검색 결과 없으면 “검색 결과가 없습니다.” 출력 후 mainMenu()로 돌아감
		if(members.length == 0) {
			System.out.println("검색 결과가 없습니다.");
			return;
		} else {
			// 검색 결과가 있으면 “찾으신 회원 조회 결과입니다.” 출력 후
			System.out.println("찾으신 회원 조회 결과입니다.");
			// 회원 검색 결과 출력
			for(int i = 0; i < members.length; i++) {
				System.out.println(members[i].inform());	
			}
		}
	}
	public void updateMember() {
		// 1. 비밀번호 수정하기 ➔ updatePassword()
		System.out.println("1. 비밀번호 수정하기");
		// 2. 이름 수정하기 ➔ updateName()
		System.out.println("2. 이름 수정하기");
		// 3. 이메일 수정하기 ➔ updateEmail()
		System.out.println("3. 이메일 수정하기");
		// 9. 메인으로 돌아기기
		System.out.println("9. 메인으로 돌아가기");
		System.out.print("메뉴 번호 : ");
		int menuNum = sc.nextInt();
		switch(menuNum) {
			case 1:
				updatePassword();
				break;
			case 2:
				updateName();
				break;
			case 3:
				updateEmail();
				break;
			case 9:
				// 메뉴 번호에 따라 각 메소드로 이동되며 9번을 입력했을 경우
				// “메인으로 돌아갑니다.” 출력 후 mainMenu()로 돌아감
				System.out.println("메인으로 돌아갑니다.");
				return;
			default:
				// 메뉴 번호를 잘못 입력했을 경우 “잘못 입력하셨습니다.” 출력 후
				// mainMenu()로 돌아감
				System.out.println("잘못 입력하셨습니다.");
		}
	}
	public void updatePassword() {
		// 수정할 회원 id와 비밀번호를 사용자에게 입력 받고 입력 받은 데이터를
		System.out.print("수정할 회원의 아이디 : ");
		String id = sc.next();
		System.out.print("수정할 비밀번호 : ");
		String password = sc.next();
		// mc의 updatePassword() 메소드의 매개변수로 넘김, 반환 값에 따라
		boolean isUpdate = mc.updatePassword(id, password);
		if(isUpdate) {
			// 검색 결과가 있으면 “수정이 성공적으로 되었습니다.” 출력 후
			// mainMenu()로 돌아감
			System.out.println("수정이 성공적으로 되었습니다.");
		} else {
			// 검색결과 없으면 “존재하지 않는 아이디입니다.” 출력, mainMenu()로 감
			System.out.println("존재하지 않는 아이디입니다.");
		}
	}
	public void updateName() {
		// 수정할 회원 id와 이름을 사용자에게 입력 받고 입력 받은 데이터를
		System.out.print("수정할 회원의 아이디 : ");
		String id = sc.next();
		System.out.print("수정할 이름 : ");
		String name = sc.next();
		// mc의 updateName() 메소드의 매개변수로 넘김, 반환 값에 따라
		boolean isUpdate = mc.updateName(id, name);
		if(isUpdate) {
			// 검색 결과가 있으면 “수정이 성공적으로 되었습니다.” 출력 후
			// mainMenu()로 돌아감
			System.out.println("수정이 성공적으로 되었습니다.");
		} else {
			// 검색결과 없으면 “존재하지 않는 아이디입니다.” 출력, mainMenu()로 감
			System.out.println("존재하지 않는 아이디입니다.");
		}
	}
	public void updateEmail() {
		// 수정할 회원 id와 이메일을 사용자에게 입력 받고 입력 받은 데이터를
		System.out.print("수정할 회원의 아이디 : ");
		String id = sc.next();
		System.out.print("수정할 이메일 : ");
		String email = sc.next();
		// mc의 updateEmail() 메소드의 매개변수로 넘김, 반환 값에 따라
		boolean isUpdate = mc.updateEmail(id, email);
		if(isUpdate) {
			// 검색 결과가 있으면 “수정이 성공적으로 되었습니다.” 출력 후
			// mainMenu()로 돌아감
			System.out.println("수정이 성공적으로 되었습니다.");
		} else {
			// 검색결과 없으면 “존재하지 않는 아이디입니다.” 출력, mainMenu()로 감
			System.out.println("존재하지 않는 아이디입니다.");
		}
	}
	public void deleteMember() {
		// 1. 특정 회원 삭제하기 ➔ deleteOne()
		// 2. 모든 회원 삭제하기 ➔ deleteAll()
		// 9. 메인으로 돌아기기
		System.out.println("1. 특정 회원 삭제하기");
		System.out.println("2. 모든 회원 삭제하기");
		System.out.println("9. 메인으로 돌아가기");
		System.out.print("메뉴 번호 : ");
		int menuNum = sc.nextInt();
		// 메뉴 번호에 따라 각 메소드로 이동되며 9번을 입력했을 경우
		switch(menuNum) {
			case 1:
				deleteOne();
				break;
			case 2:
				deleteAll();
				break;
			case 9:
				// “메인으로 돌아갑니다.” 출력 후 mainMenu()로 돌아감
				System.out.println("메인으로 돌아갑니다.");
				return;
			default: 
				// 메뉴 번호를 잘못 입력했을 경우 “잘못 입력하셨습니다.” 출력 후
				// mainMenu()로 돌아감
				System.out.println("잘못 입력하셨습니다.");
		}
	}
	public void deleteOne() {
		// 삭제할 회원 id를 사용자에게 입력 받고 정말 삭제할 것인지 사용자에게
		System.out.print("삭제할 회원의 아이디 : ");
		String id = sc.next();
		System.out.print("정말로 삭제하시겠습니까?(Y/N) : ");
		char answer = sc.next().charAt(0);
		
		if(answer == 'Y' || answer == 'y') {
			// 물어본 뒤, Y나 y를 사용자가 입력할 경우 입력 받은 id를
			// mc의 delete() 메소드의 매개변수로 넘김, 반환 값에 따라
			boolean isDel = mc.delete(id);
			if(isDel) {
				// 검색 결과가 있으면 “성공적으로 삭제하였습니다.” 출력 후
				// mainMenu()로 돌아감
				System.out.println("성공적으로 삭제하였습니다.");
			} else {
				// 검색결과 없으면 “존재하지 않는 아이디입니다.” 출력, mainMenu()로 감
				System.out.println("존재하지 않는 아이디입니다.");
			}
		}
	}
	public void deleteAll() {
		// 정말 삭제할 것인지 사용자에게 물어본 뒤, Y나 y를 사용자가 입력할 경우
		System.out.print("정말로 삭제하시겠습니까?(Y/N) :");
		char answer = sc.next().charAt(0);
		if(answer == 'Y' || answer == 'y') {
			// mc의 delete() 메소드 호출, “성공적으로 삭제하였습니다.” 출력 후
			// mainMenu()로 돌아감
			mc.delete();
			System.out.println("성공적으로 삭제하였습니다.");
		}
	}
	public void printAll() {
		// mc의 printAll() 메소드의 반환 값을 가지고 저장된 회원을 출력하는데
		Member[] members = mc.printAll();
		int existMembers = mc.existMemberNum();
		if(existMembers == 0) {
			// 저장된 회원의 수가 0명이면 “저장된 회원이 없습니다.” 출력,
			System.out.println("저장된 회원이 없습니다.");
		} else {
			// 0명이 아니면 저장된 모든 회원의 정보 출력
			for(Member member : members) {
				if(member != null) {
					System.out.println(member.inform());					
				}
			}
		}
	}
}
