package Basket.joueurEquipe;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "joueur_equipe")
public class JoueurEquipe {
    
    @Id
    private Long id;

    @Column(name = "idJoueur")
    private Long idJoueur;

    @Column(name = "idEquipe")
    private Long idEquipe;

    private Date date;


    public JoueurEquipe() 
    {

    }

    public JoueurEquipe(Long id, Long idJoueur, Long idEquipe, Date date) {
        setId(id);
        setIdJoueur(idJoueur);
        setIdEquipe(idEquipe);
        setDate(date);
    }

    public JoueurEquipe(Long idJoueur, Long idEquipe, Date date) {
        setIdJoueur(idJoueur);
        setIdEquipe(idEquipe);
        setDate(date);
    }


    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Long getIdJoueur() {
        return idJoueur;
    }
    public void setIdJoueur(Long idJoueur) {
        this.idJoueur = idJoueur;
    }
    public Long getIdEquipe() {
        return idEquipe;
    }
    public void setIdEquipe(Long idEquipe) {
        this.idEquipe = idEquipe;
    }
    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date = date;
    }
}
