/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zw.co.hitrac.support.web.page;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.form.CheckBox;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.RequiredTextField;
import org.apache.wicket.markup.html.link.BookmarkablePageLink;
import org.apache.wicket.markup.html.panel.FeedbackPanel;
import org.apache.wicket.model.CompoundPropertyModel;
import org.apache.wicket.request.mapper.parameter.PageParameters;
import org.apache.wicket.spring.injection.annot.SpringBean;
import zw.co.hitrac.support.SupportPageParametersUtil;
import zw.co.hitrac.support.business.domain.Agric.Purpose;
import zw.co.hitrac.support.business.service.PurposeService;
import zw.co.hitrac.support.web.model.PurposeModel;

/**
 *
 * @author gerald matsika
 * 02/05/16
 */
public class PurposeEditPage extends WebPage{
    

    private PurposeModel purposeModel;

    @SpringBean
    private  PurposeService purposeService;

    public PurposeEditPage(PageParameters parameters) {
        super(parameters);
        createPurposeModel(parameters);
        add(new FeedbackPanel("feedback"));
       add(new BookmarkablePageLink("back", PurposeListPage.class));

        Form<Purpose> form = new Form<Purpose>("form", new CompoundPropertyModel<Purpose>(purposeModel));;
        form.add(new RequiredTextField("sp"));

        form.add(new org.apache.wicket.markup.html.form.Button("submit") {
            @Override
            public void onSubmit() {
                Purpose purpose = purposeModel.getObject();
                purposeService.save(purpose);
                setResponsePage(PurposeListPage.class);
            }
        });
        add(form);

    }

    private void createPurposeModel(PageParameters parameters) {
        Long id = SupportPageParametersUtil.extractId(parameters);
        purposeModel = new PurposeModel(id);

    }

}

