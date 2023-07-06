package com.modern.www._1_2_MySql_DB_entities;
// Generated May 13, 2022 7:18:24 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Hospital generated by hbm2java
 */
@Entity
@Table(name="hospital"
    ,catalog="smrtamb"
)
public class Hospital  implements java.io.Serializable {


     private int hospitalId;
     private String hospitalName;
     private int emptyRooms;
     private int emptyOperatingTheaters;
     private String address;
     private Set<Doctor> doctors = new HashSet<Doctor>(0);
     private Set<Department> departments = new HashSet<Department>(0);
     private Set<Supplies> supplieses = new HashSet<Supplies>(0);
     private Set<PatientAmbulanceHospital> patientAmbulanceHospitals = new HashSet<PatientAmbulanceHospital>(0);

    public Hospital() {
    }

	
    public Hospital(int hospitalId, String hospitalName, int emptyRooms, int emptyOperatingTheaters, String address) {
        this.hospitalId = hospitalId;
        this.hospitalName = hospitalName;
        this.emptyRooms = emptyRooms;
        this.emptyOperatingTheaters = emptyOperatingTheaters;
        this.address = address;
    }
    public Hospital(int hospitalId, String hospitalName, int emptyRooms, int emptyOperatingTheaters, String address, Set<Doctor> doctors, Set<Department> departments, Set<Supplies> supplieses, Set<PatientAmbulanceHospital> patientAmbulanceHospitals) {
       this.hospitalId = hospitalId;
       this.hospitalName = hospitalName;
       this.emptyRooms = emptyRooms;
       this.emptyOperatingTheaters = emptyOperatingTheaters;
       this.address = address;
       this.doctors = doctors;
       this.departments = departments;
       this.supplieses = supplieses;
       this.patientAmbulanceHospitals = patientAmbulanceHospitals;
    }
   
     @Id 

    
    @Column(name="hospital_id", unique=true, nullable=false)
    public int getHospitalId() {
        return this.hospitalId;
    }
    
    public void setHospitalId(int hospitalId) {
        this.hospitalId = hospitalId;
    }

    
    @Column(name="hospital_name", nullable=false, length=100)
    public String getHospitalName() {
        return this.hospitalName;
    }
    
    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    
    @Column(name="empty_rooms", nullable=false)
    public int getEmptyRooms() {
        return this.emptyRooms;
    }
    
    public void setEmptyRooms(int emptyRooms) {
        this.emptyRooms = emptyRooms;
    }

    
    @Column(name="empty_operating_theaters", nullable=false)
    public int getEmptyOperatingTheaters() {
        return this.emptyOperatingTheaters;
    }
    
    public void setEmptyOperatingTheaters(int emptyOperatingTheaters) {
        this.emptyOperatingTheaters = emptyOperatingTheaters;
    }

    
    @Column(name="address", nullable=false, length=150)
    public String getAddress() {
        return this.address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }

@OneToMany(fetch=FetchType.EAGER, mappedBy="hospital")
    public Set<Doctor> getDoctors() {
        return this.doctors;
    }
    
    public void setDoctors(Set<Doctor> doctors) {
        this.doctors = doctors;
    }

@ManyToMany(fetch=FetchType.EAGER)
    @JoinTable(name="hospital_departments", catalog="smrtamb", joinColumns = { 
        @JoinColumn(name="hospital_id", nullable=false, updatable=false) }, inverseJoinColumns = { 
        @JoinColumn(name="department_number", nullable=false, updatable=false) })
    public Set<Department> getDepartments() {
        return this.departments;
    }
    
    public void setDepartments(Set<Department> departments) {
        this.departments = departments;
    }

@ManyToMany(fetch=FetchType.EAGER)
    @JoinTable(name="hospital_supplies", catalog="smrtamb", joinColumns = { 
        @JoinColumn(name="hospital_id", nullable=false, updatable=false) }, inverseJoinColumns = { 
        @JoinColumn(name="supply_id", nullable=false, updatable=false) })
    public Set<Supplies> getSupplieses() {
        return this.supplieses;
    }
    
    public void setSupplieses(Set<Supplies> supplieses) {
        this.supplieses = supplieses;
    }

@OneToMany(fetch=FetchType.EAGER, mappedBy="hospital")
    public Set<PatientAmbulanceHospital> getPatientAmbulanceHospitals() {
        return this.patientAmbulanceHospitals;
    }
    
    public void setPatientAmbulanceHospitals(Set<PatientAmbulanceHospital> patientAmbulanceHospitals) {
        this.patientAmbulanceHospitals = patientAmbulanceHospitals;
    }




}

