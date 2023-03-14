package ch08;

public class CompanyMainTest {

	public static void main(String[] args) {

		Company company = Company.getInstance();
		System.out.println(company);
		Company company2 = Company.getInstance();
		Company company3 = Company.getInstance();
		System.out.println(company2);
		System.out.println(company3);

	}

}
