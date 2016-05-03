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
import zw.co.hitrac.support.business.domain.Agric.AgricPractice;
import zw.co.hitrac.support.business.service.AgricPracticeService;
import zw.co.hitrac.support.web.model.AgricPracticeModel;

/**
 *
 * @author gerald matsika
 */
public class AgricPracticeEditPage extends WebPage{
    
    
    private AgricPracticeModel agricpracticeModel;

    @SpringBean
    private AgricPracticeService agricpracticeService;

   
    public AgricPracticeEditPage(PageParameters parameters) {
        super(parameters);
        createAgricPracticeModel(parameters);
        add(new FeedbackPanel("feedback"));
       add(new BookmarkablePageLink("back", AgricPracticeListPage.class));

        Form<AgricPractice> form = new Form<AgricPractice>("form", new CompoundPropertyModel<AgricPractice>(agricpracticeModel));
        form.add(new RequiredTextField("agricpracticetype"));
    

        form.add(new org.apache.wicket.markup.html.form.Button("submit") {
            @Override
            public void onSubmit() {
                AgricPractice agricpractice = agricpracticeModel.getObject();
                agricpracticeService.save(agricpractice);
                setResponsePage(AgricPracticeListPage.class);
            }
        });
        add(form);

    }

    private void createAgricPracticeModel(PageParameters parameters) {
        Long id = SupportPageParametersUtil.extractId(parameters);
        agricpracticeModel = new AgricPracticeModel(id);

    }

  
}

    

