package com.javaex.oop.goods.v2;

// v2. 필드
public class Goods {
	// 필드 선언
	// instance 영역
	private String name;	// 상품명
	private int price;		// 가격
	

	
	// Getter Setter 메서드
	public String getName() {
		//메서드 영역
		return name;
	}
	public void setName(String name) {
		this.name = name;		//외부로부터 전달받은 데이터의 식별자
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		//getter/setter를 활용하면 무결성 체크, 인증 체크 같은 로직 수행 가능
		if (price<0) {
			this.price = 0;
		}else {
			this.price = price;
		}
	
	}
	
	// 일반 메서드
	public void showInfo() {
		System.out.printf("상품 이름: %s%n 가격: %,d%n", name, price);
	}
}
