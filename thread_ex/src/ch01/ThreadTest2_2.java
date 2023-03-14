package ch01;

public class ThreadTest2_2 {
	public static void main(String[] args) {
		System.out.println("------메인스레드 시작");
		System.out.println(Thread.currentThread());
		
		Worker worker1 = new Worker("워커1");
		Worker worker2 = new Worker("워커2");
		
		worker1.start();
		worker2.start();
		System.out.println("--------메인스레드 종료");
	}
	
	

}
