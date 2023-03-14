package ch03;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStream3 {
	public static void main(String[] args) {

		int data = 0;

		// output3.txt
		// hello world를 찍어주세요

		try {
			File file = new File("output3.txt");
			FileOutputStream fos = new FileOutputStream(file);
			try {
				while ((data = System.in.read()) != -1) {
					fos.write(data);
				}
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}

	} // end of main

} // end of class
