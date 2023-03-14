package ch03;

import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

// 내부 클래스, 외부 클래스

// 내부 클래스 MyDrawPanel이 있어서 외부 클래스가 됨
public class MyFrame1 extends JFrame {

	JPanel jPanel;
	MyDrawPanel drawPanel; // 멤버변수 선언

	// 내부 클래스 선언
	// 내부 클래스- 정적 클래스,인스턴스 클래스
	// 정적(static)--> new하지 않아도 접근 가능, 클래스이름으로 접근 가능
	// 인스턴스--> 외부 클래스가 new생성해야함, 내부 클래스도 new해야 한다
	class MyDrawPanel extends JPanel {
		@Override
		public void paint(Graphics g) {
			super.paint(g);
			g.drawRect(100, 100, 100, 200); // 사각형
			g.drawRect(100, 50, 50, 50);
			g.drawString("반가워", 300, 300); // 문자입력
			g.drawLine(250, 300, 500, 550); // 선
			g.drawOval(300, 300, 50, 50); // 원형
		}
	}

	public MyFrame1() {
		initData();
		setInitLayout();

	}

	private void initData() {
		setTitle("내부클래스란");
		setSize(600, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		drawPanel = new MyDrawPanel();

	}

	private void setInitLayout() {
		add(drawPanel);
		setVisible(true);
	}

} // end of class
