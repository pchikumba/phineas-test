/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zw.co.hitrac.support.web.model;

import org.apache.wicket.injection.Injector;
import org.apache.wicket.model.LoadableDetachableModel;
import org.apache.wicket.spring.injection.annot.SpringBean;
import zw.co.hitrac.support.business.domain.Nutrition.Frequency;
import zw.co.hitrac.support.business.service.FrequencyService;

/**
 *
 * @author pchikumba
 */
public class FrequencyModel extends LoadableDetachableModel<Frequency>{
 
  private Long id;  
    
  @SpringBean
    private FrequencyService frequencyService;
    public FrequencyModel(Long id){
        this.id=id;
        Injector.get().inject(this);
    }
    
    
    @Override
    protected Frequency load() {
        
      if (id==null){
         return new Frequency();
      } else{
          return frequencyService.find(id);
      } 
    }

 
}
