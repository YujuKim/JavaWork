package ch01;

public class ThreadTest2 {



	// 메인 스레드
	// 클래스 사용하는 방법 연습
	public static void main(String[] args) {
		System.out.println("-------------메인 스레드 시작");
		
		// 현재 스레드가 누군지 알아보는 명령어
		System.out.println(Thread.currentThread());
		
		// 작업자 만들어내기(by메인스레드)
		Worker worker1 = new Worker("워커1");
		Worker worker2 = new Worker("워커2");
		
		// 너가 위임 받은 일을 시작해 --> start
		worker1.start();
		worker2.start();

		System.out.println("-------------메인 스레드 종료");

	} // end of main

} // end of class




