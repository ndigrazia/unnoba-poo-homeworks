package ar.edu.unnoba.poo.proyecto.servicio;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import ar.edu.unnoba.poo.proyecto.modelo.Proyecto;
import ar.edu.unnoba.poo.proyecto.util.JPARecursoBean;

@ManagedBean(name="ProyectoBean")
@SessionScoped
public class ProyectoServicioBean implements ProyectoServicioItf {
	
	@ManagedProperty(value="#{JPARecursoBean}")
    protected JPARecursoBean jpaRecursoBean;

	@Override
	public void grabar(Proyecto entity) {
		EntityManager em = jpaRecursoBean.getEMF().createEntityManager();
		EntityTransaction tx = em.getTransaction();
		try {
			tx.begin();
			em.persist(entity);
			tx.commit();
		} catch (Exception e) {
			tx.rollback();;
		} finally {
			em.close();
        }
	}

	@Override
	public Proyecto buscarProyectoPorId(long id) {
		EntityManager em = jpaRecursoBean.getEMF().createEntityManager();
		try{
			return em.find(Proyecto.class, id);
		} finally {
			em.close();
        }
	}
	
	public List<Proyecto> obtenerProyectos() {
		EntityManager em = jpaRecursoBean.getEMF().createEntityManager();
		try {
			Query q = em.createNamedQuery("Proyecto.findAll");
			List<Proyecto> lista = q.getResultList();
			return lista;
		} finally {
			em.close();
        }
	}
	
	public JPARecursoBean getJpaRecursoBean() {
		return jpaRecursoBean;
	}

	public void setJpaRecursoBean(JPARecursoBean jpaRecursoBean) {
		this.jpaRecursoBean = jpaRecursoBean;
	}

	@Override
	public void borrar(long id) {
		EntityManager em = jpaRecursoBean.getEMF().createEntityManager();
		EntityTransaction tx = em.getTransaction();
		try {
			tx.begin();
			Proyecto p = em.find(Proyecto.class, id);
			if(p!=null)
				em.remove(p);
			tx.commit();
		} catch (Exception e) {
			tx.rollback();;
		} finally {
			em.close();
		}
	}
		
}
