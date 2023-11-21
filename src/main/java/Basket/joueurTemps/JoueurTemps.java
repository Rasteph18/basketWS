package Basket.joueurTemps;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "joueur_temps")
public class JoueurTemps {
    
    @Id
    private Long id;

    @Column(name = "idMatch")
    private Long idMatch;

    @Column(name = "idJoueur")
    private Long idJoueur;

    @Column(name = "temps_joue")
    private Double tempsJoue;

    public JoueurTemps() 
    {

    }

    public JoueurTemps(Long id, Long idMatch, Long idJoueur, Double tempsJoue) {
        setId(id);
        setIdMatch(idMatch);
        setIdJoueur(idJoueur);
        setTempsJoue(tempsJoue);
    }

    public JoueurTemps(Long idMatch, Long idJoueur, Double tempsJoue) {
        setIdMatch(idMatch);
        setIdJoueur(idJoueur);
        setTempsJoue(tempsJoue);
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
    public Double getTempsJoue() {
        return tempsJoue;
    }
    public void setTempsJoue(Double tempsJoue) {
        this.tempsJoue = tempsJoue;
    }
}
