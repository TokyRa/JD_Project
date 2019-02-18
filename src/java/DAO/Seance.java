package DAO;
// Generated 18 f�vr. 2019 11:30:37 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 * Seance generated by hbm2java
 */
public class Seance  implements java.io.Serializable {


     private Integer idsc;
     private Set seanceprogammes = new HashSet(0);
     private Set affecterscs = new HashSet(0);
     private Set seancebilans = new HashSet(0);

    public Seance() {
    }

    public Seance(Set seanceprogammes, Set affecterscs, Set seancebilans) {
       this.seanceprogammes = seanceprogammes;
       this.affecterscs = affecterscs;
       this.seancebilans = seancebilans;
    }
   
    public Integer getIdsc() {
        return this.idsc;
    }
    
    public void setIdsc(Integer idsc) {
        this.idsc = idsc;
    }
    public Set getSeanceprogammes() {
        return this.seanceprogammes;
    }
    
    public void setSeanceprogammes(Set seanceprogammes) {
        this.seanceprogammes = seanceprogammes;
    }
    public Set getAffecterscs() {
        return this.affecterscs;
    }
    
    public void setAffecterscs(Set affecterscs) {
        this.affecterscs = affecterscs;
    }
    public Set getSeancebilans() {
        return this.seancebilans;
    }
    
    public void setSeancebilans(Set seancebilans) {
        this.seancebilans = seancebilans;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 47 * hash + Objects.hashCode(this.idsc);
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
        final Seance other = (Seance) obj;
        if (!Objects.equals(this.idsc, other.idsc)) {
            return false;
        }
        return true;
    }




}

