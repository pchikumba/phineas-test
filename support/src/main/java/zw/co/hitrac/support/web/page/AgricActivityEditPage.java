/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zw.co.hitrac.support.web.page;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.RequiredTextField;
import org.apache.wicket.markup.html.link.BookmarkablePageLink;
import org.apache.wicket.markup.html.panel.FeedbackPanel;
import org.apache.wicket.model.CompoundPropertyModel;
import org.apache.wicket.request.mapper.parameter.PageParameters;
import org.apache.wicket.spring.injection.annot.SpringBean;
import zw.co.hitrac.support.SupportPageParametersUtil;
import zw.co.hitrac.support.business.domain.Agric.AgricActivity;
import zw.co.hitrac.support.business.service.AgricActivityService;
import zw.co.hitrac.support.web.model.AgricActivityModel;

/**
 *
 * @author gerald matsika
 */
public class AgricActivityEditPage extends WebPage{
    
    
    private AgricActivityModel agricactivityModel;
    @SpringBean
    private AgricActivityService agricactivityService;

    public AgricActivityEditPage(PageParameters parameters) {
        super(parameters);
      add(new BookmarkablePageLink("back", HomePage.class));
        createProgramModel(parameters);
        add(new FeedbackPanel("feedback"));
        
        Form<AgricActivity> form = new Form<AgricActivity>("form", new CompoundPropertyModel<AgricActivity>(agricactivityModel));

        form.add(new RequiredTextField("agricpractice"));
        form.add(new RequiredTextField("sp"));
        form.add(new RequiredTextField("purpose"));
     
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
