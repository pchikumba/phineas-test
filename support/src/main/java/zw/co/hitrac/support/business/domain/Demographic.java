/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zw.co.hitrac.support.business.domain;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

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
    private Date dob;
    private EnumSex sex;
    private Enum maritalstatus;
    private Enum educationalqualification;
    private Enum religion;
    private String residentialaddress;
    private Enum accomodationtype;
    private Enum monthlyincome;
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

    public Enum getSex() {
        return sex;
    }

    public void setSex(EnumSex sex) {
        this.sex = sex;
    }

    public Enum getMaritalstatus() {
        return maritalstatus;
    }

    public void setMaritalstatus(Enum maritalstatus) {
        this.maritalstatus = maritalstatus;
    }

    public Enum getEducationalqualification() {
        return educationalqualification;
    }

    public void setEducationalqualification(Enum educationalqualification) {
        this.educationalqualification = educationalqualification;
    }

    public Enum getReligion() {
        return religion;
    }

    public void setReligion(Enum religion) {
        this.religion = religion;
    }

    public String getResidentialaddress() {
        return residentialaddress;
    }

    public void setResidentialaddress(String residentialaddress) {
        this.residentialaddress = residentialaddress;
    }

    public Enum getAccomodationtype() {
        return accomodationtype;
    }

    public void setAccomodationtype(Enum accomodationtype) {
        this.accomodationtype = accomodationtype;
    }

    public Enum getMonthlyincome() {
        return monthlyincome;
    }

    public void setMonthlyincome(Enum monthlyincome) {
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
