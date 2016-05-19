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
import zw.co.hitrac.support.business.domain.Nutrition.FrequencyOfConsumption;
import zw.co.hitrac.support.business.service.FrequencyOfConsumptionService;


/**
 *
 * @author pchikumba
 */
public class FrequencyOfConsumptionListModel extends LoadableDetachableModel<List<FrequencyOfConsumption>> {

    @SpringBean
   private FrequencyOfConsumptionService frequencyService;
   
   public FrequencyOfConsumptionListModel(){
       Injector.get().inject(this);
       
       
   }
  
   @Override
   protected List<FrequencyOfConsumption> load(){
       return frequencyService.findAll();
   }  
    
    
    
    
    
}
