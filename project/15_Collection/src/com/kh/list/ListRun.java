package com.kh.list;

import java.util.LinkedList;
import java.util.List;

public class ListRun {
	public static void main(String[] args) {
		List list = new LinkedList(); // 크기를 지정하지 않아도 된다.
		
		// * 데이터 추가 => add(E e) 메소드 사용
		list.add("sample data1");
		list.add(123);
		list.add(4.5);
		
		System.out.println(list);
		
		// * 데이터 추가 삽입 => add(int index, E e) => index 위치에 데이터 삽입
		list.add(1, "sample data2");
		System.out.println(list);
		
		// * 데이터 삭제 => remove(int index), index 위치의 데이터 삭제
		list.remove(2);
		System.out.println(list);
		
		// * 데이터 변경 => set(int index, E e)
		list.set(1, "sample e");
		System.out.println(list);
		
		// * 저장된 데이터 크기 조회 => size()
		System.out.println("현재 list 크기 : " + list.size());
		
		// * 특정 위치의 데이터 조회 => get(index), index 위치의 데이터 조회
		System.out.println(list.get(2));
		
		// * 전체 출력
		for(int i = 0; i < list.size(); i++) {
			System.out.println(i + "번 위치 : " + list.get(i));
		}
		
		// * 전체 데이터 삭제 => clear()
		list.clear();
		
		// * 리스트가 비어있는지 확인 => isEmpty()
		System.out.println(list.isEmpty());
	}
}
