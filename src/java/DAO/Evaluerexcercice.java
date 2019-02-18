package DAO;
// Generated 18 f�vr. 2019 11:30:37 by Hibernate Tools 4.3.1

import java.util.Objects;




/**
 * Evaluerexcercice generated by hbm2java
 */
public class Evaluerexcercice  implements java.io.Serializable {


     private EvaluerexcerciceId id;
     private Client client;
     private Seancebilan seancebilan;
     private Typeexercice typeexercice;
     private Float temps;
     private Integer nbrep;

    public Evaluerexcercice() {
    }

	
    public Evaluerexcercice(EvaluerexcerciceId id, Client client, Seancebilan seancebilan, Typeexercice typeexercice) {
        this.id = id;
        this.client = client;
        this.seancebilan = seancebilan;
        this.typeexercice = typeexercice;
    }
    public Evaluerexcercice(EvaluerexcerciceId id, Client client, Seancebilan seancebilan, Typeexercice typeexercice, Float temps, Integer nbrep) {
       this.id = id;
       this.client = client;
       this.seancebilan = seancebilan;
       this.typeexercice = typeexercice;
       this.temps = temps;
       this.nbrep = nbrep;
    }
   
    public EvaluerexcerciceId getId() {
        return this.id;
    }
    
    public void setId(EvaluerexcerciceId id) {
        this.id = id;
    }
    public Client getClient() {
        return this.client;
    }
    
    public void setClient(Client client) {
        this.client = client;
    }
    public Seancebilan getSeancebilan() {
        return this.seancebilan;
    }
    
    public void setSeancebilan(Seancebilan seancebilan) {
        this.seancebilan = seancebilan;
    }
    public Typeexercice getTypeexercice() {
        return this.typeexercice;
    }
    
    public void setTypeexercice(Typeexercice typeexercice) {
        this.typeexercice = typeexercice;
    }
    public Float getTemps() {
        return this.temps;
    }
    
    public void setTemps(Float temps) {
        this.temps = temps;
    }
    public Integer getNbrep() {
        return this.nbrep;
    }
    
    public void setNbrep(Integer nbrep) {
        this.nbrep = nbrep;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.id);
        hash = 97 * hash + Objects.hashCode(this.temps);
        hash = 97 * hash + Objects.hashCode(this.nbrep);
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
        final Evaluerexcercice other = (Evaluerexcercice) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.temps, other.temps)) {
            return false;
        }
        if (!Objects.equals(this.nbrep, other.nbrep)) {
            return false;
        }
        return true;
    }




}

