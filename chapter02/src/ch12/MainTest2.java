package ch12;

public class MainTest2 {
	public static void main(String[] args) {
		
		Computer greencomputer = new DeskTop();
		Computer greenlaptop = new MyNoteBook();
		
		greencomputer.display();
		greenlaptop.display();
		greenlaptop.typing();
		
	}
	

}
