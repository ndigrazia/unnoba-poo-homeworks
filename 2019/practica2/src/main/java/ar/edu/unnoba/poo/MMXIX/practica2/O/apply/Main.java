package ar.edu.unnoba.poo.MMXIX.practica2.O.apply;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
	    List<Ave> aves =  new ArrayList<Ave>();
	
	    aves.add(new Paloma());
	    aves.add(new Condor());
	    
		System.out.println(retornarComidas(aves));
	}
	
	public static Map<Ave, Comida> retornarComidas(List<Ave> aves){
		Map<Ave, Comida> comidas = new HashMap<Ave, Comida>();
		
	    for (Ave a : aves)
	         comidas.put(a, a.getTipoComida());
	
	    return comidas;
	}
	
}
