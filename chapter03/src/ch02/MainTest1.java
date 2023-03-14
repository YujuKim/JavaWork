package ch02;

import java.util.Iterator;

public class MainTest1 {

	public static void main(String[] args) {

		Television television = new Television();
		Refridge refridge = new Refridge();
		ToyRobot robot = new ToyRobot();
		ToyCar car = new ToyCar();

		// 다형성
		RemoteController controller1 = television;
		RemoteController controller2 = refridge;
		RemoteController controller3 = robot;
		RemoteController controller4 = car;

		// 다형성 + 배열
		RemoteController[] remoteControllers = new RemoteController[4];
		remoteControllers[0] = television;
		remoteControllers[1] = refridge;
		remoteControllers[2] = robot;
		remoteControllers[3] = car;

		// 문제1
		// for문을 활용해 전원을 전부 켜주세요
		for (int i = 0; i < remoteControllers.length; i++) {
			remoteControllers[i].turnOn(); // 컴파일 시점 - turnOn, turnOff
			// 런타임 시점- TV를 켭니다,냉장고를 켭니다 등등...
		}
		// 문제2
		// index값이 3번이면 자기 자신의 타입을 화면에 출력해 주세요
		for (int i = 0; i < remoteControllers.length; i++) {
			if (i == 3) {
				System.out.println("3번째 녀석은 ToyCar 데이터 타입입니다.");
			}
		}

		// 문제3
		// 만약 데이터 ToyRobot이면 멤버 변수 name의 값을 출력해 주세요

		for (int i = 0; i < remoteControllers.length; i++) {
			if (remoteControllers[i] instanceof ToyRobot) {

				System.out.println(((ToyRobot) remoteControllers[i]).name);
			}
		}
		
		// 문제4
		// 장난감 로봇에 소리 기능을 추가해 달라는 요청
		// 냉장고에도 소리 기능을 추가해 달라는 요청
		// 소리기능을 인터페이스로 설계하면 된다.
		

	} // end of main

} // end of class
