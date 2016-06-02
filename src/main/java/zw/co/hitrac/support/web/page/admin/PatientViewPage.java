/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zw.co.hitrac.support.web.page.admin;

import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.list.ListItem;
import org.apache.wicket.markup.html.list.ListView;
import org.apache.wicket.model.CompoundPropertyModel;
import org.apache.wicket.model.IModel;
import org.apache.wicket.request.mapper.parameter.PageParameters;
import zw.co.hitrac.support.SupportPageParametersUtil;
import zw.co.hitrac.support.business.domain.Agric.AgricActivity;
import zw.co.hitrac.support.business.domain.Demo.Demographic;
import zw.co.hitrac.support.business.domain.Nutrition.Nutrition;
import zw.co.hitrac.support.business.domain.Pysch.PyschSupport;
import zw.co.hitrac.support.web.model.DemographicModel;
import zw.co.hitrac.support.web.page.TemplatePage;

/**
 *
 * @author g-birds
 */
public class PatientViewPage extends TemplatePage {
    
    private DemographicModel demoModel;

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
        add(createNutritionListView());
        add(createPsychListView());
        
        
         
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
        Label middleNameLabel = new Label("maritalstatus");
        return middleNameLabel;
    }

    private Label createQualificationLabel() {
        Label middleNameLabel = new Label("qualification");
        return middleNameLabel;
    }

    private Label createReligionLabel() {
        Label religionNameLabel = new Label("religion");
        return religionNameLabel;
    }

    private Label createAddressStatusLabel() {
        Label addressNameLabel = new Label("residentialaddress");
        return addressNameLabel;
    }

    private Label createAccomodationLabel() {
        Label accommodationLabel = new Label("accommodation");
        return accommodationLabel;
    }
 
    private Label createIncomeLabel() {
        Label incomeNameLabel = new Label("income");
        return incomeNameLabel;
    }

    private Label createOccupationLabel() {
        Label occupationLabel = new Label("occupation");
        return occupationLabel;
    }

    private ListView<Nutrition> createNutritionListView() {
        ListView<Nutrition> listView = new ListView<Nutrition>("nutrition") {

            @Override
            protected void populateItem(ListItem<Nutrition> li) {
                 li.setModel(new CompoundPropertyModel<Nutrition>(li.getModel()));
                li.add(new Label("frequencyOfConsumption"));
                li.add(new Label("recommender"));
                li.add(new Label("traditionalFoodTaken"));
                li.add(new Label("traditionalFoodEnum"));
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

            }

        };
        return listView ;
    }
    
//      private ListView<PyschSupport> createPyschSupportListView() {
//        ListView<PyschSupport> listView = new ListView<PyschSupport>("ps"){
//            
//            
//             @Override
//              protected void populateItem(ListItem<PyschSupport> li) {
//                  li.setModel(new CompoundPropertyModel<PyschSupport>(li.getModel()));
//                  li.add(new Label("trainingPsg"));
//                   li.add(new Label("projectdone"));
//                    li.add(new Label("supnetjoined"));
//                    li.add(new Label("znnnpaffil"));
//                    li.add(new Label("socialmedia"));
//                    li.add(new Label("internetacces"));
//                    li.add(new Label("mobileOs"));
//        }
//        
//        } ;
//        return listView;
//      }
    
    
    
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

}


