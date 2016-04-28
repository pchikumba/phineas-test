/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zw.co.hitrac.support.web.model;

import org.apache.wicket.injection.Injector;
import org.apache.wicket.model.LoadableDetachableModel;
import org.apache.wicket.spring.injection.annot.SpringBean;
import zw.co.hitrac.support.business.domain.Gender;
import zw.co.hitrac.support.business.service.GenderService;

/**
 *
 * @author pchikumba
 */
public class GenderModel extends LoadableDetachableModel<Gender>{
 
  private Long id;  
    
  @SpringBean
    private GenderService genderService;
    public GenderModel(Long id){
        this.id=id;
        Injector.get().inject(this);
    }
    
    
    @Override
    protected Gender load() {
        
      if (id==null){
         return new Gender();
      } else{
          return genderService.find(id);
      } 
    }

 
}
