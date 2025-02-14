package practice_java;


public class RunCalc {
	public static void main(String[] args) {
		CompleteCalc cc = new CompleteCalc();
		cc.showInfo();
	}
}

interface Calc {
	public final double PI = 3.14;
	public final int ERROR = -999999999;
	
	public abstract int add(int num1, int num2);
	public abstract int substract(int num1, int num2);
	public abstract int times(int num1, int num2);
	public abstract int divide(int num1, int num2);
}

abstract class Calculator implements Calc {
	public int add(int num1, int num2) {
		return num1 + num2;
	}
	public int substract(int num1, int num2) {
		return num1 - num2;
	}
}

class CompleteCalc extends Calculator {
	public int times(int num1, int num2) {
		return num1 * num2;
	}
	public int divide(int num1, int num2) {
		return num1 / num2;
	}
	
	public void showInfo() {
		System.out.println("add : " + add(1, 2));
		System.out.println("substract : " + substract(2, 1));
		System.out.println("times : " + times(3, 4));
		System.out.println("divide : " + divide(10, 5));
	}
}