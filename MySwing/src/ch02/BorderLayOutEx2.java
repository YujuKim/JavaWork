package ch02;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

//borderLayout -->컴포넌트를 동,서,남,북,센터로 배치
public class BorderLayOutEx2 extends JFrame {
	JButton[] buttons = new JButton[5];
	// 배열 선언과 동시에 초기화
	String[] direction = { BorderLayout.EAST, BorderLayout.WEST, BorderLayout.SOUTH, BorderLayout.NORTH,
			BorderLayout.CENTER };

	public BorderLayOutEx2() {
		initData();
		setInitLayout();
	}

	private void initData() {
		setTitle("borderlayout연습");
		setSize(600, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		for (int i = 0; i < buttons.length; i++) {
			buttons[i] = new JButton(direction[i]);
		}
	}

	private void setInitLayout() {
		// setLayout(new BorderLayout()); -->기본 레이아웃은 BorderLayout이라 생략가능
		// borderLayout-매개변수 값 하나를 더 추가할 수 있다. (방향 지정가능)
		for (int i = 0; i < buttons.length; i++) {
			add(buttons[i], direction[i]);

		}

		setVisible(true);
	}

	// 코드테스트
	public static void main(String[] args) {
		new BorderLayOutEx2();
	}// end of main
} // end of class
