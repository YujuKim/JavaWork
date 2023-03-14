package ch1111;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class EventTest2 extends JFrame implements ActionListener {
	private JButton button;
	private JLabel label;
	int counter = 0;

	// 생성자
		public EventTest2() {
		this.setSize(400, 150);
		this.setTitle("이벤트 예제");

		JPanel panel = new JPanel();
		button = new JButton("증가");
		label = new JLabel("현재의 카운터값: " + counter);
		button.addActionListener(this);
		panel.add(label);
		panel.add(button);
		add(panel);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		counter++;
		label.setText("현재의 카운터값: " + counter);

	}

	// 코드테스트
	public static void main(String[] args) {
		EventTest2 t = new EventTest2();
	}

}// end of class
