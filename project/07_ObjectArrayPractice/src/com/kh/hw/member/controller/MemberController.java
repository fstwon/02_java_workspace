package com.kh.hw.member.controller;

import com.kh.hw.member.model.vo.Member;

public class MemberController {
	// field
	/*
		+ SIZE : int = 10
		- Member[] m = new Member[SIZE]
	*/
	public static final int SIZE = 10;
	private Member[] m = new Member[SIZE];
	
	// method
	/*
		+ existMemberNum() : int
		+ checkId(inputId:String) : Boolean
		
		+ insertMember(id:String, name:String,
		password:String, email:String,
		gender:String, age:int) : void
		
		+ searchId(id:String) : String
		+ searchName(name:String) : Member[]
		+ searchEmail(email:String) : Member[]
		
		+ updatePassword(id:String, password:String):Boolean
		+ updateName(id:String, name:String):Boolean
		+ updateEmail(id:String, email:String):Boolean
		
		+ delete(id:String):Boolean
		+ delete() : void
		+ printAll() : Member[]
	*/
	public int existMemberNum() {
		// 현재 존재하는 멤버 수 반환
		int count = 0;
		for(int i = 0; i < m.length; i++) {
			if(m[i] != null) {
				count++;
			}
		}
		return count;
	}
	public boolean checkId(String inputId) {
		// 아이디 중복확인 하는 메소드
		boolean isEx = false;
		for(int i = 0; i < m.length; i++) {
			if(m[i] != null && m[i].getId().equals(inputId)) {
				isEx = true;
				break;
			}
		}
		return isEx;
	}
	public void insertMember(String id, String name, String password, String email, char gender, int age) {
		// Member객체를 객체배열에 저장하는 메소드
		for(int i = 0; i < m.length; i++) {
			if(m[i] == null) {
				m[i] = new Member(id, name, password, email, gender, age);
				break;
			}
		}
	}
	public String searchId(String id) {
		String info = null;
		for(int i = 0; i < m.length; i++) {
			if(m[i] != null && m[i].getId().equals(id)) {
				info = m[i].inform();
			}
		}
		return info;
	}
	public Member[] searchName(String name) {
		int size = 0;
		for(int i = 0; i < m.length; i++) {
			if(m[i] != null && m[i].getName().equals(name)) {
				size++;
			}
		}
		
		Member[] searchM = new Member[size];
		size = 0;
		for(int i = 0; i < m.length; i++) {
			if(m[i] != null && m[i].getName().equals(name)) {
				searchM[size] = m[i];
				size++;
			}
		}
		return searchM;
	}
	public Member[] searchEmail(String email) {
		int size = 0;
		for(int i = 0; i < m.length; i++) {
			if(m[i] != null && m[i].getEmail().equals(email)) {
				size++;
			}
		}
		
		Member[] searchM = new Member[size];
		size = 0;
		for(int i = 0; i < m.length; i++) {
			if(m[i] != null && m[i].getEmail().equals(email)) {
				searchM[size] = m[i];
				size++;
			}
		}
		return searchM;
	}
	public boolean updatePassword(String id, String password) {
		boolean isUpdate = false;
		for(int i = 0; i < m.length; i++) {
			if(m[i] != null && m[i].getId().equals(id)) {
				m[i].setPassword(password);
				isUpdate = true;
				break;
			}
		}
		return isUpdate;
	}
	public boolean updateName(String id, String name) {
		boolean isUpdate = false;
		for(int i = 0; i < m.length; i++) {
			if(m[i] != null && m[i].getId().equals(id)) {
				m[i].setName(name);
				isUpdate = true;
				break;
			}
		}
		return isUpdate;
	}
	public boolean updateEmail(String id, String email) {
		boolean isUpdate = false;
		for(int i = 0; i < m.length; i++) {
			if(m[i] != null && m[i].getId().equals(id)) {
				m[i].setEmail(email);
				isUpdate = true;
				break;
			}
		}
		return isUpdate;
	}
	public boolean delete(String id) {
		// 한 회원만 삭제하는 메소드
		boolean isDel = false;
		for(int i = 0; i < m.length; i++) {
			if(m[i] != null && m[i].getId().equals(id)) {
				m[i] = null;
				isDel = true;
				break;
			}
		}
		return isDel;
	}
	public void delete() {
		// 전체 회원을 삭제하는 메소드
		for(int i = 0; i < m.length; i++) {
			m[i] = null;
		}
	}
	public Member[] printAll() {
		// Member객체 반환 메소드
		return m;
	}
}
