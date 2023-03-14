package ch03;

//객체지향 프로그래밍이란 
//객체와 객체 간 관계를 형성하고 상호작용하게 코드를 설계해 나가는 것
public class MainTest1 {

	public static void main(String[] args) {
		// 1번 3학년 홍길동
		// 2번 3학년 이순신

		Subject outerMath = new Subject(); // 외부에서 초기화하는 방법
		outerMath.subjectName = "수학";
		outerMath.score = 100;
		
		
		Student studentHong = new Student(1, 3, "홍길동");
		Student studentLee = new Student(2, 3, "이순신");

		// 컴파일 시점에선 오류를 확인할 수 없지만 실행시점에서 오류 확인
		studentHong.korean.subjectName = "국어";
		studentHong.korean.score = 90;
		// 해결방법
		// (1) 클래스 내부에서 초기화 (2)외부에서 초기화
		studentHong.math = outerMath;
		studentHong.showInfo();
		// System.out.println(studentHong.korean);
		
		
		// 이순신의 과목 국어, 수학 이름 데이터를 입력
		// 이순신의 과목별 점수를 입력 & 출력
//		studentLee.korean.subjectName = "국어";
//		studentLee.math.subjectName = "수학";
//		studentLee.korean.score = 100;
//		studentLee.math.score = 60;
//		studentLee.showInfo();
		

	}

}
