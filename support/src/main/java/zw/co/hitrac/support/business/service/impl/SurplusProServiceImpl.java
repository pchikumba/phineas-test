/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zw.co.hitrac.support.business.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zw.co.hitrac.support.business.domain.Agric.SurplusPro;
import zw.co.hitrac.support.business.repository.SurplusProRepo;
import zw.co.hitrac.support.business.service.SurplusProService;

/**
 *
 * @author gerald matsika
 */
@Service
public class SurplusProServiceImpl implements SurplusProService{
    
    @Autowired
    private SurplusProRepo surplusproRepo; 

    public SurplusPro save(SurplusPro surpluspro) {
        return surplusproRepo.save(surpluspro);
    }

    public List<SurplusPro> findAll() {
        return surplusproRepo.findAll();
    }

    public SurplusPro find(Long id) {
        return surplusproRepo.findOne(id);
    }

    public void delete(SurplusPro surpluspro) {
       surplusproRepo.delete(surpluspro);
    }
    
    
    
}


