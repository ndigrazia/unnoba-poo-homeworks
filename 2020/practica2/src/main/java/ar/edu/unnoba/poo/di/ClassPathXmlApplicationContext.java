package ar.edu.unnoba.poo.di;

public class ClassPathXmlApplicationContext implements ApplicationContext {
	
	private String config;

	public ClassPathXmlApplicationContext(String config) {
		super();
		this.config = config;
	}
	
	public Object getBean(String bean) {
		return null;
	}

}
