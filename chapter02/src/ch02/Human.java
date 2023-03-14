package ch02;

public class Human {

	String name;
	int height;
	int weight;
	boolean isMan;

	// 생성자는 객체가 메모리에 올라갈 때 가장 먼저 수행되는 코드
	// 필요 시 초기화 값 식을 사용 가능하고 메서드 호출도 가능

	public Human() {
		if (this.name == null) { // 식도 추가 가능
//			System.out.println("이름을 입력해 주세요.");
//			this.name = "아무개";
			// showInfo(); // 필요하다면 생성자 안에서 메서드 호출 가능
		}
	}

	public void showInfo() {
		System.out.println("========상태창========");
		System.out.println("키: " + height);
		System.out.println("몸무게: " + weight);
		System.out.println("이름: " + name);
		System.out.println("성별: " + isMan);
	}

}
