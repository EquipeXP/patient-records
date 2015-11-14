package com.unicamp.entity;

import javax.persistence.*;

@Entity
@Table(name="consultation")
public class Consultation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "patientId")
    private Patient patient;

    @Column(name="mainComplaint")
    private String mainComplaint;

    @Column(name="subjectiveComments")
    private String subjectiveComments;

    @Column(name="height")
    private String height;

    @Column(name="weight")
    private String weight;

    @Column(name="temperature")
    private String temperature;

    @Column(name="diastolicPressure")
    private String diastolicPressure;

    @Column(name="systolicPressure")
    private String systolicPressure;

    @Column(name="heartRate")
    private String heartRate;

    @Column(name="glycemicLevel")
    private String glycemicLevel;

    @Column(name="respiratoryRate")
    private String respiratoryRate;

    @Column(name="oxigenLevel")
    private String oxigenLevel;

    @Column(name="carbonDioxideLevel")
    private String carbonDioxideLevel;

    @Column(name="objectiveComments")
    private String objectiveComments;

    @Column(name="analysisDiagnostic")
    private String analysisDiagnostic;

    @Column(name="analysisType")
    private String analysisType;

    @Column(name="analysisComments")
    private String analysisComments;

    @Column(name="conduct")
    private String conduct;

    @Column(name="planComments")
    private String planComments;

    @Column(name="evolution")
    private String evolution;

    public void setPatient(Patient patient) {
        this.patient = patient;
    }
}
