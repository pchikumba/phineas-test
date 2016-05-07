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
import zw.co.hitrac.support.business.domain.Agric.SurplusPro;
import zw.co.hitrac.support.business.service.SurplusProService;

/**
 *
 * @author gerald matsika
 * 02/05/16
 */
public class SurplusProListModel extends LoadableDetachableModel<List<SurplusPro>>{
    
    
    @SpringBean
   private SurplusProService surplusproService;
   
   public SurplusProListModel(){
       Injector.get().inject(this);
       
       
   }
  
   @Override
   protected List<SurplusPro> load(){
       return surplusproService.findAll();
   }  
    
    
}
