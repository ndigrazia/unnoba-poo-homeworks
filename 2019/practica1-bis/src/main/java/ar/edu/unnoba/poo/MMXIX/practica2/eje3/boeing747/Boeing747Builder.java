package ar.edu.unnoba.poo.MMXIX.practica2.eje3.boeing747;

import ar.edu.unnoba.poo.MMXIX.practica2.eje3.AircraftBuilder;
import ar.edu.unnoba.poo.MMXIX.practica2.eje3.IAircraft;

public class Boeing747Builder extends AircraftBuilder {

    private Boeing747 boeing747;

    @Override
    public void buildEngine() {
    	boeing747.setEngine(new Boeing747Engine());
    }

    @Override
    public void buildWings() {
    	boeing747.setWinds(new Boeing747Wings());
    }

    @Override
    public void buildCockpit() {
    	boeing747 = new Boeing747();
    	boeing747.setCockpit(new Boeing747Cockpit());
    }

    public void buildBathrooms() {
    	boeing747.setBathrooms(new Boeing747Bathrooms());
    }

    public IAircraft getResult() {
        return boeing747;
    }
    
}