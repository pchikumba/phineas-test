/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zw.co.hitrac.support.business.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zw.co.hitrac.support.business.domain.Nutrition.FoodRecommender;
import zw.co.hitrac.support.business.repository.FoodRecommenderRepo;
import zw.co.hitrac.support.business.service.FoodRecommenderService;

/**
 *
 * @author pchikumba
 */
@Service
public class FoodRecommenderServiceImpl implements FoodRecommenderService{
    
    @Autowired
    
    private FoodRecommenderRepo foodRecommenderRepo;

    public FoodRecommender save(FoodRecommender foodRecommender) {
        return foodRecommenderRepo.save(foodRecommender);
    }

    public List<FoodRecommender> findAll() {
        return foodRecommenderRepo.findAll();
    }

    public FoodRecommender find(Long id) {
     return foodRecommenderRepo.findOne(id);
    }

    public void delete(FoodRecommender foodRecommender) {
        foodRecommenderRepo.delete(foodRecommender);
    }
 
    
    
    
}
