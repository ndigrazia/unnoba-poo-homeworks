package ar.edu.unnoba.poo.practica2.util;

import java.util.Properties;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPARecurso {

	protected EntityManagerFactory emf;

	public JPARecurso(){
		
	}
	
	public EntityManagerFactory getEMF(Properties p){
	    if (emf == null){
        	emf = Persistence.createEntityManagerFactory("default", p);
        }
    
        return emf;
	}
	
    public EntityManagerFactory getEMF(){
        return getEMF(System.getProperties());
    }
    
    public void liberar() {
    	if (emf != null){
    		emf.close();
    		emf = null;
    	}
    }
    
}
