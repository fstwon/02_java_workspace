package com.kh.practice.chap01_poly.controller;

import com.kh.practice.chap01_poly.model.vo.AniBook;
import com.kh.practice.chap01_poly.model.vo.Book;
import com.kh.practice.chap01_poly.model.vo.CookBook;
import com.kh.practice.chap01_poly.model.vo.Member;

public class LibraryController {
	// field
	/*
		- mem : Member // null로 명시초기화
		- bList : Book[] // 크기 5 할당
	*/
	private Member mem = null;
	private Book[] bList = new Book[5];
	
	// initial block
	{
		bList[0] = new CookBook("백종원의 집밥", "백종원", "tvN", true);
		bList[1] = new AniBook("한번 더 해요", "미티", "원모어", 19);
		bList[2] = new AniBook("루피의 원피스", "루피", "japan", 12);
		bList[3] = new CookBook("이혜정의 얼마나 맛있게요", "이혜정", "문학", false);
		bList[4] = new CookBook("최현석 날 따라해봐", "최현석", "소금책", true);
	}
	
	// method
	/*
		+ insertMember(mem:Member) : void
		+ myInfo() : Member
		+ selectAll() : Book[]
		+ searchBook(keyword:String) : Book[]
		+ rentBook(index:int) : int
	*/
	public void inserMember(Member mem) {
		// 전달받은 mem 주소값을 통해 LibraryController의 mem에 대입
		this.mem = mem;
	}
	
	public Member myInfo() {
		// 회원 레퍼런스(mem) 주소값 리턴
		return mem;
	}
	
	
	public Book[] selectAll() {
		// 도서 전체 목록 (bList) 주소값 리턴
		return bList;
	}
	
	
	public Book[] searchBook(String keyword) {
		/*
			전달받은 키워드가 포함된 도서가 여러 개가 존재할 수 있으니 검색된 도서를 담아줄 Book 객체 배열을 새로이 생성하고
			for문을 통해 bList 안의 도서의 타이틀과 전달받은 키워드를 비교하여 포함하고 있는 경우 새로운 배열에 차곡차곡 담기
			→ 그 배열 주소 값 리턴
		*/
		// for문으로 bList 안의 도서의 title이 keyword를 포함하고 있으면 새로운 객체 배열에 추가
		Book[] searchList = new Book[bList.length];
		
		for(int i = 0; i < bList.length; i++) {
			Book b = bList[i];
			// String.indexOf(키워드) => String.contains(키워드)
			if(b != null && b.getTitle().indexOf(keyword) > -1) {
				searchList[i] = b;
			}
		}

		// 새로운 객체 배열 주소 값 반환
		return searchList;
	}
	
	
	public int rentBook(int index) {
		/*
			result를 0으로 초기화 한 후 전달받은 인덱스의 도서가 만화책인 경우 회원의 나이와 해당 만화책의 제한
			나이를 비교하여 회원 나이가 더 적은 경우 result를 1로 초기화
			
			아니면 전달받은 인덱스의 도서가 요리책인 경우 해당 요리책의 쿠폰 유무가 유일 경우 
			회원의 couponCount를 1증가 시킨 후 result 2로 초기화 → result 리턴
		*/
		// result 0으로 초기화
		int result = 0;
		if(index < 0 || index > bList.length) {
			return -1;
		}
		Book b = bList[index];
		if(b instanceof AniBook) {
			// 전달 받은 index의 도서가 만화책인 경우 회원 나이와 만화책 제한 나이 비교
			// 회원 나이가 더 적은 경우 result 1로 초기화
			if(mem != null && ((AniBook)bList[index]).getAccessAge() > mem.getAge()) {
				result = 1;
			}
		} else if(b instanceof CookBook) {
			// 도서가 요리책인 경우 요리책의 쿠폰 유무 확인
			if(mem != null && ((CookBook)b).isCoupon()) {
				int couponCount = mem.getCouponCount();
				// coupon = true 회원의 couponCount 1 증가
				mem.setCouponCount(++couponCount);
				// result 2로 초기화 
				result = 2;
			}
		}
		
		// result 반환
		return result;
	}
}
