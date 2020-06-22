package ar.edu.unnoba.poo.proyecto.servicio;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.NoResultException;
import javax.persistence.Query;

import ar.edu.unnoba.poo.proyecto.modelo.Usuario;
import ar.edu.unnoba.poo.proyecto.util.JPARecursoBean;

@ManagedBean(name="UsuarioBean")
@SessionScoped
public class UsuarioServicioBean implements UsuarioServicioItf {
	
	@ManagedProperty(value="#{JPARecursoBean}")
    protected JPARecursoBean jpaRecursoBean;

	@Override
	public void grabar(Usuario entity) {
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
	public Usuario buscarUsuarioPorId(String id) {
		EntityManager em = jpaRecursoBean.getEMF().createEntityManager();
		
		try {
			Query q = em.createNamedQuery("Usuario.findNombre", Usuario.class);
			q.setParameter("id", id);
			return (Usuario) q.getSingleResult();
		} catch (NoResultException e) {
			return null;
		} finally {
			em.close();
        }
	}
	
	public boolean validarUsuario(String nombre, String clave) {
		Usuario u = buscarUsuarioPorId(nombre);
		
		if(u!=null)
			return u.validarClave(clave);
		
		
		return false;
	}
	
	public JPARecursoBean getJpaRecursoBean() {
		return jpaRecursoBean;
	}

	public void setJpaRecursoBean(JPARecursoBean jpaRecursoBean) {
		this.jpaRecursoBean = jpaRecursoBean;
	}
		
}
