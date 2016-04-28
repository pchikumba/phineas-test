/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zw.co.hitrac.support.web.model;

import org.apache.wicket.injection.Injector;
import org.apache.wicket.model.LoadableDetachableModel;
import org.apache.wicket.spring.injection.annot.SpringBean;
import zw.co.hitrac.support.business.domain.Demo.Qualification;
import zw.co.hitrac.support.business.service.QualificationService;

/**
 *
 * @author tonderai ndangana
 * created by 28/04/2016
 */
public class QualificationModel extends LoadableDetachableModel<Qualification>{
   
    private final Long id;  
    
    @SpringBean
    private QualificationService qualificationService;
     
    public QualificationModel(Long id){
    this.id=id;
    Injector.get().inject(this);
    
    }
    
 
    

    @Override
    protected Qualification load() {
       if (id==null){
       return new Qualification();
        }
       else {
          return qualificationService.find(id);
       }
    }
    
}
