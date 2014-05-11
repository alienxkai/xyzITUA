/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;

/**
 *
 * @author andrianarisoa
 */
@Entity
public class Liste implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idListe;

    public Long getIdListe() {
        return idListe;
    }

    public void setIdListe(Long idListe) {
        this.idListe = idListe;
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
    @ManyToMany(mappedBy = "listes")
    private List<Traduction> traductions;

    /**
     * Get the value of traductions
     *
     * @return the value of traductions
     */
    public List getTraductions() {
        return traductions;
    }

    /**
     * Set the value of traductions
     *
     * @param traductions new value of traductions
     */
    public void setTraductions(List traductions) {
        this.traductions = traductions;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idListe != null ? idListe.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the idListe fields are not set
        if (!(object instanceof Liste)) {
            return false;
        }
        Liste other = (Liste) object;
        if ((this.idListe == null && other.idListe != null) || (this.idListe != null && !this.idListe.equals(other.idListe))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Liste[ id=" + idListe + " ]";
    }
    
}
