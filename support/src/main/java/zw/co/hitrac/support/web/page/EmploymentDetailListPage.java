
package zw.co.hitrac.support.web.page;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.link.BookmarkablePageLink;
import org.apache.wicket.markup.html.list.ListItem;
import org.apache.wicket.markup.html.list.PropertyListView;
import org.apache.wicket.request.mapper.parameter.PageParameters;
import zw.co.hitrac.support.SupportPageParametersUtil;
import zw.co.hitrac.support.business.domain.Demo.Demographic;
import zw.co.hitrac.support.business.domain.Demo.EmploymentDetail;
import zw.co.hitrac.support.web.model.DemographicListModel;
import zw.co.hitrac.support.web.model.EmploymentDetailListModel;

/**
 *
 * @author tonderai ndangana
 * created on 28/04/2016
 */
public class EmploymentDetailListPage extends WebPage {
    
    public EmploymentDetailListPage(PageParameters parameters){
             super(parameters);
             
              add(new BookmarkablePageLink("new", EmploymentDetailEditPage.class));
              add(new PropertyListView<EmploymentDetail>("employmentdetail", new EmploymentDetailListModel()){
                  
                  
                    @Override
            protected void populateItem(ListItem<EmploymentDetail> item) {
                item.add(new Label("firstname"));
                item.add(new Label("lastname"));
                item.add(new Label("dob"));
                
                  PageParameters pageParameters = new PageParameters();
                pageParameters.add(SupportPageParametersUtil.ID, item.getModelObject().getId());
                item.add(new BookmarkablePageLink("edit", EmploymentDetailEditPage.class, pageParameters));
            
            
            }
             
             }); 
    
    
    }
    
     
    
}
