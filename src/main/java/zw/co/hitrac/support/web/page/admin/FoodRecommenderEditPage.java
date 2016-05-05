/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zw.co.hitrac.support.web.page.admin;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.form.CheckBox;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.RequiredTextField;
import org.apache.wicket.markup.html.link.BookmarkablePageLink;
import org.apache.wicket.markup.html.panel.FeedbackPanel;
import org.apache.wicket.model.CompoundPropertyModel;
import org.apache.wicket.request.mapper.parameter.PageParameters;
import org.apache.wicket.spring.injection.annot.SpringBean;
import zw.co.hitrac.support.SupportPageParametersUtil;
import zw.co.hitrac.support.business.domain.Nutrition.FoodRecommender;
import zw.co.hitrac.support.business.service.FoodRecommenderService;
import zw.co.hitrac.support.web.model.FoodRecommenderModel;

/**
 *
 * @author pchikumba
 */
public class FoodRecommenderEditPage extends WebPage{
   
    
    private FoodRecommenderModel foodRecommenderModel;
    
     @SpringBean
     
     private FoodRecommenderService foodRecommenderService;
     
     
     public FoodRecommenderEditPage(PageParameters parameters) {
        super(parameters);
        createFoodRecommenderModel(parameters);
        add(new FeedbackPanel("feedback"));
       add(new BookmarkablePageLink("back", FoodRecommenderListPage.class));

        Form<FoodRecommender> form = new Form<FoodRecommender>("form", new CompoundPropertyModel<FoodRecommender>(foodRecommenderModel));;
        form.add(new RequiredTextField("recommendername"));
//        form.add(new CheckBox("retired"));

        form.add(new org.apache.wicket.markup.html.form.Button("submit") {
            @Override
            public void onSubmit() {
                FoodRecommender foodRecommender = foodRecommenderModel.getObject();
                foodRecommenderService.save(foodRecommender);
                setResponsePage(FoodRecommenderListPage.class);
            }
        });
        add(form);

    }

    private void createFoodRecommenderModel(PageParameters parameters) {
        Long id = SupportPageParametersUtil.extractId(parameters);
        foodRecommenderModel = new FoodRecommenderModel(id);

    }

}

    

