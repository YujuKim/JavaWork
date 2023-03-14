package ch07;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class MoveLabelFrame extends JFrame {
	private JLabel labelText;
	private int labelTextX;
	private int labelTextY;

	public MoveLabelFrame() {
		initData();
		setInitLayout();
		addEventListener();

	}

	private void initData() {
		setSize(800, 800);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		labelText = new JLabel("Hello world");
		labelText.setSize(100, 100);
		labelTextX = 300;
		labelTextY = 350;
	}

	private void setInitLayout() {
		setLayout(null);
		add(labelText);
		labelText.setLocation(labelTextX, labelTextY);
		setVisible(true);
	}

	private void addEventListener() {
		this.addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void keyReleased(KeyEvent e) {
				// 현재 이벤트가 일어난 시점의 x,y좌표값 확인
//				int currentX = labelText.getX();
//				int currentY = labelText.getY();

				e.getKeyCode();

				if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
					// 멤버변수를 메서드 안에서 활용할 땐 지역변수를 활용하는 게 좋다
					if (labelTextX != 700) {
						int x = labelTextX += 50;
						int y = labelTextY;
						labelText.setLocation(x, y);
					}
				} else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
					if (labelTextX != 0) {
						int x = labelTextX -= 50;
						int y = labelTextY;

						labelText.setLocation(x, y);
					}
				} else if (e.getKeyCode() == KeyEvent.VK_UP) {
					if (labelTextY != 0) {
						int x = labelTextX;
						int y = labelTextY -= 50;

						labelText.setLocation(x, y);
					}
				} else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
					if (labelTextY != 700) {

						int x = labelTextX;
						int y = labelTextY += 50;

						labelText.setLocation(x, y);
					}
				}
			}

			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub

			}
		});

	}
}
