package ch05;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class MainTest2 {
	public static void main(String[] args) {

		FileOutputStream fos = null;

		try {
			fos = new FileOutputStream("output3.txt");
			// 보조 스트림
			BufferedOutputStream bos = new BufferedOutputStream(fos);

			try {
				bos.write(97);
				bos.write(98);
				bos.write(99);
				bos.flush();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}

	} // end of main

}// end of class
