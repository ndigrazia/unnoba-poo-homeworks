package com.registro.usuarios.controlador;
import org.apache.commons.logging.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.registro.usuarios.servicio.UsuarioServicio;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class DashboardController {
  

	@Autowired
	private UsuarioServicio servicio;
  
  @GetMapping("/dashboard")
  public String Dashboard(Model modelo){
    		modelo.addAttribute("usuarios", servicio.listarUsuarios());
		// retorna vista de index, que contiene la lista de los usarios
    return "dashboard";
  }

}
