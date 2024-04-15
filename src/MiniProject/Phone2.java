package MiniProject;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Phone2 {

	public static void main(String[] args) {
		System.out.println("*****************************************");
        System.out.println("*         전화번호 관리 프로그램             *");
        System.out.println("*****************************************");
        System.out.println("1. 리스트  2. 등록  3. 삭제  4. 검색  5. 종료  ");
        System.out.println("-----------------------------------------");
        System.out.println(">메뉴번호: ");
        
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        List<Person> personList = new ArrayList<>();
        
        
        switch (choice) {
        case 1:
//        	List<Person> personList1 = new ArrayList<>();
        	break;
        case 2:
        	registerContact(scanner, personList);
        	break;
        case 3:
        	deleteContact(scanner, personList);
        	break;
        case 4:
        	searchContact(scanner, personList);
        	break;
        case 5:
        	System.out.println("**********************************");
        	System.out.println("*          감사합니다              *");
        	System.out.println("**********************************");
        	break;
        default :
        	System.out.println("[다시입력해주세요]");
        	
        
        }
        
        // 리스트
        List<Person> personList1 = new ArrayList<>();
        personList.add(new Person("고길동", "010-8788-8811", "032-8890-2974"));
        personList.add(new Person("둘리", "010-1212-3434", "02-567-3242"));
        personList.add(new Person("도우너", "010-2342-5422", "02-1234-2321"));
        personList.add(new Person("마이콜", "010-4930-3948", "02-4693-3292"));
        personList.add(new Person("또치", "010-3242-9282", "02-3938-3857"));
        
        for (Person person : personList) {
            System.out.println(person);
        }
        
        scanner.close();
	}
	
	
	// 등록
	 private static void registerContact(Scanner scanner, List<Person> personList) {
		 System.out.println("<2. 등록>");
		 
		 System.out.println(">이름: ");
		 String name = scanner.next();
		 
		 System.out.println(">휴대전화: ");
		 String hp = scanner.next();
		 
		 System.out.println(">회사전화: ");
		 String tel = scanner.next();
		 
		 System.out.println("[등록되었습니다.]");
		 
		 Person person = new Person(name, hp, tel); // 입력값으로 Person 객체 생성
		 personList.add(person); // 리스트에 추가
			
			
	} 
	 
	 // 삭제
	 private static void deleteContact(Scanner scanner, List<Person> personList) {
		 System.out.println("<3. 삭제>");
		 System.out.println(">이름: ");
		 String name = scanner.next();
		 
		 for (int i = 0; i < personList.size(); i++) {
	            if (personList.get(i).getName().equals(name)) {
	                personList.remove(i);
	                System.out.println(personList);
	                System.out.println("[삭제되었습니다.]");
	                return;
	            }
	        }
		 
		 
	 }
	 
	 
	 // 검색
	 private static void searchContact(Scanner scanner, List<Person> personList) {
		 System.out.println("<4. 검색>");
		 System.out.println(">검색할 이름: ");
		 String searchName = scanner.next();

		    // 검색된 결과를 담을 리스트 생성
		    List<Person> searchResult = new ArrayList<>();

		    // 이름에 검색 문자열이 포함된 Person 객체를 검색하여 검색 결과 리스트에 추가
		    for (Person person : personList) {
		        if (person.getName().contains(searchName)) {
		            searchResult.add(person);
		        }
		    }

		    // 검색 결과 출력
		    if (searchResult.isEmpty()) {
		        System.out.println("[검색 결과가 없습니다.]");
		    } else {
		        System.out.println("[검색 결과]");
		        for (Person person : searchResult) {
		            System.out.println(person);
		        }
		    }
	 }
}
