/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author andrianarisoa
 */
@Entity
public class Utilisateur implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idUtilisateur;

    public Long getIdUtilisateur() {
        return idUtilisateur;
    }

    public void setIdUtilisateur(Long idUtilisateur) {
        this.idUtilisateur = idUtilisateur;
    }
    
    private String nom;

    /**
     * Get the value of nom
     *
     * @return the value of nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * Set the value of nom
     *
     * @param nom new value of nom
     */
    public void setNom(String nom) {
        this.nom = nom;
    }
    
    private String prenom;

    /**
     * Get the value of prenom
     *
     * @return the value of prenom
     */
    public String getPrenom() {
        return prenom;
    }

    /**
     * Set the value of prenom
     *
     * @param prenom new value of prenom
     */
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    @Column(unique = true)
    private String login;

    /**
     * Get the value of login
     *
     * @return the value of login
     */
    public String getLogin() {
        return login;
    }

    /**
     * Set the value of login
     *
     * @param login new value of login
     */
    public void setLogin(String login) {
        this.login = login;
    }
    
    @OneToMany(mappedBy = "utilisateur")
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
    @OneToMany(mappedBy = "createur")
    private List<Test> tests;

    /**
     * Get the value of tests
     *
     * @return the value of tests
     */
    public List getTests() {
        return tests;
    }

    /**
     * Set the value of tests
     *
     * @param tests new value of tests
     */
    public void setTests(List tests) {
        this.tests = tests;
    }
    @OneToMany(mappedBy = "utilisateur")
    private List<Historique> historiques;

    /**
     * Get the value of historiques
     *
     * @return the value of historiques
     */
    public List getHistoriques() {
        return historiques;
    }

    /**
     * Set the value of historiques
     *
     * @param historiques new value of historiques
     */
    public void setHistoriques(List historiques) {
        this.historiques = historiques;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idUtilisateur != null ? idUtilisateur.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the idUtilisateur fields are not set
        if (!(object instanceof Utilisateur)) {
            return false;
        }
        Utilisateur other = (Utilisateur) object;
        if ((this.idUtilisateur == null && other.idUtilisateur != null) || (this.idUtilisateur != null && !this.idUtilisateur.equals(other.idUtilisateur))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Utilisateur[ id=" + idUtilisateur + " ]";
    }
    
}
