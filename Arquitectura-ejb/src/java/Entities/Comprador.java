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
@Table(name = "comprador")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Comprador.findAll", query = "SELECT c FROM Comprador c"),
    @NamedQuery(name = "Comprador.findByIdComprador", query = "SELECT c FROM Comprador c WHERE c.idComprador = :idComprador")})
public class Comprador implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "Id_Comprador")
    private Integer idComprador;
    @Lob
    @Size(max = 65535)
    @Column(name = "Nombre_Comprador")
    private String nombreComprador;
    @Lob
    @Size(max = 65535)
    @Column(name = "Correo_Comprador")
    private String correoComprador;
    @Lob
    @Size(max = 65535)
    @Column(name = "Ciudad_Comprador")
    private String ciudadComprador;
    @Lob
    @Size(max = 65535)
    @Column(name = "Descripcion_Comprador")
    private String descripcionComprador;
    @Lob
    @Size(max = 65535)
    @Column(name = "User_Comprador")
    private String userComprador;
    @Lob
    @Size(max = 65535)
    @Column(name = "Pass_Comprador")
    private String passComprador;
    @OneToMany(mappedBy = "idComprador")
    private Collection<Venta> ventaCollection;

    public Comprador() {
    }

    public Comprador(Integer idComprador) {
        this.idComprador = idComprador;
    }

    public Integer getIdComprador() {
        return idComprador;
    }

    public void setIdComprador(Integer idComprador) {
        this.idComprador = idComprador;
    }

    public String getNombreComprador() {
        return nombreComprador;
    }

    public void setNombreComprador(String nombreComprador) {
        this.nombreComprador = nombreComprador;
    }

    public String getCorreoComprador() {
        return correoComprador;
    }

    public void setCorreoComprador(String correoComprador) {
        this.correoComprador = correoComprador;
    }

    public String getCiudadComprador() {
        return ciudadComprador;
    }

    public void setCiudadComprador(String ciudadComprador) {
        this.ciudadComprador = ciudadComprador;
    }

    public String getDescripcionComprador() {
        return descripcionComprador;
    }

    public void setDescripcionComprador(String descripcionComprador) {
        this.descripcionComprador = descripcionComprador;
    }

    public String getUserComprador() {
        return userComprador;
    }

    public void setUserComprador(String userComprador) {
        this.userComprador = userComprador;
    }

    public String getPassComprador() {
        return passComprador;
    }

    public void setPassComprador(String passComprador) {
        this.passComprador = passComprador;
    }

    @XmlTransient
    public Collection<Venta> getVentaCollection() {
        return ventaCollection;
    }

    public void setVentaCollection(Collection<Venta> ventaCollection) {
        this.ventaCollection = ventaCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idComprador != null ? idComprador.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Comprador)) {
            return false;
        }
        Comprador other = (Comprador) object;
        if ((this.idComprador == null && other.idComprador != null) || (this.idComprador != null && !this.idComprador.equals(other.idComprador))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entities.Comprador[ idComprador=" + idComprador + " ]";
    }
    
}
