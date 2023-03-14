package ch04;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest2 {
	public static void main(String[] args) {

		// 문자 단위로 읽어 들이는 스트림
		FileReader fr = null;
		try {
			fr = new FileReader("output2.txt");

			int i;
			// 더이상 읽을 게 없다면 -1리턴
			while ((i = fr.read()) != -1) {
				System.out.print((char) i);

			}
			int temp = fr.read();
//			System.out.println("temp: " + (char) temp);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	} // end of main

} // end of class
