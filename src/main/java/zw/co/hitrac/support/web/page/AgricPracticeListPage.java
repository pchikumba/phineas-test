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
import zw.co.hitrac.support.business.domain.Agric.AgricPractice;
import zw.co.hitrac.support.web.model.AgricPracticeListModel;

/**
 *
 * @author gerald matsika
 */
public class AgricPracticeListPage extends WebPage{
    
       public AgricPracticeListPage(PageParameters parameters) {
        super(parameters);
        add(new BookmarkablePageLink("back", HomePage.class));
        add(new BookmarkablePageLink("new", AgricPracticeEditPage.class));
        add(new PropertyListView< AgricPractice>("agricpractice", new AgricPracticeListModel()) {

            @Override
            protected void populateItem(ListItem< AgricPractice> item) {
                item.add(new Label("agricpracticetype"));

                PageParameters pageParameters = new PageParameters();
                pageParameters.add(SupportPageParametersUtil.ID, item.getModelObject().getId());
                item.add(new BookmarkablePageLink("edit", AgricPracticeEditPage.class, pageParameters));

            }

        });

    }

}

    

