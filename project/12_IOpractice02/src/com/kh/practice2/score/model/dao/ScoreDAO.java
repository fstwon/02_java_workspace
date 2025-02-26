package com.kh.practice2.score.model.dao;

import java.io.*;

public class ScoreDAO {
	// method
	/*
	 * + saveScore(name:String, kor:int, eng:int, math:int, sum:int, avg:double) : void
	 * + readScore() : DataInputStream throws FileNotFoundException
	 */
	public void saveScore(String name, int kor, int eng, int math, int sum, double avg) {
		/*
		 * 매개변수들을 DataOutputStream을 통해 파일에 저장
		 */
		File f = new File("score.txt");
		
		// 기반 스트림, FileInputStream
		try(DataOutputStream dos = new DataOutputStream(new FileOutputStream(f, true))) {
			dos.writeUTF(name);
			dos.writeInt(kor);
			dos.writeInt(eng);
			dos.writeInt(math);
			dos.writeInt(sum);
			dos.writeDouble(avg);
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
	public DataInputStream readScore() throws FileNotFoundException {
		/*
		 * 파일을 DataInputStream을 통해 읽어옴
		 */
		File f = new File("score.txt");
		DataInputStream dis = new DataInputStream(new FileInputStream(f));
		return dis;
	}
}
