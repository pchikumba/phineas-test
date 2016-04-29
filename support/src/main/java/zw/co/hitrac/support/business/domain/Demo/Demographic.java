/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zw.co.hitrac.support.business.domain.Demo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;

/**
 *
 * @author pchikumba
 */
@Entity
public class Demographic implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String surname;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dob;
//    ############ still to use commented out infor
    @ManyToOne
    private Gender gender;
    @ManyToOne
    private MaritalStatus maritalstatus;
    @ManyToOne
    private Qualification educationalqualification;
    private String religion;
    private String residentialaddress;
    @ManyToOne
    private Accommodation accommodation;
    private double monthlyincome;
    private String occupation;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getReligion() {
        return religion;
    }

    public void setReligion(String religion) {
        this.religion = religion;
    }

    public String getResidentialaddress() {
        return residentialaddress;
    }

    public void setResidentialaddress(String residentialaddress) {
        this.residentialaddress = residentialaddress;
    }

    public Accommodation getAccommodation() {
        return accommodation;
    }

    public void setAccommodation(Accommodation accommodation) {
        this.accommodation = accommodation;
    }


    public double getMonthlyincome() {
        return monthlyincome;
    }

    public void setMonthlyincome(Double monthlyincome) {
        this.monthlyincome = monthlyincome;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public MaritalStatus getMaritalstatus() {
        return maritalstatus;
    }

    public void setMaritalstatus(MaritalStatus maritalstatus) {
        this.maritalstatus = maritalstatus;
    }

    public Qualification getEducationalqualification() {
        return educationalqualification;
    }

    public void setEducationalqualification(Qualification educationalqualification) {
        this.educationalqualification = educationalqualification;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Demographic)) {
            return false;
        }
        Demographic other = (Demographic) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "zw.co.hitrac.support.business.domain.DemographicData[ id=" + id + " ]";
    }

}
