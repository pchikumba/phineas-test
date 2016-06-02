/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zw.co.hitrac.support.business.service;

import java.util.List;
import zw.co.hitrac.support.BusinessComponent;
import zw.co.hitrac.support.business.domain.Demo.Demographic;
import zw.co.hitrac.support.business.domain.Nutrition.Nutrition;

/**
 *
 * @author hitrac
 */
public interface NutritionService extends BusinessComponent<Nutrition> {

    
    public List<Nutrition> getNutritions(Demographic demographic);
    
    
    
    
    
    
}
