package com.modern.www._1_2_MySql_DB_entities;
// Generated May 13, 2022 7:18:24 PM by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * PatientDiseasesId generated by hbm2java
 */
@Embeddable
public class PatientDiseasesId  implements java.io.Serializable {


     private long ssn;
     private int diseaseId;

    public PatientDiseasesId() {
    }

    public PatientDiseasesId(long ssn, int diseaseId) {
       this.ssn = ssn;
       this.diseaseId = diseaseId;
    }
   


    @Column(name="SSN", nullable=false)
    public long getSsn() {
        return this.ssn;
    }
    
    public void setSsn(long ssn) {
        this.ssn = ssn;
    }


    @Column(name="disease_id", nullable=false)
    public int getDiseaseId() {
        return this.diseaseId;
    }
    
    public void setDiseaseId(int diseaseId) {
        this.diseaseId = diseaseId;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof PatientDiseasesId) ) return false;
		 PatientDiseasesId castOther = ( PatientDiseasesId ) other; 
         
		 return (this.getSsn()==castOther.getSsn())
 && (this.getDiseaseId()==castOther.getDiseaseId());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + (int) this.getSsn();
         result = 37 * result + this.getDiseaseId();
         return result;
   }   


}

