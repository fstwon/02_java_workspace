package test;
import java.util.Scanner;

public class Test39 {

	public static void main(String[] args) {
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

}
