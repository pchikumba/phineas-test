package zw.co.hitrac.support.web.page.security.login;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.request.mapper.parameter.PageParameters;
import zw.co.hitrac.support.web.page.panel.LoginPanel;

/*
 * @auther tonderai  ndangana
   04/05/2016
 */

public class LoginPage extends WebPage {

    public LoginPage(PageParameters parameters) {
        super(parameters);
        add(new LoginPanel("login"));
    }
    
 
}