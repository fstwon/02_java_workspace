package com.kh.last.p4;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class NoticeTest {

	public static void main(String[] args) {
		 Object[] obArray = new Object[3];
		 Scanner sc = new Scanner(System.in);

		 //키보드로 Notice 객체의 초기값을 입력받아, 생성자로 초기화한다. – for 사용
		 for(int i = 0; i < obArray.length; i++) {
			 // no 는 인덱스 + 1
			 int no = i + 1;
			 
			 // String 입력 : 제목, 작성자, 내용
			 System.out.print("제목 : ");
			 String title = sc.nextLine();
			 System.out.print("작성자 : ");
			 String writer = sc.nextLine();
			 System.out.print("내용 : ");
			 String content = sc.nextLine();
			 
			 // date 는 직접 값 지정 처리함
			 Date date = new Date();
			 
			 // obArray에 new Notice(...입력값);
			 obArray[i] = new Notice(no, title, date, writer, content);
		 }

		 //fileSave() 메소드 실행
		 new NoticeTest().fileSave(obArray);
		 
		 List<Notice> list = new NoticeTest().fileRead();
		 
		 //fileRead() 메소드 실행
		 //리턴된 리스트 정보 출력 처리 – for each 문 사용
		 System.out.println();
		 System.out.println("리스트에 저장된 객체 정보는 다음과 같습니다.");
		 for(Notice n : list) { 
			 System.out.println(n.toString());
		 } //toString() 사용 출력

	}
	// +fileSave(array:Object[]):void
	public void fileSave(Object[] array) {
		// output
		File file = new File("noticeList.txt");
		try(ObjectOutputStream oi = new ObjectOutputStream(new FileOutputStream(file))) {
			if(!file.exists()) {
				file.createNewFile();
			}
			for(int i = 0; i < array.length; i++) {
				oi.writeObject(array[i]);
			}
		} catch(IOException e) {
			e.printStackTrace();
		}
		
	}
	// +fileRead():Array<Notice>
	public List<Notice> fileRead() {
		// input
		List<Notice> list = new ArrayList<>();
		
		File file = new File("noticeList.txt");
		try(ObjectInputStream oi = new ObjectInputStream(new FileInputStream(file))) {
			while(true) {
				list.add((Notice)(oi.readObject()));
			}
		} catch(EOFException e) {
			
		} catch(IOException e) {
			e.printStackTrace();
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		return list;
	}
}
