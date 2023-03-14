package ch03;

public class MainTest1 {

	public static void main(String[] args) {
		
		char myA='A';
		char yourA='a';
		System.out.println((int)myA);
		System.out.println((int)yourA);
		System.out.println("==========================");
		System.out.println((short)myA);
		
		//대입 연산자: '=', 연산의 방향은 오른쪽에서 왼쪽으로
		int number = 10; // 연산자 양 옆으로 한 칸씩 띄우는 게 권장사항
		int number2 = number;
		System.out.println(number2);
		System.out.println("===========================");
		
		//부호 연산자: '+','-'. 부호를 변경하는 연산자. 실제값이 바뀌진 않는다.
		System.out.println(-number);
		System.out.println(number);
		
		
	}

}
