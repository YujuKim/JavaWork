package ex10;

//다른 패키지의 자바파일이라면 import해야 사용할 수 있다
import ch06.Bank;

public class MainTest1 {

	public static void main(String[] args) {
		Bank bankA = new Bank();
		bankA.name = "홍길동";
		// name의 접근 제어 지시자는 public (Bank.java참고)
		// 같은 프로젝트 안이라면 어디서나 접근 가능
		
	
	}

}
