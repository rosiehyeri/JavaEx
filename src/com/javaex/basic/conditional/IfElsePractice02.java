package com.javaex.basic.conditional;

import java.util.Scanner;

public class IfElsePractice02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("과목번호를 입력하세요: (1. 자바, 2. C, 3. C++, 4. 파이썬)");
		int num = scanner.nextInt();
		
		if (num == 1) {
			System.out.println("R101호 입니다.");
		}
		else if (num == 2) {
			System.out.println("R202호 입니다.");
		}
		else if (num == 3) {
			System.out.println("R303호 입니다.");
		}
		else if (num == 4) {
			System.out.println("R404호 입니다.");
		}
		else {
			System.out.println("상담원에게 문의하세요.");
		}
		scanner.close();
		

	}

}
