package ch02;

public class MainTest1 {
	
	//메인 함수
	public static void main(String[] args) {
		Student studentKim = new Student();
//		studentKim.grade = 1;
//		studentKim.name = "홍길동";
//		studentKim.number = 1234;
		// 객체를 생성할 때 반드시 하나 이상의 생성자가 있어야 한다
		
		Student studentLee = new Student("이길동", 1234, 1);
		System.out.println(studentLee.name);
		System.out.println(studentLee.grade);
		System.out.println(studentLee.number);
		

	} //end of main

} //end of class
