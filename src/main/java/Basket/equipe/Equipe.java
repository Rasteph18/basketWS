package Basket.equipe;

import java.util.ArrayList;
import java.util.List;

import Basket.joueur.Joueur;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "equipe")
public class Equipe {
    
    @Id
    @Column(name = "id_equipe")
    private Long id;
    private String nom;

    @OneToMany(
        cascade = CascadeType.ALL
    )
    @JoinColumn(
        name = "id_equipe",
        referencedColumnName = "id_equipe"
    )
    private List<Joueur> joueurs;

    public Equipe()
    {

    }

    public Equipe(Long id, String nom)
    {
        setId(id);
        setNom(nom);
    }


    public Equipe(String nom)
    {
        setNom(nom);
    }

    public Equipe(Long id, String nom, List<Joueur> joueurs)
    {
        setId(id);
        setNom(nom);
        setJoueurs(joueurs);
    }

    public Equipe(String nom, List<Joueur> joueurs)
    {
        setNom(nom);
        setJoueurs(joueurs);
    }

    public Long getId() {
        return id;
    }


    public void setId(Long id) {
        this.id = id;
    }


    public String getNom() {
        return nom;
    }


    public void setNom(String nom) {
        this.nom = nom;
    }

    public List<Joueur> getJoueurs() {
        return joueurs;
    }

    public void setJoueurs(List<Joueur> joueurs) {
        this.joueurs = joueurs;
    }

}
