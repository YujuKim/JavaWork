package ex10;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.security.DomainCombiner;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

// **main을 가지는 클래스는 프로그램에 사용하는 참조변수를 다 알 수 있다**
public class BubbleFrame extends JFrame {

	private BubbleFrame mContext = this; // 주소값을 잠시 mContext변수에 담아둠
	private JLabel backgroundMap;
	private Player player;
	private Enemy enemy;

	public BubbleFrame() {
		initData();
		setInitLayout();
		addEventListener();

		new Thread(new BackgroundPlayerService(player)).start();
	}

	public Player getPlayer() {
		return player;

	}

	public Enemy getEnemy() {
		return enemy;
	}

	private void initData() {
		backgroundMap = new JLabel(new ImageIcon("images/backgroundMap.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(backgroundMap); // 루트 패널에 콘텐츠를 넣어줌
		setSize(1000, 640);

		// 부모의 주소값을 자식 객체에 던져준다

		player = new Player(mContext);

		// 적군 생성
		enemy = new Enemy();

	}

	private void setInitLayout() {

		setLayout(null); // 좌표 기반
		setResizable(false);
		setLocationRelativeTo(null); // JFrame 가운데 배치
		setVisible(true);
		add(player);
		add(enemy);

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
					break;
				case KeyEvent.VK_RIGHT:
					if (player.isRight() == false && player.isRightWallCrash() == false) {
						player.right();
					}

					break;

				case KeyEvent.VK_UP:

					if (!player.isUp() && !player.isDown()) {
						player.up();
					}
					break;

				case KeyEvent.VK_DOWN:
					player.down();
					break;

				case KeyEvent.VK_SPACE:
					player.attack();
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

	// **** 자바 프로그램 중 메인함수를 가지는 클래스는
	// 프로그램에서 사용하는 모든 참조값을 알 수 있다.
	public static void main(String[] args) {
		new BubbleFrame();
	} // end of main

}// end of class
