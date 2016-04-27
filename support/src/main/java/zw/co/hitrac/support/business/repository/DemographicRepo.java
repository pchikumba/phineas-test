
package zw.co.hitrac.support.business.repository;

import java.io.Serializable;
import org.springframework.data.jpa.repository.JpaRepository;
import zw.co.hitrac.support.business.domain.Demographic;

/**
 *
 * @author pchikumba
 */
public interface DemographicRepo extends JpaRepository<Demographic, Serializable>{
    
}
