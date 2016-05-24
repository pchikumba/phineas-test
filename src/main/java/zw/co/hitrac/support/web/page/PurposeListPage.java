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
import zw.co.hitrac.support.business.domain.Agric.Purpose;
import zw.co.hitrac.support.web.model.PurposeListModel;

/**
 *
 * @author gerald matsika
 *
 */
public class PurposeListPage extends TemplatePage{
        public PurposeListPage(PageParameters parameters) {
        super(parameters);
        add(new BookmarkablePageLink("back", HomePage.class));
        add(new BookmarkablePageLink("new", PurposeEditPage.class));
        add(new PropertyListView<Purpose>("purpose", new PurposeListModel()) {

            @Override
            protected void populateItem(ListItem<Purpose> item) {
                item.add(new Label("sp"));

                PageParameters pageParameters = new PageParameters();
                pageParameters.add(SupportPageParametersUtil.ID, item.getModelObject().getId());
                item.add(new BookmarkablePageLink("edit", PurposeEditPage.class, pageParameters));

            }

        });

    }

}

    

