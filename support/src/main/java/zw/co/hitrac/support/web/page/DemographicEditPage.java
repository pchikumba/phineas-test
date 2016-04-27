/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zw.co.hitrac.support.web.page;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.form.ChoiceRenderer;
import org.apache.wicket.markup.html.form.DropDownChoice;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.RequiredTextField;
import org.apache.wicket.markup.html.panel.FeedbackPanel;
import org.apache.wicket.model.CompoundPropertyModel;
import org.apache.wicket.request.mapper.parameter.PageParameters;
import org.apache.wicket.spring.injection.annot.SpringBean;
import zw.co.hitrac.support.SupportPageParametersUtil;
import zw.co.hitrac.support.business.domain.Demographic;
import zw.co.hitrac.support.business.domain.Gender;
import zw.co.hitrac.support.business.service.DemographicService;
import zw.co.hitrac.support.web.model.DemographicModel;
import zw.co.hitrac.support.web.model.MaritalStatusModel;
import zw.co.hitrac.support.web.model.GenderListModel;

/**
 *
 * @author pchikumba
 */
public class DemographicEditPage extends WebPage{
    
    
    
    
 private DemographicModel demographicModel;
    @SpringBean
    private DemographicService demographicService;

    public DemographicEditPage(PageParameters parameters) {
        super(parameters);
        createProgramModel(parameters);
        add(new FeedbackPanel("feedback"));
       
        
        
   Form<Demographic> form = new Form<Demographic>("form", new CompoundPropertyModel<Demographic>(demographicModel));
   
    GenderListModel genderListModel = new GenderListModel();
ChoiceRenderer<Gender> choiceRenderer = new ChoiceRenderer<Gender>("gender");
        
        
        
        form.add(new RequiredTextField("name"));
        form.add(new RequiredTextField("surname"));
        form.add(new RequiredTextField("dob"));
        form.add(new RequiredTextField("gender"));
//        form.add(new DropDownChoice<Gender>("gender", genderListModel, choiceRenderer));
//        form.add(new RequiredTextField("maritalstatus"));
        form.add(new RequiredTextField("educationalqualification"));
        form.add(new RequiredTextField("religion"));
        form.add(new RequiredTextField("residentialaddress"));
        form.add(new RequiredTextField("accomodationtype"));
        form.add(new RequiredTextField("monthlyincome"));
        form.add(new RequiredTextField("occupation"));
        
        
       

        form.add(new org.apache.wicket.markup.html.form.Button("submit") {
            @Override
            public void onSubmit() {
                Demographic demographic = demographicModel.getObject();
                demographicService.save(demographic);
                setResponsePage(DemographicListPage.class);
            }
        });

        add(form);

    }

    private void createProgramModel(PageParameters parameters) {
        Long id = SupportPageParametersUtil.extractId(parameters);
        demographicModel = new DemographicModel(id);
    }

}

