package ch01;

public class MainTest3 {

	public static void main(String[] args) {
		
//		Student studentKim = new Student();
//		System.out.println(studentKim); // 주소값이 출력된다
		Student studentLee = new Student();
		System.out.println(studentLee); // 주소값이 출력된다
		// 기본 데이터 타입 - 값(리터럴)이 출력된다
		// 참조 타입 - 주소값이 출력된다 (찾아가야 하니까 주소가 필요)
		
		System.out.println("-----------------");
		
		System.out.println(studentLee.studentId);
		System.out.println(studentLee.studentName);
		System.out.println(studentLee.address);
		System.out.println(studentLee.height);
		System.out.println(studentLee.isMarried);
		// 멤버 변수는 메모리에 올라 간 뒤 값을 할당하지 않으면
		// 기본값으로 초기화 된다. (컴파일러가 자동으로 해줌)
	}

}
