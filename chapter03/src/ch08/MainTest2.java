package ch08;

import java.io.FileInputStream;
import java.util.Properties;

public class MainTest2 {

	public static void main(String[] args) {
		// 예외 처리 구문 작성
		// 10 / 0 연산시키고 예외처리까지

		// 1.try catch
		try {
			int result = 10 / 0;
			System.out.println(result);
		} catch (ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다");

		}

		// 2.throws

		MyTest myTest = new MyTest();
		try {
			myTest.Divide(10, 0);

		} catch (Exception e) {
			System.out.println("0으로 나눌 수 없네요");
		}
	}// end of main

}// end of class

class MyTest {

	public void Divide(int n1, int n2) throws Exception {
		int result = n1 / n2;
		return;
	}
}
