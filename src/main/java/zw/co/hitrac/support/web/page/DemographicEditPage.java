/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zw.co.hitrac.support.web.page;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import org.apache.wicket.datetime.PatternDateConverter;
import org.apache.wicket.datetime.markup.html.form.DateTextField;
import org.apache.wicket.extensions.yui.calendar.DatePicker;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.form.ChoiceRenderer;
import org.apache.wicket.markup.html.form.DropDownChoice;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.RadioChoice;
import org.apache.wicket.markup.html.form.RequiredTextField;
import org.apache.wicket.markup.html.link.BookmarkablePageLink;
import org.apache.wicket.markup.html.panel.FeedbackPanel;
import org.apache.wicket.model.CompoundPropertyModel;
import org.apache.wicket.model.PropertyModel;
import org.apache.wicket.request.mapper.parameter.PageParameters;
import org.apache.wicket.spring.injection.annot.SpringBean;
import zw.co.hitrac.support.SupportPageParametersUtil;
import zw.co.hitrac.support.business.domain.Demo.Accommodation;
import zw.co.hitrac.support.business.domain.Demo.Demographic;
import zw.co.hitrac.support.business.domain.Demo.Gender;
import zw.co.hitrac.support.business.domain.Demo.Income;
import zw.co.hitrac.support.business.domain.Demo.MaritalStatus;
import zw.co.hitrac.support.business.domain.Demo.Qualification;
import zw.co.hitrac.support.business.domain.Demo.Religion;
import zw.co.hitrac.support.business.service.DemographicService;
import zw.co.hitrac.support.web.model.AccommodationListModel;
import zw.co.hitrac.support.web.model.DemographicModel;

import zw.co.hitrac.support.web.model.IncomeListModel;
import zw.co.hitrac.support.web.model.MaritalStatusListModel;
import zw.co.hitrac.support.web.model.QualificationListModel;
import zw.co.hitrac.support.web.model.ReligionListModel;

/**
 *
 * @author pchikumba
 * tndangana 01/05/2016
 */
public class DemographicEditPage extends WebPage {

    private DemographicModel demographicModel;
    @SpringBean
    private DemographicService demographicService;
    private Date dob;

    public DemographicEditPage(PageParameters parameters) {
        super(parameters);
        this.dob = new Date();
        final PropertyModel<Date> dobModel = new PropertyModel<Date>(this, "dob");
        add(new BookmarkablePageLink("back", HomePage.class));
        createProgramModel(parameters);
        add(new FeedbackPanel("feedback"));
        

        Form<Demographic> form = new Form<Demographic>("form", new CompoundPropertyModel<Demographic>(demographicModel));
       
        IncomeListModel incomelistmodel = new IncomeListModel();
        ChoiceRenderer<Income> incChoice = new ChoiceRenderer<Income> ("incomelevel","id");
        
        
        QualificationListModel qualistModel = new QualificationListModel();
        ChoiceRenderer<Qualification> quarenderer = new  ChoiceRenderer<Qualification>("qualificationtype","id");
        
        ReligionListModel religionListModel = new ReligionListModel();
        ChoiceRenderer<Religion> relchoiceRenderer = new ChoiceRenderer<Religion>("religiontype","id");
        
        AccommodationListModel accommodationListModel = new AccommodationListModel();
         ChoiceRenderer<Accommodation> accommchoiceRenderer = new ChoiceRenderer<Accommodation>("accommodationtype","id");
        
         MaritalStatusListModel maritalStatusListModel = new MaritalStatusListModel();
         ChoiceRenderer<MaritalStatus> mschoiceRenderer = new ChoiceRenderer<MaritalStatus>("statustype","id");
        
   

        form.add(new RequiredTextField("name"));
        form.add(new RequiredTextField("surname"));
        form.add(new DateTextField("dob", dobModel, new PatternDateConverter("dd/MM/yy", true)).add(new DatePicker()));
        form.add(new DropDownChoice("income", incomelistmodel, incChoice));
        
        form.add(new DropDownChoice<Accommodation>("accommodation", accommodationListModel, accommchoiceRenderer));
        form.add(genderRadioButton().setRequired(true));
        form.add(new DropDownChoice<MaritalStatus>("maritalstatus", maritalStatusListModel, mschoiceRenderer));
        form.add(new DropDownChoice<Qualification>("qualification", qualistModel, quarenderer));
        form.add(new DropDownChoice<Religion>("religion", religionListModel, relchoiceRenderer));
        form.add(new RequiredTextField("residentialaddress"));
    
        
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
    
    private RadioChoice<Gender> genderRadioButton(){
      List<Gender> genderList = Arrays.asList(Gender.values());
        ChoiceRenderer<Gender> choiceRenderer = new ChoiceRenderer<Gender>("gender");
        RadioChoice<Gender> genderChoice = new RadioChoice("gender",
                genderList, choiceRenderer);
        return genderChoice;

    
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }
}
