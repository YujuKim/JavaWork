package ch01;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterExample {

	public static void main(String[] args) {
		// 글자를 만들어 두고 파일에다가 출력하기
		// 출력 스트림 필요
		// 기반 + 보조
		BufferedWriter writer = null;

		try {
			writer = new BufferedWriter(new FileWriter("output1.txt"));
			writer.write("Hello world");
			writer.newLine(); // 한 줄 띄우는 명령어
			writer.write("안녕하쇼");
			writer.flush();
			
		} catch (IOException e) {

			e.printStackTrace();
		} finally {
			try {
				writer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	} // end of main

} // end of class
