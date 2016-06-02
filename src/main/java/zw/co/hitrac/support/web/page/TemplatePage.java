
package zw.co.hitrac.support.web.page;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.link.BookmarkablePageLink;
import org.apache.wicket.request.mapper.parameter.PageParameters;
import zw.co.hitrac.support.web.page.admin.PrincipalInvestigatorDashBoardPage;
import zw.co.hitrac.support.web.page.admin.StaticDataPage;
import zw.co.hitrac.support.web.page.admin.UserListPage;



/**
 *
 * @author pchikumba
 * @author tndangana
 */
public abstract class TemplatePage extends WebPage{
    public TemplatePage(PageParameters parameters){
        super(parameters);
        add(new BookmarkablePageLink("admin",PrincipalInvestigatorDashBoardPage.class));
        add(new BookmarkablePageLink("users",UserListPage.class));
        add(new BookmarkablePageLink("staticdata", StaticDataPage.class));
        
        //add(new BookmarkablePageLink("demographic",DemographicListPage.class));
//        add(new BookmarkablePageLink("agricactivity", AgricActivityListPage.class));
        //add(new BookmarkablePageLink("nutrition", NutritionListPage.class));
        //add(new BookmarkablePageLink("ps", PyschSupportListPage.class));
             
        
      
              
    }
}
