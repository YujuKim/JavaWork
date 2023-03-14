package ch04;

public class ForMainTest2 {
	// 메인 함수
	public static void main(String[] args) {

		// 이중 for문을 활용해 2~9단까지 출력

		for (int i = 2; i < 10; i++) {
			for (int j = 1; j < 10; j++) {

				System.out.println(i + " * " + j + " = " + (i * j));
			}

		} // end of for

	} // end of main

} // end of class
