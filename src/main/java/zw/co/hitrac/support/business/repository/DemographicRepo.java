
package zw.co.hitrac.support.business.repository;

import java.io.Serializable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import zw.co.hitrac.support.business.domain.Demo.Demographic;

/**
 *
 * @author pchikumba
 */
public interface DemographicRepo extends JpaRepository<Demographic, Serializable>{
    
    
    @Query("Select c from Demographic c where c.firstname like %:name% or c.surname like %:name%" )
    public Page<Demographic> findDemographics(Pageable pageable,@Param("name") String name);

//    public Page<Demographic> findDemographics(PageRequest pageRequest, String searchTerm);


    


    
}
