/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zw.co.hitrac.support.web.page;

import java.util.Arrays;
import java.util.List;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.form.ChoiceRenderer;
import org.apache.wicket.markup.html.form.DropDownChoice;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.RadioChoice;
import org.apache.wicket.markup.html.form.RequiredTextField;
import org.apache.wicket.markup.html.link.BookmarkablePageLink;
import org.apache.wicket.markup.html.panel.FeedbackPanel;
import org.apache.wicket.model.CompoundPropertyModel;
import org.apache.wicket.request.mapper.parameter.PageParameters;
import org.apache.wicket.spring.injection.annot.SpringBean;
import zw.co.hitrac.support.SupportPageParametersUtil;
import zw.co.hitrac.support.business.domain.Nutrition.Nutrition;
import zw.co.hitrac.support.business.domain.Nutrition.TraditionalFoodEnum;
import zw.co.hitrac.support.business.service.DemographicService;
import zw.co.hitrac.support.business.service.NutritionService;
import zw.co.hitrac.support.web.model.FrequencyOfConsumptionListModel;
import zw.co.hitrac.support.web.model.NutritionModel;
import zw.co.hitrac.support.web.model.RecommenderListModel;
import zw.co.hitrac.support.web.model.TraditionalFoodTakenListModel;

/**
 *
 * @author pchikumba
 * 05.05.2016
 */
public class NutritionEditPage extends TemplatePage {
    

    private NutritionModel nutritionModel;
    
    @SpringBean
    private NutritionService nutritionService;
    @SpringBean
    private DemographicService demographicService;

    public NutritionEditPage(PageParameters parameters, final Long demoId) {
        super(parameters);
        createNutritionModel(parameters);
        add(new FeedbackPanel("feedback"));
        
        
        
        
        nutritionModel = new  NutritionModel(null);
        nutritionModel.getObject().setDemographic(demographicService.find(demoId));
        Form<Nutrition> form = new Form<Nutrition>("form",new CompoundPropertyModel<Nutrition>(nutritionModel));
        FrequencyOfConsumptionListModel frequencyOfConsumptionListModel = new FrequencyOfConsumptionListModel();
        ChoiceRenderer<FrequencyOfConsumptionListModel> frequencyOfConsumptionListModelChoice = new ChoiceRenderer<FrequencyOfConsumptionListModel> ("frequencyType","id");
        
         RecommenderListModel recommenderListModel = new RecommenderListModel();
        ChoiceRenderer<RecommenderListModel> recommenderListModelListModelChoice = new ChoiceRenderer<RecommenderListModel>  ("nameofRec","id");
        
        TraditionalFoodTakenListModel traditionalFoodTakenListModel = new TraditionalFoodTakenListModel();
         ChoiceRenderer<TraditionalFoodTakenListModel> traditionalFoodTakenListModelChoice = new  ChoiceRenderer<TraditionalFoodTakenListModel> ("tdFood","id");
         
        form.add(new BookmarkablePageLink("back", NutritionListPage.class));
        form.add(new DropDownChoice("frequencyOfConsumption", frequencyOfConsumptionListModel, frequencyOfConsumptionListModelChoice));
        form.add(new DropDownChoice("recommender", recommenderListModel, recommenderListModelListModelChoice));
        form.add(new DropDownChoice("traditionalFoodTaken", traditionalFoodTakenListModel, traditionalFoodTakenListModelChoice));
        form.add(TraditionalFoodEnumRadioButton().setRequired(true));
                                                                                                                                                                                                                                                                                               
  
        form.add(new org.apache.wicket.markup.html.form.Button("submit"){
        
         @Override
        public void onSubmit(){
        Nutrition nutrition = nutritionModel.getObject();
        nutrition.setDemographic(demographicService.find(demoId));
       nutritionService.save(nutrition);
             System.out.println("----------------------This");
        setResponsePage(NutritionListPage.class);
        }});
        add(form);
        
    }

//    private void createPyschModel(PageParameters parameters) {
//       Long id = SupportPageParametersUtil.extractId(parameters);
//       nutritionModel = new NutritionModel(id);
//       
//    }
           private RadioChoice<TraditionalFoodEnum> TraditionalFoodEnumRadioButton(){
      List<TraditionalFoodEnum> traditionalFoodEnumList = Arrays.asList(TraditionalFoodEnum.values());
        ChoiceRenderer<TraditionalFoodEnum> choiceRenderer = new ChoiceRenderer<TraditionalFoodEnum>("traditionalFoodEnum");
        RadioChoice<TraditionalFoodEnum> TraditionalFoodEnumChoice = new RadioChoice("traditionalFoodEnum",
                traditionalFoodEnumList, choiceRenderer);
              return TraditionalFoodEnumChoice;
    
    
    
    
}

    private void createNutritionModel(PageParameters parameters) {
         Long id = SupportPageParametersUtil.extractId(parameters);
       nutritionModel = new NutritionModel(id);
       
    }

    
    
    
}
