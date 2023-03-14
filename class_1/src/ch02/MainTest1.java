package ch02;

import java.util.ArrayList;

public class MainTest1 {

	public static void main(String[] args) {
		// 학생 생성
		Student student1 = new Student(1, "Alice", "alice@email.com");
		Student student2 = new Student(2, "Bob", "bob@email.com");

		// 과목 생성
		Course course1 = new Course(1, "Math", "Introduction to Mathematics");
		Course course2 = new Course(2, "English", "Introduction to English");

		// 학생이 과정을 등록
		Enrollment enrollment1 = new Enrollment(1, student1, course1);
		Enrollment enrollment2 = new Enrollment(2, student2, course2);
		Enrollment enrollment3 = new Enrollment(3, student1, course2);

		// 학생의 데이터에 내가 등록한 정보를 저장할 수 있다
		// 방법1
//		ArrayList<Enrollment> list = new ArrayList<>();
//		list.add(enrollment1);
//		student1.setEnrollments(list);

		// 방법2. 학생의 기능을 이용
		student1.addEnrollment(enrollment1);
		student1.addEnrollment(enrollment3);
		student2.addEnrollment(enrollment2);

		// 문제1. Bob이 신청한 과정의 이름을 화면에 출력하시오 -학생으로 접근
		System.out.println(student2.getEnrollments().get(0).getCourse().getName());
		System.out.println("--------------------");

		// 문제2. Alice가 신청한 과정의 이름을 화면에 출력하시오 -학생으로 접근, 반복문 사용
		for (int i = 0; i < student1.getEnrollments().size(); i++) {
			String studentName = student1.getName();
			Course course = student1.getEnrollments().get(i).getCourse();
			String courseName = course.getName();
			System.out.println(studentName + ",courseName: " + courseName);
		}

		// 위의 학습목표는 학생 클래스와 과목 클래스를 등록클래스를 통해 연결하는 법을 아는 것이다.

		// 문제3. Enrollment1 학생 정보와 과목 정보를 출력해 주세요.
		System.out.println("학생 이름: " + enrollment1.getStudent().getName());
		System.out.println("수강 과목: " + enrollment1.getCourse().getName());
		System.out.println("--------------------------");

		// 문제4. ArrayList를 생성해 Enrollment 저장해 주세요.
		ArrayList<Enrollment> items = new ArrayList<>();
		items.add(enrollment1);
		items.add(enrollment2);
		items.add(enrollment3);
		for (Enrollment e : items) {
			System.out.println(e.getStudent().getName());
			System.out.println(e.getCourse().getName());
			System.out.println("--------------------");
		}

		// 문제5. foreach문을 써서 Alice의 수강과목명을 다시 한 번 더 출력하시오_student1로 접근
		for (Enrollment enrollment : student1.getEnrollments()) {
			System.out.println(enrollment.getCourse().getName());

		}

	} // end of main

} // end of class
