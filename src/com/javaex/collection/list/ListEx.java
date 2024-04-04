package com.javaex.collection.list;

import java.util.LinkedList;
import java.util.List;

public class ListEx {

	public static void main(String[] args) {
//		List l = new List();		// 리스트는 클래스가 아니라 인터페이스라서 오류

		// List는 객체가 아니라 인터페이스
		// 순서가 있다
		// 중복 허용   
		List<String> lst = new LinkedList<>();

		// 객체 추가: .add - 맨 마지막에 노드 연결
		lst.add("Java");
		lst.add("C");
		lst.add("C++");
		lst.add("Python");
		System.out.println("lst: " + lst);

		// 객체 삽입
		lst.add(2, "C#");
		System.out.println("lst: " + lst);

		// 리스트는 중복 삽입을 허용
		lst.add("Java");
		System.out.println("lst: " + lst);

		System.out.println("size: " + lst.size());
//		System.out.println("capacity: " + lst.capacity());  // list는 capacity 없음.  빈 공간에 새로운 노드 계속 추가하는 형태

		// 삭제: 인덱스 삭제
		lst.remove(2);
		// 객체 삭제
		lst.remove("Python");
		System.out.println("lst: " + lst);

		// TOOD: list 순회

		// 비워봅시다
		lst.clear();
		System.out.println("lst: " + lst);
	}

}
