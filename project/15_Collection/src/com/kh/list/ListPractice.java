package com.kh.list;

import java.util.*;
public class ListPractice {

	public static void main(String[] args) {
		// arrayListTest();
		// linkedListTest();
		stackTest();
		// queueTest();
	}
	public static void queueTest() {
		/*
		 * Queue 큐 LILO FIFO
		 * 처음 저장된 데이터를 가장 먼저 가져오는 구조
		 *  
		*/
		MyQueue<String> queue = new MyQueue<>();
		
		queue.enQueue("아보카도");
		queue.enQueue("딸기");
		queue.enQueue("복숭아");
		System.out.println(queue);
		try {
			System.out.println("제거 데이터 : " + queue.deQueue());
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println(queue);
	}
	public static void stackTest() {
		/*
		 * Stack 스택 LIFO FILO
		 * 가장 마지막에 저장된 데이터를 가장 먼저 가져오는 구조
		 * - 데이터 추가 : 순서대로 마지막에 추가 
		 * - 데이터 제거 : 데이터의 역순으로 제거
		 *
		*/
		MyStack<String> stack = new MyStack<>();
		stack.push("아보카도");
		stack.push("딸기");
		stack.push("복숭아");
		System.out.println(stack);
		try {
			System.out.println("제거 데이터 : " + stack.pop());			
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println(stack);
	}
	public static <T> void printItem(List<T> list) {
		for(int i = 0; i < list.size(); i++) {
			System.out.println(i + " 번째 : " + list.get(i));
		}
	}
	public static void linkedListTest() {
		Scanner sc = new Scanner(System.in);
		// 사용자에게 개수를 입력 받아 
		// 해당 개수만큼 랜덤 값을 추출하여 리스트에 저장
		System.out.print("개수 입력 : ");
		int num = sc.nextInt();
		
		List<Integer> list = new LinkedList<>();
		
		for(int i = 0; i < num; i++) {
			// Math.random() * num
			int random = (int)(Math.random() * num + 1);
			list.add(random);
		}
		// i 번째 : 데이터 값
		/*
		for(int i = 0; i < list.size(); i++) {
			System.out.println(i + " 번째 : " + list.get(i));
		}
		*/
		printItem(list);
		
		sc.close();
	}
	public static void arrayListTest() {
		// 문자열 데이터 관리 ArrayList 객체 생성
		// ArrayList<String> arrayList = new ArrayList<>();
		List<String> list = new ArrayList<>();
		
		// 헤이즐넛, 아메리카노, 카모마일
		list.add("헤이즐넛");
		list.add("아메리카노");
		list.add("카모마일");
		
		System.out.println(list); // [헤이즐넛, 아메리카노, 카모마일]
		
		// 중복 데이터 추가
		list.add("아메리카노");
		System.out.println(list); // [헤이즐넛, 아메리카노, 카모마일, 아메리카노]
		
		// * 첫번째 "아메리카노" 데이터 삭제
		list.remove(1); // [헤이즐넛, 카모마일, 아메리카도]
		
		// * "카모마일" => "유자차" 변경
		list.set(1, "유자차");
		
		// i 번째 : 데이터 값 형식을 출력
		/*
		for(int i = 0; i < list.size(); i++) {
			System.out.println(i + " 번째 : " + list.get(i));
		}
		*/
		printItem(list);
	}
}
