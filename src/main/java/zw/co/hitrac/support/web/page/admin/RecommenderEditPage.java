/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zw.co.hitrac.support.web.page.admin;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.RequiredTextField;
import org.apache.wicket.markup.html.link.BookmarkablePageLink;
import org.apache.wicket.markup.html.panel.FeedbackPanel;
import org.apache.wicket.model.CompoundPropertyModel;
import org.apache.wicket.request.mapper.parameter.PageParameters;
import org.apache.wicket.spring.injection.annot.SpringBean;
import zw.co.hitrac.support.SupportPageParametersUtil;

import zw.co.hitrac.support.business.domain.Nutrition.Recommender;
import zw.co.hitrac.support.business.service.RecommenderService;
import zw.co.hitrac.support.web.model.RecommenderModel;
import zw.co.hitrac.support.web.page.TemplatePage;

/**
 *
 * @author pchikumba
 */
public class RecommenderEditPage extends TemplatePage{
   
    
    private RecommenderModel recommenderModel;
    
     @SpringBean
     
     private RecommenderService recommenderService;
     
     
     public RecommenderEditPage(PageParameters parameters) {
        super(parameters);
        createFoodRecommenderModel(parameters);
        add(new FeedbackPanel("feedback"));
       add(new BookmarkablePageLink("back", RecommenderListPage.class));

        Form<Recommender> form = new Form<Recommender>("form", new CompoundPropertyModel<Recommender>(recommenderModel));;
        form.add(new RequiredTextField("nameofRec"));
//        form.add(new CheckBox("retired"));

        form.add(new org.apache.wicket.markup.html.form.Button("submit") {
            @Override
            public void onSubmit() {
                Recommender recommender = recommenderModel.getObject();
                recommenderService.save(recommender);
                setResponsePage(RecommenderListPage.class);
            }
        });
        add(form);

    }

    private void createFoodRecommenderModel(PageParameters parameters) {
        Long id = SupportPageParametersUtil.extractId(parameters);
        recommenderModel = new RecommenderModel(id);

    }

}

    

