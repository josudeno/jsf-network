/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BO;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author josue
 */
@Entity
@Table(name = "puestos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Puestos.findAll", query = "SELECT p FROM Puestos p"),
    @NamedQuery(name = "Puestos.findByIdPuesto", query = "SELECT p FROM Puestos p WHERE p.idPuesto = :idPuesto"),
    @NamedQuery(name = "Puestos.findByPuesto", query = "SELECT p FROM Puestos p WHERE p.puesto = :puesto"),
    @NamedQuery(name = "Puestos.findByArea", query = "SELECT p FROM Puestos p WHERE p.area = :area"),
    @NamedQuery(name = "Puestos.findBySalario", query = "SELECT p FROM Puestos p WHERE p.salario = :salario"),
    @NamedQuery(name = "Puestos.findByFecha", query = "SELECT p FROM Puestos p WHERE p.fecha = :fecha")})
public class Puestos implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_puesto")
    private Integer idPuesto=1;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "Puesto")
    private String puesto;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "Area")
    private String area;
    @Column(name = "Salario")
    private Double salario;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Fecha")
    @Temporal(TemporalType.DATE)
    private Date fecha;
    @Lob
    @Size(max = 2147483647)
    @Column(name = "Descripcion")
    private String descripcion;
    @NotNull
    @Basic(optional = false)
    @Column(name = "id_empresa")
    private Long idempresa;
      @NotNull
    @Basic(optional = false)
    @Column(name = "Disponible")
    private int disponible;
      
    public Puestos() {
    }

    public Puestos(String area) {
        this.area = area;
    }

    public Puestos(int idPuesto, String puesto, String area, double salario, Date fecha, String descripcion, Long idempresa,int disponible) {
        this.idPuesto = idPuesto;
        this.puesto = puesto;
        this.area = area;
        this.salario = salario;
        this.fecha = fecha;
        this.descripcion =descripcion;
        this.idempresa = idempresa;
        this.disponible=disponible;
    }

    public int getDisponible() {
        return disponible;
    }

    public void setDisponible(int disponible) {
        this.disponible = disponible;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    
    

    public Integer getIdPuesto() {
        return idPuesto;
    }

    public void setIdPuesto(Integer idPuesto) {
        this.idPuesto = idPuesto;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }


    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Long getIdEmpresa() {
        return idempresa;
    }

    public void setIdEmpresa(Long idEmpresa) {
        this.idempresa = idEmpresa;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPuesto != null ? idPuesto.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Puestos)) {
            return false;
        }
        Puestos other = (Puestos) object;
        if ((this.idPuesto == null && other.idPuesto != null) || (this.idPuesto != null && !this.idPuesto.equals(other.idPuesto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "BO.Puestos[ idPuesto=" + idPuesto + " ]";
    }
    
}
