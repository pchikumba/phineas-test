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
import org.apache.wicket.markup.html.form.IChoiceRenderer;
import org.apache.wicket.markup.html.form.RequiredTextField;
import org.apache.wicket.markup.html.link.BookmarkablePageLink;
import org.apache.wicket.markup.html.panel.FeedbackPanel;
import org.apache.wicket.model.CompoundPropertyModel;
import org.apache.wicket.request.mapper.parameter.PageParameters;
import org.apache.wicket.spring.injection.annot.SpringBean;
import zw.co.hitrac.support.SupportPageParametersUtil;
import zw.co.hitrac.support.business.domain.Agric.AgricActivity;
import zw.co.hitrac.support.business.domain.Agric.AgricPractice;
import zw.co.hitrac.support.business.domain.Agric.Purpose;
import zw.co.hitrac.support.business.domain.Agric.SurplusPro;
import zw.co.hitrac.support.business.service.AgricActivityService;
import zw.co.hitrac.support.web.model.AgricActivityModel;
import zw.co.hitrac.support.web.model.AgricPracticeListModel;
import zw.co.hitrac.support.web.model.PurposeListModel;
import zw.co.hitrac.support.web.model.SurplusProListModel;

/**
 *
 * @author gerald matsika
 */
public class AgricActivityEditPage extends TemplatePage{
    
    
    private AgricActivityModel agricactivityModel;
    @SpringBean
    private AgricActivityService agricactivityService;

    public AgricActivityEditPage(PageParameters parameters) {
        super(parameters);
      add(new BookmarkablePageLink("back", HomePage.class));
        createProgramModel(parameters);
        add(new FeedbackPanel("feedback"));
        
        Form<AgricActivity> form = new Form<AgricActivity>("form", new CompoundPropertyModel<AgricActivity>(agricactivityModel));

         AgricPracticeListModel agricpracticeListModel = new AgricPracticeListModel();
        ChoiceRenderer<AgricPractice> agricChoice = new ChoiceRenderer<AgricPractice> ("agricpracticetype","id");
       
           PurposeListModel purposeListModel = new PurposeListModel();
        ChoiceRenderer<Purpose> purpChoice = new ChoiceRenderer<Purpose> ("producingsp","id");
   
        
          SurplusProListModel surplusproListModel = new SurplusProListModel();
        ChoiceRenderer<SurplusPro> surChoice = new ChoiceRenderer<SurplusPro> ("purpose","id");
        
         form.add(new DropDownChoice<AgricPractice>("agricpractice", agricpracticeListModel, agricChoice));
        
        form.add(new DropDownChoice<Purpose>("purpose", purposeListModel, purpChoice));
         form.add(new DropDownChoice<SurplusPro>("surpluspro", surplusproListModel, surChoice));
     
        form.add(new org.apache.wicket.markup.html.form.Button("submit") {
            @Override
            public void onSubmit() {
                AgricActivity agricactivity = agricactivityModel.getObject();
                agricactivityService.save(agricactivity);
                setResponsePage(AgricActivityListPage.class);
            }
        });

        add(form);

    }

   private void createProgramModel(PageParameters parameters) {
        Long id = SupportPageParametersUtil.extractId(parameters);
        agricactivityModel = new AgricActivityModel(id);
    }
   
}
