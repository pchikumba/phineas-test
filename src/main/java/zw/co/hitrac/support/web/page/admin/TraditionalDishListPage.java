
package zw.co.hitrac.support.web.page.admin;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.link.BookmarkablePageLink;
import org.apache.wicket.markup.html.list.ListItem;
import org.apache.wicket.markup.html.list.PropertyListView;
import org.apache.wicket.request.mapper.parameter.PageParameters;
import zw.co.hitrac.support.SupportPageParametersUtil;
import zw.co.hitrac.support.business.domain.Nutrition.TraditionalDish;
import zw.co.hitrac.support.web.model.TraditionalDishListModel;
import zw.co.hitrac.support.web.page.HomePage;

/**
 *
 * @author pchikumba
 */
public class TraditionalDishListPage extends WebPage{
    
public TraditionalDishListPage(PageParameters parameters) {
        super(parameters);
        add(new BookmarkablePageLink("back", HomePage.class));
        add(new BookmarkablePageLink("new", TraditionalDishEditPage.class));
        add(new PropertyListView<TraditionalDish>("traditionaldish", new TraditionalDishListModel()) {

            @Override
            protected void populateItem(ListItem<TraditionalDish> item) {
                item.add(new Label("dishtype"));

                PageParameters pageParameters = new PageParameters();
                pageParameters.add(SupportPageParametersUtil.ID, item.getModelObject().getId());
                item.add(new BookmarkablePageLink("edit", TraditionalDishEditPage.class, pageParameters));

            }

        });

    }

}
    
    
    

