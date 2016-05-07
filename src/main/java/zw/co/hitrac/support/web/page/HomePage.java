/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zw.co.hitrac.support.web.page;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.link.BookmarkablePageLink;
import org.apache.wicket.request.mapper.parameter.PageParameters;
import zw.co.hitrac.support.web.page.admin.AdminPage;
import zw.co.hitrac.support.web.page.admin.UserListPage;



/**
 *
 * @author pchikumba
 */
public class HomePage extends WebPage{
    public HomePage(PageParameters parameters){
        super(parameters);
        add(new BookmarkablePageLink("admin",AdminPage.class));
        add(new BookmarkablePageLink("user",UserListPage.class));
      
              
    }
}
