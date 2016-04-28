/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zw.co.hitrac.support.business.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zw.co.hitrac.support.business.domain.Demo.EmploymentDetail;
import zw.co.hitrac.support.business.repository.EmploymentDetailsRepo;
import zw.co.hitrac.support.business.service.EmploymentDetailService;

/**
 *
 * @author tonderai ndangana
 *created 27/04/2016
 */
@Service
public class EmploymentDetailsServiceImpl implements EmploymentDetailService{
    
    @Autowired
    private EmploymentDetailsRepo edrepo;

    public EmploymentDetail save(EmploymentDetail employmentdetails) {
       return edrepo.save(employmentdetails);  
    }

    public List<EmploymentDetail> findAll() {
        return edrepo.findAll();
    }

    public EmploymentDetail find(Long id) {
       return edrepo.findOne(id);
    }

    public void delete(EmploymentDetail employmentdetail) {
       edrepo.delete(employmentdetail);
    }

    
}
