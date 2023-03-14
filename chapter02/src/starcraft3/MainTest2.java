package starcraft3;

import java.util.Scanner;

public class MainTest2 {
	// 메인 함수
	public static void main(String[] args) {
		final int ZEALOT = 1;
		final int MARINE = 2;
		final int ZERGLING = 3;
		final int GAME_END = 4;

		Scanner scanner = new Scanner(System.in);
		int unitChoice = -1;
		do {
			System.out.println("유닛을 선택하세요");
			System.out.println("1.질럿\t2.마린\t3.저글링\t4.종료");
			unitChoice = scanner.nextInt();
			if (unitChoice == ZEALOT) {
				System.out.println("질럿을 선택했습니다.");
			} else if (unitChoice == MARINE) {
				System.out.println("마린을 선택했습니다.");

			} else {
				System.out.println("저글링을 선택했습니다.");
			}
		} while (unitChoice != GAME_END);
		System.out.println("종료되었습니다.");

	} // end of main

}// end of class
