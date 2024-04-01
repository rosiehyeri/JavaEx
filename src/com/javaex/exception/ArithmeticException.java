 package com.javaex.exception;


import java.util.Scanner;

public class ArithmeticException{

	// 정수 1개 입력
	// 100을 입력받은 정수로 나눔
	// 나는 결과를 화면에 출력
	
	public ArithmeticException(String message) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		double result = 0;
		int num;

		// 스캐너 개방
		Scanner scanner = new Scanner(System.in);
		System.out.println("정수 입력: ");
		
		try {
			//예외 발생 가능영역을 try 블록으로 감싼다
			num = scanner.nextInt();
			result = 100/num;
			
			//앞쪽에서 구체적 에러 처리
			// 가장 마지막에 Exception으로 잔여 에러 처리
		} catch(InputMismatchException e) {
			// 입력 양식 에러
			System.err.println("정수로 입력해 주세요.");
		}
		catch (ArithmeticException e) {
			// 100% arithmeticException
			// 구체적인 예외 처리 로직 수행 가능
			System.err.print"0으로는 나눌 수 없습니다.");
		} catch (Exception e) { // 예외(정보) 클래스로 catch
			e.printStackTrace();	// 예외 스택 출력
		} finally {
			// 예외 유무 관계 없이 가장 마지막에 1회 실행됨
			// try블록에서 설정된 시스템 자원 등을 해제
			// finally는 필수가 아님
			System.out.println("예외처리 종료.");
		}
			
		
		
		System.out.println(result);
		
		scanner.close();
				
	}

}
