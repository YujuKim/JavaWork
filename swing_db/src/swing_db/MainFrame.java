package swing_db;

import javax.swing.JFrame;

public class MainFrame extends JFrame{
	public MainFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(600, 600);
		setVisible(true);
	}
	public static void main(String[] args) {
		new MainFrame();
	}
}
