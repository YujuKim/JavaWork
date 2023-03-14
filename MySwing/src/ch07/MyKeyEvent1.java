package ch07;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class MyKeyEvent1 extends JFrame implements KeyListener {
	private JTextArea area;

	public MyKeyEvent1() {
		initData();
		setInitLayout();
		addEventListener();

	}

	private void initData() {
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false); // 프레임 사이즈 조절 불가
		area = new JTextArea();

	}

	private void setInitLayout() {
		add(area);
		setVisible(true);

	}

	private void addEventListener() {
		KeyListener keyListener;
		area.addKeyListener(this);
	}

	@Override
	public void keyTyped(KeyEvent e) {
		System.out.println("keyTyped: " + e.toString());

	}

	@Override
	public void keyPressed(KeyEvent e) {
		
		System.out.println("keyPressed: " + e.getKeyCode());
		if (e.getKeyCode() == KeyEvent.VK_UP) {
			area.append("위\n");

		} else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
			area.append("아래\n");

		} else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
			area.append("왼쪽\n");

		} else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
			area.append("오른쪽\n");
		}
		
	}

	@Override
	public void keyReleased(KeyEvent e) {

	}
}
