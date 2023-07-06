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
 * PatientSurgeryDoctor generated by hbm2java
 */
@Entity
@Table(name="patient_surgery_doctor"
    ,catalog="smrtamb"
)
public class PatientSurgeryDoctor  implements java.io.Serializable {


     private PatientSurgeryDoctorId id;
     private Doctor doctor;
     private Patient patient;
     private Surgery surgery;
     private String postoperativeDiagnosis;
     private String procedurePerformed;

    public PatientSurgeryDoctor() {
    }

    public PatientSurgeryDoctor(PatientSurgeryDoctorId id, Doctor doctor, Patient patient, Surgery surgery, String postoperativeDiagnosis, String procedurePerformed) {
       this.id = id;
       this.doctor = doctor;
       this.patient = patient;
       this.surgery = surgery;
       this.postoperativeDiagnosis = postoperativeDiagnosis;
       this.procedurePerformed = procedurePerformed;
    }
   
     @EmbeddedId

    
    @AttributeOverrides( {
        @AttributeOverride(name="surgeryDate", column=@Column(name="surgery_date", nullable=false, length=10) ), 
        @AttributeOverride(name="pssn", column=@Column(name="PSSN", nullable=false) ), 
        @AttributeOverride(name="surgeryId", column=@Column(name="surgery_id", nullable=false) ), 
        @AttributeOverride(name="dssn", column=@Column(name="DSSN", nullable=false) ) } )
    public PatientSurgeryDoctorId getId() {
        return this.id;
    }
    
    public void setId(PatientSurgeryDoctorId id) {
        this.id = id;
    }

@ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="DSSN", nullable=false, insertable=false, updatable=false)
    public Doctor getDoctor() {
        return this.doctor;
    }
    
    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

@ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="PSSN", nullable=false, insertable=false, updatable=false)
    public Patient getPatient() {
        return this.patient;
    }
    
    public void setPatient(Patient patient) {
        this.patient = patient;
    }

@ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="surgery_id", nullable=false, insertable=false, updatable=false)
    public Surgery getSurgery() {
        return this.surgery;
    }
    
    public void setSurgery(Surgery surgery) {
        this.surgery = surgery;
    }

    
    @Column(name="postoperative_diagnosis", nullable=false, length=200)
    public String getPostoperativeDiagnosis() {
        return this.postoperativeDiagnosis;
    }
    
    public void setPostoperativeDiagnosis(String postoperativeDiagnosis) {
        this.postoperativeDiagnosis = postoperativeDiagnosis;
    }

    
    @Column(name="procedure_performed", nullable=false, length=200)
    public String getProcedurePerformed() {
        return this.procedurePerformed;
    }
    
    public void setProcedurePerformed(String procedurePerformed) {
        this.procedurePerformed = procedurePerformed;
    }




}

