package com.javaex.oop.point.v3;

//아래와 같이 클래스를 정의하여 프로그램을 작성하세요
//Point 클래스를 만드세요
//x,y 좌표를 나타낼 수 있는 필드 작성
//x,y 좌표에 접근할 수 있는 getter/setter 메소드 작성
//다음 실행 결과를 참조하여 draw() 메소드 작성

//PointApp 클래스를 만드세요
//draw() 메소드를 호출하여 다음과같이 출력하세요
//점[x=5, y=5]을 그렸습니다.
//점[x=10, y=23]을 그렸습니다.

//v3. 메서드 오버로딩
//매서드 시그니쳐 : 반환 타입, 이름은 같고 매개변수의 타입, 순서, 개수만 다른 메서드
public class Point {

	//필드 (은닉)
	private int x;
	private int y;
	
	  // 기본 생성자
    public Point() {
        
    }
    
    // 모든 필드를 초기화할 수 있는 생성자
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
	
	//일반 메서드
	public void draw() {
		System.out.printf("점[x=%d, y=%d]을 그렸습니다%n", x, y);
	}
	
	//메서드 오버로딩
	//		boolean bDraw -> true면 그렸습니다. false면 지웠습니다.
	public void draw(boolean bDraw) {
		String message = String.format("점 [x=%d, y=%d]을 ", x, y);
		message += bDraw ? "그렸습니다." : "지웠습니다.";
		System.out.println(message);
			
	}

	
}

