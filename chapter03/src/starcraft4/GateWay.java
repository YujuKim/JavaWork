package starcraft4;

public class GateWay {
	private String name;

	public GateWay() {
		this.name = "게이트웨이";
	}

	// 배열 활용해 질럿 생산
	public Zealot[] createZealot(int count) {
		// 배열 선언
		Zealot[] arr = new Zealot[count];

		System.out.println("질럿을 생산합니다.");

		for (int i = 0; i < count; i++) {

			arr[i] = new Zealot("질럿");
		}
		return arr;
	}

	// 드라군 생산

}
