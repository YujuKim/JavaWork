package ch01;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FlowLayOutEx4 extends JFrame {

	// 멤버변수 선언
	private JButton[] buttons = new JButton[5]; // 배열 선언 방법의 이해

	// 생성자
	public FlowLayOutEx4() {
		initData();
		setInitLayout();

	}

	private void initData() {
		// JFrame의 코드들

		setTitle("배열활용");
		setSize(600, 600);
		// static변수나 static함수는 클래스 이름으로도 접근 가능!
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		for (int i = 0; i < buttons.length; i++) {
			buttons[i] = new JButton("button" + (i + 1));

		}
	}

	private void setInitLayout() {
		setLayout(new FlowLayout(FlowLayout.LEFT, 30, 30));
		for (int i = 0; i < buttons.length; i++) {

			add(buttons[i]);

		}

		setVisible(true);
	}

	// 코드테스트
	public static void main(String[] args) {
		new FlowLayOutEx4();
	}
}
