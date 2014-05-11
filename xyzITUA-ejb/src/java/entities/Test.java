/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;

/**
 *
 * @author andrianarisoa
 */
@Entity
public class Test implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idTest;

    public Long getIdTest() {
        return idTest;
    }

    public void setIdTest(Long idTest) {
        this.idTest = idTest;
    }
    @ManyToOne
    @JoinColumn(name ="LISTE_ID")
    private Liste liste;

    /**
     * Get the value of liste
     *
     * @return the value of liste
     */
    public Liste getListe() {
        return liste;
    }

    /**
     * Set the value of liste
     *
     * @param liste new value of liste
     */
    public void setListe(Liste liste) {
        this.liste = liste;
    }
    @ManyToOne
    @JoinColumn(name="CREATEUR_ID")
    private Utilisateur createur;

    /**
     * Get the value of createur
     *
     * @return the value of createur
     */
    public Utilisateur getCreateur() {
        return createur;
    }

    /**
     * Set the value of createur
     *
     * @param createur new value of createur
     */
    public void setCreateur(Utilisateur createur) {
        this.createur = createur;
    }

    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dateCreation;

    /**
     * Get the value of dateCreation
     *
     * @return the value of dateCreation
     */
    public Date getDateCreation() {
        return dateCreation;
    }

    /**
     * Set the value of dateCreation
     *
     * @param dateCreation new value of dateCreation
     */
    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }

    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dateModification;

    /**
     * Get the value of dateModification
     *
     * @return the value of dateModification
     */
    public Date getDateModification() {
        return dateModification;
    }

    /**
     * Set the value of dateModification
     *
     * @param dateModification new value of dateModification
     */
    public void setDateModification(Date dateModification) {
        this.dateModification = dateModification;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTest != null ? idTest.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the idTest fields are not set
        if (!(object instanceof Test)) {
            return false;
        }
        Test other = (Test) object;
        if ((this.idTest == null && other.idTest != null) || (this.idTest != null && !this.idTest.equals(other.idTest))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Test[ id=" + idTest + " ]";
    }
    
}
