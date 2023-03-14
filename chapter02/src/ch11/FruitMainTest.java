package ch11;

public class FruitMainTest {

	public static void main(String[] args) {
		// 다양한 형태로 클래스(타입)를 바라 볼 수 있다
		// -->다형성
		Fruit fruit1 = new Banana(); // 업캐스팅된 상태
		// 컴파일 시점에는 컴파일러가 앞에 선언된 데이터 타입만 확인
		Fruit fruit2 = new Peach();

		Fruit[] fruits = new Fruit[2];
		fruits[0] = fruit1;
		fruits[1] = fruit2;

		// 다운캐스팅(강제형변환의 개념이다)
		// 자식 클래스를 명시하는 것
		String bananaOrigin = ((Banana) fruit1).origin;
		System.out.println("다운캐스팅된 값 확인: "+bananaOrigin);

		// 반복문1
		for (int i = 0; i < fruits.length; i++) {
			fruits[i].showInfo();
			//바나나 이면 원산지를 출력하시오
			//주소값이 같으면
			if(fruits[i]==fruit1) {
				System.out.println(((Banana)fruits[i]).origin);
			}
			System.out.println("----------------");

		}
		
		//반복문2
		//instance of 연산자 활용
		for (int i = 0; i < fruits.length; i++) {
			fruits[i].showInfo();
			if(fruits[i] instanceof Banana) {
				//바나나 타입이 맞다면 여기 코드 안으로 들어옴
				//다운캐스팅가능
				String origin = ((Banana)fruits[i]).origin;
				System.out.println("바나나 원산지: "+origin);
			}
				
			}
	} // end of main

}// end of class
