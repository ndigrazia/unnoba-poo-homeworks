package com.example.demo.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.entity.Usuario;

import com.example.demo.business.UsuarioBusiness;

@Controller
public class BuscarUsuarioController {
    @Autowired
    private UsuarioBusiness usuarioBusiness;
    
    @GetMapping("/buscarUsuario")
    public String modificar(){
        return "buscarUsuario";
    }

    @PostMapping ("/buscarUsuario")
    public String buscarUsario (@RequestParam("mail") String mail, Model model){
        Usuario usuario = usuarioBusiness.obtenerPorMail(mail);

        if (usuario != null) {
            model.addAttribute("usuario", usuario);
            return "usuarioEncontrado";
        } else {
            // Puedes agregar un mensaje de error si el usuario no se encuentra
            model.addAttribute("error", "Usuario no encontrado");
            return "modificacion";
        }
    }
}
