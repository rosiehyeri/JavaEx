package com.javaex.basic.loop;

public class WhileEx {
	// I Like Java0 ~ I Like Java 20
	public static void main(String[] args) {
	
		// While 반복문
		// 조건을 만족하는 동아 블록 반복
		// 반복 조건 제어 변수 필요, 조건 변수를 개발자가 직접 제어
		
		int num = 0;		// 초기화
		
		while(num <= 20) {
		System.out.println("I Like Java " + num + "번째 말하는 중");
		//반복 제어 변수 증감
		num += 1;
		}
		
	}

}
