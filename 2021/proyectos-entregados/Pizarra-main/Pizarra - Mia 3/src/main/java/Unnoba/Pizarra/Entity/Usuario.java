package Unnoba.Pizarra.Entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Data
@Getter@Setter
@Table(name="usuario")
public class Usuario implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id_usuario")
    long id_usuario;

    @NotNull
    @Email
    @Column(name = "email",unique=true)
    private String email;

    @Column(name = "nombre")
    private String nombre;

    @NotNull
    @Column(name = "apellido")
    private String apellido;
    
    @NotNull
    @Column (name="password")
    private String password;

    public Usuario(Long id, String email,String nom,String ap, String pass){
        super();
        this.id_usuario=id;
        this.email=email;
        this.nombre= nom;
        this.apellido=ap;
    }

    public Usuario(){
        super();
    }

    
}
