package ch04;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MyArticle {
	public static void main(String[] args) {
		// 파일 입출력 활용해 코드를 작성
		// 입력 대상: article1.txt
		// 출력 대상: today_article.txt
		FileReader fr = null;
		FileWriter fw = null;

		try {
			fr = new FileReader("article1.txt");
			fw = new FileWriter("today_article.txt");

			int i;
			fw.write("씨네21\n");
			while ((i = fr.read()) != -1) { // 더이상 읽을 게 없다면 -1리턴
//					System.out.print((char) i); // 리더기반은 2바이트 이상 처리 가능해 한글이 깨지지 않음
				fw.write(i);
			}

			fw.write("작성자:이동진");

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();

		} finally {
			try {
				fr.close();
				// Writer를 작성할 때 스트림이 열려있으면 버퍼라는 공간에 담아뒀다가
				// 스트림이 종료되거나 flush메서드를 만나면 실제로 file에 출력한다
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	} // end of main

}// end of class
