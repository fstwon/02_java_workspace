package com.kh.last.p1;

import java.util.Random;

public class ArrayTest {

	public static void main(String[] args) {
		int[] array = new int[6];	// 크기가 6인 정수형 배열 선언 및 할당
		
		// java.util.Random 클래스를 사용하여 각 인덱스 위치에 값을 저장
		for(int i=0; i<array.length; i++) {
			array[i] = new Random().nextInt(100) + 1;
			// 1 ~ 100까지 랜덤값을 추출하여 배열에 저장
		}
		
		System.out.println("할당된 배열의 크기 : " + array.length);
		
		ArrayTest at = new ArrayTest();		
		at.print(array); // print 메소드 호출
		// print(array); // print 메소드에 static 예약어 추가 시 호출 가능!
		
		System.out.println("가장 큰 값 : " + at.max(array));
		System.out.println("가장 작은 값 : " + at.min(array));
		System.out.println("짝수의 개수 : " + at.evenCount(array) + " 개");
		System.out.println("홀수의 개수 : " + at.oddCount(array) + " 개");
		System.out.println("합계 : " + at.sum(array));
		System.out.printf("평균 : %.2f\n", at.avg(array));
		// 지시어 %f (실수형), 소숫점을 제한하고 싶을 경우 %.nf
	}
	
	/*
		+ sum(arr : int[]) : int 배열의 합계를 계산해서 리턴함
		+ avg(arr : int[]) : double 배열의 평균을 계산해서 리턴함
		+ max(arr : int[]) : int 배열에서 가장 큰 값을 찾아서 리턴
		+ min(arr : int[]) : int 배열에서 가장 작은값 찾아서 리턴
		+ evenCount(arr : int[]) : int 배열에서 짝수의 개수를 리턴함
		+ oddCount(arr : int[]) : int 배열에서 홀수의 개수를 리턴함
		+ print(arr : int[]) : void 배열 값들 출력
	 */
	public int sum(int[] arr) {
		int total = 0;
		
		for(int n : arr) {
			total += n;		// total = total + n;
		}
		
		return total;
	}
	
	public double avg(int[] arr) {
		// 평균 = 총합 / 총개수
		return (double)sum(arr) / arr.length;
		// sum(arr) => int
		// -> (double)sum(arr) => int --> double 강제 형변환
		// arr.length => int
		// -> (double)sum(arr) / arr.length => double / int-->double 자동형변환
	}
	
	public int max(int[] arr) {
		int maxNum = arr[0];
		
		for(int n : arr) {
			// if (maxNum < n) maxNum = n;
			maxNum = Math.max(maxNum, n);
			// Math.max(a, b) => a b 중 최대값을 리턴
		}
		
		return maxNum;
	}
	
	public int min(int[] arr) {
		int minNum = arr[0];
		
		for(int i=1; i<arr.length; i++) {
			// if (minNum > arr[i]) minNum = arr[i];
			minNum = Math.min(minNum, arr[i]);
		}
		
		return minNum;
	}
	
	public int evenCount(int[] arr) {
		int count = 0;
		
		for(int n : arr) {
			if (n % 2 == 0) count++;
		}
		
		return count;
	}
	
	public int oddCount(int[] arr) {
		int count = 0;
		
		for(int i=0; i<arr.length; i++) {
			if (arr[i] % 2 != 0) count++;
		}
		
		return count;
	}
	
	public void print(int[] arr) {
		// array : 23 1 75 62 12 5 형식으로 출력
		System.out.print("array : ");
		for(int n : arr) {
			System.out.print(n + " ");
		}
		
		System.out.println(); // 줄바꿈 처리
	}

}
