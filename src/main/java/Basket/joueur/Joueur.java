package Basket.joueur;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Column;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;

@Entity
@Table
public class Joueur {
    
    @Id
    private Long id;
    private String nom;
    private String prenom;
    private String numero;

    @Transient
    private int nbMatchJoue = 5;


    public Joueur()
    {

    }

    public Joueur(Long id, String nom, String prenom, String numero)
    {
        setId(id);
        setNom(nom);
        setPrenom(prenom);
        setNumero(numero);
    }

    public Joueur(String nom, String prenom, String numero)
    {
        setNom(nom);
        setPrenom(prenom);
        setNumero(numero);
    }

    public Joueur(String nom, String prenom, String numero, int nbMatchJoue)
    {
        setNom(nom);
        setPrenom(prenom);
        setNumero(numero);
        setNbMatchJoue(nbMatchJoue);
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
    public String getPrenom() {
        return prenom;
    }
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    public String getNumero() {
        return numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }
    public int getNbMatchJoue() {
        return nbMatchJoue;
    }

    public void setNbMatchJoue(int nbMatchJoue) {
        this.nbMatchJoue = nbMatchJoue;
    }
}
