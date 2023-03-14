package ch08;

public class MainTest2 {

	public static void main(String[] args) {
		// 클래스 안의 멤버 변수를 사용하려면
		// 반드시 먼저 메모리에 올려야 한다.
		// static은 안 그래도 됨

		// 수행 요청-클래스이름.
		System.out.println(NumberPrinter.waitNumber);
		NumberPrinter.waitNumber++;
		NumberPrinter.waitNumber++;
		NumberPrinter.waitNumber++;
		System.out.println(NumberPrinter.waitNumber);

		// 문법적으로 class {}안에 작성을 해야 하지만 static키워드를 가진 건 잠시 자리만 빌려 문법만 사용할 뿐
		// 메모리를 사용하는 영역은 미리 뜨는 static영역이다.

	} // end of main

} // end of class
