/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zw.co.hitrac.support.web.model;

import org.apache.wicket.injection.Injector;
import org.apache.wicket.model.LoadableDetachableModel;
import org.apache.wicket.spring.injection.annot.SpringBean;
import zw.co.hitrac.support.business.domain.Agric.AgricActivity;
import zw.co.hitrac.support.business.service.AgricActivityService;

/**
 *
 * @author gerald matsika
 */
public class AgricActivityModel extends LoadableDetachableModel<AgricActivity>{
    
        private Long id;
    @SpringBean
    private AgricActivityService agricactivityService;
    public AgricActivityModel(Long id){
        this.id=id;
        Injector.get().inject(this);
    }
    
    

    @Override
    protected AgricActivity load() {
        
        if (id== null){
        return new AgricActivity();
        }
        else{
            return agricactivityService.find(id);
        
        }
        
    }
    
    

}
