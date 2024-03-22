package com.javaex.oop.goods.v2;

public class GoodsApp {

	public static void main(String[] args) {
		
		Goods camera = new Goods();
//		camera.name = "nikon";		//에러가 나서 setter로 우회접근 private으로 감춰졌음
		camera.setName("nikon");
//		camera.price = 400_000;
		camera.setPrice (400_000);
		
		Goods notebook = new Goods();
		notebook.setName("LG그램");
        notebook.setPrice(900_000);
        notebook.setPrice(-900_000);		//이런거 방지하기 위해서 if문
				
		Goods mug = new Goods();
		mug.setName("머그컵");
		mug.setPrice(2_000);
		
		// 상품 정보 출력(getter 활용)
		System.out.printf("%s, %,d원%n", camera.getName(), camera.getPrice());
		System.out.printf("%s, %,d원%n", notebook.getName(), notebook.getPrice());
		System.out.printf("%s, %,d원%n", mug.getName(), mug.getPrice());
		
		// 상품 정보 출력(메서드 활용)
		camera.showInfo();
		notebook.showInfo();
		mug.showInfo();
	}

}
