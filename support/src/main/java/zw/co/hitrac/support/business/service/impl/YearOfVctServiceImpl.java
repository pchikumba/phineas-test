/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zw.co.hitrac.support.business.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zw.co.hitrac.support.business.domain.HealthInformation.YearOfVct;
import zw.co.hitrac.support.business.repository.YearOfVctRepo;
import zw.co.hitrac.support.business.service.YearOfVctService;

/**
 *
 * @author tonderai ndangana
 * 29/04/2016
 * 
 */
@Service
public class YearOfVctServiceImpl implements YearOfVctService {
    
    @Autowired
    private YearOfVctRepo yearofvctrepo;

    public YearOfVct save(YearOfVct yearofvct) {
      return yearofvctrepo.save(yearofvct);
    }

    public List<YearOfVct> findAll() {
       return yearofvctrepo.findAll();
    }

    public YearOfVct find(Long id) {
      return yearofvctrepo.findOne(id);
    }

    public void delete(YearOfVct yearofvct) {
       yearofvctrepo.delete(yearofvct);
    } 
    
    
}
