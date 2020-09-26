package practica2;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;

public class Test {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@org.junit.Test
	public void test1() {
		Singleton s = Singleton.getInstance();
		s.setValue("Hola");
		//Logica de Test
		s.getValue().equals("Hola");
	}

	@org.junit.Test
	public void test2() {
		Singleton s = Singleton.getInstance();
		s.setValue("Hola");
		//Contexto de Test1 afecta a Text2 
	}

}
