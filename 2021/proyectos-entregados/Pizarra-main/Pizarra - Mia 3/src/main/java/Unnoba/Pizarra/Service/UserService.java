package Unnoba.Pizarra.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import Unnoba.Pizarra.Repository.userRepository;
import java.util.*;
import Unnoba.Pizarra.Entity.*;

@Service
public class UserService{
    
    //Tenemos un repositorio
    @Autowired
    private userRepository userRepository;

    @Autowired
    private BCryptPasswordEncoder password;

    public List<Usuario>listarUsuarios(){
        return userRepository.findAllByOrderByNombreAsc();
    }
    public Usuario findByEmail(String email){
        return userRepository.findByEmail(email);
    }

    public Usuario addUser(Usuario user) throws Exception{
        if(check(user)){
        user.setPassword(password.encode(user.getPassword()));
        user=userRepository.save(user);
        }
        return user;
    }

    public Usuario getUserById(Long id)throws Exception{
        return userRepository.findById(id).orElseThrow(()->new Exception("El usuario no existe"));
    }

    public void deleteUserById(Long id)throws Exception{
        userRepository.deleteById(id);
    }

    public void deleteUser(Usuario user,Long id)throws Exception{
        Long id_user = user.getId_usuario();
        if(id_user.equals(id)){
            throw new Exception("Un usuario no se puede borrar a si mismo");
        }
        userRepository.deleteById(id);
    }


    private boolean check(Usuario user) throws Exception{
        Usuario userFound = userRepository.findByEmail(user.getEmail());
        if(userFound != null){
            throw new Exception("Email no disponible");
        }
        return true;
    }
}
