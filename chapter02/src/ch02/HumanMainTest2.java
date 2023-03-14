package ch02;

import java.util.Scanner;

public class HumanMainTest2 {

	public static void main(String[] args) {

		// 스캐너를 활용해 값을 할당 
		// 마지막엔 showInfo메서드를 호출해 값을 확인
		Scanner scanner = new Scanner(System.in);
		
		Human human = new Human();
		human.height = scanner.nextInt();
		human.weight = scanner.nextInt();
		human.name = scanner.next();
		human.isMan = scanner.nextBoolean();
		int scanNumber = scanner.nextInt();
		
		if (scanNumber == 0) {
		human.showInfo();
		}
		
		
	
		
		// 심화
		// 스캐너 통해 showInfo 메서드 호출 기능 만들어보기_ex)0번을 입력하면 호출
	}

}
