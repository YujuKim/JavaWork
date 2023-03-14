package ch01;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

// 1단계 JButton 2개 생성
// 배치관리자 FlowLayout 멤버변수로 선언
// 화면에 component 그리기
public class FlowLayoutEx2 extends JFrame {

	private JButton button1;
	private JButton button2;

	
	private FlowLayout flowLayout;


	public FlowLayoutEx2() {
		// 초기화값 세팅, 메서드를 통해 역할 분담
		initData();
		setInitLayout();
	}

	public void initData() {
		setTitle("연습문제");
		setSize(500, 500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		button1 = new JButton("button1");
		button2 = new JButton("button2");
		flowLayout = new FlowLayout(FlowLayout.RIGHT,20,20);

	}

	public void setInitLayout() {
		setLayout(flowLayout);
		add(button1);
		add(button2);

	}

	// 코드테스트
	public static void main(String[] args) {
		new FlowLayoutEx2();
	}
}
