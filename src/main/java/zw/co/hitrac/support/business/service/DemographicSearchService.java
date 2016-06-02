
package zw.co.hitrac.support.business.service;

import java.io.Serializable;
import org.springframework.data.domain.Page;
import zw.co.hitrac.support.business.domain.Demo.Demographic;

/**
 *
 * @author hitrac
 */
public interface DemographicSearchService extends Serializable {
    
    public Page<Demographic> searchDemographic(Integer pageNumber);
    public Page<Demographic> searchDemographic(String searchTerm,Integer pageNumber);
    
}
