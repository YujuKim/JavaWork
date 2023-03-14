package ch05;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

//실제 DB접근해 기능을 처리하는 클래스

public class EmployeeDAO implements IEmployeeDAO {
	private DBHelper dbHelper;
	private Connection conn;
	private PreparedStatement pstmt; // Statement보다 실제로 이걸 더 많이 씀
	private ResultSet rs;

	public EmployeeDAO() {
//		dbHelper.getConnection().createStatement().execute(null)
		// DBHelper 객체를 갖고 오는 동작
		dbHelper = DBHelper.getInstance();
		// dbHelper 에서 connection 객체를 갖고 오는 동작
		conn = dbHelper.getConnection();

	} // end of constructor

	@Override
	public ArrayList<EmployeeDTO> showTitleEmpInfo(String title) {
		ArrayList<EmployeeDTO> list = new ArrayList<>();
		String sql = " SELECT e.emp_no,e.first_name,e.last_name,t.title" + " FROM employees AS e"
				+ " INNER JOIN titles AS t ON e.emp_no = t.emp_no" + " WHERE t.title = ? ";
		// preparedStatement 시작 번호는 1번부터 ''<- 생략가능. 그냥? 기반으로 사용 가능
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, title);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				EmployeeDTO dto = new EmployeeDTO();
				dto.setEmpNo(rs.getString("emp_no"));
				dto.setFirstName(rs.getString("first_name"));
				dto.setLastName(rs.getString("last_name"));
				dto.setTitle(rs.getString("title"));
				list.add(dto);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return list;
	}

	@Override
	public EmployeeDTO showTitleEmpinfo() {
		return null;
	}
}// end of class
