
package zw.co.hitrac.support.web.page.admin;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.link.BookmarkablePageLink;
import org.apache.wicket.markup.html.list.ListItem;
import org.apache.wicket.markup.html.list.PropertyListView;
import org.apache.wicket.request.mapper.parameter.PageParameters;
import zw.co.hitrac.support.SupportPageParametersUtil;
import zw.co.hitrac.support.business.domain.Nutrition.TraditionalFoodTaken;
import zw.co.hitrac.support.web.model.TraditionalFoodTakenListModel;
import zw.co.hitrac.support.web.page.HomePage;
import zw.co.hitrac.support.web.page.TemplatePage;

/**
 *
 * @author pchikumba
 */
public class TraditionalFoodTakenListPage extends TemplatePage{
    
public TraditionalFoodTakenListPage(PageParameters parameters) {
        super(parameters);
        add(new BookmarkablePageLink("back", HomePage.class));
        add(new BookmarkablePageLink("new", TraditionalFoodTakenEditPage.class));
        add(new PropertyListView<TraditionalFoodTaken>("traditionalFoodTaken", new TraditionalFoodTakenListModel()) {

            @Override
            protected void populateItem(ListItem<TraditionalFoodTaken> item) {
                item.add(new Label("tdFood"));

                PageParameters pageParameters = new PageParameters();
                pageParameters.add(SupportPageParametersUtil.ID, item.getModelObject().getId());
                item.add(new BookmarkablePageLink("edit", TraditionalFoodTakenEditPage.class, pageParameters));

            }

        });

    }

}
    
    
    

