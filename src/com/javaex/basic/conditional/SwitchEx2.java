package com.javaex.basic.conditional;

import java.util.Scanner;

public class SwitchEx2 {

	public static void main(String[] args) {
		//
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("월을 입력하세요: ");
		int mon = scanner.nextInt();
		String message;
		
		switch(mon) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			message = "31일입니다.";
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			message = "30일입니다.";
			break;
		case 2:
			message = "28일입니다.";
			break;
		default :
			message = "?";
			break;
	}
		System.out.println(mon +"월은 " + message);
		
//		switch(mon) {
//		case 1:  
//			System.out.println("31일");
//			break;
//		case 2:  
//			System.out.println("28일");
//			break;
//		case 3:  
//			System.out.println("31일");
//			break;
//		case 4:
//			System.out.println("30일");
//			break;
//		case 5:
//			System.out.println("31일");
//			break;
//		case 6: 
//			System.out.println("30일");
//			break;
//		case 7:  
//			System.out.println("31일");
//			break;
//		case 8:  
//			System.out.println("31일");
//			break;
//		case 9:
//			System.out.println("30일");
//			break;
//		case 10:
//			System.out.println("31일");
//			break;
//		case 11:
//			System.out.println("30일");
//			break;
//		case 12: 
//			System.out.println("31일");
//			break;
		
		scanner.close();
		
	}

}
