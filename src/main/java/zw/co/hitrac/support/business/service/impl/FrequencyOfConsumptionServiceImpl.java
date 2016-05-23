/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zw.co.hitrac.support.business.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zw.co.hitrac.support.business.domain.Nutrition.FrequencyOfConsumption;
import zw.co.hitrac.support.business.repository.FrequencyOfConsumptionRepo;
import zw.co.hitrac.support.business.service.FrequencyOfConsumptionService;

/**
 *
 * @author hitrac
 */
@Service
public class FrequencyOfConsumptionServiceImpl implements  FrequencyOfConsumptionService {

    @Autowired
    private FrequencyOfConsumptionRepo frequencyCon;
    
    public FrequencyOfConsumption save(FrequencyOfConsumption frequencyOfConsumption) {
        return frequencyCon.save(frequencyOfConsumption);
    }

    public List<FrequencyOfConsumption> findAll() {
       return frequencyCon.findAll();
    }

    public FrequencyOfConsumption find(Long id) {
        return frequencyCon.findOne(id);
    }

    public void delete(FrequencyOfConsumption frequencyOfConsumption) {
         frequencyCon.delete(frequencyOfConsumption);
    }
    
}
