/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zw.co.hitrac.support.web.page.admin;

import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.RequiredTextField;
import org.apache.wicket.markup.html.link.BookmarkablePageLink;
import org.apache.wicket.markup.html.panel.FeedbackPanel;
import org.apache.wicket.model.CompoundPropertyModel;
import org.apache.wicket.request.mapper.parameter.PageParameters;
import org.apache.wicket.spring.injection.annot.SpringBean;
import zw.co.hitrac.support.SupportPageParametersUtil;

import zw.co.hitrac.support.business.domain.Nutrition.FrequencyOfConsumption;
import zw.co.hitrac.support.business.service.FrequencyOfConsumptionService;
import zw.co.hitrac.support.web.model.FrequencyOfConsumptionModel;
import zw.co.hitrac.support.web.page.TemplatePage;

/**
 *
 * @author pchikumba
 */
public class FrequencyOfConsumptionEditPage extends TemplatePage {

    private FrequencyOfConsumptionModel frequencyModel;

    @SpringBean
    private FrequencyOfConsumptionService frequencyService;

    public FrequencyOfConsumptionEditPage(PageParameters parameters) {
        super(parameters);
        createFrequencyModel(parameters);
        add(new FeedbackPanel("feedback"));
        add(new BookmarkablePageLink("back", StaticDataPage.class));

        Form<FrequencyOfConsumption> form = new Form<FrequencyOfConsumption>("form", new CompoundPropertyModel<FrequencyOfConsumption>(frequencyModel));;
        form.add(new RequiredTextField("frequencyType"));
//        form.add(new CheckBox("retired"));

        form.add(new org.apache.wicket.markup.html.form.Button("submit") {
            @Override
            public void onSubmit() {
                FrequencyOfConsumption frequency = frequencyModel.getObject();
                frequencyService.save(frequency);
                setResponsePage(FrequencyOfConsumptionListPage.class);
            }
        });
        add(form);

    }

    private void createFrequencyModel(PageParameters parameters) {
        Long id = SupportPageParametersUtil.extractId(parameters);
        frequencyModel = new FrequencyOfConsumptionModel(id);

    }

}
