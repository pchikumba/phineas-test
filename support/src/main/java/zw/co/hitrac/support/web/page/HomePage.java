/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zw.co.hitrac.support.web.page;

import zw.co.hitrac.support.web.page.admin.ReligionListPage;
import zw.co.hitrac.support.web.page.admin.GenderListPage;
import zw.co.hitrac.support.web.page.admin.QualificationListPage;
import zw.co.hitrac.support.web.page.admin.AccommodationListPage;
import zw.co.hitrac.support.web.page.admin.MaritalStatusListPage;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.link.BookmarkablePageLink;
import org.apache.wicket.request.mapper.parameter.PageParameters;
import zw.co.hitrac.support.web.page.admin.IncomeListPage;



/**
 *
 * @author pchikumba
 */
public class HomePage extends WebPage{
    public HomePage(PageParameters parameters){
        super(parameters);
        add(new BookmarkablePageLink("demographic",DemographicListPage.class));
        add(new BookmarkablePageLink("agricactivity",AgricActivityListPage.class));
          add(new BookmarkablePageLink("maritalstatus",MaritalStatusListPage.class));
          add(new BookmarkablePageLink("religion",ReligionListPage.class));
          add(new BookmarkablePageLink("gender", GenderListPage.class));
          add(new BookmarkablePageLink("accommodation", AccommodationListPage.class));
          add(new BookmarkablePageLink("employmentdetail", EmploymentDetailListPage.class));
           add(new BookmarkablePageLink("qualification", QualificationListPage.class));
            add(new BookmarkablePageLink("income", IncomeListPage.class));
              add(new BookmarkablePageLink("agricpractice", AgricPracticeListPage.class));
              add(new BookmarkablePageLink("purpose", PurposeListPage.class));
               add(new BookmarkablePageLink("surpluspro", SurplusProListPage.class));
              
    }
}
