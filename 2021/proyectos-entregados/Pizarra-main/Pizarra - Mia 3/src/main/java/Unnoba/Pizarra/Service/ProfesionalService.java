package Unnoba.Pizarra.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import Unnoba.Pizarra.Repository.ProfesionalRepository;
import Unnoba.Pizarra.Entity.Profesional;

@Service
public class ProfesionalService {
    
    @Autowired
    private ProfesionalRepository profRepository;

    public List<Profesional> listarProfesionales(){
        return profRepository.findAllByOrderByNombreAsc();
    }

    public Profesional findByEmail(String email){
        return profRepository.findByEmail(email);
    }

    public Profesional findByNombre(String nombre){
        return profRepository.findByNombre(nombre);
    }

    public Profesional findByApellido(String apellido){
        return profRepository.findByApellido(apellido);
    }

    public Profesional findById(Long id){
        return profRepository.getById(id);
    }

    private boolean check(Profesional profesional) throws Exception{
        Profesional userFound = profRepository.findByEmail(profesional.getEmail());
        if(userFound != null){
            throw new Exception("Email no disponible");
        }
        return true;
    }
    
    public Profesional addProfesional(Profesional profesional) throws Exception{
        if(check(profesional)){
            profRepository.save(profesional);
        }
        return profesional;
    }

    public void deleteProfesionalById(Long id){
        profRepository.deleteById(id);
    }


}
