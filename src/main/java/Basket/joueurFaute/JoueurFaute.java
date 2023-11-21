package Basket.joueurFaute;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "joueur_faute")
public class JoueurFaute {
    
    @Id
    private Long id;

    @Column(name = "idMatch")
    private Long idMatch;

    @Column(name = "idJoueur")
    private Long idJoueur;

    @Column(name = "nbFautes")
    private Integer nbFautes;


    public JoueurFaute() 
    {

    }

    public JoueurFaute(Long id, Long idMatch, Long idJoueur, Integer nbFautes) {
        setId(id);
        setIdMatch(idMatch);
        setIdJoueur(idJoueur);
        setNbFautes(nbFautes);
    }

    public JoueurFaute(Long idMatch, Long idJoueur, Integer nbFautes) {
        setIdMatch(idMatch);
        setIdJoueur(idJoueur);
        setNbFautes(nbFautes);
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
    public Integer getNbFautes() {
        return nbFautes;
    }
    public void setNbFautes(Integer nbFautes) {
        this.nbFautes = nbFautes;
    }
}
