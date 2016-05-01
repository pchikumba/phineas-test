/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zw.co.hitrac.support.business.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zw.co.hitrac.support.business.domain.Nutrition.TraditionalDish;
import zw.co.hitrac.support.business.repository.TraditionalDishRepo;
import zw.co.hitrac.support.business.service.TraditionalDishService;

/**
 *
 * @author pchikumba
 */
@Service
public class TraditionalDishServiceImpl implements TraditionalDishService{
    
    @Autowired
    
    private TraditionalDishRepo traditionalDishRepo;

    public TraditionalDish save(TraditionalDish traditionalDish) {
        return traditionalDishRepo.save(traditionalDish);
    }

    public List<TraditionalDish> findAll() {
        return traditionalDishRepo.findAll();
    }

    public TraditionalDish find(Long id) {
     return traditionalDishRepo.findOne(id);
    }

    public void delete(TraditionalDish traditionalDish) {
        traditionalDishRepo.delete(traditionalDish);
    }
 
    
    
    
}
