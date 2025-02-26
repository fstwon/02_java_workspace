package com.kh.last.p1;

import java.util.Random;

public class ArrayTest {
	private static int[] arr = new int[6];
	// 1차원 배열에 들어 있는 데이터들의 최대값, 최소값, 짝수의 개수, 홀수의 개수, 합계와 평균을 구한다.
	// 각 index 별 값은 java.util.Random으로 1부터 100사이의 임의의 정수로 기록 처리
	public static void main(String[] args) {
		setArray();
		print(arr);
	}
	public static void setArray() {
		for(int i = 0; i < arr.length; i++) {
			int r = new Random().nextInt(100) + 1;
			arr[i] = r;
		}
	}
	public static int sum(int[] arr) {
		// int 배열의 합계를 계산해서 리턴함
		int result = 0;
		for(int n : arr) {
			result += n;
		}
		return result;
	}
	public static double avg(int[] arr) {
		// double 배열의 평균을 계산해서 리턴함
		double sumArr = sum(arr);
		return sumArr / arr.length;
	}
	public static int max(int[] arr) {
		// int 배열에서 가장 큰 값을 찾아서 리턴
		int max = 0;
		for(int n : arr) {
			if(max < n) {
				max = n;
			}
		}
		return max;
	}
	public static int min(int[] arr) {
		// int 배열에서 가장 작은값 찾아서 리턴
		int min = 100;
		for(int n : arr) {
			min = Math.min(n, min);
		}
		return min;
	}
	public static int evenCount(int[] arr) {
		// int 배열에서 짝수의 개수를 리턴함
		int count = 0;
		for(int n : arr) {
			if(n % 2 == 0) {
				count++;
			}
		}
		return count;
	}
	public static int oddCount(int[] arr) {
		// int 배열에서 홀수의 개수를 리턴함
		int count = 0;
		for(int n : arr) {
			if(n % 2 != 0) {
				count++;
			}
		}
		return count;
	}
	
	public static void print(int[] arr) {
		// 배열 값들 출력
		String printResult = "[";
		for(int i = 0; i < arr.length; i++) {
			printResult += arr[i] + (i == arr.length - 1 ? "]" : ", ");
		}
		System.out.print("array : " + printResult);
		System.out.println();
		System.out.println("가장 큰 값 : " + max(arr));
		System.out.println("가장 작은 값 : " + min(arr));
		System.out.println("짝수의 개수 : " + evenCount(arr));
		System.out.println("홀수의 개수 : " + oddCount(arr));
		System.out.println("합계 : " + sum(arr));
		System.out.println("평균 : " + avg(arr));
	}
}
