/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zw.co.hitrac.support.business.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zw.co.hitrac.support.business.domain.Nutrition.Frequency;
import zw.co.hitrac.support.business.repository.FrequencyRepo;
import zw.co.hitrac.support.business.service.FrequencyService;

/**
 *
 * @author pchikumba
 */
@Service
public class FrequencyServiceImpl implements FrequencyService{
    
    @Autowired
    
    private FrequencyRepo frequencyRepo;

    public Frequency save(Frequency frequency) {
        return frequencyRepo.save(frequency);
    }

    public List<Frequency> findAll() {
        return frequencyRepo.findAll();
    }

    public Frequency find(Long id) {
     return frequencyRepo.findOne(id);
    }

    public void delete(Frequency frequency) {
        frequencyRepo.delete(frequency);
    }
 
    
    
    
}
