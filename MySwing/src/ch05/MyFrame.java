package ch05;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;


// 그림 위에 그림 올리기
// JLabel 활용해 이미지 겹치기 
public class MyFrame extends JFrame {
	private JLabel backgroundMap;
	private JLabel player;

	public MyFrame() {
		initData();
		setInitLayout();
	}

	private void initData() {
		setTitle("이미지 겹치기 연습");
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Icon icon = new ImageIcon("background3.jpg");
		backgroundMap = new JLabel(icon);
		backgroundMap.setSize(500, 500);
		player = new JLabel(new ImageIcon("image3.png"));
		player.setSize(200, 200);

	}

	private void setInitLayout() {
		backgroundMap.setLocation(0, 0);
		player.setLocation(200, 200);
		add(player);
		add(backgroundMap);
		setLayout(null);
		setVisible(true);

	}
}
