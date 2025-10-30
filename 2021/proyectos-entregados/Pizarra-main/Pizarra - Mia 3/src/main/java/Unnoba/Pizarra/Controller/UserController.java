package Unnoba.Pizarra.Controller;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;
//import javax.validation.constraintvalidation.SupportedValidationTarget;
//import org.hibernate.annotations.SourceType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestMapping;

import Unnoba.Pizarra.Entity.Usuario;
import Unnoba.Pizarra.Service.UserService;
import java.util.List;

@Controller
public class UserController {
    

    @Autowired
    private UserService userService;

    //Pagina de Incio:
    @GetMapping("/")
    public String inicio(){
        return "inicio";
    }

    @GetMapping("/users")
    public String listarUsuarios(Model model, Authentication auth){
        var usuarios = userService.listarUsuarios();
        model.addAttribute("usuarios", usuarios);
        return "users";
    }

    @GetMapping("/Login")
    public String login(Model model){
        model.addAttribute("usuario", new Usuario());
        return "Login";
    }

    @PostMapping("/Login")
    public String login2(HttpSession session, String email ){
        List<Usuario> usuarios = userService.listarUsuarios();
        Usuario u = userService.findByEmail(email);
        for(Usuario e:usuarios){
            if(e.getEmail() != u.getEmail()){
                
            }else{
                session.setAttribute("usuario", u);
                return "redirect:/principal";
            }
        }
        session.setAttribute("usuario", u);
        return "redirect:/principal";
    }

    @GetMapping("/principal")
    public String principal(Authentication auth, HttpSession session){
        String usuario = (String) auth.getName();
        if(session.getAttribute("usuario")== null){
            Usuario user = userService.findByEmail(usuario);
            session.setAttribute("usuario", user);
        }
        return "principal";
    }

    @GetMapping("/registro")
    public String registro(Model model){
        model.addAttribute("user", new Usuario());
        return "registro";
    }

    @PostMapping("/registro")
    public String registro2(@Valid @ModelAttribute Usuario user, BindingResult result, Model model, Errors erros){
        //if(erros.hasErrors() || result.hasErrors()){
         //   return "redirect:/registro";
        //}else{
            try {
                model.addAttribute("user", userService.addUser(user));
            } catch (Exception e) {
                model.addAttribute("errorMessage", e.getMessage());
                return "redirect:/registro";
            }
        //}
        return "redirect:/Login";
    }
    
    @GetMapping("/eliminar/{id_usuario}")
    public String eliminar(Usuario usu, Authentication auth) throws Exception{
        String user = auth.getName();
        Usuario usuario = userService.findByEmail(user);
        Long id = usu.getId_usuario();
        userService.deleteUser(usuario, id);
        //System.out.println(usuario.getEmail());
        //System.out.println(usuario.getId_usuario());
        //System.out.println(id);
        return "redirect:/users";
    }

}
