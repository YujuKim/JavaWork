package ch07;

public class Student {
	// 학번과 이름을 정의
	// 생성자 정의
	// to String
	// -학번과 이름을 화면에 출력
	// equals 메서드를 재정의
	// -이름이 같다면 동명이인이라고 출력

	private int id;
	private String name;

	public Student(int id, String name) {
		this.id = id;
		this.name = name;

	}

	@Override
	public String toString() {

		return this.name + "," + this.id;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student) {
			Student targetStudent = (Student) obj;
			if (this.name == targetStudent.name) {
				System.out.println("이름이 같아요");
				return true;
			}
		}
		return false;
	}

}
