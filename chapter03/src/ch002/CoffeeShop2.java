package ch002;

import java.util.Scanner;

public class CoffeeShop2 {
	private static Coffee2[] menu = { new Coffee2("아메리카노", 3000), new Coffee2("카페라떼", 3500),
			new Coffee2("바닐라라떼", 4000) };

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("고객 이름을 입력하세요.");
		String name = scanner.nextLine();
		System.out.println("고객 잔액을 입력하세요.");
		int balance = scanner.nextInt();
		Customer2 customer = new Customer2(name, balance);

		System.out.println(">>>오늘의 커피 메뉴<<<");
		for (int i = 0; i < menu.length; i++) {
			System.out.println((i + 1) + "." + menu[i].getName() + (" (" + menu[i].getPrice() + "원)"));

		}

		System.out.println("메뉴를 선택하세요.");
		int orderNumber = scanner.nextInt();

		System.out.println("몇 잔 하시겠습니까?");
		int count = scanner.nextInt();

		for (int i = 0; i < count; i++) {

			Coffee2 coffee = menu[orderNumber - 1];
			customer.buyCoffee(coffee);
		}

		System.out.println("잔액 확인: " + customer.getBalance());

		scanner.close();

	}

}// end of class
