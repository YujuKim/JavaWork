package ch10;

public class Cal {
	public int sum(int n1, int n2) {
		return n1 + n2;
	}

	public int multiply(int n1, int n2) {
		System.out.println("부모 메서드");
		return n1 * n2;
	}

	// 코드 테스트
	public static void main(String[] args) {
		Cal2 cal2 = new Cal2();
		// cal2에 multiply 메서드가 있는지 확인
		// cal2에 없다면 부모클래스에 있는 메서드를 확인
		// 부모의 메서드 multiply를 재정의 한다면
		// 그것을 '오버라이드'라고 한다
		System.out.println(cal2.multiply(0, 100));

	} // end of main
} // end of Cal class

class Cal2 extends Cal {
	public int minus(int n1, int n2) {
		return n1 - n2;
	}

	// 오버라이드란?(오버로딩이랑 다른 개념!)
	// 부모에 있는 메서드를 재정의하는 것
	// 조건: 메서드 모양이 똑같아야 한다
//	public int multiply(int n1, int n2) {
//		System.out.println("자식 메서드");
//		if (n1 == 0 || n2 == 0) {
//			System.out.println("0을 입력하였습니다.");
//		}
//		return n1 * n2;
//	}

	@Override // 어노테이션(주석+힌트로 알려주는 것)
	public int sum(int n1, int n2) {
		System.out.println("n1:" + n1 + "을 입력하였습니다.");
		return super.sum(n1, n2);
	}
} // end of Cal2 class