/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zw.co.hitrac.support.business.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zw.co.hitrac.support.business.domain.Demo.AgricActivity;
import zw.co.hitrac.support.business.repository.AgricActivityRepo;
import zw.co.hitrac.support.business.service.AgricActivityService;

/**
 *
 * @author gerald matsika
 */
@Service
public class AgricActivityServiceImpl implements AgricActivityService{
    
    @Autowired
    private AgricActivityRepo agricActivityRepo;
    
    public AgricActivity save(AgricActivity agricActivity) {
        return agricActivityRepo.save(agricActivity);
    }
    
        public List<AgricActivity> findAll() {
        return agricActivityRepo.findAll();
    }

    public AgricActivity find(Long id) {
        AgricActivity agricActivity = agricActivityRepo.findOne(id);
        return agricActivity;
    }

    public void delete(AgricActivity agricActivity) {
        agricActivityRepo.delete(agricActivity);
    }
    
}
