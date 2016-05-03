/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zw.co.hitrac.support.web.model;

import org.apache.wicket.injection.Injector;
import org.apache.wicket.model.LoadableDetachableModel;
import org.apache.wicket.spring.injection.annot.SpringBean;
import zw.co.hitrac.support.business.domain.Agric.SurplusPro;
import zw.co.hitrac.support.business.service.SurplusProService;

/**
 *
 * @author gerald matsika
 */
public class SurplusProModel extends LoadableDetachableModel<SurplusPro>{
    
      private Long id;  
    
  @SpringBean
    private SurplusProService surplusproService;
    public SurplusProModel(Long id){
        this.id=id;
        Injector.get().inject(this);
    }
    
    
    @Override
    protected SurplusPro load() {
        
      if (id==null){
         return new SurplusPro();
      } else{
          return surplusproService.find(id);
      } 
    }

 
    
}
