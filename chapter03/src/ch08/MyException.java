package ch08;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class MyException {
	public static void main(String[] args) {
		TxtFileInputManager inputManager = new TxtFileInputManager("test.txt");

		try {
			String result = inputManager.readTxtFileData();
			System.out.println("result: " + result);
		} catch (IOException e) {

			e.printStackTrace();
		}

	}

}

class TxtFileInputManager {
	// 외부 파일을 내 메모리상으로 가져올 수 있는 FileInputStream
	private FileInputStream fis;
	private String fileName;

	// 생성자
	public TxtFileInputManager(String fileName) {
		this.fileName = fileName;
	}

	// 메서드
	public String readTxtFileData() throws IOException {
		// IOException이 FileNotFoundEXception보다 부모
		fis = new FileInputStream(this.fileName);
		Properties prop = new Properties();
		prop.load(fis);
		String name = prop.getProperty("name");
		// KEY=VALUE로 데이터를 읽어 온다
		// name=홍길동 --> 홍길동 추출
		return name;

	}

}

class MyABException extends IOException {

}