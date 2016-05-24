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
import zw.co.hitrac.support.business.domain.Demo.Income;
import zw.co.hitrac.support.web.model.IncomeListModel;
import zw.co.hitrac.support.web.page.HomePage;
import zw.co.hitrac.support.web.page.TemplatePage;

/**
 *
 * @author tonderai ndangana
 * created on 30/04/2016
 */
public class IncomeListPage extends  TemplatePage {

    public IncomeListPage(PageParameters parameters) {
        super(parameters);
        
        add(new BookmarkablePageLink("back", HomePage.class));
        add(new BookmarkablePageLink("new", IncomeEditPage.class));
        add(new PropertyListView<Income>("income", new IncomeListModel()) {
            
            @Override
            protected void populateItem(ListItem<Income> item) {
                item.add(new Label("incomelevel"));
                
                 PageParameters pageParameters = new PageParameters();
                pageParameters.add(SupportPageParametersUtil.ID, item.getModelObject().getId());
                item.add(new BookmarkablePageLink("edit", IncomeEditPage.class, pageParameters));

            }
        });
    }
    
    
    
}
