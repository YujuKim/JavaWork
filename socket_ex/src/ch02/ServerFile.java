package ch02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

// --소켓 통신 구현할 때 알아야 할 것--
// 서버 측과 클라이언트 측은 통신을 통해 데이터를 주고 받는다.
// 서버측 만들 땐 서버 소켓을 준비해야 한다.
// 소켓은 끝단에 포트 번호를 달아야 한다.
// 0 ~ 65335번까지 포트 번호를 사용할 수 있다.
// 그 중에 0 ~ 1023번 포트 번호까지는 잘 알려진 포트 번호라 가능한 사용하지 않는 것이 좋다.
public class ServerFile {
	ServerSocket serverSocket; // 서버소켓. 클라이언트 연결만 받음

	BufferedReader bufferedReader;

	Socket socket; // 실제 통신을 하는 소켓

	public ServerFile() {
		System.out.println(">> 1.서버 소켓 시작 <<");

		try {
			// 서버 소켓을 포트 번호와 함께 생성
			serverSocket = new ServerSocket(11000);
			// 누군가는 접속하기 위해 대기
			socket = serverSocket.accept(); // 클라이언트 접속 대기중
			// 클라이언트가 연결되면 통신을 담당하는 소켓을 생성(랜덤포트번호를 생성)
			System.out.println("2.클라이언트 연결 완료");

			bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));

			String getMsg = bufferedReader.readLine();

			System.out.println("서버측에서 확인: " + getMsg);
			

		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("여기에 코드가 내려 왔나요?");
	} // end of 생성자

	public static void main(String[] args) {
		new ServerFile();
	} // end of main

} // end of class
