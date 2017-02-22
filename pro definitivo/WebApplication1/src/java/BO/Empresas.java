/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BO;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author josue
 */
@Entity
@Table(name = "empresas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Empresas.findAll", query = "SELECT e FROM Empresas e"),
    @NamedQuery(name = "Empresas.findByRazon", query = "SELECT e FROM Empresas e WHERE e.razon = :razon"),
    @NamedQuery(name = "Empresas.findByArea", query = "SELECT e FROM Empresas e WHERE e.area = :area"),
    @NamedQuery(name = "Empresas.findByCuit", query = "SELECT e FROM Empresas e WHERE e.cuit = :cuit")})
public class Empresas implements Serializable {
    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "Razon")
    private String razon;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "Area")
    private String area;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "Cuit")
    private Long cuit;
    @NotNull
    @Basic(optional = false)
    @Column(name = "id_persona")
    private Integer idPersona;
    @Lob
    @Size(max = 2147483647)
    @Column(name = "Descripcion")
    private String descripcion;
    @Column(name = "url")
    private String url;

    public Empresas() {
    }

    public Empresas(Long cuit, String razon, String area,Integer id_persona,String descrip,String url) {
        this.cuit = cuit;
        this.razon = razon;
        this.area = area;
        this.idPersona=id_persona;
        this.descripcion=descrip;
        this.url=url;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getRazon() {
        return razon;
    }

    public void setRazon(String razon) {
        this.razon = razon;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public Long getCuit() {
        return cuit;
    }

    public void setCuit(Long cuit) {
        this.cuit = cuit;
    }

    public Integer getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(Integer idPersona) {
        this.idPersona = idPersona;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cuit != null ? cuit.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Empresas)) {
            return false;
        }
        Empresas other = (Empresas) object;
        if ((this.cuit == null && other.cuit != null) || (this.cuit != null && !this.cuit.equals(other.cuit))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "BO.Empresas[ cuit=" + cuit + " ]";
    }
    
}
