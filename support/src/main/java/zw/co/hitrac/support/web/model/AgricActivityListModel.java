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
import zw.co.hitrac.support.business.domain.Agric.AgricActivity;
import zw.co.hitrac.support.business.service.AgricActivityService;

/**
 *
 * @author gerald matsika
 */
public class AgricActivityListModel extends LoadableDetachableModel<List<AgricActivity>>{
    
       @SpringBean
   private AgricActivityService agricactivityservice;
   
   public AgricActivityListModel(){
       Injector.get().inject(this);
       
       
   }
  
   @Override
   protected List<AgricActivity> load(){
       return agricactivityservice.findAll();
   }  
    
    
}






    
