package ch04;

public class GameTest {

	public static void main(String[] args) {
		Wizard wizard1 = new Wizard("마수리", 20, 100);
		wizard1.showinfo();
		System.out.println("---------------------");
		wizard1.attack(300);
		wizard1.damage(1);
		wizard1.run(10);
		wizard1.recover(2);
		wizard1.restpower();

	}

}
