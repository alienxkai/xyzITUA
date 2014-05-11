/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entities;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author andrianarisoa
 */
@Entity
public class Culture implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idCulture;

    public Long getIdCulture() {
        return idCulture;
    }

    public void setIdCulture(Long idCulture) {
        this.idCulture = idCulture;
    }

    private String libelle;

    /**
     * Get the value of libelle
     *
     * @return the value of libelle
     */
    public String getLibelle() {
        return libelle;
    }

    /**
     * Set the value of libelle
     *
     * @param libelle new value of libelle
     */
    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    private String code;

    /**
     * Get the value of code
     *
     * @return the value of code
     */
    public String getCode() {
        return code;
    }

    /**
     * Set the value of code
     *
     * @param code new value of code
     */
    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCulture != null ? idCulture.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the idCulture fields are not set
        if (!(object instanceof Culture)) {
            return false;
        }
        Culture other = (Culture) object;
        if ((this.idCulture == null && other.idCulture != null) || (this.idCulture != null && !this.idCulture.equals(other.idCulture))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Culture[ id=" + idCulture + " ]";
    }
    
}
