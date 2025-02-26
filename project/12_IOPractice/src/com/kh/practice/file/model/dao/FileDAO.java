package com.kh.practice.file.model.dao;

import java.io.*;

public class FileDAO {
	// field 
	/*
	 * 생성자를 통해 특정 경로에 폴더가 없을 경우 폴더 생성
	*/
	String path = "./resources/files";
	public FileDAO() {
		File folder = new File(path);
		if(!folder.exists()) {
			if(!folder.mkdirs()) {
				System.out.println("[Error] 초기화 실패");
			}
			folder.mkdirs();
		}
	}
	// method
	/*
		+ checkName(file:String):boolean
		+ fileSave(file:String, s:String):void
		+ fileOpen(file:String):String
		+ fileEdit(file:String, s:String):void
	*/
	public boolean checkName(String file) {
		// File 객체를 생성하는 매개변수 있는 생성자에 file을 매개변수로 넘겨줌
		// new File(상위폴더경로, 파일명); 생성자
		File f = new File(path, file);
		// 해당 파일이 있는지 없는지에 대한 boolean 값을 반환
		return f.exists();
	}
	public void fileSave(String file, String s) {
		// 매개변수로 들어온 file을 파일 명으로 이용하여 파일을 만들어주고
		File f = new File(path, file);
		// 프로그램 -> 파일 : 출력 write
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(f))) {
			// FileWriter fw = new FileWriter(file);
			// BufferedWriter bw = new BufferedWriter(fw);
			// String에 써서 저장
			bw.write(s);
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
	public String fileOpen(String file) {
		// 매개변수로 들어온 file로 파일을 찾아 String에 값들 저장하여 반환
		// 파일 -> 프로그램 : 입력 read
		File f = new File(path, file);
		String result = "";
		try(BufferedReader br = new BufferedReader(new FileReader(f))) {
			// FileReader fr = new FileReader(file);
			// BufferedReader br = new BufferedReader(fr);
			String fileContent = null;
			while((fileContent = br.readLine()) != null) {
				result += fileContent + "\n";
			}
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}
		return result;
	}
	public void fileEdit(String file, String s) {
		File f = new File(path, file);
		// 프로그램 -> 파일 : 출력 write
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(f, true))) {
			// 매개변수로 들어온 file을 파일 명으로 이용하여 파일을 찾고
			// FileWriter fw = new FileWriter(file, true);
			// BufferedWriter bw = new BufferedWriter(fw);
			
			// String에 써서 저장하되 이어서 저장될 수 있도록 함
			bw.write(s);
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
}
