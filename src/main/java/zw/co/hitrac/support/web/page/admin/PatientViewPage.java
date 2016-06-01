
package zw.co.hitrac.support.web.page.admin;

import java.util.List;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.link.BookmarkablePageLink;
import org.apache.wicket.markup.html.link.Link;
import org.apache.wicket.markup.html.list.ListItem;
import org.apache.wicket.markup.html.list.ListView;
import org.apache.wicket.model.CompoundPropertyModel;
import org.apache.wicket.request.mapper.parameter.PageParameters;
import org.apache.wicket.spring.injection.annot.SpringBean;
import zw.co.hitrac.support.SupportPageParametersUtil;
import zw.co.hitrac.support.business.domain.Agric.AgricActivity;
import zw.co.hitrac.support.business.domain.Demo.Demographic;
import zw.co.hitrac.support.business.domain.Nutrition.Nutrition;
import zw.co.hitrac.support.business.domain.Pysch.PyschSupport;
import zw.co.hitrac.support.business.service.NutritionService;
import zw.co.hitrac.support.web.model.DemographicModel;
import zw.co.hitrac.support.web.page.AgricActivityEditPage;
import zw.co.hitrac.support.web.page.NutritionEditPage;
import zw.co.hitrac.support.web.page.PyschSupportEditPage;
import zw.co.hitrac.support.web.page.TemplatePage;

/**
 *
 * @author g-birds
 */
public class PatientViewPage extends TemplatePage {
    
    private DemographicModel demoModel;
    
    @SpringBean
    private  NutritionService nutritionService;

    public PatientViewPage(PageParameters parameters) {
        super(parameters);
        createDemographicModel(parameters);
        setDefaultModel(createCompoundPropertyModel());
        
        add(createFirstNameLabel());
        add(createLastNameLabel());
        add(createGenderLabel());
        add(createMaritalStatusLabel());
        add(createQualificationLabel());
        add(createReligionLabel());
        add(createAddressStatusLabel());
        add(createIncomeLabel());
        add(createOccupationLabel());
        add(createAccomodationLabel());
        add(createAgricActivityListView());
        List<Nutrition> list = nutritionService.getNutritions(demoModel.getObject());
        add(createNutritionListView(list));
        add(createPsychListView());
//        add(createDemoGraphicEditLink());
        add(addPsychSupportEditLink());
        add(addAgricActivityEditLink());
        add( addNutritionEditLink());
        
         
    }

    private Label createFirstNameLabel() {
        Label firstNameLabel = new Label("firstname");
        return firstNameLabel;
    }

    private Label createLastNameLabel() {
        Label lastNameLabel = new Label("surname");
        return lastNameLabel;
    }

    private Label createGenderLabel() {
        Label genderLabel = new Label("gender");
        return genderLabel;
    }

    private Label createMaritalStatusLabel() {
        Label middleNameLabel = new Label("maritalstatus.statustype");
        return middleNameLabel;
    }

    private Label createQualificationLabel() {
        Label middleNameLabel = new Label("qualification.qualificationtype");
        return middleNameLabel;
    }

    private Label createReligionLabel() {
        Label religionNameLabel = new Label("religion.religiontype");
        return religionNameLabel;
    }

    private Label createAddressStatusLabel() {
        Label addressNameLabel = new Label("residentialaddress");
        return addressNameLabel;
    }

    private Label createAccomodationLabel() {
        Label accommodationLabel = new Label("accommodation.accommodationtype");
        return accommodationLabel;
    }
 
    private Label createIncomeLabel() {
        Label incomeNameLabel = new Label("income.incomelevel");
        return incomeNameLabel;
    }

    private Label createOccupationLabel() {
        Label occupationLabel = new Label("occupation");
        return occupationLabel;
    }

    private ListView<Nutrition> createNutritionListView(List<Nutrition> li) {
        ListView<Nutrition> listView = new ListView<Nutrition>("nutrition", li) {

            @Override
            protected void populateItem(ListItem<Nutrition> li) {
                 li.setModel(new CompoundPropertyModel<Nutrition>(li.getModel()));
                li.add(new Label("frequencyOfConsumption"));
                li.add(new Label("recommender"));
                li.add(new Label("traditionalFoodTaken"));
                li.add(new Label("traditionalFoodEnum"));
                li.add(createNutritionEditLink(li));
            }

   
        };
        return listView;
    }

