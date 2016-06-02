
package zw.co.hitrac.support.business.domain.Demo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import zw.co.hitrac.support.business.domain.Agric.AgricActivity;
import zw.co.hitrac.support.business.domain.Nutrition.Nutrition;
import zw.co.hitrac.support.business.domain.Pysch.PyschSupport;

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
    @OneToMany(fetch = FetchType.EAGER)
    private List<Nutrition> nutrition;
    @OneToMany(fetch = FetchType.EAGER)
    private List<PyschSupport> psychsupport;
    @OneToMany(fetch = FetchType.EAGER)
    private List<AgricActivity> agricactivity;

    private String firstname;

    private String surname;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dob; 
    private Gender gender;
    @ManyToOne
    private MaritalStatus maritalstatus;
   @ManyToOne
    private Religion religion;
    @ManyToOne
    private Qualification qualification;
   private String residentialaddress;
    @ManyToOne
    private Accommodation accommodation;
    @ManyToOne
    private Income income ;
    private String occupation;
    public List<Nutrition> getNutrition() {
        return nutrition;
    }

    public void setNutrition(List<Nutrition> nutrition) {
        this.nutrition = nutrition;
    }

    public List<PyschSupport> getPsychsupport() {
        return psychsupport;
    }

    public void setPsychsupport(List<PyschSupport> psychsupport) {
        this.psychsupport = psychsupport;
    }
    

    

    public List<AgricActivity> getAgricactivity() {
        return agricactivity;
    }

    public void setAgricactivity(List<AgricActivity> agricactivity) {
        this.agricactivity = agricactivity;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
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

    public Religion getReligion() {
        return religion;
    }

    public void setReligion(Religion religion) {
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

    public Income getIncome() {
        return income;
    }

    public void setIncome(Income income) {
        this.income = income;
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

    public Qualification getQualification() {
        return qualification;
    }

    public void setQualification(Qualification qualification) {
        this.qualification = qualification;
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
