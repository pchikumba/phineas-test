
package zw.co.hitrac.support.web.page.admin;

import zw.co.hitrac.support.web.page.QuestionnaireInforPage;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.link.BookmarkablePageLink;
import org.apache.wicket.request.mapper.parameter.PageParameters;
import zw.co.hitrac.support.web.page.TemplatePage;

/**
 *
 * @author tonderai ndangana
 * 02/04/2016
 */
public class PrincipalInvestigatorAdminPage  extends TemplatePage{

    public PrincipalInvestigatorAdminPage(PageParameters parameters) {
        super(parameters);
       
           
            
             add(new BookmarkablePageLink("staticdata", StaticDataPage.class));
              add(new BookmarkablePageLink("questionnaire", QuestionnaireInforPage.class));
    }
    
    
    
}
