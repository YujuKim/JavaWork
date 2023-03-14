package ch07;

public class MainTest3 {

	public static void main(String[] args) {
		Student student1 = new Student(1,"홍길동");
		Student student2 = new Student(2,"홍길동");
		Student student3 = new Student(3,"티모");
		
		
		if(student1.equals(student2)) { //자식 객체에 존재하는 각각의 equals메서드 호출이다
			System.out.println("이름이 같아요");
		}else {
			System.out.println("이름이 달라요");
		}

	}

}
