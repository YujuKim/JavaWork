package ch01;

public class Worker3 extends Thread {


	@Override
	public void run() {
		int i = 0;
		while (i != 20) {
			System.out.println(i);
			i++;

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	} // end of run
} // end of class
