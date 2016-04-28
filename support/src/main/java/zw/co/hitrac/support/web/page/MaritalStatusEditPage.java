package zw.co.hitrac.support.web.page;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.RequiredTextField;
import org.apache.wicket.markup.html.panel.FeedbackPanel;
import org.apache.wicket.model.CompoundPropertyModel;
import org.apache.wicket.request.mapper.parameter.PageParameters;
import org.apache.wicket.spring.injection.annot.SpringBean;
import zw.co.hitrac.support.SupportPageParametersUtil;
import zw.co.hitrac.support.business.domain.Demo.MaritalStatus;
import zw.co.hitrac.support.business.service.MaritalStatusService;
import zw.co.hitrac.support.web.model.MaritalStatusModel;

/**
 *
 * @author tonderai ndangana 27/04/2016
 * 
 */
public class MaritalStatusEditPage extends WebPage {

    private MaritalStatusModel maritalStatusModel;

    @SpringBean
    private MaritalStatusService maritalStatusService;

    public MaritalStatusEditPage(PageParameters parameters) {
        super(parameters);
        createMaritalStatusModel(parameters);
        add(new FeedbackPanel("feedback"));

        Form<MaritalStatus> form = new Form<MaritalStatus>("form", new CompoundPropertyModel<MaritalStatus>(maritalStatusModel));;
        form.add(new RequiredTextField("statustype"));

        form.add(new org.apache.wicket.markup.html.form.Button("submit") {
            @Override
            public void onSubmit() {
                MaritalStatus maritalStatus = maritalStatusModel.getObject();
                maritalStatusService.save(maritalStatus);
                setResponsePage(MaritalStatusListPage.class);
            }
        });
        add(form);

    }

    private void createMaritalStatusModel(PageParameters parameters) {
        Long id = SupportPageParametersUtil.extractId(parameters);
        maritalStatusModel = new MaritalStatusModel(id);

    }

}
