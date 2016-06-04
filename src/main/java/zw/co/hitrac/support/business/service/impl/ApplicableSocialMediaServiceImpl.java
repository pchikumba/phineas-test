/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zw.co.hitrac.support.business.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zw.co.hitrac.support.business.domain.Ict.ApplicableSocialMedia;
import zw.co.hitrac.support.business.repository.ApplicableSocialMediaRepo;
import zw.co.hitrac.support.business.service.ApplicableSocialMediaService;

/**
 *
 * @author hitrac
 */
@Service
public class ApplicableSocialMediaServiceImpl implements ApplicableSocialMediaService {
    
    @Autowired
    private ApplicableSocialMediaRepo socialRepo;
    
    public ApplicableSocialMedia save(ApplicableSocialMedia applicableSocialMedia) {
        
        return socialRepo.save(applicableSocialMedia);
        
    }
    
    public List<ApplicableSocialMedia> findAll() {
        
        return socialRepo.findAll();
    }
    
    public ApplicableSocialMedia find(Long id) {
        
        return socialRepo.findOne(id);
    }
    
    public void delete(ApplicableSocialMedia applicableSocialMedia) {
        
        socialRepo.delete(applicableSocialMedia);
    }
    
}
