package Basket.tir;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Tir {
    
    @Id
    private Long id;

    @Column(name = "idMatch")
    private Long idMatch;

    @Column(name = "idJoueur")
    private Long idJoueur;

    @Column(name = "nbPoint")
    private Integer nbPoint;

    @Column(name = "idJoueurMicontre")
    private Long idJoueurMicontre;

    private Integer etat;

    @Column(name = "datetime")
    private Date dateTime;

    public Tir() {

    }

    public Tir(Long id, Long idMatch, Long idJoueur, Integer nbPoint, Long idJoueurMicontre, Integer etat,
            Date dateTime) {
        setId(id);
        setIdMatch(idMatch);
        setIdJoueur(idJoueur);
        setNbPoint(nbPoint);
        setIdJoueurMicontre(idJoueurMicontre);
        setEtat(etat);
        setDateTime(dateTime);
    }

    public Tir(Long idMatch, Long idJoueur, Integer nbPoint, Long idJoueurMicontre, Integer etat,
            Date dateTime) {
        setIdMatch(idMatch);
        setIdJoueur(idJoueur);
        setNbPoint(nbPoint);
        setIdJoueurMicontre(idJoueurMicontre);
        setEtat(etat);
        setDateTime(dateTime);
    }


    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Long getIdMatch() {
        return idMatch;
    }
    public void setIdMatch(Long idMatch) {
        this.idMatch = idMatch;
    }
    public Long getIdJoueur() {
        return idJoueur;
    }
    public void setIdJoueur(Long idJoueur) {
        this.idJoueur = idJoueur;
    }
    public Integer getNbPoint() {
        return nbPoint;
    }
    public void setNbPoint(Integer nbPoint) {
        this.nbPoint = nbPoint;
    }
    public Long getIdJoueurMicontre() {
        return idJoueurMicontre;
    }
    public void setIdJoueurMicontre(Long idJoueurMicontre) {
        this.idJoueurMicontre = idJoueurMicontre;
    }
    public Integer getEtat() {
        return etat;
    }
    public void setEtat(Integer etat) {
        this.etat = etat;
    }
    public Date getDateTime() {
        return dateTime;
    }
    public void setDateTime(Date dateTime) {
        this.dateTime = dateTime;
    }
}
