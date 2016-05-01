/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zw.co.hitrac.support.web.model;

import org.apache.wicket.injection.Injector;
import org.apache.wicket.model.LoadableDetachableModel;
import org.apache.wicket.spring.injection.annot.SpringBean;
import zw.co.hitrac.support.business.domain.Nutrition.TraditionalFood;
import zw.co.hitrac.support.business.service.TraditionalFoodService;

/**
 *
 * @author pchikumba
 */
public class TraditionalFoodModel extends LoadableDetachableModel<TraditionalFood>{
 
  private Long id;  
    
  @SpringBean
    private TraditionalFoodService traditionalFoodService;
    public TraditionalFoodModel(Long id){
        this.id=id;
        Injector.get().inject(this);
    }
    
    
    @Override
    protected TraditionalFood load() {
        
      if (id==null){
         return new TraditionalFood();
      } else{
          return traditionalFoodService.find(id);
      } 
    }

 
}
