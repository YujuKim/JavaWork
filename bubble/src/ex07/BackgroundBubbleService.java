package ex07;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

//주의!
//얘는 스레드가 아님!
//메서드 호출 시키기!
public class BackgroundBubbleService {
	private BufferedImage image;
	private Bubble bubble;

	public BackgroundBubbleService(Bubble bubble) {
		this.bubble = bubble;
		try {
			image = ImageIO.read(new File("images/backgroundMapService.png"));
		} catch (IOException e) {
			System.out.println("파일 경로를 확인해 주세요!");
			e.printStackTrace();
		}

	}

	public boolean leftWall() {
		// RGB값을 int값으로 확인
		Color leftColor = new Color(image.getRGB(bubble.getX()+10, bubble.getY()));
		if (leftColor.getRed() == 255 && leftColor.getGreen() == 0 && leftColor.getBlue() == 0) {
			// 빨간색이면 (왼쪽 벽에 부딪히면)
			return true;

		}

		return false;
	}

	public boolean rightWall() {
		Color rightColor = new Color(image.getRGB(bubble.getX()+60, bubble.getY()));
		if (rightColor.getRed() == 255 && rightColor.getGreen() == 0 && rightColor.getBlue() == 0) {

			return true;

		}
		return false;
	}

	public boolean topWall() {
		Color topColor = new Color(image.getRGB(bubble.getX()+25, bubble.getY()));
		if (topColor.getRed() == 255 && topColor.getGreen() == 0 && topColor.getBlue() == 0) {

			return true;
		}
		return false;
	}
}
