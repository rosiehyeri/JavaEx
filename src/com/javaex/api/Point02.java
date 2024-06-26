package com.javaex.api;

//두 객체의 내부 데이터의 같음을 확인하는 equals 메서드 
public class Point02 {
	// 필드
		private int x;
		private int y;
		
		// 생성자
		public Point02(int x, int y) {
			this.x=x;
			this.y=y;
		}
		
		//equals : 두 객체의 내부 데이터가 같음을 확인하는 메서드
		@Override
		public boolean equals(Object obj) {
			if (obj instanceof Point02) {
			// 전달 받은 파라미터 other가 Point 인지 확인
			// Obj -> Point로 캐스팅
			Point02 other = (Point02)obj;
			//두 객체의 동등성
			//두 객체의 x필드가 같고, 두 객체의 y필드가 같아야 동등하다
			return x == other.x && y == other.y();
			//아래와 같은 코드
			if (x==other.x && y == other.y()) {
				return true;
			} else {
				return false;
			}
		}
			//obj가 Point가 아님
			return super.equals(obj);
		}
		//toString : 객체 정보를 문자열로 출력할 때 호출되는 메서드
		@Override 
		public String toString() {
			return "point("+ x + "," + y +")";
		}
}
