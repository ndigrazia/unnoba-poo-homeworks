package ar.edu.unnoba.poo.MMXIX.practica2.eje2;

public class FactoryMethodPatterns {

	public static void main(String[] args) {
		DriverManager driver = DriverManagerFactory.getDriverManager(DriverManagerFactory.ORACLE_NAME);
		driver.getConnection();		
	}

}
