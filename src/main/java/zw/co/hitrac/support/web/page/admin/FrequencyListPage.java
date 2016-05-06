/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zw.co.hitrac.support.web.page.admin;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.link.BookmarkablePageLink;
import org.apache.wicket.markup.html.list.ListItem;
import org.apache.wicket.markup.html.list.PropertyListView;
import org.apache.wicket.request.mapper.parameter.PageParameters;
import zw.co.hitrac.support.SupportPageParametersUtil;
import zw.co.hitrac.support.business.domain.Nutrition.Frequency;
import zw.co.hitrac.support.web.model.FrequencyListModel;
import zw.co.hitrac.support.web.page.HomePage;

/**
 *
 * @author pchikumba
 */
public class FrequencyListPage extends WebPage{
    
  public FrequencyListPage(PageParameters parameters) {
        super(parameters);
        add(new BookmarkablePageLink("back", HomePage.class));
        add(new BookmarkablePageLink("new", FrequencyEditPage.class));
        add(new PropertyListView<Frequency>("frequency", new FrequencyListModel()) {

            @Override
            protected void populateItem(ListItem<Frequency> item) {
                item.add(new Label("frequencyofconsumption"));

                PageParameters pageParameters = new PageParameters();
                pageParameters.add(SupportPageParametersUtil.ID, item.getModelObject().getId());
                item.add(new BookmarkablePageLink("edit", FrequencyEditPage.class, pageParameters));

            }

        });

    }
  
    
    
    
}
