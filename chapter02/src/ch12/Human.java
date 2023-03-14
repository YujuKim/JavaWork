package ch12;

public class Human extends Animal {

	//부모 클래스에 있는 추상 메서드를 자식 클래스에서 일반메서드로 재정의
	@Override
	public void hunt() {
		System.out.println("휴먼이 사냥을 합니다.");

	}

}
