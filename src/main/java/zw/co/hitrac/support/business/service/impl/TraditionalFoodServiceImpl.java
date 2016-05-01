/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zw.co.hitrac.support.business.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zw.co.hitrac.support.business.domain.Nutrition.TraditionalFood;
import zw.co.hitrac.support.business.repository.TraditionalFoodRepo;
import zw.co.hitrac.support.business.service.TraditionalFoodService;

/**
 *
 * @author pchikumba
 */
@Service
public class TraditionalFoodServiceImpl implements TraditionalFoodService{
    
    @Autowired
    
    private TraditionalFoodRepo traditionalFoodRepo;

    public TraditionalFood save(TraditionalFood traditionalFood) {
        return traditionalFoodRepo.save(traditionalFood);
    }

    public List<TraditionalFood> findAll() {
        return traditionalFoodRepo.findAll();
    }

    public TraditionalFood find(Long id) {
     return traditionalFoodRepo.findOne(id);
    }

    public void delete(TraditionalFood traditionalFood) {
        traditionalFoodRepo.delete(traditionalFood);
    }
 
    
    
    
}
