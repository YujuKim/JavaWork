package ch06;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ColorChange2 extends JFrame implements ActionListener {

	private JPanel panel1;
	private JButton[] buttons = new JButton[7];

	public ColorChange2() {
		initData();
		setInitLayout();
		addEventListener();

	}

	private void initData() {
		setSize(600, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel1 = new JPanel();
		buttons[0] = new JButton("click1");
		buttons[1] = new JButton("click2");
		buttons[2] = new JButton("click3");
		buttons[3] = new JButton("click4");
		buttons[4] = new JButton("click5");
		buttons[5] = new JButton("click6");
		buttons[6] = new JButton("click7");

	}

	private void setInitLayout() {
		// Frame의 레이아웃은 기본(border)
		add(panel1);

		panel1.add(buttons[0]);
		panel1.add(buttons[1]);
		panel1.add(buttons[2]);
		panel1.add(buttons[3]);
		panel1.add(buttons[4]);
		panel1.add(buttons[5]);
		panel1.add(buttons[6]);

		setVisible(true);

	}

	private void addEventListener() {
		// this -> ColorChange. 따라서 ActionListener타입으로 바라볼 수 있다
		buttons[0].addActionListener(this);
		buttons[1].addActionListener(this);
		buttons[2].addActionListener(this);
		buttons[3].addActionListener(this);
		buttons[4].addActionListener(this);
		buttons[5].addActionListener(this);
		buttons[6].addActionListener(this);

	}

	// 테스트코드
	public static void main(String[] args) {
		new ColorChange2();

	}// end of main

	// ActionListener에 약속된 메서드(인터페이스)
	// 이벤트가 일어나면 운영체제가 actionPerformed메서드를 호출
	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == this.buttons[0]) {
			panel1.setBackground(Color.red);
		} else if (e.getSource() == this.buttons[1]) {
			panel1.setBackground(Color.orange);

		} else if (e.getSource() == this.buttons[2]) {
			panel1.setBackground(Color.yellow);

		} else if (e.getSource() == this.buttons[3]) {
			panel1.setBackground(Color.green);

		} else if (e.getSource() == this.buttons[4]) {
			panel1.setBackground(Color.blue);
		} else if (e.getSource() == this.buttons[5]) {
			panel1.setBackground(Color.PINK);
		} else if (e.getSource() == this.buttons[6]) {
			panel1.setBackground(Color.black);
		}

	}

}// end of class
