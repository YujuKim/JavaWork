package ch05;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBHelper {

	private static final String DB_HOST = "localhost";
	private static final String DB_PORT = "3306";
	private static final String DB_DATA_BASE_NAME = "myblog";
	private static final String DB_CHARSET = "UTF-8";
	private static final String DB_USER = "bloguser";
	private static final String DB_PASSWORD = "1q2w3e4r5t";

	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	// 싱글톤 패턴 객체 만들기
	// 1단계
	private static DBHelper dbHelper;

	// 2단계
	private DBHelper() {
	}

	// 3단계
	public static DBHelper getInstance() {
		if (dbHelper == null) {
			dbHelper = new DBHelper();
		}
		return dbHelper;
	}

	public Connection getConnection() {
		if (conn == null) {
			String urlFormat = "jdbc:mysql://%s:%s/%s?serverTimezone=Asia/Seoul&characterEncoding=%s";
			// "jdbc:mysql://localhost:3306/employees?serverTimezone=Asia/Seoul&characterEncoding=UTF-8"
			String url = String.format(urlFormat, DB_HOST, DB_PORT, DB_DATA_BASE_NAME, DB_CHARSET);
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				try {
					conn = DriverManager.getConnection(url, DB_USER, DB_PASSWORD);
					System.out.println("Connection Success");
				} catch (Exception e) {
					e.printStackTrace();
					try {
						conn.close();
					} catch (Exception e2) {
						e2.printStackTrace();
					}
				}
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} // 동적 로딩
		}

		return conn;

	}

	public void closeConnection() {
		if (conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

} // end of class
