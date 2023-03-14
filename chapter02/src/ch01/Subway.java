package ch01;

public class Subway {
	int line;
	String driver;
	
	public void go () {
		System.out.println(line + "호선 지하철이 갑니다.");
		
	}
	public void stop () {
		System.out.println(line + "호선 지하철이 멈춥니다.");
		
	}
	public void driver () {
		System.out.println(line + "호선 지하철의 기관사는 " + driver + "입니다." );
		
	}
}
