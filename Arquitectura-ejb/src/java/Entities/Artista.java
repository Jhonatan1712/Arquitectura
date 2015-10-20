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
import javax.persistence.Id;
import javax.persistence.Lob;
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
@Table(name = "artista")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Artista.findAll", query = "SELECT a FROM Artista a"),
    @NamedQuery(name = "Artista.findByIdArtista", query = "SELECT a FROM Artista a WHERE a.idArtista = :idArtista")})
public class Artista implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "Id_Artista")
    private Integer idArtista;
    @Lob
    @Size(max = 65535)
    @Column(name = "Nombre_Artista")
    private String nombreArtista;
    @Lob
    @Size(max = 65535)
    @Column(name = "User_Artista")
    private String userArtista;
    @Lob
    @Size(max = 65535)
    @Column(name = "Pass_Artista")
    private String passArtista;
    @Lob
    @Size(max = 65535)
    @Column(name = "Descripcion_Artista")
    private String descripcionArtista;
    @OneToMany(mappedBy = "idArtista")
    private Collection<Estampas> estampasCollection;

    public Artista() {
    }

    public Artista(Integer idArtista) {
        this.idArtista = idArtista;
    }

    public Integer getIdArtista() {
        return idArtista;
    }

    public void setIdArtista(Integer idArtista) {
        this.idArtista = idArtista;
    }

    public String getNombreArtista() {
        return nombreArtista;
    }

    public void setNombreArtista(String nombreArtista) {
        this.nombreArtista = nombreArtista;
    }

    public String getUserArtista() {
        return userArtista;
    }

    public void setUserArtista(String userArtista) {
        this.userArtista = userArtista;
    }

    public String getPassArtista() {
        return passArtista;
    }

    public void setPassArtista(String passArtista) {
        this.passArtista = passArtista;
    }

    public String getDescripcionArtista() {
        return descripcionArtista;
    }

    public void setDescripcionArtista(String descripcionArtista) {
        this.descripcionArtista = descripcionArtista;
    }

    @XmlTransient
    public Collection<Estampas> getEstampasCollection() {
        return estampasCollection;
    }

    public void setEstampasCollection(Collection<Estampas> estampasCollection) {
        this.estampasCollection = estampasCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idArtista != null ? idArtista.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Artista)) {
            return false;
        }
        Artista other = (Artista) object;
        if ((this.idArtista == null && other.idArtista != null) || (this.idArtista != null && !this.idArtista.equals(other.idArtista))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entities.Artista[ idArtista=" + idArtista + " ]";
    }
    
}
