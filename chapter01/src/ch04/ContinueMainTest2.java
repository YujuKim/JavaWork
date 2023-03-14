package ch04;

import java.util.Iterator;
import java.util.Scanner;

public class ContinueMainTest2 {

	public static void main(String[] args) {
		// 사용자의 정수값을 입력 받아 배수의 개수를 출력하는 프로그램 만들기
		// 테스트값은 1000. 3을 입력하면 1부터 1000까지 중 3의 배수가 몇 개 있는지

		Scanner sc = new Scanner(System.in);
		System.out.println("배수를 입력해 주세요.");
		final int multiple = sc.nextInt();
		System.out.println("몇까지 확인 하겠습니까?");
		final int max = sc.nextInt();

		int num = 0;
		int count = 0;
		for (num = 1; num <= max; num++) {
			if (num % multiple == 0) {
				count++;
				continue;
			}
			// System.out.println("num: " + num);

		}
		System.out.println(multiple + "의 배수의 개수는 " + count + "개 입니다.");

	} // end of main
}// end of class

//		Scanner sc = new Scanner(System.in);
//		int num = 0;
//		int val = 0;
//		int userInput = sc.nextInt();
//		
//		for (int i = 1; i < userInput; i++) {
//			if(i % 3 == 0) {
//				num++;
//				continue;
//					}
//			val += num;
//	
//		}
//		System.out.println(val);
//	}

//}
