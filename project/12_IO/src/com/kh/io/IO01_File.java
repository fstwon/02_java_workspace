package com.kh.io;

import java.io.File;
import java.io.IOException;

public class IO01_File {
	public static void main(String[] args) {
		/*
			파일을 통해 입출력
			File class 사용 (java.io.File)
		*/
		fileTest2();
	}
	public static void fileTest2() {
		// sample 폴더 생성 후 myDiary.txt 파일 생성
		File folder = new File("sample");
		
		// sample 폴더 존재 유무 확인
		if(!folder.exists()) {
			// 존재하지 않을 경우 폴더 생성
			folder.mkdir();
		}
		
		// my_diary 파일 생성
		File file = new File("sample//myDiary.txt");
		try {			
			if(!file.exists()) {
				file.createNewFile();
			}
			
			// 파일 정보 확인
			System.out.println("파일명 : " + file.getName());
			System.out.println("파일 경로 : " + file.getAbsolutePath());
			System.out.println("파일 용량 : " + file.length());
			System.out.println("파일 상위 폴더 : " + file.getParent());
		} catch(IOException e) {
			e.printStackTrace();
		}			
	}
	public static void fileTest1() {
		// file 객체 생성
		// 1. 파일 명만 전달하여 생성
		File f1 = new File("test1.txt"); // 파일 인스턴스 생성, pathname으로 생성 위치와 생성할 파일 명 전달
		
		// 2. 외부에 존재하는 폴더 경로 + 파일명 전달하여 생성, D:\\test2.txt
		File f2 = new File("D:\\test2.txt");
		
		// 3. 존재하지 않는 폴더 경로 + 파일명 전달하여 생성, D:\\tmp\\test3.txt
		// 지정된 경로를 찾을 수 없습니다. 예외 발생
		File f3 = new File("D:\\tmp\\test3.txt");
		
		// f3 지정된 경로 생성
		File f3_folder = new File("D:\\tmp");
		
		// 파일 존재 유무 확인
		File f4 = new File("test4.txt");
		
		// File객체명.createNewFile(); => 파일 생성 메소드
		try {
			f1.createNewFile();
			f2.createNewFile();
			
			// 폴더 생성 메소드 mkdir
			f3_folder.mkdir(); // 폴더 생성
			f3.createNewFile(); // 폴더 생성 경로에 파일 생성
			
			// 파일 존재 유무 확인 메소드 exists()
			System.out.println("f1 파일 존재 유무 : " + f1.exists());
			System.out.println("f4 파일 존재 유무 : " + f4.exists());
			
			// 파일 확인 메소드 
			System.out.println("f1은 파일인가? : " + f1.isFile());
			System.out.println("f3_folder는 파일인가? : " + f3_folder.isFile());
			
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
}
