package ch05;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MainTest4 {

	public static void main(String[] args) {
		FileReader fileReader = null;
		int count = 0;

		// 기반+보조스트림 (자료형:문자단위)
		try {
			File file = new File("output2.txt");
			fileReader = new FileReader(file);
			// 한 줄씩 글자를 읽어라
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			// 파일에다 출력하기
			FileWriter writer = new FileWriter("myText.txt");

			writer.write(bufferedReader.readLine());
			writer.flush();

//			int i;

//			기반 스트림 사용 - 자료 대상: 문자열

//				while ((i = fileReader.read()) != -1) {
//					System.out.println((char) i);
//					count++;

//			while((i=buefferdReader.read())!=-1) {
//				System.out.println((char)i);
//				count++;

//			String temp = (String)bufferedReader.read();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("반복횟수: " + count);
	} // end of main

} // end of class
