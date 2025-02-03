package test;
import java.util.Scanner;

public class Test39 {

	public static void main(String[] args) {
		// test1();
		test2();
	}
	public static void test1() {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();

        // n1, n2, n3 중 최대 값을 출력
        // n1 < n2, n2 < n3
        if(n1 < n2 && n2 < n3) {
        	 System.out.print("최대 값 : " + n3);
        } else if(n1 < n2 && n2 > n3) {
             System.out.print("최대 값 : " + n2);
        } else {
        	 System.out.print("최대 값 : " + n1);
        }		
	}
	public static void test2() {
		int[] arr = new int[3];
		
		// System.out.print(arr[0]);
		// 배열 생성 및 초기화 1
		double[] arr2 = new double[]{1.3, 2.5, 2.6, 4.5};
		System.out.print(arr2[0]);
		// 배열 생성 및 초기화 2
		// double[] arr2 = {1.3, 2.5, 2.6, 4.5};
	}
}
