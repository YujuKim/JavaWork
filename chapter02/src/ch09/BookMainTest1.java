package ch09;

import java.util.Iterator;

public class BookMainTest1 {
	// 메인함수-코드의 시작
	public static void main(String[] args) {
		Book[] books = new Book[10]; // 배열 선언(메모리 공간 만들기)
		books[0] = new Book("플러트UI실전", "김근호");
		books[1] = new Book("무궁화꽃이 피었습니다", "김진명");
		books[2] = new Book("흐르는 강물처럼", "파울로코엘료");
		books[3] = new Book("리딩으로리드하라", "이지성");
		books[4] = new Book("사피엔스", "유발하라리");
		books[9] = new Book("홍길동전", "허균");

		for (int i = 0; i < books.length; i++) {
			// 방어적 코드 짜기

			if (books[i] != null) {
				System.out.println(books[i].getTitle());
			}
		}

//		주의1
		// 인덱스의 크기는 n-1개다.
		// 배열의 길이와 인덱스의 길이는 다르다.

//		주의2
		// 배열의 길이와 실제 들어가 있는 값의 개수는 다를 수 있다.

		// 문제1_ double 배열 4개를 선언하고 임의 값을 넣어 출력
		// 3번째 인덱스는 값을 할당하지 마시오
		// 출력은 for문
		double[] ds = new double[4]; // 배열 선언(메모리 공간 만들기)
		ds[0] = 35.3;
		ds[1] = 36.5;
		ds[2] = 37.1;

		for (int i = 0; i < ds.length; i++) {
			System.out.println(ds[i]);
		} // double은 기본적으로 0.0이 할당되기 때문에 방어적 코드 작성 불필요

		// 문제2_ 예제 books를 활용해 0번째와 2번째 인덱스에 있는 값을 스왑
		Book temp = books[0];
		books[0] = books[2];
		books[2] = temp;
		for (int i = 0; i < books.length; i++) {
			// 방어적 코드 짜기

			if (books[i] != null) {
				System.out.println(books[i].getTitle());
			}
		}

		// 문제3_ 인덱스 3번의 값을 삭제
		books[3] = null;
		for (int i = 0; i < books.length; i++) {
			if (books[i] != null) {
				books[i].showInfo();

			}
		}

	} // end of main

}
// end of class
