/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zw.co.hitrac.support.business.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zw.co.hitrac.support.business.domain.Demo.Income;
import zw.co.hitrac.support.business.repository.IncomeRepo;
import zw.co.hitrac.support.business.service.IncomeService;

/**
 *
 * @author tonderai ndangana
 * 30/04/2016
 */
@Service
public class IncomeServiceImpl implements IncomeService {
    
    @Autowired
    private IncomeRepo incomerepo;

    public Income save(Income income) {
       return incomerepo.save(income);
    }

    public List<Income> findAll() {
      return incomerepo.findAll();
    }

    public Income find(Long id) {
     return incomerepo.findOne(id);
    }

    public void delete(Income income) {
       incomerepo.delete(income);
    }
    
}
