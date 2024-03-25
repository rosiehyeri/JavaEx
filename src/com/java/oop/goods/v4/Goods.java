package com.java.oop.goods.v4;
//v4. this
//현재 자기 자신의 객체를 의미
//this(): 현재 클래스 내부의 다른 생성자를 호춣할 때 사용
public class Goods {
	private String name;	// 상품명
	private int price;		// 가격
	

	//name 필드 생성자
	public Goods(String name) {
		this.name = name;
		System.out.println("name 필드 초기화 생성자");
	}
	//전체 필드 생성자
	public Goods (String name, int price) {
		//객체 초기화를담당
		this(name); // -> Goods(String name) 생성자 호출
		this.price = price;
		System.out.println("전체 필드 초기화 생성자");
	}
	
	// Getter Setter 메서드
	// Setter가 없으면 read only 필드를 만들 수 있고
	// Getter/Setter 모두 없으면 프라이빗 필드가 된다
	public String getName() {
		//메서드 영역
		return name;
	}
//	public void setName(String name) {
//		this.name = name;		//외부로부터 전달받은 데이터의 식별자
//	}
	public int getPrice() {
		return price;
	}
//	public void setPrice(int price) {
//		//getter/setter를 활용하면 무결성 체크, 인증 체크 같은 로직 수행 가능
//		if (price<0) {
//			this.price = 0;
//		}else {
//			this.price = price;
//		}
	
//	}
	
	// 일반 메서드
	public void showInfo() {
		System.out.printf("상품 이름: %s%n 가격: %,d%n", name, price);
	}
}
