/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zw.co.hitrac.support.business.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zw.co.hitrac.support.business.domain.Nutrition.TraditionalFoodTaken;
import zw.co.hitrac.support.business.repository.TraditionalFoodTakenRepo;
import zw.co.hitrac.support.business.service.TraditionalFoodTakenService;

/**
 *
 * @author hitrac
 */
@Service
public class TraditionalFoodTakenServiceImpl implements   TraditionalFoodTakenService{

    @Autowired
    private  TraditionalFoodTakenRepo tdFoodTaken;
    
    
    public TraditionalFoodTaken save(TraditionalFoodTaken traditionalFoodTaken) {
      return  tdFoodTaken.save(traditionalFoodTaken);
    }

    public List<TraditionalFoodTaken> findAll() {
     return tdFoodTaken.findAll();
    }

    public TraditionalFoodTaken find(Long id) {
        
        return tdFoodTaken.findOne(id);
      
    }

    public void delete(TraditionalFoodTaken traditionalFoodTaken ) {
        
         tdFoodTaken.delete(traditionalFoodTaken);
     
    }
    
}
