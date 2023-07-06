package com.modern.www._1_2_MySql_DB_entities;
// Generated May 13, 2022 7:18:24 PM by Hibernate Tools 4.3.1


import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * PatientAmbulanceHospital generated by hbm2java
 */
@Entity
@Table(name="patient_ambulance_hospital"
    ,catalog="smrtamb"
)
public class PatientAmbulanceHospital  implements java.io.Serializable {


     private PatientAmbulanceHospitalId id;
     private Ambulance ambulance;
     private Hospital hospital;
     private Patient patient;
     private String street;
     private String city;

    public PatientAmbulanceHospital() {
    }

    public PatientAmbulanceHospital(PatientAmbulanceHospitalId id, Ambulance ambulance, Hospital hospital, Patient patient, String street, String city) {
       this.id = id;
       this.ambulance = ambulance;
       this.hospital = hospital;
       this.patient = patient;
       this.street = street;
       this.city = city;
    }
   
     @EmbeddedId

    
    @AttributeOverrides( {
        @AttributeOverride(name="transDate", column=@Column(name="trans_date", nullable=false, length=10) ), 
        @AttributeOverride(name="pssn", column=@Column(name="PSSN", nullable=false) ), 
        @AttributeOverride(name="carNumber", column=@Column(name="car_number", nullable=false) ), 
        @AttributeOverride(name="hospitalId", column=@Column(name="hospital_id", nullable=false) ) } )
    public PatientAmbulanceHospitalId getId() {
        return this.id;
    }
    
    public void setId(PatientAmbulanceHospitalId id) {
        this.id = id;
    }

@ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="car_number", nullable=false, insertable=false, updatable=false)
    public Ambulance getAmbulance() {
        return this.ambulance;
    }
    
    public void setAmbulance(Ambulance ambulance) {
        this.ambulance = ambulance;
    }

@ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="hospital_id", nullable=false, insertable=false, updatable=false)
    public Hospital getHospital() {
        return this.hospital;
    }
    
    public void setHospital(Hospital hospital) {
        this.hospital = hospital;
    }

@ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="PSSN", nullable=false, insertable=false, updatable=false)
    public Patient getPatient() {
        return this.patient;
    }
    
    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    
    @Column(name="street", nullable=false, length=150)
    public String getStreet() {
        return this.street;
    }
    
    public void setStreet(String street) {
        this.street = street;
    }

    
    @Column(name="city", nullable=false, length=150)
    public String getCity() {
        return this.city;
    }
    
    public void setCity(String city) {
        this.city = city;
    }




}


