package ex13;

import java.util.Random;
import java.util.Scanner;

public class PickerMachine {

	public static void main(String[] args) {
		// 경품 데이터 메모리에 올리기(배열 사용해서)
		// 기능 만들기
		Present present1 = new Car("꼬마버스타요","파랑");
		Present present2 = new Watch("손목시계","빨강");
		Present present3 = new Ring("시크릿쥬쥬반지","분홍");
		
		Present[] presents = new Present[3];
		presents[0] = present1;
		presents[1] = present2;
		presents[2] = present3;

		Random random = new Random();
		int randomNumber = random.nextInt(3);

		Scanner scanner = new Scanner(System.in);
		System.out.println("1부터 3중 하나를 입력하세요.");
		
		//과제)두번 기회 주기 두번 다 실패시 꽝, 첫번째 맞히면 바로 종료
		int userNumber = scanner.nextInt();
		if (userNumber == randomNumber) {

			
			presents[randomNumber].showInfo();
		} else {
			System.out.println("아쉽지만 꽝입니다");
		}
		// 랜덤 번호 1~3 중 하나 추출
		// 1~3 중 사용자로부터 값 입력 받기
		// 맞으면 상품제공, 틀리면 "다시 시도"

	} // end of main class
} // end of PickerMachine class

class Present {
	String name;
	String color;

	public Present(String name, String color) {
		this.name = name;
		this.color = color;
	}

	public void showInfo() {
		System.out.println("상품 정보");
		System.out.println(name);
		System.out.println(color);
		System.out.println();
	}
}

class Car extends Present {

	public Car(String name, String color) {
		super(name, color);
		// TODO Auto-generated constructor stub
	}

}

class Watch extends Present {

	public Watch(String name, String color) {
		super(name, color);
		// TODO Auto-generated constructor stub
	}

}

class Ring extends Present {

	public Ring(String name, String color) {
		super(name, color);
		// TODO Auto-generated constructor stub
	}

}
