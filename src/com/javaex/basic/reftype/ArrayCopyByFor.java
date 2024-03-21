package com.javaex.basic.reftype;

import java.util.Arrays;

public class ArrayCopyByFor {
	// 배열은 크기 변경이 불가하다
	// 공간을 늘리고자 한다면 새 배열 생성 후 복사
	public static void main(String[] args) {
		// For 문을 이용한 배열 복사
//		arrayCopyByFor();
		// System 을 활용한 배열복사
		arrayCopyBySystem();

	}
	public static void arrayCopyByFor() {
		int scores[] = {1, 2, 3};		// .length ==3
		for (int i = 0; i < scores.length; i++) {
			System.out.print(scores[i] + "\t");
			
		}
		System.out.println();
		
		//  새 공간을 만들어 복사
		int target[] = new int[10];
		
		for (int i = 0; i < scores.length; i++) {
			target[i] = scores[i];
		}
		
		// 배열 유틸리티 클래스를 이용한 출력
		System.out.println(Arrays.toString(target));
		
	}
	public static void arrayCopyBySystem( ) {
		int scores[] = {1, 2, 3};
		int target[] = new int[10];
		
		
		System.out.println("source: " 
							+ Arrays.toString(scores));
		
		// 배열 복제
		System.arraycopy(scores,		//원본 배열
					0,					//복사 시작 인덱스(원본)
					target,				//복사 대상 배열
					3,					//대상 배열의 시작 인덱스
					scores.length);		//복사할 길이
		
		System.out.println("target: " + Arrays.toString(target));
		
		//  Enhanced For
		//	for (추출된 데이터: 원본 배열 혹은 컬렉션)
		for (int value: target) {
			System.out.print(value + "\t");
		}
		System.out.println( );
	}
}
