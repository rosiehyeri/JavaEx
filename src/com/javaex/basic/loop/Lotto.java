package com.javaex.basic.loop;

public class Lotto {

	public static void main(String[] args) {
		for(int i = 0; i < 6; i ++) {
			System.out.print((int)(Math.random() * 45) + 1 + " ");
			
		}

	}
}

//While문으로도 만들어보기