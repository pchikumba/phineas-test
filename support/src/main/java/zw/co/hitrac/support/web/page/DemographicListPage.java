/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zw.co.hitrac.support.web.page;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.link.BookmarkablePageLink;
import org.apache.wicket.markup.html.list.ListItem;
import org.apache.wicket.markup.html.list.PropertyListView;
import org.apache.wicket.request.mapper.parameter.PageParameters;
import zw.co.hitrac.support.SupportPageParametersUtil;
import zw.co.hitrac.support.business.domain.Demographic;
import zw.co.hitrac.support.web.model.DemographicListModel;

/**
 *
 * @author pchikumba
 */
public class DemographicListPage extends WebPage {

    public DemographicListPage(PageParameters parameters) {
        super(parameters);

        add(new BookmarkablePageLink("new", DemographicEditPage.class));
        add(new PropertyListView<Demographic>("demographic", new DemographicListModel()) {

            @Override
            protected void populateItem(ListItem<Demographic> item) {
                item.add(new Label("name"));
                item.add(new Label("surname"));
                item.add(new Label("dob"));
                item.add(new Label("sex"));
                item.add(new Label("maritalstatus"));
                item.add(new Label("educationalqualification"));
                item.add(new Label("religion"));
                item.add(new Label("residentialaddress"));
                item.add(new Label("accomodationtype"));
                item.add(new Label("monthlyincome"));
                item.add(new Label("occupation"));
                
              
                PageParameters pageParameters = new PageParameters();
                pageParameters.add(SupportPageParametersUtil.ID, item.getModelObject().getId());
                item.add(new BookmarkablePageLink("edit", DemographicEditPage.class, pageParameters));
            }

        });

    }

}