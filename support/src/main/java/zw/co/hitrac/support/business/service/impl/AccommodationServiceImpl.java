/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zw.co.hitrac.support.business.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zw.co.hitrac.support.business.domain.Accommodation;
import zw.co.hitrac.support.business.repository.AccommodationRepo;
import zw.co.hitrac.support.business.service.AccommodationService;

/**
 *
 * @author pchikumba
 */
@Service
public class AccommodationServiceImpl implements AccommodationService{
    
    @Autowired
    
    private AccommodationRepo accommodationRepo;

    public Accommodation save(Accommodation accommodation) {
        return accommodationRepo.save(accommodation);
    }

    public List<Accommodation> findAll() {
        return accommodationRepo.findAll();
    }

    public Accommodation find(Long id) {
     return accommodationRepo.findOne(id);
    }

    public void delete(Accommodation accommodation) {
        accommodationRepo.delete(accommodation);
    }
 
    
    
    
}
