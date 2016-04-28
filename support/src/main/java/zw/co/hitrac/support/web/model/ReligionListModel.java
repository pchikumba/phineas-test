
package zw.co.hitrac.support.web.model;

import java.util.List;
import org.apache.wicket.injection.Injector;
import org.apache.wicket.model.LoadableDetachableModel;
import org.apache.wicket.spring.injection.annot.SpringBean;
import zw.co.hitrac.support.business.domain.Demo.Religion;
import zw.co.hitrac.support.business.service.ReligionService;

/**
 *
 * @author pchikumba
 * 27/04/2016
 */
public class ReligionListModel extends LoadableDetachableModel<List<Religion>>{
    
   @SpringBean
   private ReligionService religionService;
   
   public ReligionListModel(){
       Injector.get().inject(this);
       
       
   }
  
   @Override
   protected List<Religion> load(){
       return religionService.findAll();
   }  
    
    
}

