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
import zw.co.hitrac.support.business.domain.Nutrition.TraditionalDish;
import zw.co.hitrac.support.business.service.TraditionalDishService;

/**
 *
 * @author pchikumba
 */
public class TraditionalDishListModel extends LoadableDetachableModel<List<TraditionalDish>> {

    @SpringBean
   private TraditionalDishService traditionalDishService;
   
   public TraditionalDishListModel(){
       Injector.get().inject(this);
       
       
   }
  
   @Override
   protected List<TraditionalDish> load(){
       return traditionalDishService.findAll();
   }  
    
    
    
    
    
}
