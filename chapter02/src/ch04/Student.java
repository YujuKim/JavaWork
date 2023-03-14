package ch04;

public class Student {
	String name;
	int grade;
	String gender;
	int i;
	public Student(String name, int grade, String gender) {
		this.name = name;
		this.grade = grade;
		this.gender = gender;
	}
	public void ShowInfo(){
		System.out.println(this.name);
		System.out.println(this.grade);
		System.out.println(this.gender);
	}
}
