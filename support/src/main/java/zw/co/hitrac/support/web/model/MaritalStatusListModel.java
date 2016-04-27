
package zw.co.hitrac.support.web.model;

import java.util.List;
import org.apache.wicket.injection.Injector;
import org.apache.wicket.model.LoadableDetachableModel;
import org.apache.wicket.spring.injection.annot.SpringBean;
import zw.co.hitrac.support.business.domain.MaritalStatus;
import zw.co.hitrac.support.business.service.MaritalStatusService;

/**
 *
 * @author tonderai ndangana
 * 27/04/2016
 */
public class MaritalStatusListModel extends LoadableDetachableModel<List<MaritalStatus>>{
    
   @SpringBean
   private MaritalStatusService maritalStatusService;
   
   public MaritalStatusListModel(){
       Injector.get().inject(this);
       
       
   }
  
   @Override
   protected List<MaritalStatus> load(){
       return maritalStatusService.findAll();
   }  
    
    
}

