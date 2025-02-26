package com.kh.practice.book.run;

import com.kh.practice.book.view.BookMenu;
// import com.kh.practice.book.model.vo.Book;

public class Run {

	public static void main(String[] args) {
		// new BookDAO().fileSave(new Book[10]);
		// new BookDAO().fileRead();
		BookMenu bm = new BookMenu();
		bm.mainMenu();
	}

}
