/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zw.co.hitrac.support.business.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zw.co.hitrac.support.business.domain.Agric.AgricPractice;
import zw.co.hitrac.support.business.repository.AgricPracticeRepo;
import zw.co.hitrac.support.business.service.AgricPracticeService;

/**
 *
 * @author gerald matsika
 */
@Service
public class AgricPracticeServiceImpl implements AgricPracticeService{
    
        @Autowired
    
    private AgricPracticeRepo agricpracticeRepo;

    public AgricPractice save(AgricPractice agricpractice) {
        return agricpracticeRepo.save(agricpractice);
    }

    public List<AgricPractice> findAll() {
        return agricpracticeRepo.findAll();
    }

    public AgricPractice find(Long id) {
        return agricpracticeRepo.findOne(id);
    }

    public void delete(AgricPractice agricpractice) {
       agricpracticeRepo.delete(agricpractice);
    }
    
    
    
}

    

