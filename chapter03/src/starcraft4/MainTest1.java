package starcraft4;

public class MainTest1 {

	public static void main(String[] args) {

		Zealot zealot1 = new Zealot("천하무적질럿1");
		Zealot zealot2 = new Zealot("질럿2");
		Marine marine1 = new Marine("귀신잡는마린1");
		Marine marine2 = new Marine("마린2");
		Zergling zergling1 = new Zergling("저글링1");
		Zergling zergling2 = new Zergling("저글링2");

		// 질럿1이 마린 1을 공격
//		zealot1.attackMarine(marine1);
//		// 질럿1이 마린2를 죽을 때까지 공격
//		for (int i = 0; i < 17; i++) {
//			zealot1.attackMarine(marine2);
//		}

		zealot1.showInfo();
		marine1.showInfo();
		marine2.showInfo();

	}

}
