/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zw.co.hitrac.support.web.page;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.link.BookmarkablePageLink;
import org.apache.wicket.request.mapper.parameter.PageParameters;



/**
 *
 * @author pchikumba
 */
public class HomePage extends WebPage{
    public HomePage(PageParameters parameters){
        super(parameters);
        add(new BookmarkablePageLink("demographic",DemographicListPage.class));
          add(new BookmarkablePageLink("maritalstatus",MaritalStatusListPage.class));
          add(new BookmarkablePageLink("religion",ReligionListPage.class));
          add(new BookmarkablePageLink("gender", GenderListPage.class));
          add(new BookmarkablePageLink("accommodation", AccommodationListPage.class));
    }
}
