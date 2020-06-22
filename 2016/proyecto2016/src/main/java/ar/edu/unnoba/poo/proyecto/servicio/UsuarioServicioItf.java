package ar.edu.unnoba.poo.proyecto.servicio;

import ar.edu.unnoba.poo.proyecto.modelo.Usuario;

public interface UsuarioServicioItf {

	public void grabar(Usuario entity);
	
	public Usuario buscarUsuarioPorId(String id);
	
	public boolean validarUsuario(String nombre, String clave);

}
