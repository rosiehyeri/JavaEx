package com.javaex.oop.person;

public class PersonApp {

	public static void main(String[] args) {
		Person p = new Person("정우성", 45);
		Student s1 = new Student("서울고등학교");
		Student s2 = new Student("이정재", 45, "한국고등학교");
		
		System.out.println("Person 정보 ");
		p.showInfo();
		System.out.println();
		
		System.out.println("Student1 정보 ");
		s1.showInfo();
		System.out.println();
		
		System.out.println("Student2 정보 ");
		s2.showInfo();

	}

}
