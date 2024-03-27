package com.javaex.oop.casting;

public class AnimalApp {

	public static void main(String[] args) {
		
		Animal dog1 = new Dog("마하");
		// upcasting : 부모 타입으로 자식 객체를 참조하는 것
		// 자동 캐스팅
		// 참조 타입에 설꼐된 것만 사용할 수 있다
		dog1.eat();
		dog1.walk();
//		dog1.bark();
//		설계도에 있는 것만 사용 가능
		
		Dog dog2 = new Dog("반야");
		dog2.eat();
		dog2.walk();
		dog2.bark();
		
		// downcasting : 명시적으로 타입을 지정해줘야 함
		// dog1을 bark() 하도록 해보자
		
		((Dog)(dog1)).bark();				//dog1이 Animal에서 Dog로 참조타입 바뀜(캐스팅)
		{
			
		
		Dog pet = new Dog("바라밀");
		pet.eat();
		pet.walk();
		pet.bark();
		
		pet = null;
		
//		pet = new Cat("짠식이");				// 부모가 아닌 클래스에서는 형제끼리 참조 불가
		}
		Animal pet = new Dog("바라밀");
		pet.eat();
		pet.walk();
//		pet.bark();
		// 현재 pet이 어떤 클래스의 인스턴스인지 확인해줘야 힘
		
		if (pet instanceof Dog) {		//Dog의 인스턴스면
			((Dog)pet).bark();
		} else if (pet instanceof Cat) {		//Cat의 인스턴스면
			((Cat)pet).meow();
		}
		
		pet = null;
		
		
		pet = new Cat("짠식이");
		pet.eat();
		pet.walk();
//		pet.meow();
		if (pet instanceof Dog) {		//Dog의 인스턴스면
			((Dog)pet).bark();
		} else if (pet instanceof Cat) {		//Cat의 인스턴스면
			((Cat)pet).meow();
		}
		
		
		
	}
	
	
	
}
