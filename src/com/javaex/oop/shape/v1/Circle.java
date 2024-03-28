package com.javaex.oop.shape.v1;

public class Circle extends Shape {

	//필드
	private double radius;
	
	//생성자
	public Circle(int x, int y, double radius) {
		//부모 생성자 호출
		super(x, y);
		this.radius = radius;
		
	}
	
	
	// 부모가 선언한 추상 메서드는 반드시 구현해줘야 한다
	@Override
	public void draw() {
		System.out.printf("원 [x=%d, y=%d, r=%f, area=%f]을 그렸습니다.%n",
				x, y, radius,area());				// %d=정수, %f=실수
	}
	
	@Override
	public double area() {
		double area = Math.PI * Math.pow(radius, 2);  		//Math.pow(radius, 2) == radius * radius
		return area;											//연산 결과를 return
	}
}
