/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zw.co.hitrac.support.web.model;

import java.util.List;
import org.apache.wicket.injection.Injector;
import org.apache.wicket.model.LoadableDetachableModel;
import org.apache.wicket.spring.injection.annot.SpringBean;
import zw.co.hitrac.support.business.domain.Nutrition.FoodRecommender;
import zw.co.hitrac.support.business.service.FoodRecommenderService;

/**
 *
 * @author pchikumba
 */
public class FoodRecommenderListModel extends LoadableDetachableModel<List<FoodRecommender>> {

    @SpringBean
   private FoodRecommenderService foodRecommenderService;
   
   public FoodRecommenderListModel(){
       Injector.get().inject(this);
       
       
   }
  
   @Override
   protected List<FoodRecommender> load(){
       return foodRecommenderService.findAll();
   }  
    
    
    
    
    
}
