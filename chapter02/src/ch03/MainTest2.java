package ch03;

public class MainTest2 {
	// 코드의 시작점
	public static void main(String[] args) {
		Bus bus = new Bus(100);

		bus.take(1);
		bus.take(1);
		bus.take(3);
		bus.takeoff(1);
		bus.showInfo();

		Subway subway = new Subway(5);

		subway.take(10);
		subway.takeOff(5);
		subway.showInfo();

	} // end of main

} // end of class
