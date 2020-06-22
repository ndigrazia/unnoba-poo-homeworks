package ar.edu.unnoba.poo.MMXIX.practica2.eje2;

public class DriverManagerFactory {
	
	public static final String MYSQL_NAME = "com.mysql.jdbc.Driver";
	public static final String ORACLE_NAME = "oracle.jdbc.driver.OracleDriver";
	
	public static final DriverManager getDriverManager(String name) {
		if (name.equalsIgnoreCase(MYSQL_NAME)) {
			return new MysqlDataSource();
		} else if (name.equalsIgnoreCase(ORACLE_NAME)) {
			return new OracleConnection();
		} 
		
		throw new RuntimeException("Driver Manager Name is not correct.");
	}
	
}
