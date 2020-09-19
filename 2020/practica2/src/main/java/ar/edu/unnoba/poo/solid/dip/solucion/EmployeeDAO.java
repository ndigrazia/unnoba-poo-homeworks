package ar.edu.unnoba.poo.solid.dip.solucion;

public class EmployeeDAO {

	private DriverConnection driver;

	public EmployeeDAO(DriverConnection driver) {
		super();
		this.driver = driver;
		
	}
	
	public void getEmployees() {
		Connection con = driver.getConnection();
	}
}
