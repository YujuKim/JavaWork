package ch06;

/**
 * 1.함수를 선언하는 코드 방법 2.함수를 사용하는 코드 방법 두 가지를 기억할 것!!
 */
public class Lion {

	// 정수를 반환하는 함수
	// 함수를 설계하는 코드 작성
	static int addNumber(int n1, int n2) {
		// 함수 구현부(body)
		int result;
		result = n1 + n2;
		return result; // 리턴 키워드를 만나면 실행의 제어권을 반납, 호출한 곳으로 돌아감
	}

	// 아무 값도 반환하지 않는 함수(return타입이 없는)
	static void sayHello(String name) {
		System.out.println(name + "반갑습니다~~");
	}

	// 매개변수가 없는 함수
	static int calcSum() {
		int sum = 0;
		int i;

		for (i = 1; i <= 100; i++) {
			sum += i;
		}
		return sum;
	}

	// calcSum2함수. 정수값3개를 받아서 덧셈 연산 후 결과를 반환하시오 (리턴 타입은 double)
	static double calcSum2(int i, int j, int k) {
		double sum = i + j + k;
		return sum;

	}

	// calcSum3함수. 정수값1, 실수값1, 논리값1개 받고 식을 만들어 결과 반환
	// 문자열로 연산해 리턴타입은 String으로
	static String calcSum3(int i, double j, boolean k) {
		String sum = "정수값: " + i + " 실수값: " + j + " 논리값: " + k;
		return sum;

	}

	// main함수
	public static void main(String[] args) {
		// 함수 호출하기1
		// 함수를 사용하는 코드
		int myNumber = addNumber(5, 10);
		System.out.println("myNumber: " + myNumber);

		// 함수 호출하기2
		// 함수 호출할 때는 모양을 맞춰야 한다.
		sayHello("애쉬");
		sayHello("티모");
		sayHello("바론");

		// 함수 호출하기3
		int calResult = calcSum();
		System.out.println(calResult);
		System.out.println(calcSum());

		// 함수 호출하기(연습문제)
		double calResult2 = calcSum2(1, 2, 3);
		System.out.println(calResult2);

		// 함수 호출하기(연습문제2)
		String calResult3 = calcSum3(1, 2, true);
		System.out.println(calResult3);

	}// end of main
	
	
}// end of class
