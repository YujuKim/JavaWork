package thread;

public class thread02 extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		thread02 thread = new thread02();
		thread.start();
		System.out.println("종료될때까지 기다립니다");
		try {
			thread.join();
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		System.out.println("스레드가 종료되었습니다");
	}
}
