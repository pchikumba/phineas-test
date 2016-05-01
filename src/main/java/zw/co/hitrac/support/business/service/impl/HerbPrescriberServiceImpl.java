package zw.co.hitrac.support.business.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zw.co.hitrac.support.business.domain.HealthInformation.HerbPrescriber;
import zw.co.hitrac.support.business.repository.HerbPrescriberRepo;
import zw.co.hitrac.support.business.service.HerbPrescriberService;

/**
 *
 * @author tonderai ndangana 
 * 28/04/2016
 */
@Service
public class HerbPrescriberServiceImpl implements HerbPrescriberService {
    
    @Autowired
    private HerbPrescriberRepo herbrepo;
    
    
    public HerbPrescriber save (HerbPrescriber herbPrescriber){
      return herbrepo.save(herbPrescriber);
    }
    
  
    public HerbPrescriber find(Long id) {
        return herbrepo.findOne(id);
    }

    public void delete(HerbPrescriber herbPrescriber) {
        herbrepo.delete(herbPrescriber);
        
    }

    public List<HerbPrescriber> findAll() {
   return herbrepo.findAll();
    }
    
    
    
    
    
}
