package Unnoba.Pizarra.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Unnoba.Pizarra.Entity.Profesional;

@Repository
public interface ProfesionalRepository extends JpaRepository<Profesional,Long> {
    
    public Profesional findByNombre(String nombre);

    public Profesional findByEmail(String email);

    public Profesional findByApellido(String apellido);

    public List<Profesional> findAllByOrderByNombreAsc();
}
