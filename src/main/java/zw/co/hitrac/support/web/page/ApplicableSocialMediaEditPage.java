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
import zw.co.hitrac.support.business.domain.Ict.ApplicableSocialMedia;
import zw.co.hitrac.support.business.service.ApplicableSocialMediaService;
import zw.co.hitrac.support.web.model.ApplicableSocialMediaModel;

/**
 *
 * @author hitrac
 */
public class ApplicableSocialMediaEditPage extends TemplatePage {

    private ApplicableSocialMediaModel applicableSocialMediaModel;
    @SpringBean
    private ApplicableSocialMediaService applicableSocialMediaService;

    public ApplicableSocialMediaEditPage(PageParameters parameters) {
        super(parameters);
        add(new FeedbackPanel("feedback"));

        Form<ApplicableSocialMedia> form = new Form<ApplicableSocialMedia>("form", new CompoundPropertyModel<ApplicableSocialMedia>(applicableSocialMediaModel));

        form.add(new RequiredTextField("socialMediaType"));

        form.add(new org.apache.wicket.markup.html.form.Button("submit") {

            @Override
            public void onSubmit() {
                ApplicableSocialMedia applicableSocialMedia = applicableSocialMediaModel.getObject();
                applicableSocialMediaService.save(applicableSocialMedia);
                setResponsePage(ApplicableSocialMediaListPage.class);
            }
        });
        add(form);

    }

}
