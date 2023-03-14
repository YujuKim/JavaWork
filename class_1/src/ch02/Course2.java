package ch02;

public class Course2 {
	private int courseId;
	private String name;
	private String description;

	public Course2(int courseId, String name, String description) {
		super();
		this.courseId = courseId;
		this.name = name;
		this.description = description;
	}

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
