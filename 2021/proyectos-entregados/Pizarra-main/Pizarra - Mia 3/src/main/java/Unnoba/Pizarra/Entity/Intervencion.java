package Unnoba.Pizarra.Entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter @Setter
@Entity
@Table(name = "intervencion")
public class Intervencion implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_intervencion")
    private Long id_intervencion;

    @NotNull
    @Column(name = "fechahorainicio")
    @DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm")
    private Date fechaHoraInicio;

    @NotNull
    @Column(name = "fechahorafin")
    @DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm")
    private Date fechaHoraFin;

    @NotNull
    @Column(name = "paciente")
    private String paciente;

    @NotNull
    @Column(name = "descripcion")
    private String descripcion;

    @ManyToOne
    @JoinColumn(name = "profesional")
    private Profesional profesional;


    public Intervencion(Long id, Date inicio, Date fin, String pac, String desc, Profesional prof){
        super();
        this.id_intervencion = id;
        this.fechaHoraInicio=inicio;
        this.fechaHoraFin=fin;
        this.paciente=pac;
        this.descripcion=desc;
        this.profesional=prof;
    }

    public Intervencion(){
        super();
    }
}
