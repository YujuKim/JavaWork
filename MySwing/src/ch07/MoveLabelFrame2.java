package ch07;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class MoveLabelFrame2 extends JFrame implements Moveable {
	private JLabel labelText;
	private int labelTextX;
	private int labelTextY;

	public MoveLabelFrame2() {
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

				e.getKeyCode();

				if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
					right();

				} else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
					left();
				} else if (e.getKeyCode() == KeyEvent.VK_UP) {
					up();
				} else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
					down();
				}

			}

			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub

			}
		});

	}

	@Override
	public void left() {
		if (labelTextX != 0) {
			labelText.setLocation(labelTextX -= 50, labelTextY);
		}
	}

	@Override
	public void right() {
		if (labelTextX != 700) {
			labelText.setLocation(labelTextX += 50, labelTextY);
		}
	}

	@Override
	public void up() {
		if (labelTextY != 0) {
			labelText.setLocation(labelTextX, labelTextY -= 50);
		}
	}

	@Override
	public void down() {
		if (labelTextY != 700) {
			labelText.setLocation(labelTextX, labelTextY += 50);
		}
	}
}
