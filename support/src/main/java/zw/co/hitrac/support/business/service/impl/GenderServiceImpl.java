/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zw.co.hitrac.support.business.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zw.co.hitrac.support.business.domain.Demo.Gender;
import zw.co.hitrac.support.business.repository.GenderRepo;
import zw.co.hitrac.support.business.service.GenderService;

/**
 *
 * @author pchikumba
 */
@Service
public class GenderServiceImpl implements GenderService{
    
    @Autowired
    
    private GenderRepo genderRepo;

    public Gender save(Gender gender) {
        return genderRepo.save(gender);
    }

    public List<Gender> findAll() {
        return genderRepo.findAll();
    }

    public Gender find(Long id) {
        return genderRepo.findOne(id);
    }

    public void delete(Gender gender) {
       genderRepo.delete(gender);
    }
    
    
    
}
