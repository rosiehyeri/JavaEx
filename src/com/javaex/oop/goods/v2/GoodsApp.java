package com.javaex.oop.goods.v2;

public class GoodsApp {

	public static void main(String[] args) {
		
		Goods camera = new Goods();
		camera.name = "nikon";
		camera.price = 400_000;
		
		Goods notebook = new Goods();
		notebook.name = "LG그램";
		notebook.price = 900_000;
				
		Goods mug = new Goods();
		mug.name = "머그컵";
		mug.price = 2_000;
		
		// 상품 정보 출력
		System.out.printf("%s, %,d원%n", camera.name, camera.price);
		System.out.printf("%s, %,d원%n", notebook.name, notebook.price);
		System.out.printf("%s, %,d원%n", mug.name, mug.price);
	}

}
