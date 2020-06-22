package ar.edu.unnoba.poo.MMXIX.practica2.O.does_not_apply;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
	    List<Ave> aves =  new ArrayList<Ave>();
	
	    aves.add(new Ave(Pico.CORTO_PEQUEÑO, "Paloma"));
	    aves.add(new Ave(Pico.GANCHO, "Condor"));
	    
		System.out.println(retornarComidas(aves));
	}
	
	public static Map<String, String> retornarComidas(List<Ave> aves){
		Map<String, String> comidas = new HashMap<String, String>();
		
	    for (Ave a : aves) {
	        if(a.getTipo().equalsIgnoreCase("Paloma"))
	        	 comidas.put("Paloma", "Granívoro");
	        if(a.getTipo().equalsIgnoreCase("Condor"))
	        	 comidas.put("Condor", "Carnívoro");
	    }

	    return comidas;
	}
	
}
