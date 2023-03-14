package ch09;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.EventListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class LottoFrame2 extends JFrame {

	JButton button;
	LottoRandomNumber2 RandomNumbers;
	boolean isStart = false;

	public LottoFrame2() {
		initData();
		setInitLayout();
		addEventListener();

	}

	private void initData() {
		setTitle("로또번호");
		setSize(600, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		button = new JButton("번호 뽑기");
		RandomNumbers = new LottoRandomNumber2();

	}

	private void setInitLayout() {
		add(button, BorderLayout.SOUTH);
		setVisible(true);

	}

	@Override
	public void paint(Graphics g) {
		super.paint(g);
		if (isStart == false) {
			g.drawString("시작해 주세요", 250, 150);
			return;
		}
		int[] getNumbers = RandomNumbers.createLottoNumber();
		g.drawString(getNumbers[0] + "", 50, 150);
		g.drawString(getNumbers[1] + "", 150, 150);
		g.drawString(getNumbers[2] + "", 250, 150);
		g.drawString(getNumbers[3] + "", 350, 150);
		g.drawString(getNumbers[4] + "", 450, 150);
		g.drawString(getNumbers[5] + "", 550, 150);

	}

	private void addEventListener() {
		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				isStart = true;
				repaint();

			}
		});

	}
}// end of class
