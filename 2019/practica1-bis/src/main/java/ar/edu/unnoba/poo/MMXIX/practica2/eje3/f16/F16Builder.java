package ar.edu.unnoba.poo.MMXIX.practica2.eje3.f16;

import ar.edu.unnoba.poo.MMXIX.practica2.eje3.AircraftBuilder;
import ar.edu.unnoba.poo.MMXIX.practica2.eje3.IAircraft;

public class F16Builder extends AircraftBuilder {

    private F16 f16 = null;

    @Override
    public void buildEngine() {
       f16.setEngine(new F16Engine());
    }

    @Override
    public void buildWings() {
       f16.setWinds(new F16Wings());
    }

    @Override
    public void buildCockpit() {
       f16 = new F16();
       f16.setCockpit(new F16Cockpit());
    }

    public IAircraft getResult() {
        return f16;
    }
    
}
