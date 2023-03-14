package ch02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest1 {

	public static void main(String[] args) {
		FileInputStream fis = null;

		try {
			fis = new FileInputStream("input.txt");
			System.out.print((char) fis.read());
			System.out.print((char) fis.read());
			System.out.print((char) fis.read());
			System.out.print((char) fis.read());
			System.out.print((char) fis.read());
			System.out.print((char) fis.read());
			System.out.print((char) fis.read());
			System.out.print((char) fis.read());
			System.out.print((char) fis.read());
			System.out.print((char) fis.read());
			System.out.print((char) fis.read());
		} catch (IOException e) {

			e.printStackTrace();

		} finally {
			try {
				fis.close(); // stream 닫기
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
//		System.out.println("여기 코드가 올까요");

	}
}
