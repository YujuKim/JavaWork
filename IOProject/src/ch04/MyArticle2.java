package ch04;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MyArticle2 {
	public static void main(String[] args) {
		FileReader fr = null;
		FileWriter fw = null;
		
		try {
			fr = new FileReader("article1.txt");
			fw = new FileWriter("today_article.txt");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
