package ch01;

public class Student {

	// 상태(속성)
	String studentName;
	String address;
	int studentId;
	double height;
	boolean isMarried;

	// 기능

	// 공부한다
	public void study() {
		System.out.println(studentName + " 학생이 공부를 합니다.");
	}

	// 휴식한다
	public void breakTime() {
		System.out.println(studentName + " 학생이 휴식을 합니다.");
	}

	public void showInfo() {
		System.out.println("=========상태창=========");
		System.out.println("학생의 ID값은: " + studentId);
		System.out.println("학생의 이름은: " + studentName);
		System.out.println("학생의 주소는: " + address);
		System.out.println("======================");
	}
	public void sleep() {
		System.out.println(studentName + " 학생이 엎드려 잡니다.");
	}
	
	public void laugh() {
		System.out.println(studentName + " 학생이 웃습니다.");
	}
	
	public void talk() {
		System.out.println(studentName + " 학생이 이야기 합니다.");
	}
	

} // end of class
