package ch04;

import java.util.Scanner;

public class WhileMainTest4 {
	// 메인 작업자(메인 스레드)
	public static void main(String[] args) {

		// while문
		// 1부터 입력한 숫자까지의 합 구하기
		int num = 1;
		int sum = 0;
		final int userInput;

		Scanner scanner = new Scanner(System.in);
		System.out.println("덧셈 정수값을 입력해주세요.");
		userInput = scanner.nextInt();
		while (num <= userInput) {
			sum = sum + num;
			num++;
		}
		System.out.println("결과값:" + sum);

	} // end of main

}
// end of class
