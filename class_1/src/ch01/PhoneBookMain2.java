package ch01;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class PhoneBookMain2 {

	public static void main(String[] args) {
		Map<String, String> address = new HashMap<>();

		Scanner scanner = new Scanner(System.in);
		String userInput = "-1";

		final String SAVE = "1";
		final String SEARCH_ALL = "2";
		final String SEARCH_BY_NAME = "3";
		final String DELETE_ALL = "4";
		final String END = "0";

		System.out.println(">>기능을 선택해주세요<<");

		while (userInput != "0") {
			System.out.println("0.종료 1.저장 2.전체조회 3.선택조회 4.선택삭제 5.전체삭제");
			userInput = scanner.nextLine();

			if (userInput.equals(SAVE)) {
				System.out.println("이름을 입력하세요");
				String name = scanner.nextLine();
				System.out.println("전화번호를 입력하세요.");
				String number = scanner.nextLine();
				address.put(name, number);

			} else if (userInput.equals(SEARCH_ALL)) {
				for (Entry<String, String> entry : address.entrySet()) {
					System.out.println("key: " + entry.getKey());
					System.out.println("key: " + entry.getValue());

				}
			}
		} // end of while

	}

}
