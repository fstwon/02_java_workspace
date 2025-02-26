package com.kh.practice.book.model.dao;

import java.io.*;

import com.kh.practice.book.model.vo.Book;

public class BookDAO {
	// field
	/*
		- bArr:Book[] = new Book[10]
	*/
	private Book[] bArr = new Book[10];
	
	// constructor
	public BookDAO() {}
	
	
	// method
	/*
		+ fileSave(bArr:Book[]) : void
		+ fileRead() : Book[]
	*/
	
	public void fileSave(Book[] bArr) {
		// book.txt 파일에 객체 저장
		File f = new File("book.txt");
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(f))) {
			// 객체를 저장하는 스트림인 ObjectOutputStream을 가지고 book.txt에
			// oos.writeBytes("writeBytes");
			for(int i = 0; i < bArr.length; i++) {
				// oos.writeUTF(bArr[i]);
				if(bArr[i] != null) {
					// 매개변수로 받은 bArr을 저장, 단 null이 아닌 것만 저장함
					oos.writeObject(bArr[i]);
				}
			}
			// bw.write("test");
			// bw.newLine();
		} catch(IOException e) {
			e.printStackTrace();
		}
		
		
	}
	public Book[] fileRead() {
		/*
		 * book.txt 파일에 있는 데이터를 Book 객체 배열에 담아 반환
		 */
		File f = new File("book.txt");
		// 저장된 객체를 읽어오는 스트림인 ObjectInputStream을 가지고
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(f))) {
			// ObjectInputStream ois = new ObjectInputStream(new FileInputStream(f));
			
			// book.txt에 저장된 객체를 필드 bArr에 저장하여 반환
			// 반복문 사용
			for(int i = 0; i < bArr.length; i++) {
				bArr[i] = (Book)(ois.readObject());
			}
		} catch(EOFException e) {
			// 더 이상 파일에 읽을 게 없을 때 뜨는 예외인 EOFException이 발생하면
			// 예외만 잡아주고 안에는 아무 처리도 하지 않음
			// System.out.println("배열 끝까지 도달");
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}

		return bArr;
	}
}
