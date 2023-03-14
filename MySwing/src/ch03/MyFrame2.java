package ch03;

import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

import ch03.MyFrame1.MyDrawPanel;

// 내부 클래스 활용해
// JPanel을 상속 받고 paint메서드로 집 그림 그리기
public class MyFrame2 extends JFrame {
	// 멤버변수 선언
	JPanel jPanel;
	DrawPanel MydrawPanel;

	class DrawPanel extends JPanel {
		@Override
		public void paint(Graphics g) {
			super.paint(g);
			g.drawRect(150, 100, 300, 400);
			g.drawRect(200,150,50,50);
			g.drawRect(280,150,50,50);
			g.drawRect(300,150,50,50);
			g.drawRect(200,250,50,50);
			g.drawRect(280,250,50,50);
			g.drawRect(300,250,50,50);
			g.drawRect(350,350,80,140);
			g.drawOval(410,420,10,10);
			g.drawString("👤👤",300,200);
			g.drawString("👤",300,300);
			g.drawLine(40,70,220,70);
			g.drawString("☆ Home Sweet Home ☆",60,60);
			
		}

	}

	// 생성자
	public MyFrame2() {
		initData();
		setInitLayout();

	}

	private void initData() {
		setTitle("집짓기");
		setSize(600, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		MydrawPanel = new DrawPanel();
	}

	private void setInitLayout() {
		add(MydrawPanel);
		setVisible(true);

	}

} // end of class
