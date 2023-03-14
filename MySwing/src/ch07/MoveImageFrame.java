package ch07;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MoveImageFrame extends JFrame implements Moveable {
	private JLabel ImageLabel;
	private int ImageLabelX;
	private int ImageLabelY;

	public MoveImageFrame() {
		initData();
		setInitLayout();
		addEventListener();

	}

	private void initData() {
		setTitle("이미지 이동");
		setSize(800, 800);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ImageLabel = new ImageLabel();
		ImageLabel.setSize(100, 100);
		ImageLabelX = 0;
		ImageLabelY = 0;

	}

	private void setInitLayout() {
		add(ImageLabel);
		ImageLabel.setLocation(ImageLabelX, ImageLabelY);
		setVisible(true);
	}

	private void addEventListener() {
		this.addKeyListener(new KeyListener() {

			@Override
			public void keyPressed(KeyEvent e) {
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
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub

			}
		});
	}

// 내부 클래스
	static class ImageLabel extends JLabel {
		private Image image;

		public ImageLabel() {
			image = new ImageIcon("image5.png").getImage();

		}

		@Override
		public void paint(Graphics g) {

			super.paint(g);
			g.drawImage(image, 10, 10, 100, 100, null);
		}

	} // end of inner class

	@Override
	public void left() {
		if (ImageLabelX != 0) {
			ImageLabel.setLocation(ImageLabelX -= 10, ImageLabelY);
		}

	}

	@Override
	public void right() {
		if (ImageLabelX != 650) {
			ImageLabel.setLocation(ImageLabelX += 10, ImageLabelY);
		}

	}

	@Override
	public void up() {
		if (ImageLabelY != 0) {
			ImageLabel.setLocation(ImageLabelX, ImageLabelY -= 10);
		}

	}

	@Override
	public void down() {
		if (ImageLabelY != 650) {
			ImageLabel.setLocation(ImageLabelX, ImageLabelY += 10);
		}

	}

} // end of outer class
