/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zw.co.hitrac.support.business.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zw.co.hitrac.support.business.domain.Nutrition.Nutrition;
import zw.co.hitrac.support.business.repository.NutritionRepo;
import zw.co.hitrac.support.business.service.NutritionService;

/**
 *
 * @author pchikumba
 */

@Service
public class NutritionServiceImpl implements NutritionService{
@Autowired
private NutritionRepo nutritionRepo;

    public Nutrition save(Nutrition nutrition) {
        return nutritionRepo.save(nutrition);
        
    }

    public List<Nutrition> findAll() {
        return nutritionRepo.findAll();
        
    }

    public Nutrition find(Long id) {
        return nutritionRepo.findOne(id);
        
    }

    public void delete(Nutrition nutrition) {
        nutritionRepo.delete(nutrition);
        
    }
    
}
