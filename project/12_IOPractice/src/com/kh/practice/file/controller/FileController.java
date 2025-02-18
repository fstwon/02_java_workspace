package com.kh.practice.file.controller;

import com.kh.practice.file.model.dao.FileDAO;

public class FileController {
	// field
	/*
		- fd:FileDAO = new FileDAO()
	*/
	private FileDAO fd = new FileDAO();
	
	
	// method
	/*
		+ checkName(file:String):boolean
		+ fileSave(file:String, sb:String):void
		+ fileOpen(file:String):String
		+ fileEdit(file:String, sb:String):void
	*/
	
	
	public boolean checkName(String file) {
		// DAO에 매개변수를 전달하고, DAO로부터 전달받은 값을 다시 반환
		return fd.checkName(file);
	}
	public void fileSave(String file, String s) {
		// 전달받은 매개변수를 변경하고 DAO에 전달
		fd.fileSave(file, s);
	}
	public String fileOpen(String file) {
		// DAO에 매개변수를 전달하고, DAO로부터 전달받은 값을 다시 반환
		return fd.fileOpen(file);
	}
	public void fileEdit(String file, String s) {
		// 전달받은 매개변수를 변경하고 DAO에 전달
		fd.fileEdit(file, s);
	}
}
