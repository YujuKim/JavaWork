package ch03;

public class Student {
	int studentId;
	int grade;
	//참조 타입
	String name;
	Subject korean;
	Subject math;

	// 생성자
	public Student(int studentId, int grade, String name) {
		this.studentId = studentId;
		this.grade = grade;
		this.name = name;
		this.korean = new Subject();
		//this.math = new Subject();
	}

	// 메서드
	public void showInfo() {
		System.out.println("**상태창**");
		System.out.println(this.name + " 입니다.");
		System.out.println(this.grade + " 학년 입니다.");
		System.out.println(this.studentId + " 번 입니다.");
		System.out.println(this.korean.subjectName + "의 점수는 "+ this.korean.score);
		System.out.println(this.math.subjectName + "의 점수는 "+ this.math.score);
	}
}
