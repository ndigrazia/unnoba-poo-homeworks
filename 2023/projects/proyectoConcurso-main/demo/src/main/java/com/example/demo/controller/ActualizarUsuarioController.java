package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


import com.example.demo.business.UsuarioBusiness;
import com.example.demo.entity.Rol;
import com.example.demo.entity.Usuario;

@Controller
public class ActualizarUsuarioController {
    @Autowired
    private UsuarioBusiness usuarioBusiness;
    
    @GetMapping("/usuarioActualizado")
    public String modificar(){
        return "usuarioActualizado";
    }

    @PostMapping("/actualizarUsuario")
    public String actualizarUsuario(@ModelAttribute("usuario") Usuario usuario) {
        String mail = usuario.getMail(); 
        String apellidoNombre = usuario.getApellidoNombre();
        String telefono = usuario.getTelefono();
        Rol rol = usuario.getRol();
        usuarioBusiness.actualizarDatosUsuario(mail, apellidoNombre, telefono, rol);
        return "usuarioActualizado"; 
    }
}
