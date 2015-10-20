/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Jhonatan
 */
@Entity
@Table(name = "estampas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Estampas.findAll", query = "SELECT e FROM Estampas e"),
    @NamedQuery(name = "Estampas.findByIdEstampa", query = "SELECT e FROM Estampas e WHERE e.idEstampa = :idEstampa"),
    @NamedQuery(name = "Estampas.findByPopularidad", query = "SELECT e FROM Estampas e WHERE e.popularidad = :popularidad"),
    @NamedQuery(name = "Estampas.findByRanking", query = "SELECT e FROM Estampas e WHERE e.ranking = :ranking")})
public class Estampas implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Id_Estampa")
    private Integer idEstampa;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "Nombre_Estampa")
    private String nombreEstampa;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "Descripcion")
    private String descripcion;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "Tema")
    private String tema;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Popularidad")
    private int popularidad;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Ranking")
    private int ranking;
    @OneToMany(mappedBy = "idEstampa")
    private Collection<Imagenes> imagenesCollection;
    @JoinColumn(name = "Id_Artista", referencedColumnName = "Id_Artista")
    @ManyToOne
    private Artista idArtista;

    public Estampas() {
    }

    public Estampas(Integer idEstampa) {
        this.idEstampa = idEstampa;
    }

    public Estampas(Integer idEstampa, String nombreEstampa, String descripcion, String tema, int popularidad, int ranking) {
        this.idEstampa = idEstampa;
        this.nombreEstampa = nombreEstampa;
        this.descripcion = descripcion;
        this.tema = tema;
        this.popularidad = popularidad;
        this.ranking = ranking;
    }

    public Integer getIdEstampa() {
        return idEstampa;
    }

    public void setIdEstampa(Integer idEstampa) {
        this.idEstampa = idEstampa;
    }

    public String getNombreEstampa() {
        return nombreEstampa;
    }

    public void setNombreEstampa(String nombreEstampa) {
        this.nombreEstampa = nombreEstampa;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public int getPopularidad() {
        return popularidad;
    }

    public void setPopularidad(int popularidad) {
        this.popularidad = popularidad;
    }

    public int getRanking() {
        return ranking;
    }

    public void setRanking(int ranking) {
        this.ranking = ranking;
    }

    @XmlTransient
    public Collection<Imagenes> getImagenesCollection() {
        return imagenesCollection;
    }

    public void setImagenesCollection(Collection<Imagenes> imagenesCollection) {
        this.imagenesCollection = imagenesCollection;
    }

    public Artista getIdArtista() {
        return idArtista;
    }

    public void setIdArtista(Artista idArtista) {
        this.idArtista = idArtista;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idEstampa != null ? idEstampa.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Estampas)) {
            return false;
        }
        Estampas other = (Estampas) object;
        if ((this.idEstampa == null && other.idEstampa != null) || (this.idEstampa != null && !this.idEstampa.equals(other.idEstampa))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entities.Estampas[ idEstampa=" + idEstampa + " ]";
    }
    
}
