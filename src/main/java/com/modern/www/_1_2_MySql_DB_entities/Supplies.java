package com.modern.www._1_2_MySql_DB_entities;
// Generated May 13, 2022 7:18:24 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Supplies generated by hbm2java
 */
@Entity
@Table(name="supplies"
    ,catalog="smrtamb"
)
public class Supplies  implements java.io.Serializable {


     private int supplyId;
     private String supplyName;
     private Set<CaseSupplies> caseSupplieses = new HashSet<CaseSupplies>(0);
     private Set<Hospital> hospitals = new HashSet<Hospital>(0);
     private Set<AmbulanceSupplies> ambulanceSupplieses = new HashSet<AmbulanceSupplies>(0);

    public Supplies() {
    }

	
    public Supplies(int supplyId, String supplyName) {
        this.supplyId = supplyId;
        this.supplyName = supplyName;
    }
    public Supplies(int supplyId, String supplyName, Set<CaseSupplies> caseSupplieses, Set<Hospital> hospitals, Set<AmbulanceSupplies> ambulanceSupplieses) {
       this.supplyId = supplyId;
       this.supplyName = supplyName;
       this.caseSupplieses = caseSupplieses;
       this.hospitals = hospitals;
       this.ambulanceSupplieses = ambulanceSupplieses;
    }
   
     @Id 

    
    @Column(name="supply_id", unique=true, nullable=false)
    public int getSupplyId() {
        return this.supplyId;
    }
    
    public void setSupplyId(int supplyId) {
        this.supplyId = supplyId;
    }

    
    @Column(name="supply_name", nullable=false, length=150)
    public String getSupplyName() {
        return this.supplyName;
    }
    
    public void setSupplyName(String supplyName) {
        this.supplyName = supplyName;
    }

@OneToMany(fetch=FetchType.EAGER, mappedBy="supplies")
    public Set<CaseSupplies> getCaseSupplieses() {
        return this.caseSupplieses;
    }
    
    public void setCaseSupplieses(Set<CaseSupplies> caseSupplieses) {
        this.caseSupplieses = caseSupplieses;
    }

@ManyToMany(fetch=FetchType.EAGER, mappedBy="supplieses")
    public Set<Hospital> getHospitals() {
        return this.hospitals;
    }
    
    public void setHospitals(Set<Hospital> hospitals) {
        this.hospitals = hospitals;
    }

@OneToMany(fetch=FetchType.EAGER, mappedBy="supplies")
    public Set<AmbulanceSupplies> getAmbulanceSupplieses() {
        return this.ambulanceSupplieses;
    }
    
    public void setAmbulanceSupplieses(Set<AmbulanceSupplies> ambulanceSupplieses) {
        this.ambulanceSupplieses = ambulanceSupplieses;
    }




}


