package com.kh.object.practice2.run;
import com.kh.object.practice2.model.vo.Product;

public class Run {

	public static void main(String[] args) {
		Product p = new Product();
		p.setProductName("그래픽 카드");
		p.setBrand("NVIDIA");
		p.setPrice(200);
		
		p.information();
	};

}
