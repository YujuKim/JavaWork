package ch05;

public class MainTest1 {
	public static void main(String[] args) {
		Student studentKim = new Student("홍길동", 10_000);
		Bus bus100 = new Bus(100);
		Bus bus200 = new Bus(200);
		Subway subwayLine1 = new Subway(1);
		Subway subwayLine2 = new Subway(2);

		// 객체와 객체 간 메시지 전달하기 (상호작용하기)

		// 버스 태워 보기
		studentKim.takeBus(bus100);
		System.out.println("===============");

		// 학생 정보 확인
		studentKim.showInfo();

		// 버스 정보 확인
		bus100.showInfo();

		// 지하철 태워보기
		studentKim.takeSubway(subwayLine2);

		// 학생 정보 확인
		studentKim.showInfo();
		
		//지하철 정보 확인
		subwayLine2.showInfo();
		subwayLine1.showInfo();
		

	} // end of main

} // end of class
