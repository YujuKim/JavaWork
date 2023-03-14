package ch06;

public class BankMainTest1 {
	// 메인 함수
	public static void main(String[] args) {
		Bank bankB = new Bank();
		bankB.deposit(10_000);
		bankB.withdraw(6_000);
		
		// 기능을 활용해야 하는데 멤버변수에 바로 접근하는 실수를 범함
		// 객체의 상태값은 행위를 통해 변경 시키는 것이 객체 지향 코드 방법이다.
		//bankB.balance = 100_000;
		bankB.showInfo(); //104_000이 아니라 100_000가 출력
		//예방하기 위해 접근 제어 지시자를 할당-private
		//외부에서 접근 불가
		
		
		//문자열 전체가 아닌 현재 금액에 대한 정보만 받고 싶다면
		
		//현재 계좌 잔액을 지역 변수에 담기
		int currentMoney = bankB.getBalance();
		System.out.println("currentMoney: " + currentMoney);
		
		//set메서드 사용해보기
		bankB.setBalance(200_000);
		bankB.showInfo();

		bankB.setBalance(-1_000);
		bankB.showInfo();
		

	} // end of main

} // end of class
