
package zw.co.hitrac.support.business.repository;

import java.io.Serializable;
import org.springframework.data.jpa.repository.JpaRepository;
import zw.co.hitrac.support.business.domain.Nutrition.Recommender;

/**
 *
 * @author hitrac
 */
public interface RecommenderRepo extends JpaRepository<Recommender, Serializable>{
    
}
