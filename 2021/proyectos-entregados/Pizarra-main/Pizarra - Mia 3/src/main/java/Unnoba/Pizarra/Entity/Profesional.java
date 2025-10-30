package Unnoba.Pizarra.Entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter @Setter
@Entity
@Table(name = "profesional")
public class Profesional implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_profesional")
    private Long id_profesional;

    @NotNull
    @Column(name = "nombre")
    private String nombre;

    @NotNull
    @Column(name = "apellido")
    private String apellido;

    @NotNull
    @Column(name = "telefono")
    private String telefono;

    @NotNull
    @Column(name = "email",unique = true)
    private String email;

    @NotNull
    @Column(name = "matricula")
    private String matricula;

    public Profesional(Long id, String nombre, String apellido,String telefono, String email,String matricula){
        super();
        this.id_profesional=id;
        this.nombre=nombre;
        this.apellido=apellido;
        this.telefono=telefono;
        this.email=email;
        this.matricula=matricula;
    }

    public Profesional(){
        super();
    }
}
