


package zw.co.hitrac.support.web.model;

import org.apache.wicket.injection.Injector;
import org.apache.wicket.model.LoadableDetachableModel;
import org.apache.wicket.spring.injection.annot.SpringBean;
import zw.co.hitrac.support.business.domain.Nutrition.Nutrition;
import zw.co.hitrac.support.business.service.NutritionService;

/**
 *
 * @author pchikumba
 * 05/05/2016
 */
public class NutritionModel extends LoadableDetachableModel<Nutrition> {
    
    private Long id;
    @SpringBean
    private NutritionService nutritionService;
    public NutritionModel(Long id){
        this.id=id;
        Injector.get().inject(this);
    }
    
    

    @Override
    protected Nutrition load() {
        
        if (id== null){
        return new Nutrition();
        }
        else{
            return nutritionService.find(id);
        
        }
        
    }
    
}
