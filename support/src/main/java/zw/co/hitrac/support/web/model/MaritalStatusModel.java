
package zw.co.hitrac.support.web.model;

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
public class MaritalStatusModel extends LoadableDetachableModel<MaritalStatus>{

   private Long id;
   @SpringBean
    private MaritalStatusService maritalStatusService;
    public MaritalStatusModel(Long id){
        this.id=id;
        Injector.get().inject(this);
    }
    
    
    @Override
    protected MaritalStatus load() {
        
      if (id==null){
         return new MaritalStatus();
      } else{
          return maritalStatusService.find(id);
      } 
    }

 
    
}

    

