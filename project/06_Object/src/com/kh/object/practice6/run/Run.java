package com.kh.object.practice6.run;
import com.kh.object.practice6.model.vo.Book;

public class Run {

	public static void main(String[] args) {
//		title : String
//		- publisher : String
//		- author : String
//		- price : int
//		- discountRate : double
		Book b1 = new Book();
		b1.inform();
		// title:String, publisher:String, author:String
		Book b2 = new Book("b2 title", "b2 pub", "b2 author");
		b2.inform();
		// title:String, publisher:String, author:String, price:int, discountRate:double
		Book b3 = new Book("b3 title", "b3 pub", "b3 author", 20000, 1.5);
		b3.inform();
	}

}
