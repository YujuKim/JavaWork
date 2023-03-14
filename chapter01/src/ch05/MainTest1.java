package ch05;

public class MainTest1 {
	// 코드의 시작점
	public static void main(String[] args) {
		Warrior w1; //데이터 타입 선언 or 참조 타입 선언 or 변수 선언
		
		w1 = new Warrior(); 
		//new키워드를 만나면 메모리상에 존재하게 한다.
		//메모리에 올라가면 프로그램 세상에 존재하게 된다.
		//메모리에 올라갔을 때 객체라고 부른다.
		
		//지역변수
		w1.height = 100;
		w1.name = "작은오크";
		w1.color = "초록색";
		w1.power = 10;
		
		Warrior w2 = new Warrior();
		w2.name = "큰오크";
		w2.height = 500;
		w2.power = 300;
		w2.color = "빨간색";
	}

}
