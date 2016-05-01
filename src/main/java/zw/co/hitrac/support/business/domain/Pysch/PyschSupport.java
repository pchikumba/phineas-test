/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zw.co.hitrac.support.business.domain.Pysch;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author hitrac
 */
@Entity
public class PyschSupport implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String trainingPsg;
    private String projectdone;
//    support group or social network joined
    private String supnetjoined;
//    are you affiliated to znnnp+
    private Boolean znnnpaffil=Boolean.FALSE;
    private Boolean socialmedia = Boolean.FALSE;
    private Boolean internetacces = Boolean.FALSE;
    private String mobileOs;
    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTrainingPsg() {
        return trainingPsg;
    }

    public void setTrainingPsg(String trainingPsg) {
        this.trainingPsg = trainingPsg;
    }

    public String getProjectdone() {
        return projectdone;
    }

    public void setProjectdone(String projectdone) {
        this.projectdone = projectdone;
    }

    public String getSupnetjoined() {
        return supnetjoined;
    }

    public void setSupnetjoined(String supnetjoined) {
        this.supnetjoined = supnetjoined;
    }

    public Boolean getZnnnpaffil() {
        return znnnpaffil;
    }

    public void setZnnnpaffil(Boolean znnnpaffil) {
        this.znnnpaffil = znnnpaffil;
    }

    public Boolean getSocialmedia() {
        return socialmedia;
    }

    public void setSocialmedia(Boolean socialmedia) {
        this.socialmedia = socialmedia;
    }

    public Boolean getInternetacces() {
        return internetacces;
    }

    public void setInternetacces(Boolean internetacces) {
        this.internetacces = internetacces;
    }

    public String getMobileOs() {
        return mobileOs;
    }

    public void setMobileOs(String mobileOs) {
        this.mobileOs = mobileOs;
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
        if (!(object instanceof PyschSupport)) {
            return false;
        }
        PyschSupport other = (PyschSupport) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "zw.co.hitrac.support.business.domain.Pysch.PyschSupport[ id=" + id + " ]";
    }
    
}
