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
import zw.co.hitrac.support.business.domain.Demo.Qualification;
import zw.co.hitrac.support.web.model.QualificationListModel;

/**
 *
 * @author tonderai ndangana;
 * created on 28/04/2016
 */
public class QualificationListPage extends WebPage {
    
    
    public QualificationListPage(PageParameters parameters) {
        super(parameters);

        add(new BookmarkablePageLink("new", QualificationEditPage.class));
        add(new PropertyListView<Qualification>("qualification", new QualificationListModel()){

            @Override
            protected void populateItem(ListItem<Qualification> item) {
               item.add(new Label("qualificationtype"));
               
                PageParameters pageParameters = new PageParameters();
                pageParameters.add(SupportPageParametersUtil.ID, item.getModelObject().getId());
                item.add(new BookmarkablePageLink("edit", QualificationEditPage.class, pageParameters));
               
               
            }
            
            });

        }
    
    
    
}
