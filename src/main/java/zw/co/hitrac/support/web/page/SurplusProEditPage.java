/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zw.co.hitrac.support.web.page;

import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.RequiredTextField;
import org.apache.wicket.markup.html.link.BookmarkablePageLink;
import org.apache.wicket.markup.html.panel.FeedbackPanel;
import org.apache.wicket.model.CompoundPropertyModel;
import org.apache.wicket.request.mapper.parameter.PageParameters;
import org.apache.wicket.spring.injection.annot.SpringBean;
import zw.co.hitrac.support.SupportPageParametersUtil;
import zw.co.hitrac.support.business.domain.Agric.SurplusPro;
import zw.co.hitrac.support.business.service.SurplusProService;
import zw.co.hitrac.support.web.model.SurplusProModel;
import zw.co.hitrac.support.web.page.admin.StaticDataPage;

/**
 *
 * @author gerald matsika
 */
public class SurplusProEditPage extends TemplatePage {

    private SurplusProModel surplusproModel;

    @SpringBean
    private SurplusProService surplusproService;

    public SurplusProEditPage(PageParameters parameters) {
        super(parameters);
        createSurplusProModel(parameters);
        add(new FeedbackPanel("feedback"));
        add(new BookmarkablePageLink("back", StaticDataPage.class));

        Form<SurplusPro> form = new Form<SurplusPro>("form", new CompoundPropertyModel<SurplusPro>(surplusproModel));;
        form.add(new RequiredTextField("purpose"));

        form.add(new org.apache.wicket.markup.html.form.Button("submit") {
            @Override
            public void onSubmit() {
                SurplusPro surpluspro = surplusproModel.getObject();
                surplusproService.save(surpluspro);
                setResponsePage(SurplusProListPage.class);
            }
        });
        add(form);

    }

    private void createSurplusProModel(PageParameters parameters) {
        Long id = SupportPageParametersUtil.extractId(parameters);
        surplusproModel = new SurplusProModel(id);

    }

}
