package ch02;

public class Enrollment2 {
	private int enrollmentId;
	private Student2 student;
	private Course2 course;

	public Enrollment2(int enrollmentId, Student2 student, Course2 course) {
		super();
		this.enrollmentId = enrollmentId;
		this.student = student;
		this.course = course;
	}

	public int getEnrollmentId() {
		return enrollmentId;
	}

	public void setEnrollmentId(int enrollmentId) {
		this.enrollmentId = enrollmentId;
	}

	public Student2 getStudent() {
		return student;
	}

	public void setStudent(Student2 student) {
		this.student = student;
	}

	public Course2 getCourse() {
		return course;
	}

	public void setCourse(Course2 course) {
		this.course = course;
	}

}
