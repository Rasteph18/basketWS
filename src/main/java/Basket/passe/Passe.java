package Basket.passe;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Passe {
    
    @Id
    private Long id;

    @Column(name = "idMatch")
    private Long idMatch;

    @Column(name = "idJoueurPassant")
    private Long idJoueurPassant;

    @Column(name = "idJoueurPasse")
    private Long idJoueurPasse;

    @Column(name = "typePasse")
    private Integer typePasse;

    @Column(name = "datetime")
    private Date dateTime;

    

    public Passe() {

    }


    public Passe(Long id, Long idMatch, Long idJoueurPassant, Long idJoueurPasse, Integer typePasse, Date dateTime) {
        setId(id);
        setIdMatch(idMatch);
        setIdJoueurPassant(idJoueurPassant);
        setIdJoueurPasse(idJoueurPasse);
        setTypePasse(typePasse);
        setDateTime(dateTime);
    }

    public Passe(Long idMatch, Long idJoueurPassant, Long idJoueurPasse, Integer typePasse, Date dateTime) {
        setIdMatch(idMatch);
        setIdJoueurPassant(idJoueurPassant);
        setIdJoueurPasse(idJoueurPasse);
        setTypePasse(typePasse);
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
    public Long getIdJoueurPassant() {
        return idJoueurPassant;
    }
    public void setIdJoueurPassant(Long idJoueurPassant) {
        this.idJoueurPassant = idJoueurPassant;
    }
    public Long getIdJoueurPasse() {
        return idJoueurPasse;
    }
    public void setIdJoueurPasse(Long idJoueurPasse) {
        this.idJoueurPasse = idJoueurPasse;
    }
    public Integer getTypePasse() {
        return typePasse;
    }
    public void setTypePasse(Integer typePasse) {
        this.typePasse = typePasse;
    }
    public Date getDateTime() {
        return dateTime;
    }
    public void setDateTime(Date dateTime) {
        this.dateTime = dateTime;
    }


}
