package com.javaex.exception;

public class NullPointerExceptionEx {

	public static void main(String[] args) {

		String str = new String ("hello");
		str = null;
	
		try {
		System.out.println(str.toString());
		} catch (NullPointerException e) {
			System.err.println("널입니다.");
		} finally {
			System.out.println("예외 처리 종료");
		}
		
	}
	

}
