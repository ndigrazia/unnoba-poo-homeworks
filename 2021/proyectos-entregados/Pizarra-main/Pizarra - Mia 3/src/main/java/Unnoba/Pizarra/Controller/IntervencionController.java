package Unnoba.Pizarra.Controller;


import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import Unnoba.Pizarra.Entity.Intervencion;
import Unnoba.Pizarra.Entity.Profesional;
import Unnoba.Pizarra.Service.IntervencionService;
import Unnoba.Pizarra.Service.ProfesionalService;

@Controller
public class IntervencionController {
    

    @Autowired
    private IntervencionService intervencionService;

    @Autowired
    private ProfesionalService profesionalService;


    @GetMapping("/intervenciones")
    public String listarIntervenciones(Model model){
        var intervenciones = intervencionService.listarIntervenciones();
        model.addAttribute("intervenciones", intervenciones);
        return "intervenciones";
    }

    @GetMapping("/registroIntervencion")
    public String registrarIntervencion(Model model){
        List <Profesional> profesionales = profesionalService.listarProfesionales();
        Intervencion intervencion = new Intervencion();
        model.addAttribute("profesionales", profesionales);
        model.addAttribute("intervencion",intervencion);
        return "registroIntervencion";
    }

   //@PostMapping("/registroIntervencion")
   @PostMapping("/save")
    public String registroIntervencion(@Valid @ModelAttribute Intervencion intervencion, Model model, Long id){
        intervencionService.addIntervencion(intervencion);
        System.out.println("El profesional es: " + intervencion.getProfesional());
        return "redirect:/registroIntervencion";
    }

    @GetMapping("/deleteIntervencion/{id_intervencion}")
    public String deleteIntervencion(Intervencion intervencion){
        Long id_intervencion = intervencion.getId_intervencion();
        intervencionService.deleteIntervencion(id_intervencion);
        return "redirect:/intervenciones";
    }

    @GetMapping("/editar/{id_intervencion}")
    public String editar(Intervencion intervencion,Model model){
        intervencion = intervencionService.encontrarIntervencion(intervencion);
        model.addAttribute("intervencion", intervencion);
        return "editarIntervencion";
    }

    @PostMapping("/guardar")
    public String guardar(Intervencion intervencion){
        intervencionService.addIntervencion(intervencion);
        return "redirect:/intervenciones";
    }

    @GetMapping("/informacionIntervencion/{id_intervencion}")
    public String informacion(Model model, Intervencion intervencion){
        intervencion = intervencionService.encontrarIntervencion(intervencion);
        model.addAttribute("intervencion", intervencion);
        return "informacionIntervencion";
    }
}
