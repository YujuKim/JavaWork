package ch04;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerTest {

	// 클라이언트로 연결 받는 소켓
	ServerSocket serverSocket;

	// 입력스트림 -소켓 담당
	BufferedReader reader;

	// 출력스트림
	BufferedWriter bufferedWriter;

	// 입력 스트림 -키보드 담당
	BufferedReader keyboardReader;

	// 실제 통신을 담당할 소켓
	Socket socket;

	public ServerTest() {
		initData();

	}

	private void initData() {
		try {
			// 서버 소켓 생성
			serverSocket = new ServerSocket(10000);

			// 클라이언트 접속 대기
			socket = serverSocket.accept(); // 클라이언트가 들어 오면 소켓 반환
			System.out.println("클라이언트 연결 완료");

			// 입력스트림 연결
			reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));

			// 키보드에 연결 스트림 준비
			keyboardReader = new BufferedReader(new InputStreamReader(System.in));

			// 클라이언트측으로 데이터 보내기 위해 출력 스트림 연결 - 대상 소켓
			bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

			// 새로운 작업자 생성해 일하라고 명령하기
			WriterThread writerThread = new WriterThread();
			// Runnable 타입을 시작 시키는 방법
			Thread thread = new Thread(writerThread);
			thread.start(); // run 메서드 안 코드가 동작

			// 데이터를 읽는 명령 -main스레드
			while (true) {
				String msg = "클라이언트에서 온 메세지: " + reader.readLine() + "\n";
				System.out.println(msg);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	} // end of initData

	// 내부 클래스 생성
	class WriterThread implements Runnable {

		// 새로운 작업자가 해야 할 일 정의
		@Override
		public void run() {
			// 키보드에서 데이터를 입력 받아
			// 소켓 출력 스트림을 통해 데이터를 보내주어야 한다
			while (true) {
				try {
					String serverMsg = "서버: " + keyboardReader.readLine();
					System.out.println("서버가 작성한 문구확인: " + serverMsg);
					// 출력 스트림 통해 데이터 보내기 -->소켓
					bufferedWriter.write(serverMsg + "\n");
					bufferedWriter.flush();

				} catch (IOException e) {

					e.printStackTrace();
				} // 키보드 데이터를 받을 수 있다.

			}

		}

	}

	public static void main(String[] args) {
		new ServerTest();

	} // end of main
} // end of class
