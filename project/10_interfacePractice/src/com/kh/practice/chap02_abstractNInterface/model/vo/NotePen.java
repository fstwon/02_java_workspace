package com.kh.practice.chap02_abstractNInterface.model.vo;

public interface NotePen {
	// field
	// + PEN_BUTTON : boolean = true
	public static final boolean PEN_BUTTON = true;
	
	// method
	// + bluetoothPen() : boolean // 블루투스펜 탑재여부
	public abstract boolean bluetoothPen();
}
