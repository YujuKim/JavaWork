package ch04;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest1 {
	public static void main(String[] args) {

		FileWriter fw = null;
		char[] buf = { '반', '갑', '습', '니', '다' };
		try {
			fw = new FileWriter("writer1.txt");
//			fw.write('H'); // 문자 하나만 출력 ---> File에
//			fw.write(buf); // 문자 배열로 파일에다 출력
//			fw.write("사실 그냥 문자열로 출력할래"); // 문자열로 출력

			fw.write(buf, 1, 3); // 대상, 인덱스 시작값, 길이
		} catch (IOException e) {

			e.printStackTrace();
		} finally {
			try {
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	} // end of main

} // end of class
