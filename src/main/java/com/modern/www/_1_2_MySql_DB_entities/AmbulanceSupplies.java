package com.modern.www._1_2_MySql_DB_entities;
// Generated May 13, 2022 7:18:24 PM by Hibernate Tools 4.3.1


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * AmbulanceSupplies generated by hbm2java
 */
@Entity
@Table(name="ambulance_supplies"
    ,catalog="smrtamb"
)
public class AmbulanceSupplies  implements java.io.Serializable {


     private int supplyTransId;
     private Ambulance ambulance;
     private Supplies supplies;
     private Date transDate;

    public AmbulanceSupplies() {
    }

	
    public AmbulanceSupplies(int supplyTransId, Ambulance ambulance, Date transDate) {
        this.supplyTransId = supplyTransId;
        this.ambulance = ambulance;
        this.transDate = transDate;
    }
    public AmbulanceSupplies(int supplyTransId, Ambulance ambulance, Supplies supplies, Date transDate) {
       this.supplyTransId = supplyTransId;
       this.ambulance = ambulance;
       this.supplies = supplies;
       this.transDate = transDate;
    }
   
     @Id 

    
    @Column(name="supply_trans_id", unique=true, nullable=false)
    public int getSupplyTransId() {
        return this.supplyTransId;
    }
    
    public void setSupplyTransId(int supplyTransId) {
        this.supplyTransId = supplyTransId;
    }

@ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="car_number", nullable=false)
    public Ambulance getAmbulance() {
        return this.ambulance;
    }
    
    public void setAmbulance(Ambulance ambulance) {
        this.ambulance = ambulance;
    }

@ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="supply_id")
    public Supplies getSupplies() {
        return this.supplies;
    }
    
    public void setSupplies(Supplies supplies) {
        this.supplies = supplies;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="trans_date", nullable=false, length=10)
    public Date getTransDate() {
        return this.transDate;
    }
    
    public void setTransDate(Date transDate) {
        this.transDate = transDate;
    }




}

