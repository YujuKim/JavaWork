package ch02;

public class ConstantTest {
	// 코드의 시작점(main함수)
	public static void main(String[] args) {
		//상수는 변하지 않는 수.
		//예약어 final을 사용해 선언
		
		final int MAX_NUM=12;
//		MAX_NUM=13; //<--오류
		//대문자를 사용하고 단어의 연결은 _로 구분
		//상수로 한 번 초기화 된 값은 변경할 수 없다.
		
		final int MIN_NUM;
		MIN_NUM =1;
		//상수는 선언 후 단 한 번만 초기화 할 수 있다.
		
	} // end of main

} // end of class
