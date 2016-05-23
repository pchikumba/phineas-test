/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zw.co.hitrac.support.business.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zw.co.hitrac.support.business.domain.Nutrition.Recommender;
import zw.co.hitrac.support.business.repository.RecommenderRepo;
import zw.co.hitrac.support.business.service.RecommenderService;

/**
 *
 * @author hitrac
 */
@Service
public class RecommenderServiceImpl implements RecommenderService{
 @Autowired
 private RecommenderRepo recommenderRepo;

    public Recommender save(Recommender recommender) {
        return recommenderRepo.save(recommender);
        
    }

    public List<Recommender> findAll() {
       return recommenderRepo.findAll();
    }

    public Recommender find(Long id) {
       return recommenderRepo.findOne(id);
    }

    public void delete(Recommender recommender) {
        recommenderRepo.delete(recommender);
    }
    
}
