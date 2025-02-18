package com.kh.practice.numRange.view;

import com.kh.practice.numRange.controller.NumberController;
import com.kh.practice.numRange.exception.NumRangeException;


public class NumberMenu {


    public void menu() {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        // 사용자에게 두 정수를 입력 받아 
        System.out.print("정수1 : ");
        int n1 = sc.nextInt();

        System.out.print("정수2 : ");
        int n2 = sc.nextInt();

        try {
            // NumberController의 checkDouble()에 매개변수로 넘겨주어 반환 값을 출력함
            boolean result = new NumberController().checkDouble(n1, n2);
            // 이 때 checkDouble()메소드를 호출하는 부분부터 try~catch를 이용하여 예외 처리

            System.out.printf("%d는(은) %d의 배수인가 ? %b\n", n1, n2, result);
        } catch (NumRangeException e) {
            e.printStackTrace();
        }

    }


}