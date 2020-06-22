package ar.edu.unnoba.poo.MMXIX.practica2.eje3;

public class Director {

	private AircraftBuilder aircraftBuilder;

    public Director(AircraftBuilder aircraftBuilder) {
        this.aircraftBuilder = aircraftBuilder;
    }

    public void construct() {
        aircraftBuilder.buildCockpit();
        aircraftBuilder.buildEngine();
        aircraftBuilder.buildWings();
        aircraftBuilder.buildBathrooms();
    }
    
}
