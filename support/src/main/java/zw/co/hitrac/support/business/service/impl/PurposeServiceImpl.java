/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zw.co.hitrac.support.business.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zw.co.hitrac.support.business.domain.Agric.Purpose;
import zw.co.hitrac.support.business.repository.PurposeRepo;
import zw.co.hitrac.support.business.service.PurposeService;

/**
 *
 * @author gerald matsika
 */
@Service
public class PurposeServiceImpl implements PurposeService{
    
    @Autowired 
   private PurposeRepo purposeRepo;

    public Purpose save(Purpose purpose) {
        return purposeRepo.save(purpose);
    }

    public List<Purpose> findAll() {
        return purposeRepo.findAll();
    }

    public Purpose find(Long id) {
        return purposeRepo.findOne(id);
    }

    public void delete(Purpose purpose) {
       purposeRepo.delete(purpose);
    }
    
    
    
}

    

