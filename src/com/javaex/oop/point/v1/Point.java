package com.javaex.oop.point.v1;

//아래와 같이 클래스를 정의하여 프로그램을 작성하세요
//Point 클래스를 만드세요
//x,y 좌표를 나타낼 수 있는 필드 작성
//x,y 좌표에 접근할 수 있는 getter/setter 메소드 작성
//다음 실행 결과를 참조하여 draw() 메소드 작성

//PointApp 클래스를 만드세요
//draw() 메소드를 호출하여 다음과같이 출력하세요
//점[x=5, y=5]을 그렸습니다.
//점[x=10, y=23]을 그렸습니다.

public class Point {

	//필드 (은닉)
	private int x;
	private int y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	//getter 메소드
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	
	//setter 메소드
	public void setX(int x) {
		this.x = x;
	}
	public void setY(int y) {
		this.y = y;  
	}
	
	//draw() 메소드
	public void draw() {
		System.out.printf("점[x=%d, y=%d]을 그렸습니다%n", x, y);
	}
	

	
}

