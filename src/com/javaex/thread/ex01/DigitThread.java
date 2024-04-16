package com.javaex.thread.ex01;


// Thread 상속을 통한 Thread 생성
public class DigitThread extends Thread{

	
	// Thread의 로직을 구현
	// 주의: 이 메서드(run)는 절대 직접 실행하지 말자
	@Override
	public void run() {
		// Working logic: 0 ~30까지 숫자 출력
		for (int i = 0; i < 30; i++) {
			System.out.printf("%s:%d%n", getName(),		// 쓰레드 이름
					i);
			
			// 쓰레드 지연
			try {
				Thread.sleep((300));	// 0.3초 대기
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
							
	}
		System.out.println(getName() + "Thread 종료");
	}

}
