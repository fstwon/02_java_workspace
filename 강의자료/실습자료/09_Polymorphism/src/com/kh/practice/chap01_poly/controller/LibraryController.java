package com.kh.practice.chap01_poly.controller;

import com.kh.practice.chap01_poly.model.vo.*;
/*
import com.kh.practice.chap01_poly.model.vo.AniBook;
import com.kh.practice.chap01_poly.model.vo.Book;
import com.kh.practice.chap01_poly.model.vo.CookBook;
import com.kh.practice.chap01_poly.model.vo.Member;
*/

public class LibraryController {
//	- mem : Member // null로 명시초기화
	private Member mem = null;
//	- bList : Book[] // 크기 5 할당
	private Book[] bList = new Book[5];
	{
		bList[0] = new CookBook("백종원의 집밥", "백종원", "tvN", true);
		bList[1] = new AniBook("한번 더 해요", "미티", "원모어", 19);
		bList[2] = new AniBook("루피의 원피스", "루피", "japan", 12);
		bList[3] = new CookBook("이혜정의 얼마나 맛있게요", "이혜정", "문학", false);
		bList[4] = new CookBook("최현석 날 따라해봐", "최현석", "소금책", true);
	}
	
//	+ insertMember(mem:Member) : void
	public void insertMember(Member mem) {
		// 전달받은 mem (매개변수) 주소값을 통해 
		//	LibraryController의 mem에(인스턴스변수, 필드) 대입 => mem필드의 setter 메소드
		this.mem = mem;
	}
//	+ myInfo() : Member
	public Member myInfo() {
		/// 회원 레퍼런스(mem) 주소값 리턴 => mem필드의 getter 메소드
		return mem;	
	}
//	+ selectAll() : Book[]
	public Book[] selectAll() {
		// 도서 전체 목록 (bList) 주소값 리턴 => bList필드의 getter 메소드
		return bList;	
	}
//	+ searchBook(keyword:String) : Book[]
	public Book[] searchBook(String keyword) {
		/*
			전달받은 키워드(매개변수)가 포함된 도서가 여러 개가 존재할 수 있으니 
			검색된 도서를 담아줄 Book 객체 배열을 새로이 생성하고
			
			for문을 통해 bList 안의 도서들의 도서명과 전달받은 키워드를 비교하여 
			포함하고 있는 경우 새로운 배열에 차곡차곡 담기
			→ 그 배열 주소 값 리턴
		 */
		Book[] searchList = new Book[bList.length];
		
		int count=0;	// 조회 결과를 담을 배열(searchList)의 인덱스
		// for문을 사용하여 bList 안의 도서들에서 도서명에 
		// 키워드가 포함된 항목을 searchList배열에 저장
		// * 키워드 포함 여부 확인 : 문자열.contains(키워드)
		for(int i=0; i<bList.length; i++) {	
			// 저장된 도서목록 길이만큼 반복문 수행
			// => i 변수는 bList 배열의 인덱스로 사용하게 될것!
			if(bList[i] != null 
					&& bList[i].getTitle().contains(keyword)) {
				searchList[count++] = bList[i];
			}
		}
		
		return searchList; 
	}
//	+ rentBook(index:int) : int
	public int rentBook(int index) {
		int result = 0;
		
		if (index >= 0 && index < bList.length) {
			// 0 <= index < 배열길이 => 유효한 인덱스 범위일 때만 동작될 것임!
			// 전달 받은 index의 bList 객체 
			Book b = bList[index];
			// => 만약에, index 값이 음수거나 배열 크기 이상인 값이 전달된다면?
			//	  오류 발생!! 
			
			if (b instanceof AniBook) {
				// 만화책을 참조하고 있고
				// 해당 만화책의 제한 나이와 
				// 			회원의 나이를 비교하여 회원 나이가 적을 경우
				if ( mem != null
						&& (((AniBook)b).getAccessAge() > mem.getAge())) {
					// result를 1로 초기화 → 나이제한으로 대여 불가
					result = 1;
				}
			} else if (b instanceof CookBook) {
				// 요리책을 참조하고 있고 
				// 해당 요리책의 쿠폰유무가 “유”일 경우
				if(mem != null
						&&((CookBook)b).isCoupon()) {
					// 회원의 couponCount 1 증가 처리 후
					//  => 기존의 couponCount 값을 조회하여 +1한 후에 
					//	   couponCount 필드에 저장!
					mem.setCouponCount( mem.getCouponCount() + 1 );
					// result를 2로 초기화 → 성공적으로 대여 완료, 요리학원 쿠폰 발급
					result = 2;
					
				}
			}
		}
		// result 값 리턴
		return result;
	}
}





