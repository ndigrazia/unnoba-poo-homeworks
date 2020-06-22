package ar.edu.unnoba.poo.proyecto.util;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

@ManagedBean(name="JPARecursoBean")
@ApplicationScoped
public class JPARecursoBean {

	protected EntityManagerFactory emf;

	public JPARecursoBean(){}
	
    public EntityManagerFactory getEMF (){
    	if (emf == null){
        	emf = Persistence.createEntityManagerFactory("2016-poo-practica3-JTA", System.getProperties());
        }
        
        return emf;
    }
    
}
