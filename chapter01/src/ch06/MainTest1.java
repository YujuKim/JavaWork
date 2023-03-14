package ch06;

public class MainTest1 {

	// 1. 리턴값이 int, 매개변수 n1,n2,n3, 함수 이름은 intAdd
	// 2. 리턴값이 double, 매개변수 n1,n2, 함수 이름은 doubleAdd
	// 3. 리턴값이 void, 매개변수는 String article, 함수 이름은 printArticle 출력

	static int intAdd(int n1, int n2, int n3) {
//		int sum = n1 + n2 + n3;
//		return sum;

		return n1 + n2 + n3;
	}

	static double doubleAdd(double n1, double n2) {
		double sum2 = n1 + n2;
		return sum2;
	}

	static void printArticle(String article) {
		System.out.println(article);
	}

	// 메인함수 -함수 호출해서 수행
	public static void main(String[] args) {

//		int result1 = intAdd(7,8,9);
//		System.out.println(result1);
//		
//		double result2 = doubleAdd(2.5,5.5);
//		System.out.println(result2);
//		
//		printArticle("Hello");

		System.out.println(intAdd(1, 2, 3));
		System.out.println(doubleAdd(10, 10));
		System.out.println("방가");

	}
}
