package ch10;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class AmongUsFrame extends JFrame implements KeyListener {
	// 필요한 것
	// 배경 이미지
	BufferedImage backgroundMap;
	// 캐릭터 어몽어스 이미지 1
	BufferedImage pinkImage1;
	// 캐릭터 어몽어스 이미지 1 (적군)
	BufferedImage grayImage1;
	// jpanel 상속 --> inner class로
	CustomPanel customPanel;

	int pinkX = 200;
	int pinkY = 200;
	int grayX = -20;
	int grayY = 400;

	public AmongUsFrame() {
		initData();
		setInitLayout();
		addEventListener();
//		Thread thread = new Thread(customPanel);
//		thread.start();
		new Thread(customPanel).start();
	}

	private void initData() {
		setTitle("미니어몽어스");
		setSize(600, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 이미지 3개 , CustomPanel있다
		try {
			backgroundMap = ImageIO.read(new File("images/backgroundmap.jpg"));
			pinkImage1 = ImageIO.read(new File("images/pink_image1.png"));
			grayImage1 = ImageIO.read(new File("images/gray.png"));
		} catch (IOException e) {
			System.out.println("이미지를 찾을 수 없습니다.");
			e.printStackTrace();
		}
		// CustomPanel이 메모리에 올라가는 순간 paintComponent() 메서드도 호출
		customPanel = new CustomPanel();

	}

	private void setInitLayout() {
		add(customPanel); // add 호출시 paintComponent메서드 실행됨
		setVisible(true);

	}

	private void addEventListener() {
		this.addKeyListener(this); // 이벤트 리스너 등록 처리

	}

	class CustomPanel extends JPanel implements Runnable {
//		boolean isRight = true;

		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(backgroundMap, 0, 0, getWidth(), getHeight(), null);
			g.drawImage(pinkImage1, pinkX, pinkY, 100, 100, null);
			g.drawImage(grayImage1, grayX, grayY, 100, 100, null);
		}

		@Override
		public void run() {
			boolean isRight = true;
			System.out.println("1");

			while (true) {
				if (isRight) {
					grayX += 10;

				} else {
					grayX -= 10;
				}
				// 방향체크
				if (grayX == 500) {
					isRight = false;
				}
				if (grayX == -20) {
					isRight = true;
				}
				if (pinkX == grayX && pinkY == grayY) {
					System.out.println("충돌이 일어났습니다.");
					pinkImage1 = null;
					break;

				}
				try {
					Thread.sleep(30);
				} catch (InterruptedException e) {

					e.printStackTrace();
				}
				repaint();

			}

		}
	} // end of inner class

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {
		int KeyCode = e.getKeyCode();
//		System.out.println("keyCode: " + KeyCode);
		if (KeyCode == KeyEvent.VK_LEFT) {
			pinkX = (pinkX < 0) ? pinkX : pinkX - 10; // 삼항 연산자로 벽 막기
//			pinkX -= 10;

		} else if (KeyCode == KeyEvent.VK_RIGHT) {
			pinkX = (pinkX >= 500) ? 500 : pinkX + 10;
//			pinkX += 10;

		} else if (KeyCode == KeyEvent.VK_UP) {
			pinkY = (pinkY < 0) ? pinkY : pinkY - 10;
//			pinkY -= 10;

		} else if (KeyCode == KeyEvent.VK_DOWN) {
			pinkY = (pinkY >= 500) ? pinkY : pinkY + 10;
		}

		// 그림을 다시 그려 주라 실행
//		repaint();
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

}// end of outer class
