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
import static sun.misc.ClassFileTransformer.add;
import zw.co.hitrac.support.SupportPageParametersUtil;
import zw.co.hitrac.support.business.domain.Nutrition.Frequency;
import zw.co.hitrac.support.business.service.FrequencyService;
import zw.co.hitrac.support.web.model.FrequencyModel;

/**
 *
 * @author pchikumba
 */
public class FrequencyEditPage extends WebPage{
    
    private FrequencyModel frequencyModel;

    @SpringBean
    private FrequencyService frequencyService;

    public FrequencyEditPage(PageParameters parameters) {
        super(parameters);
        createFrequencyModel(parameters);
        add(new FeedbackPanel("feedback"));
       add(new BookmarkablePageLink("back", FrequencyListPage.class));

        Form<Frequency> form = new Form<Frequency>("form", new CompoundPropertyModel<Frequency>(frequencyModel));;
        form.add(new RequiredTextField("frequencyofconsumption"));
//        form.add(new CheckBox("retired"));

        form.add(new org.apache.wicket.markup.html.form.Button("submit") {
            @Override
            public void onSubmit() {
                Frequency frequency = frequencyModel.getObject();
                frequencyService.save(frequency);
                setResponsePage(FrequencyListPage.class);
            }
        });
        add(form);

    }

    private void createFrequencyModel(PageParameters parameters) {
        Long id = SupportPageParametersUtil.extractId(parameters);
        frequencyModel = new FrequencyModel(id);

    }

}

    

