/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zw.co.hitrac.support.business.service;

import org.springframework.data.domain.Page;
import zw.co.hitrac.support.business.domain.Demo.Demographic;

/**
 *
 * @author hitrac
 */
public interface GeneralSearchService {
    
    public Page<Demographic> searchDemographic(Integer pageNumber);
    public Page<Demographic> searchDemographic(String searchTerm,Integer pageNumber);
    
}
