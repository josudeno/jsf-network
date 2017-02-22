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

/**
 *
 * @author josue
 */
@Entity
@Table(name = "profesionales")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Profesionales.findAll", query = "SELECT p FROM Profesionales p"),
    @NamedQuery(name = "Profesionales.findByTitulo", query = "SELECT p FROM Profesionales p WHERE p.titulo = :titulo"),
    @NamedQuery(name = "Profesionales.findByIdPersona", query = "SELECT p FROM Profesionales p WHERE p.idPersona = :idPersona")})
public class Profesionales implements Serializable {
    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 150)
    @Column(name = "Titulo")
    private String titulo;
    @Lob
    @Size(max = 2147483647)
    @Column(name = "Cursos")
    private String cursos;
    @Lob
    @Size(max = 2147483647)
    @Column(name = "Idiomas")
    private String idiomas;
    @Lob
    @Size(max = 2147483647)
    @Column(name = "Antecedentes")
    private String antecedentes;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_persona")
    private Integer idPersona;
    @Column(name = "url")
    private String url;

    public Profesionales(String titulo, String cursos, String idiomas, Integer idPersona,String antecedentes,String url) {
        this.titulo = titulo;
        this.cursos = cursos;
        this.idiomas = idiomas;
        this.idPersona = idPersona;
        this.antecedentes=antecedentes;
        this.url=url;
    }

 
    

    public Profesionales() {
    }

 
    

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCursos() {
        return cursos;
    }

    public void setCursos(String cursos) {
        this.cursos = cursos;
    }

    public String getIdiomas() {
        return idiomas;
    }

    public void setIdiomas(String idiomas) {
        this.idiomas = idiomas;
    }

    public Integer getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(Integer idPersona) {
        this.idPersona = idPersona;
    }

    public int getPersonas() {
        return idPersona;
    }

    public void setPersonas(int personas) {
        this.idPersona = personas;
    }

    public String getAntecedentes() {
        return antecedentes;
    }

    public void setAntecedentes(String antecedentes) {
        this.antecedentes = antecedentes;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
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
        if (!(object instanceof Profesionales)) {
            return false;
        }
        Profesionales other = (Profesionales) object;
        if ((this.idPersona == null && other.idPersona != null) || (this.idPersona != null && !this.idPersona.equals(other.idPersona))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "BO.Profesionales[ idPersona=" + idPersona + " ]";
    }
    
}
