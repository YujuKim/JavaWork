package ex03;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.security.DomainCombiner;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class BubbleFrame extends JFrame {
	private JLabel backgroundMap;
	private Player player;

	public BubbleFrame() {
		initData();
		setInitLayout();
		addEventListener();

		new Thread(new BackgroundPlayerService(player)).start();
	}

	private void initData() {
		backgroundMap = new JLabel(new ImageIcon("images/backgroundMapService.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(backgroundMap); // 루트 패널에 콘텐츠를 넣어줌
		setSize(1000, 640);
		player = new Player();

	}

	private void setInitLayout() {

		setLayout(null); // 좌표 기반
		setResizable(false);
		setLocationRelativeTo(null); // JFrame 가운데 배치
		setVisible(true);
		add(player);

	}

	private void addEventListener() {
		this.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				switch (e.getKeyCode()) {
				case KeyEvent.VK_LEFT:
					// 여러 번 눌러도 한 번만 호출 되게 방어적 코드 작성
					if (player.isLeft() == false && player.isLeftWallCrash() == false) {
						player.left();
					}
					player.left();

					break;
				case KeyEvent.VK_RIGHT:
					if (player.isRight() == false && player.isRightWallCrash() == false) {
						player.right();
					}
					player.right();
					break;

				case KeyEvent.VK_UP:
					player.up();
					break;

				case KeyEvent.VK_DOWN:
					player.down();
					break;
				}
			} // end of pressed

			@Override
			public void keyReleased(KeyEvent e) {
				switch (e.getKeyCode()) {
				case KeyEvent.VK_LEFT:
					// 왼쪽 버튼을 떼면 멈추기
					player.setLeft(false);

					break;

				case KeyEvent.VK_RIGHT:
					// 오른쪽 버튼을 떼면 멈추기
					player.setRight(false);
					break;
				}

			}
		});

	}

	public static void main(String[] args) {
		new BubbleFrame();
	} // end of main

}// end of class
