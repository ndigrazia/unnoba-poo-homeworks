package ar.edu.unnoba.poo.MMXIX.practica2.L.does_not_apply;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
	    List<Ave> aves =  new ArrayList<Ave>();
	
	    aves.add(new Paloma());
	    aves.add(new Condor());
	    
		System.out.println(retornarTipos(aves));
	}
	
	public static Map<Ave, Tipo> retornarTipos(List<Ave> aves){
		Map<Ave, Tipo> tipos = new HashMap<Ave, Tipo>();
		
	    for (Ave a : aves) {
	    	if(a instanceof Paloma)
	    			tipos.put(a, ((Paloma)a).getTipoPalomaAve());
	    	if(a instanceof Condor)
    			tipos.put(a, ((Condor)a).getTipoCondorAve());
	    }
	    
	    return tipos;
	}
	
}
