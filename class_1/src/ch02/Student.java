package ch02;

import java.util.ArrayList;
import java.util.List;

public class Student {
	private int studentId;
	private String name;
	private String email;
	List<Enrollment> enrollments = new ArrayList<>();
	// 배열이나 자료구조는 멤버변수 선언과 동시에 초기화 해주는 게 좋다

	public Student(int studentId, String name, String email) {
		this.name = name;
		this.studentId = studentId;
		this.email = email;

	}

	public int getStudentId() {
		return studentId;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public List<Enrollment> getEnrollments() {
		return enrollments;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setEnrollments(List<Enrollment> enrollments) {
		this.enrollments = enrollments;
	}

	// 등록 기능 추가
	public void addEnrollment(Enrollment enrollment) {
		enrollments.add(enrollment);

	}

}
