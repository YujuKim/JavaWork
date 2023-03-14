package ch02;

import javax.swing.JButton;
import javax.swing.JFrame;

// 좌표 기반으로 컴포넌트 배치해보기
public class NoLayoutEx1 extends JFrame {
	private JButton button1;
	private JButton button2;
	private JButton button3;

	public NoLayoutEx1() {
		initData();
		setInitLayout();
	}

	private void initData() {
		setTitle("좌표기반 연습");
		setSize(600, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 좌표기반 세팅을 하면 각 컴포넌트의 크기를 지정해주어야 한다. 기본값은 0
		button1 = new JButton("button1");
		button1.setSize(100, 100);
		button2 = new JButton("button2");
		button2.setSize(150, 50);
		button3 = new JButton("button3");
		button3.setSize(200, 30);

	}

	private void setInitLayout() {
		setLayout(null); // null을 주면 좌표기반으로 컴포넌트를 배치해야 한다
		button1.setLocation(100, 100);
		button2.setLocation(200, 150);
		button3.setLocation(350, 170);
		add(button1);
		add(button2);
		add(button3);
		setVisible(true);

	}

	// 코드테스트
	public static void main(String[] args) {
		new NoLayoutEx1();
	} // end of main
} // end of class
