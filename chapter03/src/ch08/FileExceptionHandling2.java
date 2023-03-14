package ch08;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileExceptionHandling2 {

	public static void main(String[] args) {

		MyFile file = new MyFile();
		try {
			file.inputData("하이!!");

		} catch (FileNotFoundException e) {
			System.out.println("파일이 없네요~");
		}

	}

}

class MyFile {
	// throws :던지다
	// 누군가가 MyFile 클래스를 사용할 때
	// inputData메서드 호출시 오류가 날 수 있으니
	// 예외 처리 흐름은 사용자가 알아서 구현해 쓰라는 의미
	public void inputData(String str) throws FileNotFoundException {
		FileInputStream fis;
		fis = new FileInputStream("test1.txt");

	}
}
