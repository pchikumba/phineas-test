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
import zw.co.hitrac.support.business.domain.Agric.AgricActivity;
import zw.co.hitrac.support.web.model.AgricActivityListModel;

/**
 *
 * @author gerald matsika
 */
public class AgricActivityListPage extends TemplatePage{
    
    
    public AgricActivityListPage(PageParameters parameters) {
        super(parameters);

        add(new BookmarkablePageLink("back", HomePage.class));
        add(new BookmarkablePageLink("new", AgricActivityEditPage.class));
        add(new PropertyListView<AgricActivity>("agricactivity", new AgricActivityListModel()) {

            @Override
            protected void populateItem(ListItem<AgricActivity> item) {
                item.add(new Label("agricpractice.agricpracticetype"));
                item.add(new Label("purpose.producingsp"));
                item.add(new Label("surpluspro.purpose"));
           
                PageParameters pageParameters = new PageParameters();
                pageParameters.add(SupportPageParametersUtil.ID, item.getModelObject().getId());
                item.add(new BookmarkablePageLink("edit", AgricActivityEditPage.class, pageParameters));
            }

        });

    }

}

    

