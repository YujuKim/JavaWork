package ch05;

import java.util.Scanner;

public class UserMainTest2 {
	public static void main(String[] args) {
		// 메모리 올리고
		User user2 = new User();

		// 값을 할당
		Scanner scanner = new Scanner(System.in);

		System.out.println("이름을 입력해주세요.");
		user2.name = scanner.nextLine();
		System.out.println("성별을 입력해주세요.");
		user2.gender = scanner.nextLine();
		System.out.println("국적을 입력해주세요.");
		user2.nationality = scanner.nextLine();
		System.out.println("나이를 입력해주세요.");
		user2.age = scanner.nextInt();
		System.out.println("키를 입력해주세요.");
		user2.height = scanner.nextDouble();

		// 화면에 출력
		System.out.println(user2.name);
		System.out.println(user2.gender);
		System.out.println(user2.nationality);
		System.out.println(user2.age);
		System.out.println(user2.height);

	}

}
