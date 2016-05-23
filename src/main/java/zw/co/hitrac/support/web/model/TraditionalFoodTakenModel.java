/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zw.co.hitrac.support.web.model;

import org.apache.wicket.injection.Injector;
import org.apache.wicket.model.LoadableDetachableModel;
import org.apache.wicket.spring.injection.annot.SpringBean;
import zw.co.hitrac.support.business.domain.Nutrition.TraditionalFoodTaken;
import zw.co.hitrac.support.business.service.TraditionalFoodTakenService;


/**
 *
 * @author pchikumba
 */
public class TraditionalFoodTakenModel extends LoadableDetachableModel<TraditionalFoodTaken>{
 
  private Long id;  
    
  @SpringBean
    private TraditionalFoodTakenService traditionalFoodService;
    public TraditionalFoodTakenModel(Long id){
        this.id=id;
        Injector.get().inject(this);
    }
    
    
    @Override
    protected TraditionalFoodTaken load() {
        
      if (id==null){
         return new TraditionalFoodTaken();
      } else{
          return traditionalFoodService.find(id);
      } 
    }

 
}
