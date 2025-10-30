package Unnoba.Pizarra.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Unnoba.Pizarra.Entity.Intervencion;
import Unnoba.Pizarra.Entity.Profesional;
import Unnoba.Pizarra.Repository.IntervencionRepository;
import Unnoba.Pizarra.Repository.ProfesionalRepository;

@Service
public class IntervencionService {
    
    @Autowired
    private IntervencionRepository intervencionRepository;

    @Autowired
    private ProfesionalRepository profesionalRepository;

    public List<Intervencion> listarIntervenciones(){
        return intervencionRepository.findAllByOrderByFechaHoraInicioAsc();
    }

    public Intervencion addIntervencion(Intervencion intervencion){
        if(checkFechaInicio(intervencion)&& checkFechaFin(intervencion)){
        intervencionRepository.save(intervencion);
        }
        return intervencion;
    }

    public void deleteIntervencion(Long id){
        intervencionRepository.deleteById(id);
    }

    public Optional<Intervencion> findById(Long id){
        return intervencionRepository.findById(id);
    }

    public void guardar(Intervencion intervencion, Profesional profesional){
        Profesional prof2= profesionalRepository.findByEmail(profesional.getEmail());
        intervencion.setProfesional(prof2);
        intervencionRepository.save(intervencion);
    }

    public Intervencion encontrarIntervencion(Intervencion intervencion){
        return intervencionRepository.findById(intervencion.getId_intervencion()).orElse(null);
    }

    public boolean checkFechaInicio(Intervencion intervencion){
        Date fechaInicio = intervencion.getFechaHoraInicio();
        List<Intervencion> intervenciones = intervencionRepository.findAll();
        for(Intervencion e : intervenciones){
            if(fechaInicio.after(e.getFechaHoraInicio()) && fechaInicio.after(e.getFechaHoraFin())){
            }else{
                return false;
            }
        }
        return true;
    }

    public boolean checkFechaFin(Intervencion intervencion){
        Date fechaInicio = intervencion.getFechaHoraInicio();
        Date fechaFin = intervencion.getFechaHoraFin();
        if(fechaFin.before(fechaInicio)){
            return false;
        }
        return true;
    }


}
