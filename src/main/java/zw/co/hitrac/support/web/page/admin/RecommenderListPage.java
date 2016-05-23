
package zw.co.hitrac.support.web.page.admin;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.link.BookmarkablePageLink;
import org.apache.wicket.markup.html.list.ListItem;
import org.apache.wicket.markup.html.list.PropertyListView;
import org.apache.wicket.request.mapper.parameter.PageParameters;
import zw.co.hitrac.support.SupportPageParametersUtil;
import zw.co.hitrac.support.business.domain.Nutrition.Recommender;

import zw.co.hitrac.support.web.model.RecommenderListModel;
import zw.co.hitrac.support.web.page.HomePage;

/**
 *
 * @author pchikumba 04/05/2016
 */
public class RecommenderListPage extends WebPage{
  
    
    public RecommenderListPage(PageParameters parameters) {
        super(parameters);
        add(new BookmarkablePageLink("back", HomePage.class));
        add(new BookmarkablePageLink("new", RecommenderEditPage.class));
        add(new PropertyListView<Recommender>("recommender", new RecommenderListModel()) {

            @Override
            protected void populateItem(ListItem<Recommender> item) {
                item.add(new Label("nameofRec"));

                PageParameters pageParameters = new PageParameters();
                pageParameters.add(SupportPageParametersUtil.ID, item.getModelObject().getId());
                item.add(new BookmarkablePageLink("edit", RecommenderEditPage.class, pageParameters));

            }

        });

    }

}


