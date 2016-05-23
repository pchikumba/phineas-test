/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zw.co.hitrac.support.business.domain.Nutrition;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author hitrac
 */
@Entity
public class Nutrition implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private FrequencyOfConsumption  frequencyOfConsumption ;
    private Recommender recommender;
    private TraditionalFoodTaken traditionalFoodTaken;
    @Enumerated(EnumType.STRING)
    private TraditionalFoodEnum traditionalFoodEnum ;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public FrequencyOfConsumption getFrequencyOfConsumption() {
        return frequencyOfConsumption;
    }

    public void setFrequencyOfConsumption(FrequencyOfConsumption frequencyOfConsumption) {
        this.frequencyOfConsumption = frequencyOfConsumption;
    }

    public Recommender getRecommender() {
        return recommender;
    }

    public void setRecommender(Recommender recommender) {
        this.recommender = recommender;
    }

    public TraditionalFoodTaken getTraditionalFoodTaken() {
        return traditionalFoodTaken;
    }

    public void setTraditionalFoodTaken(TraditionalFoodTaken traditionalFoodTaken) {
        this.traditionalFoodTaken = traditionalFoodTaken;
    }

    public TraditionalFoodEnum getTraditionalFoodEnum() {
        return traditionalFoodEnum;
    }

    public void setTraditionalFoodEnum(TraditionalFoodEnum traditionalFoodEnum) {
        this.traditionalFoodEnum = traditionalFoodEnum;
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
        if (!(object instanceof Nutrition)) {
            return false;
        }
        Nutrition other = (Nutrition) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "zw.co.hitrac.support.business.domain.Nutrition.Nutrition[ id=" + id + " ]";
    }
    
}
