package Basket.rebond;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Rebond {
    
    @Id
    private Long id;

    @Column(name = "idMatch")
    private Long idMatch;

    @Column(name = "idJoueur")
    private Long idJoueur;

    @Column(name = "typeRebond")
    private Integer typeRebond;

    @Column(name = "datetime")
    private Date dateTime;

    

    public Rebond() {

    }


    public Rebond(Long id, Long idMatch, Long idJoueur, Integer typeRebond, Date dateTime) {
        setId(id);
        setIdMatch(idMatch);
        setIdJoueur(idJoueur);
        setTypeRebond(typeRebond);
        setDateTime(dateTime);
    }

    public Rebond(Long idMatch, Long idJoueur, Integer typeRebond, Date dateTime) {
        setIdMatch(idMatch);
        setIdJoueur(idJoueur);
        setTypeRebond(typeRebond);
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
    public Integer getTypeRebond() {
        return typeRebond;
    }
    public void setTypeRebond(Integer typeRebond) {
        this.typeRebond = typeRebond;
    }
    public Date getDateTime() {
        return dateTime;
    }
    public void setDateTime(Date dateTime) {
        this.dateTime = dateTime;
    }
}
