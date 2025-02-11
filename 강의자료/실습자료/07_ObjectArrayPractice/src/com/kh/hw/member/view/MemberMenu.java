package com.kh.hw.member.view;

import java.util.Scanner;

import com.kh.hw.member.controller.MemberController;
import com.kh.hw.member.model.vo.Member;

public class MemberMenu {
	/*
	 * - sc : Scanner = new Scanner(System.in) - MemberController mc = new
	 * MemberController
	 */
	private Scanner sc = new Scanner(System.in);
	private MemberController mc = new MemberController();

//	+ MemberMenu ()
	public MemberMenu() {
	}

//	+ mainMenu() : void
	public void mainMenu() {

		while (true) {
			// MemberController(mc)클래스 안에 있는 멤버필드를 이용하여
			// 최대 등록 가능한 회원 수가 몇 명인지 출력
			System.out.println("최대 등록 가능한 회원 수는 " + mc.SIZE + "명입니다.");
			// => MemberController.SIZE 로도 접근 가능!

			// 또한 현재 등록된 회원 수는 mc에 existMemberNum()의 반환 값으로
			// 몇 명이 등록되어 있는지 출력
			int existNumber = mc.existMemberNum();
			System.out.println("현재 등록된 회원 수는 " + existNumber + "명입니다.");

			// 현재 등록된 회원 수에 따라 메인 메뉴를 다르게 출력
			// 현재 등록된 회원 수가 10명이 아닐 때
			if (existNumber < mc.SIZE) {
				System.out.println("1. 새 회원 등록"); // ➔ insertMember()
			} else {
				System.out.println("회원 수가 모두 꽉 찼기 때문에 일부 메뉴만 오픈됩니다.");
			}
			// 아래 내용은 회원 수 상관없이 모두 출력해야 하기 때문에
			// 조건문에서 제외!
			System.out.println("2. 회원 검색"); // ➔ searchMember()
			System.out.println("3. 회원 정보 수정"); // ➔ updateMember()
			System.out.println("4. 회원 삭제"); // ➔ deleteMember()
			System.out.println("5. 모두 출력"); // ➔ printAll()
			System.out.println("9. 끝내기");
			System.out.print("메뉴 번호 : ");
			int selMenu = sc.nextInt();

			// 두 경우 모두 끝내기를 누르면 “프로그램을 종료합니다” 출력 후 프로그램 종료하고
			// 메뉴 번호에 없는 번호를 누를 시
			// “잘못 입력하셨습니다. 다시 입력해주세요.” 출력 후 메뉴 반복
			switch (selMenu) {
			case 1: // selMenu == 1
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
				// break;
				return; // 메소드 종료 => 프로그램 종료!
			default:
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}
		}
	}

//	+ insertMember() : void
	public void insertMember() {
		// 회원 등록에 필요한 아이디, 이름, 비밀번호, 이메일, 성별, 나이를
		// 사용자에게 직접 입력 받되
		System.out.println("회원을 등록합니다.");
		String id = "";
		do {
			System.out.print("아이디 : ");
			id = sc.next();
			// 아이디의 경우 기존 회원의 아이디와 중복되지 않도록
			// mc의 checkId()메소드를 통해서 중복 검사를 함
			// 중복 검사를 한 결과 값에 따라 중복 값이 없으면 다음으로 넘어가고
			// 있으면 “중복된 아이디입니다. 다시 입력해주세요.”라는 문구를 출력 후
			// 다시 아이디를 받도록 함
			if (mc.checkId(id)) {
				System.out.println("중복된 아이디입니다. 다시 입력해주세요.");
			}
		} while (mc.checkId(id));
		/*
		 * while(true) { System.out.print("아이디 : "); id = sc.next(); if (mc.checkId(id))
		 * { System.out.println("중복된 아이디입니다. 다시 입력해주세요."); continue; }
		 * 
		 * break; }
		 */
		System.out.print("이름 : ");
		String name = sc.next();

		System.out.print("비밀번호 : ");
		String passwd = sc.next();

		System.out.print("이메일 : ");
		String email = sc.next();

		char gender = '\0';
		while (true) {
			System.out.print("성별(M/F) : ");
			gender = sc.next().charAt(0);
			// 성별의 경우 M이나 m, F나 f가 아니면 “성별을 다시 입력하세요.”를
			// 출력 후 다시 성별을 입력하도록 함
			if (gender != 'M' && gender != 'm' && gender != 'F' && gender != 'f') {
				System.out.println("성별을 다시 입력하세요.");
			} else {
				break; // M 또는 F 입력 시 반복문 종료
			}
		}
		System.out.print("나이 : ");
		int age = sc.nextInt();

		// 아이디부터 나이까지 모든 데이터를 받았으면
		// mc의 insertMember메소드의 매개변수로 넘김
		mc.insertMember(id, name, passwd, email, gender, age);
	}

//	+ searchMember() : void
	public void searchMember() {
		System.out.println("1. 아이디로 검색하기"); // ➔ searchId()
		System.out.println("2. 이름으로 검색하기"); // ➔ searchName()
		System.out.println("3. 이메일로 검색하기"); // ➔ searchEmail()
		System.out.println("9. 메인으로 돌아가기");
		System.out.print("번호 : ");
		int selMenu = sc.nextInt();
		// 메뉴 번호에 따라 각 메소드로 이동되며 9번을 입력했을 경우
		// “메인으로 돌아갑니다.” 출력 후 mainMenu()로 돌아감
		// 메뉴 번호를 잘못 입력했을 경우 “잘못 입력하셨습니다.” 출력 후
		// mainMenu()로 돌아감
		switch (selMenu) {
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
			return; // 메소드 종료 => 호출된 위치로 돌아감 (mainMenu() 돌아감!)
		default:
			System.out.println("잘못 입력하셨습니다.");
			break; // switch종료 => 이후 작업이 없으므로 메소드 종료됨!
					// => 호출된 위치로 돌아감!
		}

	}

//	+ searchId() : void
	public void searchId() {
		// 검색할 아이디를 사용자에게 입력 받고
		System.out.print("검색할 아이디 : ");
		String keyword = sc.next();

		// 입력 받은 데이터를 mc의 searchId() 메소드의 매개변수로 넘김
		String info = mc.searchId(keyword);
		// 반환 값에 따라
		// 검색 결과 없으면 “검색 결과가 없습니다.” 출력 후 mainMenu()로 돌아감
		if (info == null) {
			System.out.println("검색 결과가 없습니다.");
		} else {
			// 검색 결과가 있으면 “찾으신 회원 조회 결과입니다.” 출력 후
			System.out.println("찾으신 회원 조회 결과입니다.");
			// 회원 검색 결과 출력
			System.out.println(info);
		}
	}

//	+ searchName() : void
	public void searchName() {
		// 검색할 이름을 사용자에게 입력 받고
		System.out.print("검색할 이름 : ");
		String name = sc.next();
		// 입력 받은 데이터를 mc의 searchName() 메소드의 매개변수로 넘김, 반환 값에 따라
		Member[] searchList = mc.searchName(name);

		// 검색 결과 없으면 “검색 결과가 없습니다.” 출력 후 mainMenu()로 돌아감
		if (searchList.length == 0) {
			System.out.println("검색 결과가 없습니다.");
		} else {
			// 검색 결과가 있으면 “찾으신 회원 조회 결과입니다.” 출력 후
			System.out.println("찾으신 회원 조회 결과입니다.");
			// 회원 검색 결과 출력
			for (Member m : searchList) {
				System.out.println(m.inform());
			}
		}
	}

//	+ searchEmail() : void
	public void searchEmail() {
		// 검색할 이메일을 사용자에게 입력 받고 입력 받은 데이터를
		System.out.print("검색할 이메일 : ");
		String email = sc.next();
		// mc의 searchEmail() 메소드의 매개변수로 넘김, 반환 값에 따라
		Member[] searchList = mc.searchEmail(email);
		// 검색 결과 없으면 “검색 결과가 없습니다.” 출력 후 mainMenu()로 돌아감
		if (searchList.length == 0) {
			System.out.println("검색 결과가 없습니다.");
		} else {
			// 검색 결과가 있으면 “찾으신 회원 조회 결과입니다.” 출력 후
			System.out.println("찾으신 회원 조회 결과입니다.");
			// 회원 검색 결과 출력
			for (Member m : searchList) {
				System.out.println(m.inform());
			}
		}
	}

//	+ updateMember() : void
	public void updateMember() {
		System.out.println("1. 비밀번호 수정하기"); // ➔ updatePassword()
		System.out.println("2. 이름 수정하기"); // ➔ updateName()
		System.out.println("3. 이메일 수정하기"); // ➔ updateEmail()
		System.out.println("9. 메인으로 돌아가기");
		System.out.print("메뉴 번호 : ");
		int selMenu = sc.nextInt();

		// 메뉴 번호에 따라 각 메소드로 이동되며 9번을 입력했을 경우
		// “메인으로 돌아갑니다.” 출력 후 mainMenu()로 돌아감
		// 메뉴 번호를 잘못 입력했을 경우 “잘못 입력하셨습니다.” 출력 후
		// mainMenu()로 돌아감
		switch (selMenu) {
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
			System.out.println("메인으로 돌아갑니다.");
			break;
		default:
			System.out.println("잘못 입력하셨습니다.");
			break;
		}
	}

//	+ updatePassword() : void
	public void updatePassword() {
		// 수정할 회원 id와 비밀번호를 사용자에게 입력 받고
		System.out.print("수정할 회원 id : ");
		String id = sc.next();
		System.out.print("변경할 비밀번호 : ");
		String pwd = sc.next();

		// 입력 받은 데이터를 mc의 updatePassword() 메소드의 매개변수로 넘김
		boolean isUpdate = mc.updatePassword(id, pwd);

		// 반환 값에 따라
		if (isUpdate) {
			// 결과값이 true인 경우 “수정이 성공적으로 되었습니다.” 출력 후 mainMenu()로 돌아감
			System.out.println("수정이 성공적으로 되었습니다.");
		} else {
			// 결과값이 false인 경우 “존재하지 않는 아이디입니다.” 출력, mainMenu()로 감
			System.out.println("존재하지 않는 아이디입니다.");
		}
	}

//	+ updateName() : void
	public void updateName() {
		// 수정할 회원 id와 이름을 사용자에게 입력 받고
		System.out.print("수정할 회원 id : ");
		String id = sc.next();
		System.out.print("수정할 회원 이름 : ");
		String name = sc.next();

		// 입력 받은 데이터를 mc의 updateName() 메소드의 매개변수로 넘김
		if (mc.updateName(id, name)) {
			// 검색 결과가 있으면 “수정이 성공적으로 되었습니다.” 출력 후 mainMenu()로 돌아감
			System.out.println("수정이 성공적으로 되었습니다.");
		} else {
			// 반환 값에 따라 검색결과 없으면 “존재하지 않는 아이디입니다.” 출력, mainMenu()로 감
			System.out.println("존재하지 않는 아이디입니다.");
		}
	}

//	+ updateEmail() : void
	public void updateEmail() {
		// 수정할 회원 id와 이메일을 사용자에게 입력 받고
		System.out.print("수정할 회원 id : ");
		String id = sc.next();
		System.out.print("수정할 회원 이메일 : ");
		String email = sc.next();
		// 입력 받은 데이터를 mc의 updateEmail() 메소드의 매개변수로 넘김, 반환 값에 따라
		if (mc.updateEmail(id, email)) {
			// 검색 결과가 있으면 “수정이 성공적으로 되었습니다.” 출력 후 mainMenu()로 돌아감
			System.out.println("수정이 성공적으로 되었습니다.");
		} else {
			// 반환 값에 따라 검색결과 없으면 “존재하지 않는 아이디입니다.” 출력, mainMenu()로 감
			System.out.println("존재하지 않는 아이디입니다.");
		}

	}

//	+ deleteMember() : void
	public void deleteMember() {
		System.out.println("1. 특정 회원 삭제하기"); // ➔ deleteOne()
		System.out.println("2. 모든 회원 삭제하기"); // ➔ deleteAll()
		System.out.println("9. 메인으로 돌아가기");
		System.out.print("메뉴 번호 : ");
		int selMenu = sc.nextInt();
		// 메뉴 번호에 따라 각 메소드로 이동되며 9번을 입력했을 경우
		// “메인으로 돌아갑니다.” 출력 후 mainMenu()로 돌아감
		// 메뉴 번호를 잘못 입력했을 경우 “잘못 입력하셨습니다.” 출력 후
		// mainMenu()로 돌아감
		switch (selMenu) {
		case 1:
			deleteOne();
			break;
		case 2:
			deleteAll();
			break;
		case 9:
			System.out.println("메인으로 돌아갑니다.");
			break;
		default:
			System.out.println("잘못 입력하셨습니다.");
			break;
		}
	}

//	+ deleteOne() : void
	public void deleteOne() {
		// 삭제할 회원 id를 사용자에게 입력 받고
		System.out.print("삭제할 회원 id : ");
		String id = sc.next();
		// 정말 삭제할 것인지 사용자에게 물어본 뒤
		System.out.print("정말 삭제하시겠습니까 (y/n) : ");
		char yn = sc.next().charAt(0);

		// Y나 y를 사용자가 입력할 경우
		if (yn == 'Y' || yn == 'y') {
			// 입력 받은 id를 mc의 delete() 메소드의 매개변수로 넘김
			boolean isDeleted = mc.delete(id);
			// 반환 값에 따라
			// 결과 값이 true인 경우 “성공적으로 삭제하였습니다.” 출력 후 mainMenu()로 돌아감
			if (isDeleted) {
				System.out.println("성공적으로 삭제하였습니다.");
			} else {
				// 결과 값이 false인 경우 “존재하지 않는 아이디입니다.” 출력, mainMenu()로 감
				System.out.println("존재하지 않는 아이디입니다.");
			}
		}
	}

//	+ deleteAll() : void
	public void deleteAll() {
		// 정말 삭제할 것인지 사용자에게 물어본 뒤
		System.out.print("정말 삭제하시겠습니까 (y/n) : ");
		char yn = sc.next().charAt(0);
		// Y나 y를 사용자가 입력할 경우 mc의 delete() 메소드 호출
		// “성공적으로 삭제하였습니다.” 출력 후 mainMenu()로 돌아감
		if (yn == 'Y' || yn == 'y') {
			mc.delete();
			System.out.println("성공적으로 삭제하였습니다.");
		}
	}

//	+ printAll() : void
	public void printAll() {
		Member[] memberList = mc.printAll();
		if (mc.existMemberNum() == 0) {
			System.out.println("저장된 회원이 없습니다.");
		} else {
			for (int i = 0; i < memberList.length; i++) {
				if (memberList[i] != null) {
					System.out.println(memberList[i].inform());
				}
			}
			/*
			 * for(Member m : memberList) { if (m != null) { // 저장된 회원의 정보만 출력! String info
			 * = m.inform(); System.out.println(info); // System.out.println(m.inform()); }
			 * }
			 */
		}
	}

	public void printAllv2() {
		// mc의 printAll() 메소드의 반환 값을 가지고
		Member[] memberList = mc.printAll();

		// 저장된 회원 수 확인 => mc.existMemberNum() 사용!
		if (memberList.length == 0) {
			// 저장된 회원을 출력하는데 저장된 회원의 수가 0명이면
			// “저장된 회원이 없습니다.” 출력
			System.out.println("저장된 회원이 없습니다.");
		} else {
			// 0명이 아니면 저장된 모든 회원의 정보 출력
			for (Member m : memberList) {
				System.out.println(m.inform());
			}
		}
	}
}
