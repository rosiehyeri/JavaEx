package com.javaex.oop.methods;

public class MethodEx2 {
		// 가변인수 : 정해지지 않은 개수의 인수가 넘어올 때
	public static void main(String[] args) {
		// 방법1 : 배열로 전달하는 방법
		System.out.println("getSumArr: " + 
		getSumArr(new double[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}));
		// 방법2 : 가변인수 사용
		System.out.println("getSumVar: " +
				getSumVar(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
		
		// 고정 인수와 가변 인수를같이 사용
		printSum("합계: ", 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
	}
	// 배열을 이용한 여러 개의 데이터 전달
	private static double getSumArr(double[] values) {
		double total = 0;
		
//		for (int i=0; i<values.length-1; i++) {
//			total += values[i];
//		}
		for (double val: values) {
			total += val;
		}
		
		return total; 
	};
	
	private static double getSumVar(double ... values) {
		double total = 0;
		
		for (double val: values ) {
			total += val;
		}
		
		return total;
	}
	
	// 인수의 순서가 중요. 고정인수, 가변인수 선언
	public static void printSum(String message, double ... values) {
		System.out.println(message + getSumVar(values));
	}
}

