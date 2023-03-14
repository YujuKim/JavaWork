package ex10;

import java.util.Scanner;

public class GugudanTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("시작값을 입력하세요.");
		int i = sc.nextInt();
		System.out.println("종료값을 입력하세요.");
		int j = sc.nextInt();
		int k;

		for (i = i; i <= j; i++) {
			for (k = 1; k < 10; k++) {
				System.out.println(i + "*" + k + "=" + i * k);
			}
		}
	}

}
