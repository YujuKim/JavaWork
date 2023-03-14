package ch01;

public class Bus {
	int number;
	String driver;
	
	public void go() {
		System.out.println(number + "번 버스가 갑니다.");
	}
	
	public void stop() {
		System.out.println(number + "번 버스가 멈춥니다.");
	}
	
	public void driver() {
		System.out.println(number + "번 버스의 기사는 " + driver + "입니다.");
		
	}
	
	
	
}
