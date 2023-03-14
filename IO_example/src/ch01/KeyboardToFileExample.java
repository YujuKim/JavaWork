package ch01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class KeyboardToFileExample {

	public static void main(String[] args) {

		// 오토 클로즈 -- 자동으로 리소스를 닫아줌
		// try문 옆에 () 붙여줌
		// 이걸 활용하면 닫아 주는 코드를 불필요하게 작성할 필요가 없다
		// 닫아줄 식은 괄호 안에 작성해주면 된다
		try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
				BufferedWriter writer = new BufferedWriter(new FileWriter("output2.txt"));

		) {
			// 중괄호 안에는 수행할 코드 작성
			System.out.println("키보드로 입력 받아 데이터를 파일에 작성하기");

			String input = reader.readLine();
			// 사용자 입력 값이 quit이 아니라면 true가 된다
			while (!(input.equals("quit"))) {
				// 파일에 글 작성
				writer.write(input);
				writer.newLine();
				// 키보드에서 데이터를 다시 입력 받기
				input = reader.readLine();
			}
			System.out.println("출력이 완료되었습니다.");
		} catch (Exception e) {
			e.printStackTrace();
		}

	} // end of main

} // end of class
