/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BO;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author josue
 */
@Entity
@Table(name = "personas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Personas.findAll", query = "SELECT p FROM Personas p"),
    @NamedQuery(name = "Personas.findByIdPersona", query = "SELECT p FROM Personas p WHERE p.idPersona = :idPersona"),
    @NamedQuery(name = "Personas.findByNombre", query = "SELECT p FROM Personas p WHERE p.nombre = :nombre"),
    @NamedQuery(name = "Personas.findByApellido", query = "SELECT p FROM Personas p WHERE p.apellido = :apellido"),
    @NamedQuery(name = "Personas.findBySexo", query = "SELECT p FROM Personas p WHERE p.sexo = :sexo"),
    @NamedQuery(name = "Personas.findByFechanac", query = "SELECT p FROM Personas p WHERE p.fechanac = :fechanac")})
public class Personas implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_persona")
    private Integer idPersona=1;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "Nombre")
    private String nombre;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "Apellido")
    private String apellido;
    @Column(name = "Sexo")
    private Character sexo;
    @Column(name = "Fecha_nac")
    @Temporal(TemporalType.DATE)
    private Date fechanac;

    public Personas(String nombre, String apellido, Character sexo, Date fechanac) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.sexo = sexo;
        this.fechanac = fechanac;
    }
    

    public Personas() {
    }

    public Personas(Integer idPersona) {
        this.idPersona = idPersona;
    }

    public Personas(Integer idPersona, String nombre, String apellido) {
        this.idPersona = idPersona;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public Integer getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(Integer idPersona) {
        this.idPersona = idPersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Character getSexo() {
        return sexo;
    }

    public void setSexo(Character sexo) {
        this.sexo = sexo;
    }

    public Date getFechanac() {
        return fechanac;
    }

    public void setFechanac(Date fechanac) {
        this.fechanac = fechanac;
    }


    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPersona != null ? idPersona.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Personas)) {
            return false;
        }
        Personas other = (Personas) object;
        if ((this.idPersona == null && other.idPersona != null) || (this.idPersona != null && !this.idPersona.equals(other.idPersona))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "BO.Personas[ idPersona=" + idPersona + " ]";
    }
    
}
