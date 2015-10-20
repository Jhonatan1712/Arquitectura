/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Jhonatan
 */
@Entity
@Table(name = "dyp")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Dyp.findAll", query = "SELECT d FROM Dyp d"),
    @NamedQuery(name = "Dyp.findByIddyp", query = "SELECT d FROM Dyp d WHERE d.iddyp = :iddyp"),
    @NamedQuery(name = "Dyp.findByIdDiseno", query = "SELECT d FROM Dyp d WHERE d.idDiseno = :idDiseno"),
    @NamedQuery(name = "Dyp.findByIdProducto", query = "SELECT d FROM Dyp d WHERE d.idProducto = :idProducto")})
public class Dyp implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "Id_dyp")
    private Integer iddyp;
    @Column(name = "Id_Diseno")
    private Integer idDiseno;
    @Column(name = "Id_Producto")
    private Integer idProducto;

    public Dyp() {
    }

    public Dyp(Integer iddyp) {
        this.iddyp = iddyp;
    }

    public Integer getIddyp() {
        return iddyp;
    }

    public void setIddyp(Integer iddyp) {
        this.iddyp = iddyp;
    }

    public Integer getIdDiseno() {
        return idDiseno;
    }

    public void setIdDiseno(Integer idDiseno) {
        this.idDiseno = idDiseno;
    }

    public Integer getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Integer idProducto) {
        this.idProducto = idProducto;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iddyp != null ? iddyp.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Dyp)) {
            return false;
        }
        Dyp other = (Dyp) object;
        if ((this.iddyp == null && other.iddyp != null) || (this.iddyp != null && !this.iddyp.equals(other.iddyp))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entities.Dyp[ iddyp=" + iddyp + " ]";
    }
    
}
