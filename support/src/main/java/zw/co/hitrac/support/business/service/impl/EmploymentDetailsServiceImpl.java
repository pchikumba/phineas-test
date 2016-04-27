/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zw.co.hitrac.support.business.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zw.co.hitrac.support.business.domain.EmploymentDetails;
import zw.co.hitrac.support.business.repository.EmploymentDetailsRepo;
import zw.co.hitrac.support.business.service.EmploymentDetailsService;

/**
 *
 * @author hitrac
 */
@Service
public class EmploymentDetailsServiceImpl implements EmploymentDetailsService{
    
    @Autowired
    private EmploymentDetailsRepo edrepo;

    public EmploymentDetails save(EmploymentDetails t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public List<EmploymentDetails> findAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public EmploymentDetails find(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
