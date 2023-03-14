package ch01;

import java.util.Iterator;

import javax.swing.JFrame;

// 클래스 문법
// 변수, 생성자, 메서드 가능. 식은 불가능

public class MyGameFrame extends JFrame {

	public MyGameFrame() {
		// 익명 클래스 + 메서드 체이닝 방식 코드
		new Thread(this.runnable).start();

	}

	// Runnable runnable; // 변수선언
	Runnable runnable = new Runnable() {

		@Override
		public void run() {
			for (int i = 0; i < 10; i++) {
				System.out.println("--------------");
				try {
					Thread.sleep(200);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		}
	};

	// 메인 작업자
	public static void main(String[] args) {
		MyGameFrame gameFrame = new MyGameFrame();
		Thread thread = new Thread(gameFrame.runnable);
		thread.start();
//		gameFrame.runnable.run();
		for (int i = 0; i < 30; i++) {
			System.out.println("i: " + i);

		}

	} // end of main
} // end of class
