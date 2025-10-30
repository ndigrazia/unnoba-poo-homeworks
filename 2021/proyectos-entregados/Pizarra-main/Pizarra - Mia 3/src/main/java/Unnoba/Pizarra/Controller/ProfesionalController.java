package Unnoba.Pizarra.Controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import Unnoba.Pizarra.Entity.Profesional;
import Unnoba.Pizarra.Service.ProfesionalService;

@Controller
public class ProfesionalController {
    
    @Autowired
    private ProfesionalService profService;

    @GetMapping("/profesionals")
    public String profesionals(Model model){
        var profesionals = profService.listarProfesionales();
        model.addAttribute("profesionals", profesionals);
        return "profesionals";    
    }


    //Agregar para registrar, y para eliminar

    @GetMapping("/registroProfesional")
    public String registro(Model model){
        model.addAttribute("profesional", new Profesional());
        return "registroProfesional";
    }

    @PostMapping("/registroProfesional")
    public String registrar(@Valid @ModelAttribute Profesional profesional, Model model){
        try {
            model.addAttribute("profesional", profService.addProfesional(profesional));
        } catch (Exception e) {
            model.addAttribute("errorMessage", e.getMessage());
        }
        return "redirect:/registroProfesional";
    }

    @GetMapping("/delete/{id_profesional}")
    public String deleteProfesional(Profesional profesional){
        Long id_profesional = profesional.getId_profesional(); 
        profService.deleteProfesionalById(id_profesional);
        return "redirect:/profesionals";
    }
}
