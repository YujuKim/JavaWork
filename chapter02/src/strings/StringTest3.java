package strings;

public class StringTest3 {
	public static void main(String[] args) {
		// StringBuilder와 StringBuffer를 알아보자
		// 문자열을 여러번 연결하거나 변경할 때 유용
		// StringBuffer는 멀티 쓰레드 프로그래밍에서 동기화를 보장한다.
		// 단일 쓰레드 프로그램에서는 StringBuilder를 권장한다.

		String java = new String("java");
		String android = new String("android");
		System.out.println(java + android);

		StringBuilder builder = new StringBuilder(java);
		// "java"쓴 거랑 똑같음

		// 주소값 확인하기
		System.out.println(System.identityHashCode(builder));
		System.out.println("------------------------------");
		System.out.println("builder값: " + builder);

		// builder 에 문자열을 더하는 기능은 append이다
		builder.append(android);
		System.out.println(builder);
		System.out.println("-------------------------------");
		System.out.println(System.identityHashCode(builder));

		// 응용
		// stringBuilder를 String으로 형변환
		// 1. toString활용
		String result = builder.toString();
		// 2. 자동형변환
		String result2 = builder + "반가워";

		// 정리
		// StringBuilder는 문자열을 다룰 때 한 번 생성한 문자열을 변경하더라도
		// 메모리를 새로 생성하지 않는다.

	} // end of main

} // end of class
