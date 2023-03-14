package ch02;

import java.util.ArrayList;

public class MainTest3 {
	public static void main(String[] args) {
		Student2 studentKim = new Student2("KimYuju", 1, "yuju@mail.com");
		Student2 studentLee = new Student2("LeeJun", 1, "leejun@mail.com");

		Course2 course1 = new Course2(1, "Math", "Mathematics");
		Course2 course2 = new Course2(2, "Science", "ScienceClass");

		Enrollment2 enrollment1 = new Enrollment2(1, studentKim, course1);
		Enrollment2 enrollment2 = new Enrollment2(2, studentKim, course2);
		Enrollment2 enrollment3 = new Enrollment2(3, studentLee, course2);

		// 학생의 기능을 이용
		studentKim.addEnrollment(enrollment1);
		studentKim.addEnrollment(enrollment2);
		studentLee.addEnrollment(enrollment2);

		// Kim이 신청한 과정의 이름을 화면에 출력
		System.out.println(studentKim.getEnrollments().get(0).getCourse().getName());
		System.out.println(studentKim.getEnrollments().get(1).getCourse().getName());
		System.out.println("----다른 방법-----");
		for (int i = 0; i < studentKim.enrollments.size(); i++) {
			String name = studentKim.getName();
			String courseName = studentKim.getEnrollments().get(i).getCourse().getName();
			System.out.println(courseName);

		}
		System.out.println("------------------------");

		// Lee가 신청한 과정의 이름을 화면에 출력
		System.out.println(studentLee.getEnrollments().get(0).getCourse().getName());
		System.out.println("---------------------");
		// enrollment1 학생 이름을 출력해 주세요
		System.out.println(enrollment1.getStudent().getName());
		System.out.println("-------------------");
		// ArrayList 생성해 Enrollment 저장해주세요
		ArrayList<Enrollment2> items = new ArrayList<>();
		items.add(enrollment1);
		items.add(enrollment2);
		items.add(enrollment3);
		for (Enrollment2 집에갈래 : items) {
			System.out.println(집에갈래.getStudent().getName());
			System.out.println(집에갈래.getCourse().getName());
			
		}
		System.out.println("--------------------");
		// for each문을 써서 Kim의 수강과목명을 다시 한 번 더 출력해주세요
		
		for (Enrollment2 Kimcourse : studentKim.getEnrollments()) {
			System.out.println(Kimcourse.getCourse().getName());
			
		}

	}
// end of main
}