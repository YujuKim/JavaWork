package strings;

public class StringTest2 {
	public static void main(String[] args) {

		// '상수풀'이라는 개념을 이해했다면
		// 실제 주소값을 찍어 봅시다
		// Student sKim = new Student();
		// System.out.println(sKim);
		String str1 = "반가워";
		String str2 = new String("반가워");
		String str3 = new String("반가워");
		String str4 = "반가워";

		// 현재 string주소값 찍어 보는 법
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str4));
		System.out.println(System.identityHashCode(str2));
		System.out.println(System.identityHashCode(str3));

		// 상수풀에 한 번 생성된 문자열은 불변(immutable)이다
		str4 = str4 + "홍길동";
		System.out.println(System.identityHashCode(str4));
		str1 += ":하이";
		System.out.println(System.identityHashCode(str1));
		// 원래 str1,str4와 다른 주소값이 출력된다.
		// 값이 변경되면 상수풀 영역에 새로 생성된다.

		// 메모리를 효율적으로 사용하기 위해선
		// StringBuilder클래스와 StringBuffer클래스를 알아야 한다.

	} // end of main

} // end of class
