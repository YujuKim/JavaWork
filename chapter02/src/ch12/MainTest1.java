package ch12;

public class MainTest1 {

	public static void main(String[] args) {
		// 기본적으로 추상클래스는 new를 쓸 수 없다
		// 개념적으로만 봐야지 개발자가 직접 객체를 만들어 뭔가를 시킬 수 없게 한다.

		Animal animalHuman = new Human();
		animalHuman.hunt();
		System.out.println("-------------------");
		Animal animalPerson = new Person();
		animalPerson.hunt(); //런타임 시점에 Person에 있는 메서드를 호출
		

	}

}
