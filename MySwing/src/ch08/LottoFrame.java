package ch08;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;

public class LottoFrame extends JFrame implements ActionListener {
	JButton button;
	int[] lotto = new int[6];

	public LottoFrame() {
		initData();
		setInitLayout();
		addEventListener();

	}

	private void initData() {
		setTitle("Lotto");
		setSize(600, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		button = new JButton("lotto start");

	}

	private void setInitLayout() {
		add(button, BorderLayout.NORTH);
		setVisible(true);

	}

	private void addEventListener() {
		button.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("게임 시작^▽^");
		lotto = getLottoNumber();
		repaint(); // F5같은 역할

	} 

	@Override
	public void paint(Graphics g) {

		super.paint(g);
		Font f = new Font("궁서체", Font.BOLD, 25);
		g.setFont(f);
		if (lotto[0] == 0) {
			g.drawString("로또 번호를 클릭하세요", 180, 200);
			// 게임 초기 상태(int라 null이 아니라 0이 들어가 있음)
			return;
		}
		// 코드가 여기 내려오면 버튼을 눌렀다는 것과 같은 의미이다
		// 그럼 메서드와 멤버 변수를 활용해 그림을 그릴 수 있다

		// 동작은 하지만 추천하지 않는 코드
		for (int i = 0, x = 50; i < 6; i++, x += 50) {
			g.drawString(lotto[i] + "", x, 200);

		}

	}

	public int[] getLottoNumber() {
		int[] lotto = new int[6];
		Random r = new Random();
		for (int i = 0; i < lotto.length; i++) {
			int j = r.nextInt(45) + 1;
			lotto[i] = j;
			// 중복값 확인을 위해 반복문 생성
			for (int e = 0; e < i; e++) {

				///e - 0 
				/// i - 1
				
				//lotto[i] == 10 
				// lotto[e] == 3
	
				// 조건
				if (lotto[i] == lotto[e]) {
					i = i - 1;
					break;
				}

			}

		} // end of for

		// 오름차순 정렬
		Arrays.sort(lotto);
		return lotto;
	}

//테스트코드
	public static void main(String[] args) {
		LottoFrame a = new LottoFrame();
		a.getLottoNumber();
		for (int i = 0; i < a.getLottoNumber().length; i++) {

			System.out.println(a.getLottoNumber()[i]);
		}
	} //end of main

} // end of class
