package ch01;

public class DataType2 {

	// 코드의 시작점_main함수
	public static void main(String[] args) {
		char name; // 변수 선언. 2바이트 공간에 문자를 담을 수 있다.
		char a;
		char initial;

		name = 'a'; // 값을 초기화할 땐 작은따옴표
		name = 'b';
		// name ='ab'; 불가. char엔 하나의 문자만 담을 수 있다.
		System.out.println(name);
		System.out.println('p');
		System.out.println('C');

	} // end of main

} // end of class
