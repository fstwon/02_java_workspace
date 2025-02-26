package com.kh.list;

import java.util.ArrayList;
import java.util.List;

public class ListPractice {

	/*
	 * List 특징 : 순서가 있고, 중복이 가능한 컬렉션
	 * 
	 * * ArrayList 
	 *   : 배열 기반의 구조
	 *     데이터 조회가 빠름
	 *     데이터 추가/삭제 시 내부로직 복잡하여 오래 걸림
	 * 
	 * * LinkedList
	 *   : 리스트 기반의 구조
	 *     데이터 추가/삭제가 빠름
	 *     데이터 조회가 느림
	 *     
	 * * 메소드
	 * 	 - 데이터 추가 : add(데이터)
	 *   - 데이터 삭제 : remove(인덱스)
	 *   - 데이터 조회 : get(인덱스)
	 *   - 데이터 수정 : set(인덱스, 변경할데이터)
	 *   - 저장된 데이터 크기 : size()
	 */
	public static void main(String[] args) {
		arrayListTest();
	}

	public static void arrayListTest() {
		// 문자열 데이터를 관리하는 ArrayList 객체 생성
		// ArrayList<String> list = new ArrayList<>();
		List<String> list = new ArrayList<>();
		
		list.add("헤이즐넛");
		list.add("아메리카노");
		list.add("카모마일");
		
		// ["헤이즐넛", "아메리카노", "카모마일"]		
		System.out.println(list);
		
		// * "아메리카노"를 또 추가한다면?
		list.add("아메리카노");
		System.out.println(list);
		
		// * 첫번째 "아메리카노" 데이터를 삭제
	}
}





