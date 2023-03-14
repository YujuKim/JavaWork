package ch05;

public class MainTest2 {

	public static void main(String[] args) {
		// 1단계 - 사용해 보기
		// 2단계 - 실행의 흐름 만들어 보기

		Student studentLee = new Student("이태백", 5000);
		Bus bus63 = new Bus(63);
		Bus bus103 = new Bus(103);
		Subway subwayLine2 = new Subway(2);
		Subway subwayLine1 = new Subway(1);

		// 학생 정보
		studentLee.showInfo();
		
		// 버스 태우기
		studentLee.takeBus(bus63);
		studentLee.takeBus(bus103);
		
		// 지하철 태우기
		studentLee.takeSubway(subwayLine2);
		studentLee.takeSubway(subwayLine1);
		
		// 대중교통 이용횟수
		studentLee.showNumber();
		
		// 잔액 정보
		studentLee.showMoney();
		
		// 버스 정보
		bus63.showInfo();
		bus103.showInfo();
		
		// 지하철 정보
		subwayLine2.showInfo();
		subwayLine1.showInfo();

	}

}
