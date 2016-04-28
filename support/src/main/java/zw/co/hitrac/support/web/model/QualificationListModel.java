
package zw.co.hitrac.support.web.model;

import java.util.List;
import org.apache.wicket.injection.Injector;
import org.apache.wicket.model.LoadableDetachableModel;
import org.apache.wicket.spring.injection.annot.SpringBean;
import zw.co.hitrac.support.business.domain.Qualification;
import zw.co.hitrac.support.business.service.QualificationService;

/**
 *
 * @author tonderai ndangana
 * created by 28/04/2016
 */
public class QualificationListModel extends LoadableDetachableModel<List<Qualification>>{
    
    @SpringBean
    private QualificationService qualificationService;

    public QualificationListModel() {
        Injector.get().inject(this);
    }
    
    
    
    

    @Override
    protected List<Qualification> load() {
   return qualificationService.findAll();
    }

  
    
}
