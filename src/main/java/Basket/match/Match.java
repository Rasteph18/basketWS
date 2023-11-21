package Basket.match;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Match {
    
    @Id
    private Long id;

    @Column(name = "idEq1")
    private Long idEq1;

    @Column(name = "idEq2")
    private Long idEq2;

    private Date date;

    public Match()
    {

    }

    public Match(Long id, Long idEq1, Long idEq2, Date date) {
        setId(id);
        setIdEq1(idEq1);
        setIdEq2(idEq2);
        setDate(date);
    }

    public Match(Long idEq1, Long idEq2, Date date) {
        setIdEq1(idEq1);
        setIdEq2(idEq2);
        setDate(date);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIdEq1() {
        return idEq1;
    }

    public void setIdEq1(Long idEq1) {
        this.idEq1 = idEq1;
    }

    public Long getIdEq2() {
        return idEq2;
    }

    public void setIdEq2(Long idEq2) {
        this.idEq2 = idEq2;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

}
