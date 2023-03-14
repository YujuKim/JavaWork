package ch02;

import javax.swing.JButton;
import javax.swing.JFrame;

// 좌표 기반으로 컴포넌트 배치해보기
public class NoLayoutEx2 extends JFrame {
//	JButton[] buttons = new JButton[5];
	private JButton button1;
	private JButton button2;
	private JButton button3;
	private JButton button4;
	private JButton button5;

	public NoLayoutEx2() {
		initData();
		setInitLayout();
	}

	private void initData() {
		setTitle("좌표기반 연습2");
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		button1 = new JButton("🍕🍕");
		button2 = new JButton("🍦🍦");
		button3 = new JButton("🍩🍩");
		button4 = new JButton("🍗🍗");
		button5 = new JButton("🌭🌭");
		button1.setSize(100, 100);
		button2.setSize(100, 120);
		button3.setSize(100, 140);
		button4.setSize(100, 160);
		button5.setSize(100, 180);
		

	}

	private void setInitLayout() {
		setLayout(null);
		add(button1);
		add(button2);
		add(button3);
		add(button4);
		add(button5);
		button1.setLocation(20, 50);
		button2.setLocation(120, 50);
		button3.setLocation(220, 50);
		button4.setLocation(320, 50);
		button5.setLocation(420, 50);
		setVisible(true);

	}

	// 코드테스트
	public static void main(String[] args) {
		new NoLayoutEx2();

	} // end of main
} // end of class
