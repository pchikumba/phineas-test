/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zw.co.hitrac.support.business.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zw.co.hitrac.support.business.domain.Demographic;
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
        return demographicRepo.findAll();
    }

    public Demographic find(Long id) {
        Demographic demographic = demographicRepo.findOne(id);
        
        return demographic;
    }
    
}
