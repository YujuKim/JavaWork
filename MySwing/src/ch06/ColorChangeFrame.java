package ch06;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ColorChangeFrame extends JFrame implements ActionListener {
	// 이벤트 리스너에 대한 개념을 알자

	// 멤버 변수
	private JButton button1;
	private JButton button2;
	private JButton button3;
	

	// 생성자
	public ColorChangeFrame() {
		initData();
		setInitLayout();
		addEventListener();

	}

	private void initData() {
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		button1 = new JButton("click 1");
		button2 = new JButton("click 2");
		button3 = new JButton("click 3");
	}

	private void setInitLayout() {
		setLayout(new FlowLayout());
		add(button1);
		add(button2);
		add(button3);
		setVisible(true);
	}

	private void addEventListener() {
		ActionListener actionListener;
		// 이벤트 리스너 등록
		// ColorChangeFrame은 다형성이 적용되어
		// ActionListener타입으로도 바라볼 수 있다
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);

	}

	// 코드 테스트
	public static void main(String[] args) {
		new ColorChangeFrame();

	} // end of main

	// 버튼을 누르면 actionPerformed 호출되어짐 by 운영체제 not 개발자
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("actionPerformed 메소드 호출 됨");
		System.out.println(e.toString());
		

	}
} // end of class
