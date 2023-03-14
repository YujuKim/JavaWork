package ch01;

public class MainTest1 {
	//메인 함수 - 코드의 시작점
	public static void main(String[] args) {
		Student studentKim = new Student();
		studentKim.studentId = 1;
		studentKim.studentName = "홍길동";
		studentKim.address = "부산시 해운대구";
		
		studentKim.study();
		studentKim.breakTime();
		studentKim.showInfo();
		System.out.println("------------------------");
		
		Student studentLee = new Student();
		studentLee.studentName = "이순신";
		studentLee.studentId = 2;
		studentLee.address = "부산시 진구";
		
		studentLee.showInfo();
		studentLee.study();
		studentLee.breakTime();

	} //end of main

} // end of class
