package ch10;

import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

import ch10.AmongUsFrame.CustomPanel;

public class AmongUsFrame2 extends JFrame {

	BufferedImage backgroundMap;
	BufferedImage pinkImage1;
	BufferedImage grayImage1;
	CustomPanel customPanel;
	
	int pinkX = 200;
	int pinkY = 200;
	int grayX = -20;
	int grayY = 400;

	public AmongUsFrame2() {
		initData();
		setInitLayout();
		addEventListener();

	}

	private void initData() {
		setTitle("어몽어스");
		setSize(600, 600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		try {
			backgroundMap = ImageIO.read(new File("images/backgroundmap.jpg"));
			pinkImage1 = ImageIO.read(new File("images/pink_image1.png"));
			grayImage1 = ImageIO.read(new File("images/gray_image1.png"));

		} catch (Exception e) {
			System.out.println("이미지를 찾을 수 없습니다.");
		}
		customPanel = new CustomPanel();

	}

	private void setInitLayout() {
		

	}

	private void addEventListener() {

	}
	
	class CustomPanel extends JPanel implements Runnable{

		@Override
		public void run() {
			
		}
		
	}

}
