//package MiniProject;
//
//import java.io.BufferedReader;
//import java.io.FileNotFoundException;
//import java.io.FileReader;
//import java.io.FileWriter;
//import java.io.IOException;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;
//
//public class Phone {
//
//    public static void main(String[] args) {
//        System.out.println("*****************************************");
//        System.out.println("*         전화번호 관리 프로그램             *");
//        System.out.println("*****************************************");
//        System.out.println("1. 리스트  2. 등록  3. 삭제  4. 검색  5. 종료  ");
//        System.out.println("-----------------------------------------");
//        System.out.println(">메뉴번호: ");
//
//        Scanner scanner = new Scanner(System.in);
//        int choice = scanner.nextInt();
//        scanner.nextLine();
//        
//
//        switch (choice) {
//            case 1:
//            	 List<String> contacts = loadContacts(); // 연락처 목록을 받아옴
//                 printContacts(contacts); // 받아온 연락처 목록을 출력
//                break;
//            case 2:
//            	registerContacts(scanner);
//            	break;
//            case 3:
//            	deleteContacts(scanner);
//            	break;
//            case 4: 
//            	searchContacts(scanner);
//            	break;
//            case 5: 
//            	System.out.println("**********************************");
//            	System.out.println("*            감사합니다            *");
//            	System.out.println("**********************************");
//            	break;
//            
//            default:
//                System.out.println("[다시입력해주세요]");
//        }
//
//        scanner.close();
//    }
//
//
//	// 리스트
//	    List<Person> personList = new ArrayList<>();
//	
//	   
//	    personList.add(new Person("고길동", "010-8788-8881", "032-8890-2974"));
//	    personList.add(new Person("둘리", "010-1212-3434", "02-5678-8765"));
//	    personList.add(new Person("마이콜", "010-7102-6327", "02-9192-5069"));
//	    personList.add(new Person("또치", "010-6514-5113", "02-7976-9368"));
//	    personList.add(new Person("홍길동", "010-7777-7777", "02-3333-3333"));
//	
//	    // 저장된 데이터 확인
//	    for (Person person : personList) {
//	        System.out.println(person);
//	    }
//	}
//	}
//	
//	//Person 클래스 정의
//	class Person {
//	private String name;
//	private String phone;
//	private String company;
//	
//	// 생성자
//	public Person(String name, String phone, String company) {
//	    this.name = name;
//	    this.phone = phone;
//	    this.company = company;
//	}
//	
//	// toString() 메소드 오버라이딩
//	@Override
//	public String toString() {
//	    return "Person{" +
//	            "name='" + name + '\'' +
//	            ", phone='" + phone + '\'' +
//	            ", company='" + company + '\'' +
//	            '}';
//    
//    
//    
//    // 등록
//    private static void registerContacts(Scanner scanner) {
//    	System.out.println("<2. 등록>");
//    	try(FileWriter writer = new FileWriter("PhoneDB.txt")){
//    		System.out.print("이름: ");
//    		String name = scanner.nextLine();
//    		System.out.print("휴대전화: ");
//    		String number = scanner.nextLine();
//    		System.out.print("회사번호: ");
//    		String company = scanner.nextLine();
//    		writer.write(">" + name + "\n" + ">" + number + "\n" + ">" + company + "\n");
//    		System.out.println("[등록되었습니다.]");
//    	}catch (FileNotFoundException e) {
//			System.err.println("파일을 찾을 수 없습니다.");
//		}catch(IOException e) {
//    		System.err.println("전화번호부 파일에 쓰는 도중 오류 발생");
//    		e.printStackTrace();
//    	}
//    	
//    }
//    
//    // 삭제
//    private static void deleteContacts(Scanner scanner) {
//    	System.out.println("<3. 삭제>");
//    	System.out.print(">번호: ");
//    	int index = scanner.nextInt();
//    }
//    
//    
//    // 검색
//    private static void searchContacts(Scanner scanner) {
//    	System.out.println("<4. 검색>");
//    	System.out.println(">이름: ");
//    	
//    	
//    }
//}
//

