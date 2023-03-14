package ch05;

import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class MainTest1 {
	public static void main(String[] args) {

		long millisecond = 0;

		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			fis = new FileInputStream("bubble.zip");
			fos = new FileOutputStream("bubbleacopy.zip");

			int i;
			millisecond = System.currentTimeMillis();
			while ((i = fis.read()) != -1) {
				// 읽고 있는 중 --> i안에
				fos.write(i); // 쓰는 중

			}

			millisecond = System.currentTimeMillis();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fis.close();
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("파일 복사 시 소요 시간: " + millisecond);

	} // end of main

}// end of class
