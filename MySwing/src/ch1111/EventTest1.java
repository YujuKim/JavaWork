package ch1111;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class EventTest1 extends JFrame {
	private JButton button;
	private JLabel label;
	int counter = 0;

	class MyListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			counter++;
			label.setText("현재의 카운터값: " + counter);
		}
	}

	// 생성자
	public EventTest1() {
		setSize(400, 150);
		setTitle("이벤트 예제");
		setLayout(new FlowLayout());
		button = new JButton("증가");
		label = new JLabel("현재의 카운터값: " + counter);
		button.addActionListener(new MyListener());
		add(label, "Center");
		add(button, "East");
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

	}
	
	//코드테스트
	public static void main(String[] args) {
		EventTest1 t= new EventTest1();
	}

}// end of class
