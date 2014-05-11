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
public class Historique implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idHistorique;

    public Long getIdHistorique() {
        return idHistorique;
    }

    public void setIdHistorique(Long idHistorique) {
        this.idHistorique = idHistorique;
    }
    @ManyToOne
    @JoinColumn(name="TEST_ID")
    private Test test;

    /**
     * Get the value of test
     *
     * @return the value of test
     */
    public Test getTest() {
        return test;
    }

    /**
     * Set the value of test
     *
     * @param test new value of test
     */
    public void setTest(Test test) {
        this.test = test;
    }
    @ManyToOne
    @JoinColumn(name = "UTILISATEUR_ID")
    private Utilisateur utilisateur;

    /**
     * Get the value of utilisateur
     *
     * @return the value of utilisateur
     */
    public Utilisateur getUtilisateur() {
        return utilisateur;
    }

    /**
     * Set the value of utilisateur
     *
     * @param utilisateur new value of utilisateur
     */
    public void setUtilisateur(Utilisateur utilisateur) {
        this.utilisateur = utilisateur;
    }

    private float note;

    /**
     * Get the value of note
     *
     * @return the value of note
     */
    public float getNote() {
        return note;
    }

    /**
     * Set the value of note
     *
     * @param note new value of note
     */
    public void setNote(float note) {
        this.note = note;
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
        hash += (idHistorique != null ? idHistorique.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the idHistorique fields are not set
        if (!(object instanceof Historique)) {
            return false;
        }
        Historique other = (Historique) object;
        if ((this.idHistorique == null && other.idHistorique != null) || (this.idHistorique != null && !this.idHistorique.equals(other.idHistorique))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Historique[ id=" + idHistorique + " ]";
    }
    
}
