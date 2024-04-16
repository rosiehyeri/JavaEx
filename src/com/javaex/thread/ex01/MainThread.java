package com.javaex.thread.ex01;

public class MainThread {

	public static void main(String[] args) {
		// Working Thread 수행
		DigitThread thread = new DigitThread();
		thread.setName("DigitThread");
		// Thread 시작
		// -> .start() 메서드로 호출
		thread.start();
		
		// Main Thread 로직
		// A ~ Z 까지 차례대로 출력
		for (char ch = 'A'; ch <= 'Z'; ch++) {
			System.out.println("Main Thread: " + ch);
			
			// Thread 실행 대기
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("Main Thread 종료");
	}

}
