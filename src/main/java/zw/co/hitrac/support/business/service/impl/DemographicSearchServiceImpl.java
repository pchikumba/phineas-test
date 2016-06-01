/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zw.co.hitrac.support.business.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import zw.co.hitrac.support.business.domain.Demo.Demographic;
import zw.co.hitrac.support.business.repository.DemographicRepo;
import zw.co.hitrac.support.business.service.DemographicSearchService;


/**
 *
 * @author pchikumba
 * 
 */
@Service
public class DemographicSearchServiceImpl implements DemographicSearchService{
    
    @Autowired
    private DemographicRepo demorepo;
    
   private static final int PAGE_SIZE = 50;



    public Page<Demographic> searchDemographic(Integer pageNumber)  {
       PageRequest pageRequest=new PageRequest(pageNumber-1,PAGE_SIZE,Sort.Direction.ASC,"surname");
        return demorepo.findAll(pageRequest);}

    public Page<Demographic> searchDemographic(String searchTerm, Integer pageNumber) {
        PageRequest pageRequest=new PageRequest(pageNumber-1,PAGE_SIZE,Sort.Direction.ASC,"surname");
        return demorepo.findDemographics(pageRequest,searchTerm);
    }

    
}
