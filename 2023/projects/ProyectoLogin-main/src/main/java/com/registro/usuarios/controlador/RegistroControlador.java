package com.registro.usuarios.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.registro.usuarios.servicio.UsuarioServicio;

@Controller
// Este controlador maneja las peticiones GET para mostrar una página de inicio (que muestra los usuarios) y una página de inicio de sesión
public class RegistroControlador {

	@Autowired
	private UsuarioServicio servicio;
	
	@GetMapping("/login")
	public String iniciarSesion() {
		// retorna vista del login
		return "login";
	}
	
	@GetMapping("/")
	public String verPaginaDeInicio(Model modelo) {
		modelo.addAttribute("usuarios", servicio.listarUsuarios());
		// retorna vista de index, que contiene la lista de los usarios
		return "index";
	}
}
