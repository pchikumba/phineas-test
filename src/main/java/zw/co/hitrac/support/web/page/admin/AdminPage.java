
package zw.co.hitrac.support.web.page.admin;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.link.BookmarkablePageLink;
import org.apache.wicket.request.mapper.parameter.PageParameters;
import zw.co.hitrac.support.web.page.DemographicListPage;
import zw.co.hitrac.support.web.page.EmploymentDetailListPage;
import zw.co.hitrac.support.web.page.PyschSupportListPage;

/**
 *
 * @author tonderai ndangana
 * 02/04/2016
 */
public class AdminPage  extends WebPage{

    public AdminPage(PageParameters parameters) {
        super(parameters);
       
           
            
             add(new BookmarkablePageLink("staticdata", StaticDataPage.class));
              add(new BookmarkablePageLink("questionnaire", QuestionnaireInforPage.class));
    }
    
    
    
}
