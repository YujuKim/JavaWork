package ch03;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStream1 {
	public static void main(String[] args) {

		// 현재 outut.txt 파일은 없는 상태
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream("output.txt");
			fos.write(97);
			fos.write(98);
			fos.write(99);
			fos.write(100);
		} catch (IOException e) {

			e.printStackTrace();
		} finally {
			try {
				fos.close();
			} catch (IOException e) {

				e.printStackTrace();
			}

		}

	} // end of main

} // end of class
