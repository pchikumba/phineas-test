/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zw.co.hitrac.support.web.model;

import org.apache.wicket.injection.Injector;
import org.apache.wicket.model.LoadableDetachableModel;
import org.apache.wicket.spring.injection.annot.SpringBean;
import zw.co.hitrac.support.business.domain.Pysch.PyschSupport;
import zw.co.hitrac.support.business.service.PyschSupportService;



public class PyschSupportModel extends LoadableDetachableModel<PyschSupport>{

private final Long id;
@SpringBean
private PyschSupportService pyschService;

    public PyschSupportModel(Long id) {
        this.id = id;
        Injector.get().inject(this);
    }

    @Override
    protected PyschSupport load(){
    if(id == null){
    
    
    return new PyschSupport();
    }
    else {
    return pyschService.find(id);
    
    }
    
    
    }


}
    
   
       
       
    
