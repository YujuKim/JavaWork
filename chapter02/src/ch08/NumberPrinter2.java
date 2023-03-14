package ch08;

public class NumberPrinter2 {
	private int id; // new()한 다음(메모리에 올린 다음)에 써야함
	public static int waitNumber; // static이 붙으면 객체 생성 없이도 접근, 수정 가능 
		

	//생성자
	public NumberPrinter2(int id) {
		this.id = id;
	}

	// 번호표를 출력합니다
	public void prinWaitNumber() {
		System.out.println("대기 순번" + waitNumber);
		waitNumber++;
	}
	//static이 붙으면 메서드가 아니라 함수라고 생각하면 됨
	public static int getWaitNumber() {
		//id = 100;
		//static 메서드 안에선 멤버 변수를 활용할 수 없다.
		//객체가 메모리에 올라갔다고 보장하지 못하기 때문
		return waitNumber;
	}
	//테스트 코드
	public static void main(String[] args) {
		//정적변수는 클래스 이름으로 접근 가능하다
		NumberPrinter2.waitNumber++;
		NumberPrinter2.waitNumber++;
		NumberPrinter2.waitNumber++;
		System.out.println(NumberPrinter2.waitNumber);
		
		NumberPrinter2 numberPrinter2 = new NumberPrinter2(1);
		System.out.println(NumberPrinter2.waitNumber);
		System.out.println("============================");
		System.out.println(numberPrinter2.getWaitNumber());
		NumberPrinter2.getWaitNumber();
		// 클래스 이름으로 static메서드에 접근해서 호출할 수 있다.
		// 객체가 생성되기 전에 사용 가능하다는 말
		
	}
}
