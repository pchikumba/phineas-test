
package zw.co.hitrac.support.business.domain.Nutrition;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 @author pchikumba
 */
@Entity
public class Nutrition implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne
    private FoodRecommender foodrecommender;
    @ManyToOne
    private Frequency frequency;
    @ManyToOne
    private TraditionalDish traditionalDish;
    @ManyToOne
    private TraditionalFood traditionalFood;

    public FoodRecommender getFoodrecommender() {
        return foodrecommender;
    }

    public void setFoodrecommender(FoodRecommender foodrecommender) {
        this.foodrecommender = foodrecommender;
    }

    public Frequency getFrequency() {
        return frequency;
    }

    public void setFrequency(Frequency frequency) {
        this.frequency = frequency;
    }

    public TraditionalDish getTraditionalDish() {
        return traditionalDish;
    }

    public void setTraditionalDish(TraditionalDish traditionalDish) {
        this.traditionalDish = traditionalDish;
    }

    public TraditionalFood getTraditionalFood() {
        return traditionalFood;
    }

    public void setTraditionalFood(TraditionalFood traditionalFood) {
        this.traditionalFood = traditionalFood;
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
