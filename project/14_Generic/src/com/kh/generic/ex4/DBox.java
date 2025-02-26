package com.kh.generic.ex4;

public class DBox<L, R> {
	private L left; // 첫번째 전달 타입
	private R right; // 두번째 전달 타입
	
	// setter
	public void set(L left, R right) {
		this.left = left;
		this.right = right;
	}
	/*
	public void setLeft(L left) {
		this.left = left;
	}
	public L getLeft() {
		return left;
	}
	public void setRight(R right) {
		this.right = right;
	}
	public R getRight() {
		return right;
	}
	*/
	
	@Override
	public String toString() {
		return left + " & " + right;
	}
	
}
