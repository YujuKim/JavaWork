package ch02;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

//borderLayout -->컴포넌트를 동,서,남,북,센터로 배치
public class BorderLayOutEx1 extends JFrame {
	JButton button1 = new JButton("동");
	JButton button2 = new JButton("서");
	JButton button3 = new JButton("남");
	JButton button4 = new JButton("북");
	JButton button5 = new JButton("센터");

	public BorderLayOutEx1() {
		initData();
		setInitLayout();
	}

	private void initData() {
		setTitle("borderlayout연습");
		setSize(600, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	private void setInitLayout() {
		// setLayout(new BorderLayout()); -->기본 레이아웃은 BorderLayout이라 생략가능
		// borderLayout-매개변수 값 하나를 더 추가할 수 있다. (방향 지정가능)
		add(button1, BorderLayout.EAST);
		add(button2, BorderLayout.WEST);
		add(button3, BorderLayout.SOUTH);
		add(button4, BorderLayout.NORTH);
		add(button5, BorderLayout.CENTER);

		setVisible(true);
	}

	// 코드테스트
	public static void main(String[] args) {
		new BorderLayOutEx1();
	}// end of main
} // end of class
