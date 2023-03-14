package strings;

public class StringTest1 {
	public static void main(String[] args) {

		// 문자열이란 데이터를 사용할 때
		String str1 = "반가워"; // 1번 방식
		String str2 = new String("반가워"); // 2번 방식
		// 1번과 2번은 메모리에 위치시키는 곳이 다르다.
		// 1번-상수풀, 2번-힙메모리
		String str3 = new String("반가워");
		String str4 = "반가워";

		System.out.println("str1" + str1);
		System.out.println("str2" + str2);

		// 검증 1
		if (str1 == str2) {
			System.out.println("네 주소값이 같습니다");
		} else {
			System.out.println("아니요 주소값이 다릅니다");
		} // 결과: "아니요 주소값이 다릅니다"

		// 검증 2
		if (str2 == str3) {
			System.out.println("네 주소값이 같습니다");
		} else {
			System.out.println("아니요 주소값이 다릅니다");
		} // 결과: "아니요 주소값이 다릅니다"

		// 검증 3
		if (str1 == str4) {
			System.out.println("네 주소값이 같습니다");
		} else {
			System.out.println("아니요 주소값이 다릅니다");
		} // 결과: "네 주소값이 같습니다"

		// 결론--> 리터럴 값으로 생성한 문자열은 상수풀이란 영역에 올라가고
		// 동일한 문자열을 사용한다면 새로 생성하지 않고 재활용해 사용한다

		// 검증 4
		if (str1.equals(str2)) {
			System.out.println("문자열 모양이 같아요");
		} else {
			System.out.println("문자열 모양이 달라요");
		} // 결과: "문자열 모양이 같아요"

	}// end of main
}// end of class
