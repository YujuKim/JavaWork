package ch01;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterExample2 {

	public static void main(String[] args) {

		BufferedWriter writer = null;

		try {
			writer = new BufferedWriter(new FileWriter("output2.txt"));
			writer.write("하이하이");
			writer.newLine();
			writer.write("버퍼드라이터");
			writer.flush();
		} catch (IOException e) {

			e.printStackTrace();
		} finally {
			try {
				writer.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	} // end of main

} // end of class
