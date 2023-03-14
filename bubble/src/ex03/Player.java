package ex03;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Player extends JLabel implements Moveable {
	private int x;
	private int y;
	private ImageIcon playerR, playerL;
	// 플레이어의 현재 움직임 상태를 기록해야 컨트롤 할 수 있다
	private boolean left;
	private boolean right;
	private boolean up;
	private boolean down;

	// 플레이어의 속도 상태
	private final int SPEED = 4;
	private final int JUMPSPEED = 2;

	// 플레이어의 벽 충돌 여부
	private boolean leftWallCrash;
	private boolean rightWallCrash;

	public Player() {
		initData();
		setInitLayout();

	}

	// setter메서드 만들기 left, right
	public void setLeft(boolean left) {
		this.left = left;
	}

	public void setRight(boolean right) {
		this.right = right;
	}

	// getter 메서드 추가 left, right, isLeftWallCrash추가 isRightWallCrash추가

	public boolean isLeftWallCrash() {
		return leftWallCrash;
	}

	public void setLeftWallCrash(boolean leftWallCrash) {
		this.leftWallCrash = leftWallCrash;
	}

	public boolean isRightWallCrash() {
		return rightWallCrash;
	}

	public void setRightWallCrash(boolean rightWallCrash) {
		this.rightWallCrash = rightWallCrash;
	}

	public boolean isLeft() {
		return left;
	}

	public boolean isRight() {
		return right;
	}

	private void initData() {
		playerR = new ImageIcon("images/playerR.png");
		playerL = new ImageIcon("images/playerL.png");
		left = false;
		right = false;
		up = false;
		down = false;
		leftWallCrash = false;
		rightWallCrash = false;

	}

	private void setInitLayout() {
		x = 500;
		y = 535;
		// 좌표위치, 라벨의 크기를 지정해야 한다
		setSize(50, 50);
		setLocation(x, y);
		// JLabel에 아이콘을 세팅하는 메서드
		setIcon(playerR);
	}

	@Override
	public void left() {
		left = true;
		// 한 번 왼쪽 방향키를 누르면 스레드 생성
		new Thread(new Runnable() {

			@Override
			public void run() {
				while (left) {
					setIcon(playerL);
					x = x - SPEED;
					setLocation(x, y);

					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {

						e.printStackTrace();
					}

				} // end of while

			}
		}).start();

	}

	@Override
	public void right() {
		right = true;
		new Thread(new Runnable() {

			@Override
			public void run() {
				while (right) {
					setIcon(playerR);
					x = x + SPEED;
					setLocation(x, y);
					try {
						Thread.sleep(10);
					} catch (InterruptedException e) {

						e.printStackTrace();
					}
				}

			}
		}).start();

	}

	@Override
	public void up() {
		System.out.println("점프!");
		up = true;
		new Thread(new Runnable() {

			@Override
			public void run() {
				// 65
				// -2
				for (int i = 0; i < 130 / JUMPSPEED; i++) {
					y = y - JUMPSPEED;
					setLocation(x, y);
					try {
						Thread.sleep(5);
					} catch (InterruptedException e) {

						e.printStackTrace();
					}
				} // end of for

				up = false;
				down();

			}
		}).start();

	}

	@Override
	public void down() {
		down = true;
		new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 130 / JUMPSPEED; i++) {
					y = y + JUMPSPEED;
					setLocation(x, y);
					try {
						Thread.sleep(3);
					} catch (InterruptedException e) {

						e.printStackTrace();
					}
				}
				down = false;
				// 상태값 다룰 때는 상황이 변하면 초기화 처리를 잘 해줘야 한다
			}
		}).start();

	}

}
