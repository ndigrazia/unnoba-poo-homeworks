package ar.edu.unnoba.poo.MMXIX.practica2.eje3;

import ar.edu.unnoba.poo.MMXIX.practica2.eje3.f16.F16Builder;

public class Client {

	public void main() {
		AircraftBuilder builder = new F16Builder();
        Director director = new Director(builder);
        director.construct();

        IAircraft aircraft = builder.getResult();
    }
	
}
