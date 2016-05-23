/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zw.co.hitrac.support.web.model;

import org.apache.wicket.injection.Injector;
import org.apache.wicket.model.LoadableDetachableModel;
import org.apache.wicket.spring.injection.annot.SpringBean;
import zw.co.hitrac.support.business.domain.Nutrition.FrequencyOfConsumption;
import zw.co.hitrac.support.business.service.FrequencyOfConsumptionService;

/**
 *
 * @author pchikumba
 */
public class FrequencyOfConsumptionModel extends LoadableDetachableModel<FrequencyOfConsumption>{
 
  private Long id;  
    
  @SpringBean
    private FrequencyOfConsumptionService frequencyService;
    public FrequencyOfConsumptionModel(Long id){
        this.id=id;
        Injector.get().inject(this);
    }
    
    
    @Override
    protected FrequencyOfConsumption load() {
        
      if (id==null){
         return new FrequencyOfConsumption();
      } else{
          return frequencyService.find(id);
      } 
    }

 
}
