package ch08;

public class ArrayExceptionHandling {
	public static void main(String[] args) {

		// 배열 선언과 동시에 초기화
		int[] arr = { 1, 2, 3, 4, 5 };
		try {
			for (int i = 0; i < 10; i++) {
				System.out.println(arr[i]);
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace(); // 콘솔창에서 오류사항을 확인할 수 있다
			System.out.println("개발자야 인덱스 길이 모르니!?");

		}

	} // end of main

} // end of class
