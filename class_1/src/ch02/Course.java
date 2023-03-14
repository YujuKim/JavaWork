package ch02;

public class Course {
	private int courseId;
	private String name;
	private String description;

	public Course(int courseId, String name, String description) {
//		super();
		this.courseId = courseId;
		this.name = name;
		this.description = description;
	}

	public int getCourseId() {
		return courseId;
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
