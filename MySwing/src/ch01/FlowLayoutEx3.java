package ch01;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

//멤버변수 선언
//배열 활용
//생성자+메서드호출
//for문 활용
//GUI프로그램 익숙해지기
public class FlowLayoutEx3 extends JFrame {

	JButton[] buttons = new JButton[4];

	private FlowLayout flowLayout;

	public FlowLayoutEx3() {
		// 초기화값 세팅, 메서드를 통해 역할 분담
		initData();
		setInitLayout();
	}

	public void initData() {
		setTitle("연습문제");
		setSize(500, 500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		for (int i = 0; i < buttons.length; i++) {
			buttons[i] = new JButton("버튼" + (i + 1));
		}

		flowLayout = new FlowLayout(FlowLayout.RIGHT, 20, 20);

	}

	public void setInitLayout() {
		setLayout(flowLayout);

		for (int i = 0; i < 4; i++) {

			add(buttons[i]);
		}

	}

	// 코드테스트
	public static void main(String[] args) {
		new FlowLayoutEx3();
	}
}
