package ex07;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

// 메인스레드는 지금 화면에 그림을 그려주고 있는 동시에 키보드 이벤트 리스너를 받고 있어 바쁘다.
// 백그라운드에서 계속 Player의 움직임을 관찰하는 기능을 주고자 한다.
public class BackgroundPlayerService implements Runnable {
	private BufferedImage image;
	private Player player;

	public BackgroundPlayerService(Player player) {
		this.player = player;
		try {
			image = ImageIO.read(new File("images/backgroundMapService.png"));
		} catch (IOException e) {
			System.out.println("백그라운드플레이어서비스 객체에 사용하는 이미지 경로 및 파일명 확인!");
		}

	}

	@Override
	public void run() {
		while (true) {
			// 색상 확인
			// 왼쪽으로 갈 땐 좌표 지점을 보정해야 하고
			// 오른쪽으로 갈 땐 역시나 기준 좌표 지점을 보정해야 한다
			// 기준 왼쪽, 오른쪽
			Color leftColor = new Color(image.getRGB(player.getX(), player.getY() + 25));
			Color rightColor = new Color(image.getRGB(player.getX() + 60, player.getY() + 25));

			// 바닥 충돌 감지
//			Color bottomColorLeft = new Color(image.getRGB(player.getX() + 10, player.getY() + 60));
			int bottomColorLeft = image.getRGB(player.getX() + 20, player.getY() + 55);

			int bottomColorRight = image.getRGB(player.getX() + 40, player.getY() + 55);
			// 하얀색이 아니면 바닥이다
			if (bottomColorLeft + bottomColorRight != -2) {
//				System.out.println("여기는 바닥입니다.");
				player.setDown(false);

			} else {
				// 방향키 위를 누르면 65번 반복하며 y값을 -해서 이미지를 위로 올리고 있다
				// 현재 y좌표에서 좌표 +130하고 down()메서드 호출
				// 올라가는 동시에 위 + 위 + 위를 누르면 계속 스레드가 생성돼
				if (player.isUp() == false && player.isDown() == false) {
					// 다운메서드가 한 번 호출 되어야 한다.
					player.down();
				}
			}

			if (rightColor.getRed() == 255 && rightColor.getGreen() == 0 && rightColor.getBlue() == 0) {
				player.setRight(false);
				player.setRightWallCrash(true);

			} else if (leftColor.getRed() == 255 && leftColor.getGreen() == 0 && leftColor.getBlue() == 0) {
				player.setLeft(false);
				player.setLeftWallCrash(true);

			} else {
				player.setLeftWallCrash(false);
				player.setRightWallCrash(false);
			}
			try {
				Thread.sleep(3);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}
}
