package com.kh.object.practice5.model.vo;

public class Lotto {
	// field
	// -lotto:int[]
	private int[] lotto;
	
	{
		lotto = new int[6];
		for(int i = 0; i < lotto.length; i++) {
			lotto[i] = (int)(Math.random() * 45 + 1);
			for(int j = 0; j < i; j++) {
				if(lotto[i] == lotto[j]) {
					i--;
					break;
				} else {
					if(lotto[j] > lotto[i]) {
						int tmp = lotto[j];
						lotto[j] = lotto[i];
						lotto[i] = tmp;
					}
				}
			}
		}
	}
	
	// constructor
	// +Lotto()
	public Lotto() {
		
	}
	
	// method
	// +information():void
	public void information() {
		for(int num : lotto) {
			System.out.print(num + " ");
		}
	}
	
}
