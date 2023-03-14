package ch08;

import java.util.Scanner;

public class ExceptionHandling {
	public static void main(String[] args) {

		// try-catch-finally
		Scanner scanner = new Scanner(System.in);

		try {
			int result = scanner.nextInt();
		} catch (Exception e) {
			e.printStackTrace();

		} finally {
			scanner.close(); // finally는 자원 해제 용도로 많이 사용 된다.
		}

		int result = scanner.nextInt();
	} // end of main

} // end of class
