package ch01;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Map.Entry;

public class PhoneBookMain {

	public static void main(String[] args) {
		Map<String, String> address = new HashMap<>();

		// while 0.종료 1.저장 2.전체조회 3.선택조회 4.선택삭제 5.전체삭제

		Scanner scanner = new Scanner(System.in);
		String userInput = "-1";

		final String SAVE = "1";
		final String SEARCH_ALL = "2";
		final String SEARCH_BY_NAME = "3";
		final String DELETE_ALL = "4";
		final String END = "0";

		System.out.println(">> 기능을 선택해주세요.<<");

		while (userInput != "0") {
			System.out.println("0.종료 1.저장 2.전체조회 3.선택조회 4.선택삭제 5.전체삭제");
			userInput = scanner.nextLine();

			if (userInput.equals(SAVE)) {
				System.out.println("이름을 입력하세요");
				String name = scanner.nextLine();
				System.out.println("전화번호를 입력하세요");
				String number = scanner.nextLine();
				address.put(name, number);

			} else if (userInput.equals(SEARCH_ALL)) {
				for (Entry<String, String> entry : address.entrySet()) {
					// Map 인터페이스의 내부 인터페이스. 
					// Map에 저장되는 key-value 쌍을 다루기 위함
					
					System.out.println("key: " + entry.getKey());
					System.out.println("value: " + entry.getValue());

				}

			} else if (userInput.equals(SEARCH_BY_NAME)) {
				System.out.println("조회하실 이름을 입력하세요.");
				String name = scanner.nextLine();
				for (String key : address.keySet()) {
					if (name == key) {
						System.out.println(key);
						System.out.println(address.get(key));
					}
					System.out.println("없는 이름입니다.");
				}

			}

		}
		System.out.println("프로그램 종료");

	}

}
