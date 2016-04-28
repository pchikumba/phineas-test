package zw.co.hitrac.support.web.page;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.RequiredTextField;
import org.apache.wicket.markup.html.panel.FeedbackPanel;
import org.apache.wicket.model.CompoundPropertyModel;
import org.apache.wicket.request.mapper.parameter.PageParameters;
import org.apache.wicket.spring.injection.annot.SpringBean;
import zw.co.hitrac.support.SupportPageParametersUtil;
import zw.co.hitrac.support.business.domain.Demo.Gender;
import zw.co.hitrac.support.business.service.GenderService;
import zw.co.hitrac.support.web.model.GenderModel;


/**
 *
 * @author pchikumba 27/04/2016
 * 
 */
public class GenderEditPage extends WebPage {

    private GenderModel genderModel;

    @SpringBean
    private GenderService genderService;

    public GenderEditPage(PageParameters parameters) {
        super(parameters);
        createGenderModel(parameters);
        add(new FeedbackPanel("feedback"));

        Form<Gender> form = new Form<Gender>("form", new CompoundPropertyModel<Gender>(genderModel));;
        form.add(new RequiredTextField("gendertype"));

        form.add(new org.apache.wicket.markup.html.form.Button("submit") {
            @Override
            public void onSubmit() {
                Gender gender = genderModel.getObject();
                genderService.save(gender);
                setResponsePage(GenderListPage.class);
            }
        });
        add(form);

    }

    private void createGenderModel(PageParameters parameters) {
        Long id = SupportPageParametersUtil.extractId(parameters);
        genderModel = new GenderModel(id);

    }

}
