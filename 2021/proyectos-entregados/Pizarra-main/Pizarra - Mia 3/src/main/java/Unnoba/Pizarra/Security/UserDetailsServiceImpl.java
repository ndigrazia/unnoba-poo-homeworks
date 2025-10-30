package Unnoba.Pizarra.Security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.core.userdetails.User.UserBuilder;
import org.springframework.stereotype.Service;

import Unnoba.Pizarra.Entity.Usuario;
import Unnoba.Pizarra.Repository.userRepository;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private userRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Usuario usuario = userRepository.findByEmail(username);
        UserBuilder builder = null;
        if(usuario !=null){
            builder = org.springframework.security.core.userdetails.User.withUsername(username);
            builder.disabled(false);
            builder.password(usuario.getPassword());
            builder.authorities(new SimpleGrantedAuthority("USER"));
        }else{
            throw new UsernameNotFoundException("Usuario no encontrado");
        }
        return builder.build();
    }
    
}