    private ListView<AgricActivity> createAgricActivityListView() {
        ListView<AgricActivity> listView = new ListView<AgricActivity>("agricactivity") {

            @Override
            protected void populateItem(ListItem<AgricActivity> item) {
                item.setModel(new CompoundPropertyModel<AgricActivity>(item.getModel()));
                item.add(new Label("agricpractice"));
                item.add(new Label("purpose"));
                item.add(new Label("surpluspro"));
                item.add(createAgricActivityListViewEDitLink(item));

            }

        };
        return listView ;
    }
    

    
    
      private ListView<PyschSupport> createPsychListView() {
        ListView<PyschSupport> listView = new ListView<PyschSupport>("psychsupport"){
            
             @Override
              protected void populateItem(ListItem<PyschSupport> li) {
                  li.setModel(new CompoundPropertyModel<PyschSupport>(li.getModel()));
                  li.add(new Label("trainingPsg"));
                   li.add(new Label("projectdone"));
                    li.add(new Label("supnetjoined"));
                    li.add(new Label("znnnpaffil"));
                    li.add(new Label("socialmedia"));
                    li.add(new Label("internetacces"));
                    li.add(new Label("mobileOs"));
                    li.add(createPsychListViewEditLink(li));
              }
        };
        return listView;
        
      }
    
    

    
    
    
    
    

    private void createDemographicModel(PageParameters parameters) {
         Long id = SupportPageParametersUtil.extractId(parameters, SupportPageParametersUtil.ID);
        demoModel = new DemographicModel(id);
        
       
    }

    private CompoundPropertyModel<Demographic> createCompoundPropertyModel() {
      CompoundPropertyModel<Demographic> model = new CompoundPropertyModel<Demographic>(demoModel);
        return model;
    }
    
      private Link<Void> createNutritionEditLink(ListItem<Nutrition> li)  {
        PageParameters pageParameters = new PageParameters();
        pageParameters.add(SupportPageParametersUtil.ID, demoModel.getObject().getId());
        Link<Void> createLink = new BookmarkablePageLink<Void>("editNutrition", NutritionEditPage.class, pageParameters);
        return createLink;
    }
       private Link<Void> createPsychListViewEditLink(ListItem<PyschSupport> li)  {
        PageParameters pageParameters = new PageParameters();
        pageParameters.add(SupportPageParametersUtil.ID, demoModel.getObject().getId());
        Link<Void> createLink = new BookmarkablePageLink<Void>("editPyschSupport", PyschSupportEditPage.class, pageParameters);
        return createLink;
    }
       
       
        private Link<Void> createAgricActivityListViewEDitLink(ListItem<AgricActivity> item)  {
        PageParameters pageParameters = new PageParameters();
        pageParameters.add(SupportPageParametersUtil.ID, demoModel.getObject().getId());
        Link<Void> createLink = new BookmarkablePageLink<Void>("editAgricActivity", AgricActivityEditPage.class, pageParameters);
        return createLink;
    }
             
//       private Link<Void> createDemoGraphicEditLink()  {
//        PageParameters pageParameters = new PageParameters();
//        pageParameters.add(SupportPageParametersUtil.ID, demoModel.getObject().getId());
//        Link<Void> createLink = new BookmarkablePageLink<Void>("editDemographic", DemographicEditPage.class, pageParameters);
//        return createLink;
//    }
//  
        
          private Link<Void> addNutritionEditLink() {
        PageParameters pageParameters = new PageParameters();
        pageParameters.add(SupportPageParametersUtil.ID, demoModel.getObject().getId());
        Link<Void> createLink = new Link<Void>("addNutritionDetails") {
            
            @Override
            public void onClick() {
                setResponsePage(new NutritionEditPage(getPageParameters(), demoModel.getObject().getId()));
            }
        };
        return createLink;
    }
          
              private Link<Void> addAgricActivityEditLink() {
        PageParameters pageParameters = new PageParameters();
        pageParameters.add(SupportPageParametersUtil.ID, demoModel.getObject().getId());
        Link<Void> createLink = new BookmarkablePageLink<Void>("addAgricActivityDetails", AgricActivityEditPage.class, pageParameters);
        return createLink;
    }
          private Link<Void> addPsychSupportEditLink() {
        PageParameters pageParameters = new PageParameters();
        pageParameters.add(SupportPageParametersUtil.ID, demoModel.getObject().getId());
        Link<Void> createLink = new BookmarkablePageLink<Void>("addPsychSupportDetails", PyschSupportEditPage.class, pageParameters);
        return createLink;
    }

             

                      
                      
}                     





