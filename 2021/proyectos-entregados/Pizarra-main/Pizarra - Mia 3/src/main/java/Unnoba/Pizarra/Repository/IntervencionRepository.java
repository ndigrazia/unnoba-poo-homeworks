package Unnoba.Pizarra.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Unnoba.Pizarra.Entity.Intervencion;

@Repository
public interface IntervencionRepository extends JpaRepository<Intervencion,Long>{

    public List<Intervencion> findAllByOrderByFechaHoraInicioAsc();

    public Optional<Intervencion> findById(Long id);

    
}
