package ar.edu.unnoba.poo.practica2.extras.herramientas;

import java.util.HashMap;
import java.util.Map;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class GeneradorDDL {
	
   public static void main(String args[]){
        Map<String,String> properties = new HashMap<String,String>();
        properties.put("hibernate.hbm2ddl.auto", "create");
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("default", properties);
        emf.createEntityManager().close();
        emf.close();
    }
   
}
