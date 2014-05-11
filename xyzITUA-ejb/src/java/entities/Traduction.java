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
import javax.persistence.Temporal;

/**
 *
 * @author andrianarisoa
 */
@Entity
public class Traduction implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idTraduction;

    public Long getIdTraduction() {
        return idTraduction;
    }

    public void setIdTraduction(Long idTraduction) {
        this.idTraduction = idTraduction;
    }

    private String motSource;

    /**
     * Get the value of motSource
     *
     * @return the value of motSource
     */
    public String getMotSource() {
        return motSource;
    }

    /**
     * Set the value of motSource
     *
     * @param motSource new value of motSource
     */
    public void setMotSource(String motSource) {
        this.motSource = motSource;
    }

    private String motCible;

    /**
     * Get the value of motCible
     *
     * @return the value of motCible
     */
    public String getMotCible() {
        return motCible;
    }

    /**
     * Set the value of motCible
     *
     * @param motCible new value of motCible
     */
    public void setMotCible(String motCible) {
        this.motCible = motCible;
    }
    
    @ManyToOne
    @JoinColumn(name = "CREATEUR_ID")
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
    @ManyToOne
    @JoinColumn(name="CULTURESOURCE_ID")
    private Culture cultureSource;

    /**
     * Get the value of cultureSource
     *
     * @return the value of cultureSource
     */
    public Culture getCultureSource() {
        return cultureSource;
    }

    /**
     * Set the value of cultureSource
     *
     * @param cultureSource new value of cultureSource
     */
    public void setCultureSource(Culture cultureSource) {
        this.cultureSource = cultureSource;
    }
    @ManyToOne
    @JoinColumn(name ="CULTURECIBLE_ID")
    private Culture cultureCible;

    /**
     * Get the value of cultureCible
     *
     * @return the value of cultureCible
     */
    public Culture getCultureCible() {
        return cultureCible;
    }

    /**
     * Set the value of cultureCible
     *
     * @param cultureCible new value of cultureCible
     */
    public void setCultureCible(Culture cultureCible) {
        this.cultureCible = cultureCible;
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
    @ManyToMany
    private List<Liste> listes;

    /**
     * Get the value of listes
     *
     * @return the value of listes
     */
    public List getListes() {
        return listes;
    }

    /**
     * Set the value of listes
     *
     * @param listes new value of listes
     */
    public void setListes(List listes) {
        this.listes = listes;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTraduction != null ? idTraduction.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the idTraduction fields are not set
        if (!(object instanceof Traduction)) {
            return false;
        }
        Traduction other = (Traduction) object;
        if ((this.idTraduction == null && other.idTraduction != null) || (this.idTraduction != null && !this.idTraduction.equals(other.idTraduction))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Traduction[ id=" + idTraduction + " ]";
    }
    
}
