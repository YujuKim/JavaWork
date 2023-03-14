package ch04;

import java.util.Scanner;

public class IfMainTest1 {

	public static void main(String[] args) {
		// 제어문 -if
		// 주어진 조건에 따라 실행이 이루어지도록 구현

		boolean flag = true;

		// if문
		// 출력이 될 수도 있고 안 될 수도 있음

		if (flag) {
			System.out.println("조건식의 결과가 true이면 여기 코드가 수행 됩니다.");
		}

		// if else 문
		// 두 개중 하나는 무조건 출력
		flag = false;

		if (flag) {
			System.out.println("true면 실행!");
		} else {
			System.out.println("false면 실행!");
		}

		System.out.println("성적을 입력하시오");
		Scanner sc = new Scanner(System.in);
		int point = sc.nextInt();

		// if else if문 (else는 생략 가능)
		if (point >= 90) {
			System.out.println("A학점입니다.");
		} else if (point >= 80) {
			System.out.println("B학점입니다.");
		} else if (point >= 50) {
			System.out.println("C학점입니다.");
		} else if (point >= 20) {
			System.out.println("D학점입니다.");
		} else {
			System.out.println("F학점입니다.");
		} // end of if

	} // end of main

} // end of class
