/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BO;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

/**
 *
 * @author josue
 */
@Entity
@Table(name = "trabajos")
@NamedQueries({
    @NamedQuery(name = "Trabajos.findAll", query = "SELECT t FROM Trabajos t"),
    @NamedQuery(name = "Trabajos.findByIdPuesto", query = "SELECT t FROM Trabajos t WHERE t.idPuesto = :idPuesto"),
    @NamedQuery(name = "Trabajos.findByCuit", query = "SELECT t FROM Trabajos t WHERE t.cuit = :cuit"),
    @NamedQuery(name = "Trabajos.findByIdProfesional", query = "SELECT t FROM Trabajos t WHERE t.idProfesional = :idProfesional"),
    @NamedQuery(name = "Trabajos.findByFecha", query = "SELECT t FROM Trabajos t WHERE t.fecha = :fecha")})
public class Trabajos implements Serializable {
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_puesto")
    @Id
    private int idPuesto;
    @Basic(optional = false)
    @NotNull
    @Column(name = "cuit")
    @Id
    private Long cuit;
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_profesional")
    @Id
    private int idProfesional;
  //  @Basic(optional = false)
    @Column(name = "fecha")
    @Temporal(TemporalType.DATE)
//    @Id
    private Date fecha;

    public Trabajos() {
    }

    public Trabajos(int idPuesto, Long cuit, int idProfesional) {
        this.idPuesto = idPuesto;
        this.cuit = cuit;
        this.idProfesional = idProfesional;
    }

    public int getIdPuesto() {
        return idPuesto;
    }

    public void setIdPuesto(int idPuesto) {
        this.idPuesto = idPuesto;
    }

    public Long getCuit() {
        return cuit;
    }

    public void setCuit(Long cuit) {
        this.cuit = cuit;
    }

    public int getIdProfesional() {
        return idProfesional;
    }

    public void setIdProfesional(int idProfesional) {
        this.idProfesional = idProfesional;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idPuesto;
        hash += (Long) cuit;
        hash += (int) idProfesional;
        hash += (fecha != null ? fecha.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Trabajos)) {
            return false;
        }
        Trabajos other = (Trabajos) object;
        if (this.idPuesto != other.idPuesto) {
            return false;
        }
        if (this.cuit != other.cuit) {
            return false;
        }
        if (this.idProfesional != other.idProfesional) {
            return false;
        }
        if ((this.fecha == null && other.fecha != null) || (this.fecha != null && !this.fecha.equals(other.fecha))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "BO.Trabajos[ idPuesto=" + idPuesto + ", cuit=" + cuit + ", idProfesional=" + idProfesional + ", fecha=" + fecha + " ]";
    }

}
