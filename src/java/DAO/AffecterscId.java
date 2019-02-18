package DAO;
// Generated 18 fvr. 2019 11:30:37 by Hibernate Tools 4.3.1



/**
 * AffecterscId generated by hbm2java
 */
public class AffecterscId  implements java.io.Serializable {


     private int idprog;
     private int idsc;

    public AffecterscId() {
    }

    public AffecterscId(int idprog, int idsc) {
       this.idprog = idprog;
       this.idsc = idsc;
    }
   
    public int getIdprog() {
        return this.idprog;
    }
    
    public void setIdprog(int idprog) {
        this.idprog = idprog;
    }
    public int getIdsc() {
        return this.idsc;
    }
    
    public void setIdsc(int idsc) {
        this.idsc = idsc;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof AffecterscId) ) return false;
		 AffecterscId castOther = ( AffecterscId ) other; 
         
		 return (this.getIdprog()==castOther.getIdprog())
 && (this.getIdsc()==castOther.getIdsc());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getIdprog();
         result = 37 * result + this.getIdsc();
         return result;
   }   


}


