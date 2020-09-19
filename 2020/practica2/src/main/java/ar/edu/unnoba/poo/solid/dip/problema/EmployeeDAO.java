package ar.edu.unnoba.poo.solid.dip.problema;

public class EmployeeDAO {

	private MysqlConnection driver;

	/*Que pasa cuando quiero usar otra base*/
	public EmployeeDAO(MysqlConnection driver) {
		super();
		this.driver = driver;
	}
	
	public void getEmployees() {
		Connection con = driver.getConnection();
	}
	
}
