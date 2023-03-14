package ch01;

public class Worker2 extends Thread {

	private String name;

	public Worker2(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		for (int i = 0; i < 50; i++) {
			System.out.println("worker: " + name + i);
		}
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
	}
}
