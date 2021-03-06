package DAO;
// Generated 18 f�vr. 2019 11:30:37 by Hibernate Tools 4.3.1

import java.util.Objects;




/**
 * Affectersc generated by hbm2java
 */
public class Affectersc  implements java.io.Serializable {


     private AffecterscId id;
     private Programme programme;
     private Seance seance;
     private Integer numsemaine;
     private Integer ordresc;

    public Affectersc() {
    }

	
    public Affectersc(AffecterscId id, Programme programme, Seance seance) {
        this.id = id;
        this.programme = programme;
        this.seance = seance;
    }
    public Affectersc(AffecterscId id, Programme programme, Seance seance, Integer numsemaine, Integer ordresc) {
       this.id = id;
       this.programme = programme;
       this.seance = seance;
       this.numsemaine = numsemaine;
       this.ordresc = ordresc;
    }
   
    public AffecterscId getId() {
        return this.id;
    }
    
    public void setId(AffecterscId id) {
        this.id = id;
    }
    public Programme getProgramme() {
        return this.programme;
    }
    
    public void setProgramme(Programme programme) {
        this.programme = programme;
    }
    public Seance getSeance() {
        return this.seance;
    }
    
    public void setSeance(Seance seance) {
        this.seance = seance;
    }
    public Integer getNumsemaine() {
        return this.numsemaine;
    }
    
    public void setNumsemaine(Integer numsemaine) {
        this.numsemaine = numsemaine;
    }
    public Integer getOrdresc() {
        return this.ordresc;
    }
    
    public void setOrdresc(Integer ordresc) {
        this.ordresc = ordresc;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 71 * hash + Objects.hashCode(this.id);
        hash = 71 * hash + Objects.hashCode(this.numsemaine);
        hash = 71 * hash + Objects.hashCode(this.ordresc);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Affectersc other = (Affectersc) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.numsemaine, other.numsemaine)) {
            return false;
        }
        if (!Objects.equals(this.ordresc, other.ordresc)) {
            return false;
        }
        return true;
    }




}


