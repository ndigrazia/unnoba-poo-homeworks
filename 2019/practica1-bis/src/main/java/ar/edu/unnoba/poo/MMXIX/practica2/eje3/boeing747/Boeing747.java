package ar.edu.unnoba.poo.MMXIX.practica2.eje3.boeing747;

import ar.edu.unnoba.poo.MMXIX.practica2.eje3.IAircraft;

public class Boeing747 extends IAircraft {

	private Boeing747Engine engine;
	private Boeing747Wings winds;
	private Boeing747Cockpit cockpit;
	private Boeing747Bathrooms bathrooms;
	
	public Boeing747Engine getEngine() {
		return engine;
	}
	public void setEngine(Boeing747Engine engine) {
		this.engine = engine;
	}
	
	public Boeing747Wings getWinds() {
		return winds;
	}
	public void setWinds(Boeing747Wings winds) {
		this.winds = winds;
	}
	
	public Boeing747Cockpit getCockpit() {
		return cockpit;
	}
	public void setCockpit(Boeing747Cockpit cockpit) {
		this.cockpit = cockpit;
	}
	
	public Boeing747Bathrooms getBathrooms() {
		return bathrooms;
	}
	public void setBathrooms(Boeing747Bathrooms bathrooms) {
		this.bathrooms = bathrooms;
	}
		
}
