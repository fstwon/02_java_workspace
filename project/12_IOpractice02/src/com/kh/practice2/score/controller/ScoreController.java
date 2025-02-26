package com.kh.practice2.score.controller;

import java.io.DataInputStream;
import java.io.FileNotFoundException;

import com.kh.practice2.score.model.dao.ScoreDAO;

public class ScoreController {
	// field
	/* - sd:ScoreDAO = new ScoreDAO() */
	private ScoreDAO sd = new ScoreDAO();
	
	
	// method
	/*
	 * + saveScore(name:String, kor:int, eng:int, math:int, sum:int, avg:double) : void
	 * + readScore() : DataInputStream throws FileNotFoundException
	 */
	public void saveScore(String name, int kor, int eng, int math, int sum, double avg) {
		// 매개변수를 DAO에 saveScore에 전달
		sd.saveScore(name, kor, eng, math, sum, avg);
	}
	public DataInputStream readScore() throws FileNotFoundException {
		// DAO에 반환 값을 그대로 반환
		return sd.readScore();
	}
}
