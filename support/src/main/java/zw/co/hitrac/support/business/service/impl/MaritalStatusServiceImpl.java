/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zw.co.hitrac.support.business.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zw.co.hitrac.support.business.domain.MaritalStatus;
import zw.co.hitrac.support.business.repository.MaritalStatusRepo;
import zw.co.hitrac.support.business.service.MaritalStatusService;

/**
 *
 * @author hitrac
 */


@Service
public class MaritalStatusServiceImpl implements MaritalStatusService {
    
    
   @Autowired
   private MaritalStatusRepo maritalStatusRepo;

    public MaritalStatus save(MaritalStatus maritalstatus) {
     return maritalStatusRepo.save(maritalstatus)  ; 
    }

    public List<MaritalStatus> findAll() {
        return maritalStatusRepo.findAll();
    }

    public MaritalStatus find(Long id) {
        return maritalStatusRepo.findOne(id);
    }

    public void delete(MaritalStatus maritalstatus) {
         maritalStatusRepo.delete(maritalstatus);
    }

   
  
    
}
