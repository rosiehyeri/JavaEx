/**
 * 
 */
package com.javaex.basic.types;

/**
 * 
 */
public class FloatDoubleExx {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// float (4byte)
		// double (8byte) -> default
		float floatVar;
		double doubleVar;
		
		// 정밀도 체크
		floatVar = 0.12345678901234567890F;  // float 뒤에 F
		doubleVar = 0.12345678901234567890;
		
		System.out.print("float: " + floatVar);
		System.out.print("double: " + doubleVar);
		
		// E 표기법
		int intVar;
		intVar = 300000000;
		floatVar = 3E9F;
		doubleVar = 3E-9;
		System.out.print("intVar: " + intVar);
		System.out.print("floatVar:" + floatVar);
		System.out.print("doubleVar:" + doubleVar);
		
		// 부동 소수점 계산의 유의점
		// float, double형은 정밀도 포기하고 표현 범위만 넓힌 데이터. 그래서 정밀한 데이터 할 때는 float, double 잘 아씀
		System.out.println(0.1 * 3);
	}

}
