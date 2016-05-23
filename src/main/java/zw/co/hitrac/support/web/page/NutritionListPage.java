
package zw.co.hitrac.support.web.page;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.link.BookmarkablePageLink;
import org.apache.wicket.markup.html.list.ListItem;
import org.apache.wicket.markup.html.list.PropertyListView;
import org.apache.wicket.request.mapper.parameter.PageParameters;
import zw.co.hitrac.support.SupportPageParametersUtil;
import zw.co.hitrac.support.business.domain.Nutrition.Nutrition;
import zw.co.hitrac.support.web.model.NutritionListModel;

/**
 *
 * @author pchikumba
 * 05/05/2016
 */
public class NutritionListPage extends WebPage{

    public NutritionListPage(PageParameters parameters) {
        super(parameters);
        
         add(new BookmarkablePageLink("back", HomePage.class));
          add(new BookmarkablePageLink("new", NutritionEditPage.class));
          add(new PropertyListView<Nutrition>("nutrition",new NutritionListModel() ) {
              
              @Override
              protected void populateItem(ListItem<Nutrition> li) {
                 
                  li.add(new Label("frequencyOfConsumption.frequencyType"));
                   li.add(new Label("recommender.nameofRec"));
                    li.add(new Label("traditionalFoodTaken.tdFood"));
                    li.add(new Label("traditionalFoodEnum"));
                   
//        
                    
                    PageParameters pageParameters = new PageParameters();
                pageParameters.add(SupportPageParametersUtil.ID, li.getModelObject().getId());
                li.add(new BookmarkablePageLink("edit", NutritionEditPage.class, pageParameters));

              }
          });
    }
    
    
    
}
