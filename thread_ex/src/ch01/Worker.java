package ch01;

// 스레드를 상속한 클래스 Worker. 따라서 Worker클래스는 Thread클래스이기도 하다(다형성)
public class Worker extends Thread {
	private String name;
	// 스레드 만드는 방법
	// 1. 상속 활용하기

	public Worker(String name) {
		this.name = name;
	}

	// 약속된 부분!
	// start메서드를 통해 스레드한테 일 시작 명령을 내릴 수 있다
	// 그럼 스레드는 run 메서드 안에 있는 부분을 수행시킨다
	@Override
	public void run() {
		for (int i = 0; i < 50; i++) {
			System.out.println("worker: " + name + i);

			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	} // end of run
}
