package com.kh.array;

public class Array02 {

	public static void main(String[] args) {
		// 정수형 배열 10개 크기의 iArr 변수 선언 및 할당
		int[] iArr = new int[10];
		// 실수형 배열 4개 크기의 dArr 변수 선언 및 할당
		double[] dArr = new double[4];
		
		// iArr 배열 값 모두 출력
		for(int i = 0; i < iArr.length; i++) {
			System.out.print(iArr[i] + " ");
		}
		System.out.println();
		// dArr 배열 값 모두 출력
		for(int i = 0; i < dArr.length; i++) {
			System.out.print(dArr[i] + " ");
		}
		System.out.println();
		// iArr 배열 변수 출력
		System.out.println(iArr); // 배열의 자료형 + @ + 주소값의 16진수 형태
		System.out.println(iArr.hashCode()); // 주소 값의 10진수 형태
		
		// 배열을 강제로 삭제해야하는 경우 참조 변수에 null을 대입하여 주소 연결을 해제함으로써 
		// 삭제할 수 있다. 
		// 연결이 해제된 데이터의 값은 연결이 해제된 후에도 Heap 메모리 영역에 존재하지만
		// 지속적으로 데이터에 값을 참조하지 않는 경우 Garbage Collector (GC)에 의해 Heap 영역에서도 삭제된다. 
		int[] arr = null; // 아무것도 참조하지 않는다.
		// 아무것도 참조하지 않는 배열의 데이터에 접근하는 경우 에러 발생
		// NullPointerException
		// System.out.println(arr.hashCode());
		
		// ArrayIndexOfBoundsException
		// arr = new int[4];
		// System.out.println(arr[5]);
		
		
		// 배열 선언, 할당, 초기화 전부 동시에 진행
		int[] arr2 = new int[] {1, 2, 3, 4};
		int[] arr3 = {1, 2, 3, 4};
		
		System.out.println(arr2 == arr3);
	}

}
