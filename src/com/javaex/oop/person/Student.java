package com.javaex.oop.person;

public class Student extends Person {
	private String school;
	
	//생성자
	public Student(String school) {
		super("Unknown", 0); 	//부모 클래스의 생성자 호출
		this.school = school;
	}
	public Student(String name, int age, String school) {
		super(name, age); 	//부모 클래스의 생성자 호출
		this.school = school;
	}
	
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	
	//정보 출력 메서드(오버라이딩)
	@Override
	public void showInfo() {
		super.showInfo(); //부모 클래스의 showInfo() 메서드 호출
		System.out.println("School: " + school);
	}

}
