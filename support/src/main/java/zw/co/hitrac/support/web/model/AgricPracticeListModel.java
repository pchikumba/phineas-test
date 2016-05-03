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
import zw.co.hitrac.support.business.domain.Agric.AgricPractice;
import zw.co.hitrac.support.business.service.AgricPracticeService;

/**
 *
 * @author gerald matsika
 */
public class AgricPracticeListModel extends LoadableDetachableModel<List<AgricPractice>>{
    
    
    @SpringBean 
   private AgricPracticeService agricpracticeService;
   
   public AgricPracticeListModel(){
       Injector.get().inject(this);
       
       
   }
  
   @Override
   protected List<AgricPractice> load(){
       return agricpracticeService.findAll();
   }  
    
    
    
    
}
