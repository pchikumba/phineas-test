/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zw.co.hitrac.support.web.model;

import org.apache.wicket.injection.Injector;
import org.apache.wicket.model.LoadableDetachableModel;
import org.apache.wicket.spring.injection.annot.SpringBean;
import zw.co.hitrac.support.business.domain.Demographic;
import zw.co.hitrac.support.business.service.DemographicService;

/**
 *
 * @author pchikumba
 */
public class DemographicModel extends LoadableDetachableModel<Demographic>{

   private Long id;
   @SpringBean
    private DemographicService demographicService;
    public DemographicModel(Long id){
        this.id=id;
        Injector.get().inject(this);
    }
    @Override
    protected Demographic load() {
      if (id==null){
         return new Demographic();
      } else{
          return demographicService.find(id);
      } 
    }
    
    
}

    

