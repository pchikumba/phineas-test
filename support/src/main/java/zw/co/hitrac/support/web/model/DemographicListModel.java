
package zw.co.hitrac.support.web.model;

import java.util.List;
import org.apache.wicket.injection.Injector;
import org.apache.wicket.model.LoadableDetachableModel;
import org.apache.wicket.spring.injection.annot.SpringBean;
import zw.co.hitrac.support.business.domain.Demo.Demographic;
import zw.co.hitrac.support.business.service.DemographicService;

/**
 *
 * @author pchikumba
 */
public class DemographicListModel extends LoadableDetachableModel<List<Demographic>>{
    
   @SpringBean
   private DemographicService demographicservice;
   
   public DemographicListModel(){
       Injector.get().inject(this);
       
       
   }
  
   @Override
   protected List<Demographic> load(){
       return demographicservice.findAll();
   }  
    
    
}
