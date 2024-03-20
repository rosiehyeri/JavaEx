package com.javaex.basic.reftype;

public class StringFormatEx {

	public static void main(String[] args) {
		// %s(문자열) %d(십진수) %n(개행)
		
		// __개의 __중에서 __개를 먹었다
		String fruit = "사과";
		int total = 10, 
				eat = 3;
		System.out.printf("%d개의 %s중에서 %d개를 먹었다%n",		// 포맷문자열
				total, fruit, eat);			// 순서 중요
		
		// %d의 천단위 구분 기호 : %,d
		int amount = 1234567890;			//1_234_567_890도 가능
		System.out.printf("%,d%n",amount);
		
		double pi = Math.PI;
		System.out.printf("PI: %f%n", pi);
		System.out.printf("PI: %.2f%n", pi);		//소수점 둘째 자리까지 출력
		
		// 포맷 형식은 String 형의 .format 메서드에서 구현된다
		String fmt = "%d개의 %s중에서 %d개를 먹었다%n";
		System.out.println(fmt.formatted(10, "바나나", 2));
	}		

}
