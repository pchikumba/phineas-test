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
import zw.co.hitrac.support.business.domain.Pysch.PyschSupport;
import zw.co.hitrac.support.business.service.PyschSupportService;

/**
 *
 * @author hitrac
 */
public class PyschSupportListModel extends LoadableDetachableModel<List<PyschSupport>>{
    

   @SpringBean
   private PyschSupportService pyschService;

    public PyschSupportListModel() {
        Injector.get().inject(this);
    }
   
   
   

    @Override
    protected List< PyschSupport> load() {
        return pyschService.findAll();
        
    }
    
}
