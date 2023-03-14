package ch04;

import java.util.Scanner;

public class WhileMainTest2 {
	// 메인 작업자(메인 스레드)
	public static void main(String[] args) {

		// do while: 조건에 관계 없이 한 번은 수행되는 반복문
//		int num = 1;
//		int sum = 0;
//		do {
//			System.out.println("현재 값: " + num);
//			num++;
//		} while(num <= 10);
		
		//값을 입력 받아 누적 합계 구하기, 0일 때 종료
		Scanner sc = new Scanner(System.in);
		int userInput = -1; //while문의 조건식에도 0이 있으므로 헷갈림 방지를 위해 -1
		int sum = 0;
		do {
			System.out.println("값을 입력해주세요.");
			userInput = sc.nextInt();
			// 한 번 코드를 수행하고 다시 사용자 입력값을 받고 싶다면
			sum += userInput;
			System.out.println("연산된 값 : " + sum);
		
		} while (userInput != 0);

	

//		while (true) {
//			System.out.print("-");
//			// try-catch: 예외 처리
//			try {
//				Thread.sleep(80); //스레드
//
//			} catch (Exception e) {
//			}
//		} // end of while

	} // end of main

}
// end of class
