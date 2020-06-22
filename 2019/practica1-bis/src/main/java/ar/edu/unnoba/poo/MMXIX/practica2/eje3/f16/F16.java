package ar.edu.unnoba.poo.MMXIX.practica2.eje3.f16;

import ar.edu.unnoba.poo.MMXIX.practica2.eje3.IAircraft;

public class F16 extends IAircraft {

	private F16Engine engine;
	private F16Wings winds;
	private F16Cockpit cockpit;
	
	public F16Engine getEngine() {
		return engine;
	}
	public void setEngine(F16Engine engine) {
		this.engine = engine;
	}
	
	public F16Wings getWinds() {
		return winds;
	}
	public void setWinds(F16Wings winds) {
		this.winds = winds;
	}
	
	public F16Cockpit getCockpit() {
		return cockpit;
	}
	public void setCockpit(F16Cockpit cockpit) {
		this.cockpit = cockpit;
	}
	
}
