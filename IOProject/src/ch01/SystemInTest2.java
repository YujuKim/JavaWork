package ch01;

import java.io.IOException;

public class SystemInTest2 {
	public static void main(String[] args) {

		System.out.println("알파벳 여러개를 쓰고 엔터를 눌러주세요");
		int i;

		try {
//			 i = System.in.read();  한 번 수행

			// 괄호 안에는 식을 작성할 수 있다
			while ((i = System.in.read()) != '\n') {
				// 엔터키 누를 때까지 반복 수행

				System.out.println("i: " + i); // 화면에 출력
				System.out.println((char) i);
			}
		} catch (IOException e) {

			e.printStackTrace();
		}
	} // end of main

}
// end of class
