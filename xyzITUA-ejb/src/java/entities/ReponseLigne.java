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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 *
 * @author andrianarisoa
 */
@Entity
public class ReponseLigne implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idReponseLigne;

    public Long getIdReponseLigne() {
        return idReponseLigne;
    }

    public void setIdReponseLigne(Long idReponseLigne) {
        this.idReponseLigne = idReponseLigne;
    }
    @ManyToOne
    @JoinColumn(name="TRADUCTION_ID")
    private Traduction traduction;

    /**
     * Get the value of traduction
     *
     * @return the value of traduction
     */
    public Traduction getTraduction() {
        return traduction;
    }

    /**
     * Set the value of traduction
     *
     * @param traduction new value of traduction
     */
    public void setTraduction(Traduction traduction) {
        this.traduction = traduction;
    }

    private String reponse;

    /**
     * Get the value of reponse
     *
     * @return the value of reponse
     */
    public String getReponse() {
        return reponse;
    }

    /**
     * Set the value of reponse
     *
     * @param reponse new value of reponse
     */
    public void setReponse(String reponse) {
        this.reponse = reponse;
    }

    private boolean resultat;

    /**
     * Get the value of resultat
     *
     * @return the value of resultat
     */
    public boolean isResultat() {
        return resultat;
    }

    /**
     * Set the value of resultat
     *
     * @param resultat new value of resultat
     */
    public void setResultat(boolean resultat) {
        this.resultat = resultat;
    }
    @ManyToOne
    @JoinColumn(name="HISTORIQUE_ID")
    private Historique historique;

    /**
     * Get the value of historique
     *
     * @return the value of historique
     */
    public Historique getHistorique() {
        return historique;
    }

    /**
     * Set the value of historique
     *
     * @param historique new value of historique
     */
    public void setHistorique(Historique historique) {
        this.historique = historique;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idReponseLigne != null ? idReponseLigne.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the idReponseLigne fields are not set
        if (!(object instanceof ReponseLigne)) {
            return false;
        }
        ReponseLigne other = (ReponseLigne) object;
        if ((this.idReponseLigne == null && other.idReponseLigne != null) || (this.idReponseLigne != null && !this.idReponseLigne.equals(other.idReponseLigne))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.ReponseLigne[ id=" + idReponseLigne + " ]";
    }
    
}
