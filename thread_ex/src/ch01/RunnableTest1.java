package ch01;

import javax.swing.JFrame;

//  만약 코드가 JFrame을 상속 받았다면 자바는 단일 상속을 지원하기 때문에 다중상속을 할 수 없다
//  그래서 인터페이스인 Runnable 구현 방법을 알아야 한다. 
public class RunnableTest1 {

	public static void main(String[] args) {
		// 사용하는 방법
		System.out.println("main thread 시작");
		SubWorker subWorker = new SubWorker();
		// subWorker.start(); --> 현재 start 메서드가 없다
		// subWorker는 runnable 기능을 구현했지 Thread를 상속받은 건 아니기 때문!
		// 따라서 thread 기능인 start메소드가 없는 상태

		// 스레드를 생성할 때 생성자에 runnable타입을 넣을 수 있는 걸 확인 할 수 있다.

		Thread thread1 = new Thread(subWorker);
		// 시작 시점은 이벤트를 받든, 연산 후에 하든 사용자가 알아서 실행 시킬 수 있다.
		thread1.start();
	} // end of main

} // end of class

class SubWorker extends JFrame implements Runnable {
	// 설계하는 방법
	// 나중에 스레드가 동작해야 하는 부분을 run안에서 작성함
	@Override
	public void run() {
		for (int i = 0; i < 30; i++) {
			System.out.print("i:" + i + "\n");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}

}
