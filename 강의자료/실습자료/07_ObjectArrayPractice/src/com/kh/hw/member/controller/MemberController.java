package com.kh.hw.member.controller;

import com.kh.hw.member.model.vo.Member;

public class MemberController {
	/*
		- Member[] m = new Member[SIZE]
		+ SIZE : int = 10 (밑줄)
	 */
	private Member[] m = new Member[SIZE];
	public static final int SIZE = 10;
	
//	+ existMemberNum() : int
	/**
	 * 등록된 회원 정보 수를 반환 메소드
	 * @return 배열의 요소 중 null값이 아닌 요소의 개수
	 */
	public int existMemberNum() {
		int count = 0;
		for (Member data : m) {
			// 배열 내의 값이 null이 아닌 경우 => 저장된 회원 정보가 있는 경우
			// count 값을 1 증가
			if (data != null) count++;
		}
		return count;
	}
//	+ checkId(inputId:String) : Boolean
	public boolean checkId(String inputId) {
		boolean isExist = false;
		for(Member data : m) {
			// 배열 내의 저장된 회원 정보 중 아이디값이 존재하는 경우 체크
			if (data != null && data.getId().equals(inputId))
				isExist = true;
		}
		return isExist;
	}
//	+ insertMember(id:String, name:String,
//					password:String, email:String,
//					gender:String, age:int) : void
	/**
	 * Member 객체를 객체배열에 저장하는 메소드
	 * @param id 아이디
	 * @param name 이름
	 * @param password 비밀번호
	 * @param email 이메일
	 * @param gender 성별
	 * @param age 나이
	 */
	public void insertMember(String id, String name
							, String password, String email
							, char gender, int age) {
		// * 객체 배열의 요소의 값이 null인 위치에 객체 저장
		for(int i=0; i<m.length; i++) {
			// i번째 위치의 값이 null인지 체크
			if(m[i] == null) {
				// Member 객체 생성 후 i번째 위치에 저장
				m[i] = new Member(id, name, password, email, gender, age);
				break;	// 반복문 종료
			}
		}
		
	}
	
//	+ searchId(id:String) : String
	/**
	 * id로 회원을 조회하는 메소드
	 * @param id 아이디
	 * @return 회원정보(문자열): inform() 사용
	 * 			결과가 있으면 문자열
	 * 				 없으면 null
	 */
	public String searchId(String id) {
		String info = null;
		for(int i=0; i<m.length; i++) {
			// i번째 위치의 객체가 생성되었는지 체크(null값으로 비교)
			if (m[i] != null) {
				// 해당 객체의 id값을 조회하여
				//     매개변수로 받은 id 값과 비교 (문자열.equals 메소드 사용!)
				if(id.equals(m[i].getId())) {
					// id값이 같은 경우 
					//    해당 객체의 inform 메소드를 통해 회원정보 반환
					info = m[i].inform();
					break;	// 반복문 종료
				}
			}			
		}
		return info;
	}
//	+ searchName(name:String) : Member[]
	public Member[] searchName(String name) {
		Member[] searchList = new Member[SIZE];
		int idx=0;
		// 이름에 해당하는 회원 정보(객체)를 배열에 추가
		for(Member data : m) {
			if (data != null && data.getName().equals(name)) {
				searchList[idx++] = data;
			}
		}
		if (idx > 0) {
			// 조회된 회원이 있을 경우 찾은 회원만 추출
			Member[] temp = new Member[idx];
			System.arraycopy(searchList, 0, temp, 0, idx);
			searchList = temp;
		} else {
			// 조회된 결과가 없을 경우 배열의 길이를 0으로 할당
			searchList = new Member[0];
		}
		
		System.out.println(searchList.length);
		return searchList;
	}
//	+ searchEmail(email:String) : Member[]
	public Member[] searchEmail(String email) {
		Member[] searchList = new Member[SIZE];
		int idx=0;
		// 이름에 해당하는 회원 정보(객체)를 배열에 추가
		for(Member data : m) {
			if (data != null && data.getEmail().equals(email)) {
				searchList[idx++] = data;
			}
		}
		if (idx > 0) {
			// 조회된 회원이 있을 경우 찾은 회원만 추출
			Member[] temp = new Member[idx];
			System.arraycopy(searchList, 0, temp, 0, idx);
			searchList = temp;
		} else {
			// 조회된 결과가 없을 경우 배열의 길이를 0으로 할당
			searchList = new Member[0];
		}
		return searchList;
	}
//	+ updatePassword(id:String,
//					password:String):Boolean
	/**
	 * 비밀번호 변경 메소드
	 * @param id 아이디
	 * @param password 비밀번호
	 * @return 변경 성공 여부
	 */
	public boolean updatePassword(String id, String password) {
		boolean result = false;
		// 배열의 인덱스로 접근 -> 반복문 사용
		for(int i=0; i<m.length; i++) {
			// 객체 생성 여부 체크 -> null 값으로 비교
			if (m[i] != null) { // 배열의 i번째 위치의 값이 null이 아닌 경우 => 객체 생성됨!
				if (m[i].getId().equals(id)) {
					// 전달받은 비밀번호를 객체의 password 필드에 저장(변경)
					m[i].setPassword(password);	
					result = true;
					break;
				}
			}
		}
		
		return result;	// 비밀번호 변경에 대한 결과값 반환
	}
//	+ updateName(id:String, name:String):Boolean
	public boolean updateName(String id, String name) {
		boolean result = false;
		for(int i=0; i<m.length; i++) {
			if (m[i] != null) { 
				if (m[i].getId().equals(id)) {
					m[i].setName(name);	
					result = true;
					break;
				}
			}
		}
		return result;
	}
//	+ updateEmail(id:String, email:String):Boolean
	public boolean updateEmail(String id, String email) {
		boolean result = false;
		for(int i=0; i<m.length; i++) {
			if (m[i] != null) { 
				if (m[i].getId().equals(id)) {
					m[i].setEmail(email);	
					result = true;
					break;
				}
			}
		}
		return result;
	}
	
//	+ delete(id:String):Boolean
	/**
	 * 한 회원만 삭제하는 메소드
	 * @param id 아이디
	 * @return 삭제 여부
	 */
	public boolean delete(String id) {
		boolean isDelete = false;
		
		for(int i=0; i<m.length; i++) {
//			if(m[i] != null) {
//				if (m[i].getId().equals(id)) {
			if (m[i] != null && m[i].getId().equals(id)) {
			// 객체의 멤버(필드,메소드)에 접근 시 null 체크!
			// => 체크하지 않을 경우 NullPointerException 발생될 수 있음!
					m[i] = null;
					isDelete = true;
					break;
				//}
			}
		}
		
		return isDelete;
	}
//	+ delete() : void
	public void delete() {
		// 새로운 배열을 생성하여 할당
		m = new Member[SIZE];
	}
//	+ printAll() : Member[]
	/**
	 * 저장된 회원 목록을 반환하는 메소드
	 * @return 회원목록(Member배열)
	 */
	public Member[] printAll() {
		return m;
	}
	
	public Member[] printAllv2() {
		// return m; // => 회원 정보 출력 시 null체크해야 함!
		// 저장된 회원 목록에 대한 배열을 만들어서 반환!
		Member[] mList = new Member[m.length];
		
		// 새로운 배열에 null이 아닌 값으로 복사
		for(int i=0; i<m.length; i++) {
			if (m[i] != null) {
				
				for(int j=0; j<mList.length; j++) {
					if(mList[j] == null) {
						mList[j] = m[i];
						break;
					}
				}
			}
		}
		// 새로운 배열의 null 값을 가진 위치 전까지만 반환
		int idx=-1;
		boolean isExist = false;
		for(int i=0; i<mList.length; i++) {
			if (mList[i] == null) {
				idx = i;
				break;
			}
			isExist = true;
		}
		
		if(idx > -1) {
			Member[] copy = new Member[idx];
			
			System.arraycopy(mList, 0, copy, 0, idx);
			mList = copy;
		} else if(!isExist) {
			// 배열이 모두 null인 경우에 크기가 0인 배열을 반환
			mList = new Member[0];
		}
		
		return mList;
	}
}





