package com.javaex.basic.operators;

public class CondOperEx {

	public static void main(String[] args) {
		int a = 10;
		
		// a가 짝수면 짝수, 홀수면 홀수 출력
		String result = a % 2 == 0 ? "짝수" : "홀수";
		System.out.println(a + "은 " + result + "입니다.");

		int score = 70;
		String message;
		
		//	score 가 80점 이상 : Good
		// 	score 가 50 ~ 80점 : Pass
		// 	score 가 50점 미만 : Fail
		
		message = score >= 80 ? "Good" : score >= 50 ? "Pass" : "Fail";
		System.out.println(message);
		
		
	}

}
