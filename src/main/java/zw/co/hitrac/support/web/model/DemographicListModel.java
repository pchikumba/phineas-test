
package zw.co.hitrac.support.web.model;

import java.util.ArrayList;
import java.util.List;
import org.apache.wicket.injection.Injector;
import org.apache.wicket.model.LoadableDetachableModel;
import org.apache.wicket.spring.injection.annot.SpringBean;
import org.apache.wicket.util.string.Strings;
import org.springframework.data.domain.Page;
import zw.co.hitrac.support.business.domain.Demo.Demographic;
import zw.co.hitrac.support.business.service.DemographicSearchService;
import zw.co.hitrac.support.business.service.DemographicService;

/**
 *
 * @author pchikumba
 */
public class DemographicListModel extends LoadableDetachableModel<List<Demographic>>{
    
   
//   private DemographicService demographicservice;
   @SpringBean
   private DemographicSearchService demographicSearchService;
    
        private Integer pageNumber;
    private  String searchQuery = "";
   
   public DemographicListModel(){
          this.pageNumber = pageNumber;
        this.searchQuery = searchQuery;
       Injector.get().inject(this);
       
       
   }

    public DemographicListModel(int page, String toString) {
    }
  
   @Override
    protected List<Demographic> load() {
         Page<Demographic> page;
          if (Strings.isEmpty(searchQuery) || searchQuery.length() < 3) {
            List<Demographic> emptyDemographic = new ArrayList<Demographic>();
            return emptyDemographic;
        } else {
            return demographicSearchService.searchStudent(searchQuery, pageNumber).getContent();
        }
       
    }

    public String getSearchQuery() {
//       String searchQuery;
        
         return searchQuery;
   }
    
    
}
