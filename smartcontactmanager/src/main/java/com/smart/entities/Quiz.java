package com.smart.entities;
import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;






@Entity
@Table(name = "Quiz")
public class Quiz implements Serializable {

    public Quiz() {

        // TODO Auto-generated constructor stub
    }
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    @Column(name="SectionID")
    private int SectionID;
    @Column(name="SubSectionID")
    private String SubSectionID;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "P_id", referencedColumnName = "id")
    private Patient patient;
    @Column(name="Response")
    private String Response;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getSectionID() {
        return SectionID;
    }
    public void setSectionID(int sectionID) {
        SectionID = sectionID;
    }
    public String getSubSectionID() {
        return SubSectionID;
    }
    public void setSubSectionID(String subSectionID) {
        SubSectionID = subSectionID;
    }
    public Patient getPatient() {
        return patient;
    }
    public void setPatient(Patient patient) {
        this.patient = patient;
    }
    public String getResponse() {
        return Response;
    }
    public void setResponse(String response) {
        Response = response;
    }
    public Quiz(int sectionID, String subSectionID, Patient patient, String response) {
        super();
        SectionID = sectionID;
        SubSectionID = subSectionID;
        this.patient = patient;
        Response = response;
    }



}
