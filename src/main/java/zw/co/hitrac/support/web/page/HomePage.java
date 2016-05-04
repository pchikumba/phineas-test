
package zw.co.hitrac.support.web.page;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.link.BookmarkablePageLink;
import org.apache.wicket.request.mapper.parameter.PageParameters;
import zw.co.hitrac.support.web.page.admin.AdminPage;
import zw.co.hitrac.support.web.page.admin.UserListPage;



/**
 *
 * @author pchikumba
 * tonderai ndangana modified on 02/04/2016
 */
public class HomePage extends WebPage{
    public HomePage(PageParameters parameters){
        super(parameters);
         add(new BookmarkablePageLink("admin",AdminPage.class));
         add(new BookmarkablePageLink("user",UserListPage.class));
               
          
    }
}
