package com.javaex.oop.point.v3;

public class PointApp {

	public static void main(String[] args) {
		Point point1 = new Point(5,5);
		Point point2 = new Point(10,23);
		
		point1.draw();
		point2.draw();
		
		//오버로딩된 메서드 호출
		point1.draw(true);		//그리기
		point1.draw(false);		//지우기
		        
	}

}
