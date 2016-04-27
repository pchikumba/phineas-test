/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zw.co.hitrac.support.business.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import zw.co.hitrac.support.business.domain.Religion;
import zw.co.hitrac.support.business.repository.ReligionRepo;
import zw.co.hitrac.support.business.service.ReligionService;

/**
 *
 * @author pchikumba
 */
public class ReligionServiceImpl implements ReligionService{
    
    
     @Autowired
private ReligionRepo religionRepo;

  public Religion save(Religion religion) {
        return religionRepo.save(religion);
    }

    public List<Religion> findAll() {
        return religionRepo.findAll();
    }

    public Religion find(Long id) {
        Religion religion = religionRepo.findOne(id);
        
        return religion;
    }
    
    
}
