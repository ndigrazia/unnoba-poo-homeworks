package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.business.UsuarioBusiness;
import com.example.demo.entity.Usuario;

@Controller
public class BajaUsuarioController {
    
    @Autowired
    private UsuarioBusiness usuarioBusiness;

    @GetMapping("/bajaUsuario")
    public String bajaUsuario(){
        return "bajaUsuario";
    }

    @GetMapping("/usuarioEliminado")
    public String usuarioEliminado(){
        return "usuarioEliminado";
    }

    @PostMapping ("/bajaUsuario")
    public String eliminar(@RequestParam("mail") String mail, Model model){
        Usuario usuario = usuarioBusiness.obtenerPorMail(mail);

        if (usuario != null) {
            usuarioBusiness.bajaUsuario(mail);
            return "usuarioEliminado";
        } else {
            // Puedes agregar un mensaje de error si el usuario no se encuentra
            //model.addAttribute("error", "Usuario no encontrado");
            return "usuarioEliminado";
        }
    }
}
