
package zw.co.hitrac.support.business.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zw.co.hitrac.support.business.domain.Demo.Demographic;
import zw.co.hitrac.support.business.repository.DemographicRepo;
import zw.co.hitrac.support.business.service.DemographicService;

/**
 *
 * @author pchikumba
 */
@Service
public class DemographicServiceImpl implements DemographicService{
    
    
    
 @Autowired
private DemographicRepo demographicRepo;
    
    public Demographic save(Demographic demographic) {
        return demographicRepo.save(demographic);
    }

    public List<Demographic> findAll() {
        
        Demographic demographic = (Demographic) demographicRepo.findAll();
        
                return (List<Demographic>) demographic;
    }

    public Demographic find(Long id) {
        Demographic demographic = demographicRepo.findOne(id);
        
        return demographic;
    }

    public void delete(Demographic demographic) {
        
        demographicRepo.delete(demographic);
      
    }
    
}
