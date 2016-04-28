
package zw.co.hitrac.support.business.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zw.co.hitrac.support.business.domain.Demo.Qualification;
import zw.co.hitrac.support.business.repository.QualificationRepo;
import zw.co.hitrac.support.business.service.QualificationService;

/**
 *
 * @author tonderai ndangana
 * created by 28/04/2016
 */
@Service
public class QualificationServiceImpl implements QualificationService {

    @Autowired
    private QualificationRepo quaRepo;
    
    public Qualification save(Qualification qualification) {
      return quaRepo.save(qualification);
    }

    public List<Qualification> findAll() {
  return quaRepo.findAll();
    }

    public Qualification find(Long id) {
       return quaRepo.findOne(id);
    }

    public void delete(Qualification qualification) {
       quaRepo.delete(qualification);
    }
    
}
