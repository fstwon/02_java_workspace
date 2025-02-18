package com.kh.io;

import java.io.*;

public class IO02_AssistantStream {

	public static void main(String[] args) {
		// fileSave();
		// fileRead();
		// objectSave();
		objectRead();
	}
	// 파일 -> 프로그램 : 입력
	public static void objectRead() {
		// FileInputStream
		// ObjectInputStream
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("myProduct.txt"))) {
			while(true) {
				System.out.println(ois.readObject());
			}
		} catch(ClassNotFoundException e) {
			System.out.println("파일 없음");
			System.out.println(e.getMessage());
		} catch(EOFException e) {
			// End Of File 
			System.out.println("파일 입력 완료");
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
	// 프로그램 -> 파일 : 출력 
	public static void objectSave() {
		// 출력 데이터
		Product p1 = new Product("RTX5090", 600);
		Product p2 = new Product("AMD983D", 400);
		Product p3 = new Product("RTX5070", 300);
		
		// FileOutputStream 기반 스트림 사용 : 1바이트 단위로 파일에 출력
		// ObjectOutputStream 보조 스트림 사용 : 객체 단위 출력 보조
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("myProduct.txt"))) {
			oos.writeObject(p1);
			oos.writeObject(p2);
			oos.writeObject(p3);
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
	// 파일 -> 프로그램 : 입력 
	public static void fileRead() {
		// FileReader 기반 스트림 사용 : 파일을 직접 연결하여 2바이트씩 데이터를 입력받는 스트림
		// BufferedReader 보조 스트림 사용 : 데이터를 한 줄 씩 입력받도록 도와주는 보조 스트림
		// FileNotFoundException
		try {
			// 기반 스트림
			FileReader fr = new FileReader("as_test.txt");
			
			// 보조 스트림
			BufferedReader br = new BufferedReader(fr);
			/*
			System.out.println(br.readLine());
			System.out.println(br.readLine());
			System.out.println(br.readLine());
			System.out.println(br.readLine());			
			*/
			String data = null;
			while((data = br.readLine()) != null) {
				System.out.println(data);	
			}
		} catch(FileNotFoundException e) {
			System.out.println("파일이 없습니다.");
			System.out.println(e.getMessage());
		} catch(IOException e) {
			e.printStackTrace();
		}
		
		
	}
	// 프로그램 -> 파일 : 출력
	public static void fileSave() {
		// FileWriter 기반 스트림 사용 : 파일을 직접 연결하여 2바이트씩 출력하는 스트림
		// BufferedWriter 보조 스트림 사용 : 속도 향상을 도와주는 스트림
		// try with resources 구문 : 실행이 끝난 후 자원을 해제해주는 문법
		try(BufferedWriter bw = new BufferedWriter(new FileWriter("as_test.txt"))) {
			// 개행 문자(\n) 또는 BufferedWriter의 newLine 메소드를 사용하여 줄바꿈 처리
			bw.write("기반 스트림 사용\n");
			bw.write("Hello world");
			bw.newLine();
			bw.write("last line\n");
			bw.write("use try with resources");
			// bw.flush();
			// bw.close();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
}
