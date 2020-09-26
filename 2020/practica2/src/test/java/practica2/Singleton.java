package practica2;

public class Singleton {

	private static Singleton singleton = null;
	
	private String value;
	
	private Singleton() {
	}

	public static Singleton getInstance() {
		if(singleton==null)
			singleton = new Singleton();
		return  singleton;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	
}
