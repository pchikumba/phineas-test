
package zw.co.hitrac.support.web.page;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.link.BookmarkablePageLink;
import org.apache.wicket.markup.html.list.ListItem;
import org.apache.wicket.markup.html.list.PropertyListView;
import org.apache.wicket.request.mapper.parameter.PageParameters;
import zw.co.hitrac.support.SupportPageParametersUtil;
import zw.co.hitrac.support.business.domain.Pysch.PyschSupport;
import zw.co.hitrac.support.web.model.PyschSupportListModel;

/**
 *
 * @author pchikumba
 * 05/05/2016
 */
public class NutritionListPage extends WebPage{

    public NutritionListPage(PageParameters parameters) {
        super(parameters);
        
         add(new BookmarkablePageLink("back", HomePage.class));
          add(new BookmarkablePageLink("new", PyschSupportEditPage.class));
          add(new PropertyListView<PyschSupport>("ps",new PyschSupportListModel() ) {
              
              @Override
              protected void populateItem(ListItem<PyschSupport> li) {
                 
                  li.add(new Label("trainingPsg"));
                   li.add(new Label("projectdone"));
                    li.add(new Label("supnetjoined"));
                    li.add(new Label("znnnpaffil"));
                    li.add(new Label("socialmedia"));
                    li.add(new Label("internetacces"));
                    li.add(new Label("mobileOs"));
//                    li.add(new Label("supportspecify"));
                    
                    PageParameters pageParameters = new PageParameters();
                pageParameters.add(SupportPageParametersUtil.ID, li.getModelObject().getId());
                li.add(new BookmarkablePageLink("edit", PyschSupportEditPage.class, pageParameters));

              }
          });
    }
    
    
    
}
