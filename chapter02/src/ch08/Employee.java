package ch08;

//static변수와 멤버변수의 활용
public class Employee {
	public static int serialNum;
	private int employeeId;
	private String name;
	private String department;

	// 생성자
	public Employee() {
		serialNum++;
		employeeId = serialNum;
	}

	// getter와 setter(alt + shift + S -> Generate getters/setters)
	public int getEmployeeId() {
		return employeeId;
	}

	public static int getSerialNum() {
		return serialNum;
	}

	public static void setSerialNum(int serialNum) {
		Employee.serialNum = serialNum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
}
