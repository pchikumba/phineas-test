
package zw.co.hitrac.support.web.model;

import java.util.List;
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
public class NutritionListModel extends LoadableDetachableModel<List<Nutrition>>{
    
   @SpringBean
   private NutritionService nutritionservice;
   
   public NutritionListModel(){
       Injector.get().inject(this);
       
       
   }
  
   @Override
   protected List<Nutrition> load(){
       return nutritionservice.findAll();
   }  
    
    
}
