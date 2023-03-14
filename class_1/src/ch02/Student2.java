package ch02;

import java.util.ArrayList;
import java.util.List;

public class Student2 {
	private String name;
	private int studentId;
	private String email;
	List<Enrollment2> enrollments = new ArrayList<>();

	public Student2(String name, int studentId, String email) {
		super();
		this.name = name;
		this.studentId = studentId;
		this.email = email;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Enrollment2> getEnrollments() {
		return enrollments;
	}

	public void setEnrollments(List<Enrollment2> enrollments) {
		this.enrollments = enrollments;
	}

	public void addEnrollment(Enrollment2 enrollment) {
		enrollments.add(enrollment);
	}

}
