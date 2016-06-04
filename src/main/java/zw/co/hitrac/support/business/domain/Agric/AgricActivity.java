package zw.co.hitrac.support.business.domain.Agric;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import zw.co.hitrac.support.business.domain.Demo.Demographic;

/**
 *
 * @author gerald matsika
 */
@Entity
public class AgricActivity implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
//    ############ still to use commented out infor

    @ManyToOne
    private AgricPractice agricpractice;

    @ManyToOne
    private SurplusPro surpluspro;

    private Demographic demographic;

    @ManyToOne
    private Purpose purpose;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

//    public AgricPractice getAgricPractice() {
//        return agricpractice;
//    }
//
//    public void setAgricPractice(AgricPractice agricpractice) {
//        this.agricpractice = agricpractice;
//
//    }
    public SurplusPro getSurpluspro() {
        return surpluspro;
    }

    public void setSurpluspro(SurplusPro surpluspro) {
        this.surpluspro = surpluspro;
    }

    public AgricPractice getAgricpractice() {
        return agricpractice;
    }

    public void setAgricpractice(AgricPractice agricpractice) {
        this.agricpractice = agricpractice;
    }

    public Demographic getDemographic() {
        return demographic;
    }

    public void setDemographic(Demographic demographic) {
        this.demographic = demographic;
    }

    public Purpose getPurpose() {
        return purpose;
    }

    public void setPurpose(Purpose purpose) {
        this.purpose = purpose;
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
        if (!(object instanceof AgricActivity)) {
            return false;
        }
        AgricActivity other = (AgricActivity) object;
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
