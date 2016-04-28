


package zw.co.hitrac.support.web.model;

import org.apache.wicket.injection.Injector;
import org.apache.wicket.model.LoadableDetachableModel;
import org.apache.wicket.spring.injection.annot.SpringBean;
import zw.co.hitrac.support.business.domain.Demo.Demographic;
import zw.co.hitrac.support.business.service.DemographicService;
import zw.co.hitrac.support.business.service.MaritalStatusService;

/**
 *
 * @author tonderai ndangana
 * 27/04/2016
 */
public class DemographicModel extends LoadableDetachableModel<Demographic> {
    
    private Long id;
    @SpringBean
    private DemographicService demographicService;
    public DemographicModel(Long id){
        this.id=id;
        Injector.get().inject(this);
    }
    
    

    @Override
    protected Demographic load() {
        
        if (id== null){
        return new Demographic();
        }
        else{
            return demographicService.find(id);
        
        }
        
    }
    
}
