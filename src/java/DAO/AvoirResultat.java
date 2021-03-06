package DAO;
// Generated 18 f�vr. 2019 11:30:37 by Hibernate Tools 4.3.1

import java.util.Objects;




/**
 * AvoirResultat generated by hbm2java
 */
public class AvoirResultat  implements java.io.Serializable {


     private AvoirResultatId id;
     private Client client;
     private Programme programme;
     private Seanceprogamme seanceprogamme;
     private Typeexercice typeexercice;
     private String libres;

    public AvoirResultat() {
    }

	
    public AvoirResultat(AvoirResultatId id, Client client, Programme programme, Seanceprogamme seanceprogamme, Typeexercice typeexercice) {
        this.id = id;
        this.client = client;
        this.programme = programme;
        this.seanceprogamme = seanceprogamme;
        this.typeexercice = typeexercice;
    }
    public AvoirResultat(AvoirResultatId id, Client client, Programme programme, Seanceprogamme seanceprogamme, Typeexercice typeexercice, String libres) {
       this.id = id;
       this.client = client;
       this.programme = programme;
       this.seanceprogamme = seanceprogamme;
       this.typeexercice = typeexercice;
       this.libres = libres;
    }
   
    public AvoirResultatId getId() {
        return this.id;
    }
    
    public void setId(AvoirResultatId id) {
        this.id = id;
    }
    public Client getClient() {
        return this.client;
    }
    
    public void setClient(Client client) {
        this.client = client;
    }
    public Programme getProgramme() {
        return this.programme;
    }
    
    public void setProgramme(Programme programme) {
        this.programme = programme;
    }
    public Seanceprogamme getSeanceprogamme() {
        return this.seanceprogamme;
    }
    
    public void setSeanceprogamme(Seanceprogamme seanceprogamme) {
        this.seanceprogamme = seanceprogamme;
    }
    public Typeexercice getTypeexercice() {
        return this.typeexercice;
    }
    
    public void setTypeexercice(Typeexercice typeexercice) {
        this.typeexercice = typeexercice;
    }
    public String getLibres() {
        return this.libres;
    }
    
    public void setLibres(String libres) {
        this.libres = libres;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.id);
        hash = 97 * hash + Objects.hashCode(this.libres);
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
        final AvoirResultat other = (AvoirResultat) obj;
        if (!Objects.equals(this.libres, other.libres)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }




}


