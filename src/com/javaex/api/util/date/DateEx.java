package com.javaex.api.util.date;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
// Java.sql.Date와 혼동하지 말자

public class DateEx {

	public static void main(String[] args) {
		// 날짜, 시간 데이터를 표현하는 객체
		// 날짜 관련 기느은 Calendar 객체
		Date now = new Date();
		
		System.out.println("현재 시간: " + now);
		
		// 기본 출력
		// DateFormat 클래스로 기본적인 출력 형식을 맞출 수 있음
		DateFormat df = DateFormat.getDateInstance(DateFormat.FULL); // FULL
		System.out.println("FULL: " + df.format(now));
		df = DateFormat.getDateInstance(DateFormat.LONG);	// LONG 형식
		System.out.println("LONG: " + df.format(now));
		df = DateFormat.getDateInstance(DateFormat.MEDIUM); // MEDIUM 형식
		System.out.println("MEDIUM: " + df.format(now));
		df = DateFormat.getDateInstance(DateFormat.SHORT);	// SHORT 형식
		System.out.println("SHORT: " + df.format(now));
		
		// Date Format과 Time Format을 이용해서 날짜와 시간을 표기할 수 있다
		// SimpleDateFormat
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 HH시 mm분 ss초");
		System.out.println("날짜 포맷: " + sdf.format(now));
	}

}
