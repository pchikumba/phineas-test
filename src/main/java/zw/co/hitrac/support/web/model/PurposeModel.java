/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zw.co.hitrac.support.web.model;

import org.apache.wicket.injection.Injector;
import org.apache.wicket.model.LoadableDetachableModel;
import org.apache.wicket.spring.injection.annot.SpringBean;
import zw.co.hitrac.support.business.domain.Agric.Purpose;
import zw.co.hitrac.support.business.service.PurposeService;

/**
 *
 * @author gerald matsika
 * 02/05/16
 */
public class PurposeModel extends LoadableDetachableModel<Purpose>{
    
    
  private Long id;  
    
  @SpringBean
    private PurposeService purposeService;
    public PurposeModel(Long id){
        this.id=id;
        Injector.get().inject(this);
    }
    
    
    @Override
    protected Purpose load() {
        
      if (id==null){
         return new Purpose();
      } else{
          return purposeService.find(id);
      } 
    }

 
}

    

