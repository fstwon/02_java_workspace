package com.kh.object.practice3.run;
import com.kh.object.practice3.model.vo.Circle;

public class Run {

	public static void main(String[] args) {
		Circle c = new Circle();
		
		c.getAreaOfCircle();
		c.getSizeOfCircle();
		
		c.incrementRadius();
		c.incrementRadius();
		c.incrementRadius();
		c.incrementRadius();
		
		c.getAreaOfCircle();
		c.getSizeOfCircle();
	}
}
