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
import zw.co.hitrac.support.business.domain.Nutrition.TraditionalFood;
import zw.co.hitrac.support.web.model.TraditionalFoodListModel;
import zw.co.hitrac.support.web.page.HomePage;

/**
 *
 * @author pchikumba
 */
public class TraditionalFoodListPage extends WebPage {

    public TraditionalFoodListPage(PageParameters parameters) {
        super(parameters);
        add(new BookmarkablePageLink("back", HomePage.class));
        add(new BookmarkablePageLink("new", TraditionalFoodEditPage.class));
        add(new PropertyListView<TraditionalFood>("traditonalfood", new TraditionalFoodListModel()) {

            @Override
            protected void populateItem(ListItem<TraditionalFood> item) {
                item.add(new Label("tradfood"));

                PageParameters pageParameters = new PageParameters();
                pageParameters.add(SupportPageParametersUtil.ID, item.getModelObject().getId());
                item.add(new BookmarkablePageLink("edit", TraditionalFoodEditPage.class, pageParameters));

            }

        });

    }

}
