/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zw.co.hitrac.support.web.page.admin;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.link.BookmarkablePageLink;
import org.apache.wicket.request.mapper.parameter.PageParameters;
import zw.co.hitrac.support.web.page.AgricPracticeListPage;
import zw.co.hitrac.support.web.page.PurposeListPage;
import zw.co.hitrac.support.web.page.SurplusProListPage;

/**
 *
 * @author tonderai ndangana
 * created on 02/04/2016
 */
public class StaticDataPage extends WebPage {

    public StaticDataPage(PageParameters parameters) {
        super(parameters);
        
        
          add(new BookmarkablePageLink("maritalstatus",MaritalStatusListPage.class));
          add(new BookmarkablePageLink("religion",ReligionListPage.class));
          add(new BookmarkablePageLink("gender", GenderListPage.class));
          add(new BookmarkablePageLink("accommodation", AccommodationListPage.class));
          add(new BookmarkablePageLink("income", IncomeListPage.class));
          add(new BookmarkablePageLink("qualification", QualificationListPage.class));
           add(new BookmarkablePageLink("purpose", PurposeListPage.class));
            add(new BookmarkablePageLink("surpluspro", SurplusProListPage.class));
             add(new BookmarkablePageLink("agricpractice", AgricPracticeListPage.class));
    }
    
    
    
}
