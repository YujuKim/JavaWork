package ch03;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStream4 {
	public static void main(String[] args) {

		FileOutputStream fos = null;

		// 파일이 없다면 FileOut...파일을 먼저 생성해 준다.
		try {
			byte[] bs = new byte[26];
			byte myData = 65;
			fos = new FileOutputStream("output2.txt", true); // 추가적으로 글을 쓰는 동작을 함

			for (int i = 0; i < bs.length; i++) {
				bs[i] = myData;
				myData++;
				// A-65, B-66......
			}
			fos.write(bs);
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
