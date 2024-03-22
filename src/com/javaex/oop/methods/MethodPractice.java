package com.javaex.oop.methods;

import java.util.Scanner;

public class MethodPractice {
	
	
	public static void main(String[] arg) {
		//문제 1
		printHelloMethod();
		//문제 2
		printNumbers();
		//문제 3
		int rnd = getRandomNumber();
		System.out.println(rnd);
		//문제 4
		int result = getSum();
		System.out.println(result);
		//문제 5
		printOddOrEven(2024);
		//문제 6
		printStringLength("Java Programming");
		//문제 7
		int largeNumber = getLargeNumber(10, 20);
		System.out.println(largeNumber);
		//문제 8
		System.out.println(concatenateStrings("Java", "Programming"));
		//문제 9
		System.out.println(sumAll(1, 2, 3, 4, 5, 6, 7, 8, 9));
		//문제 10
		System.out.println(concatenateStrings("Java ", "Programming ", "is ", "fun!"));
		
	}
	
	//문제 1
	public static void printHelloMethod() {
		System.out.println("Hello Method!");
	}	
	
	
	//문제 2
	public static void printNumbers() {
//		System.out.println("1, 2, 3, 4, 5, 6, 7, 8, 9, 10");
		for (int i=1; i<=10; i++) {
			System.out.print(i+"\t");
		}System.out.println();
	}
	
	//문제 3
	public static int getRandomNumber() {
		int rnd = (int)(Math.random() * 101);
		return rnd;
		
	}
	
	//문제 4
	private static int getSum() {
		int result = 0;
		for (int i = 0; i <= 10; i++) {
			result += i;
		}
		return result;
	}
	
	//문제 5
	public static void printOddOrEven(int num) {
		// 3항 연산 : 조건식 ? 참일 때의 값 : 거짓일 때의 값
		System.out.println(
				num %2 == 0 ? "짝수" : "홀수");
	}
	
	//문제 6
	public static void printStringLength(String str) {
		System.out.println(str.length()); 		//문자열 길이 재는 메서드
	}
		
	
	
	//문제 7
	private static int getLargeNumber(int num1, int num2) {
		if (num1>num2) {
			return num1;
		} else {
			return num2;
		}
	}
	
	//문제 8
	private static String concatenateStrings(String str1, String str2) {
		return str1 + str2;
	}
	
	//문제 9
	private static int sumAll(int ... values) {
		int total = 0;
		for (int val : values) {
			total += val;
		}
		return total;
	}
	
	//문제 10
	private static String concatenateStrings(String ... values) {
		String result = "";
		
		for (String val: values) {
			result += val;
		}
		return result;
	}
	

}
