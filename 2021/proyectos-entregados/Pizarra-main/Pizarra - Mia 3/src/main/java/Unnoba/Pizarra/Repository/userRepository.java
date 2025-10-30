package Unnoba.Pizarra.Repository;

import java.util.List;
//import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Unnoba.Pizarra.Entity.Usuario;

@Repository
public interface userRepository extends JpaRepository<Usuario,Long>
{
    public Usuario findByEmail(String email);

    public List<Usuario> findAllByOrderByNombreAsc();

}
