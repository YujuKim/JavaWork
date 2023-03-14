package ch05;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientTest2 {

	Socket socket;
	final String IP = "localhost";
	final int PORT = 10000;
	BufferedReader keyboardReader;
	BufferedWriter writer;
	BufferedReader socketReader;

	public ClientTest2() {
		initData();

	}

	private void initData() {
		System.out.println("클라이언트에서 서버 접속 요청");
		try {
			socket = new Socket(IP, PORT);
			keyboardReader = new BufferedReader(new InputStreamReader(System.in));
			writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			socketReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));

			new Thread(new ReadThread()).start();
			while (true) {
				System.out.println("키보드 입력 대기");
				String input = keyboardReader.readLine();
				writer.write(input);
				writer.newLine();
				writer.flush();
			}
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	} // end of initData

	class ReadThread implements Runnable {

		@Override
		public void run() {
			while (true) {
				String serverMsg;
				try {
					serverMsg = socketReader.readLine();
					System.out.println("서버>>> " + serverMsg);
				} catch (IOException e) {

					e.printStackTrace();
				}
			}

		}

	}

	public static void main(String[] args) {
		new ClientTest();
	}

} // end of class
