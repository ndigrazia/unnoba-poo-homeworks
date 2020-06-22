package ar.edu.unnoba.poo.MMXIX.practica2.doble_dispatching;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Client {

	private List<Element> elements = new ArrayList<Element>();
	
	public Client() {
		elements.add(new ConcreteElementA());
		//elements.add(new ConcreteElementB());
	}
	
	public void walk1() {
		Visitor v1 = new Visitor1();
		
		for (Iterator iterator = elements.iterator(); iterator.hasNext();) {
			Element element = (Element) iterator.next();
			element.accept(v1);
		}
	}
	
	public void walk2() {
		Visitor v2 = new Visitor2();
		
		for (Iterator iterator = elements.iterator(); iterator.hasNext();) {
			Element element = (Element) iterator.next();
			element.accept(v2);
		}
	}
	public static void main(String[] args) {
		Client c = new Client();
		c.walk1();
		c.walk2();
	}
}
