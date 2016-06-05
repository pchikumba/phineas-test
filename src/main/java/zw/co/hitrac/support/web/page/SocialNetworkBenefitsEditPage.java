/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zw.co.hitrac.support.web.page;

import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.RequiredTextField;
import org.apache.wicket.markup.html.panel.FeedbackPanel;
import org.apache.wicket.model.CompoundPropertyModel;
import org.apache.wicket.request.mapper.parameter.PageParameters;
import org.apache.wicket.spring.injection.annot.SpringBean;
import zw.co.hitrac.support.SupportPageParametersUtil;
import zw.co.hitrac.support.business.domain.Ict.SocialNetworkBenefits;
import zw.co.hitrac.support.business.service.SocialNetworkBenefitsService;
import zw.co.hitrac.support.web.model.SocialNetworkBenefitsModel;

/**
 *
 * @author hitrac
 */
public class SocialNetworkBenefitsEditPage extends TemplatePage {

    private SocialNetworkBenefitsModel socialNetworkBenefitsModel;

    @SpringBean
    private SocialNetworkBenefitsService socialNetworkBenefitsService;

    public SocialNetworkBenefitsEditPage(PageParameters parameters) {
        super(parameters);
        createModel(parameters);
        add(new FeedbackPanel("feedback"));

        Form<SocialNetworkBenefits> form = new Form<SocialNetworkBenefits>("form", new CompoundPropertyModel<SocialNetworkBenefits>(socialNetworkBenefitsModel));
        form.add(new RequiredTextField("socialBenefits"));
        form.add(new org.apache.wicket.markup.html.form.Button("submit") {

            @Override
            public void onSubmit() {
                SocialNetworkBenefits socialNetworkBenefits = socialNetworkBenefitsModel.getObject();
                socialNetworkBenefitsService.save(socialNetworkBenefits);
                setResponsePage(SocialNetworkBenefitsListPage.class);

            }

        });

        add(form);

    }

    private void createModel(PageParameters parameters) {
        Long id = SupportPageParametersUtil.extractId(parameters);
        socialNetworkBenefitsModel = new SocialNetworkBenefitsModel(id);
    }

}
