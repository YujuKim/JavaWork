package ch03;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStream2 {
	public static void main(String[] args) {

		FileOutputStream fos = null;

		// 파일이 없다면 FileOut...파일을 먼저 생성해 준다.
		try {
			byte[] bs = new byte[26];
			byte myData = 65;
			fos = new FileOutputStream("output2.txt");
			// 파일에다가 A ~ Z까지 알파벳을 출력하려면?
			for (int i = 0; i < bs.length; i++) {
				fos.write(myData);
				myData++;
				// A-65, B-66......
			}
		} catch (FileNotFoundException e) {

			e.printStackTrace();
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
