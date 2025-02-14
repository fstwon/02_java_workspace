package com.kh.practice.chap02_abstractNInterface.model.vo;

public interface CellPhone extends Phone, Camera {
	// field
	// + charge() : String abstract// 충전 방식
	public abstract String charge();
}
