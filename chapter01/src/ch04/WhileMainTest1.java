package ch04;

public class WhileMainTest1 {
	// 메인 작업자
	public static void main(String[] args) {
		
		// while문을 활용해 1부터 100까지의 합 구하기
		int num = 1;
		int sum = 0;
		int userInput = 100;

		while (num <= userInput) {
			System.out.println("현재 값: " + num);
			sum += num;
			num++;
		}
		;
		System.out.println("연산에 대한 결과값은 " + sum + " 입니다.");
	} // end of main

} // end of class
