/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zw.co.hitrac.support.business.repository;

import java.io.Serializable;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import zw.co.hitrac.support.business.domain.Demo.Demographic;
import zw.co.hitrac.support.business.domain.Nutrition.Nutrition;

/**
 *
 * @author hitrac
 */
public interface NutritionRepo extends JpaRepository<Nutrition, Serializable>{
    public List<Nutrition> findByDemographic(Demographic demographic);
}
