package ch08;

public class NumberPrinter {
	private int id; // new()한 다음(메모리에 올린 다음)에 써야함
	public static int waitNumber; // static이 붙으면 객체 생성 없이도 접근, 수정 가능
	//자동으로 0으로 초기화

	// 생성자는 맨 먼저 실행되고 한 번만 수행됨
	public NumberPrinter(int id) {
		this.id = id;
		this.waitNumber = 1;
	}

	// 번호표 출력
	public void prinWaitNumber() {
		System.out.println("대기 순번" + waitNumber);
		waitNumber++;
	}

}
