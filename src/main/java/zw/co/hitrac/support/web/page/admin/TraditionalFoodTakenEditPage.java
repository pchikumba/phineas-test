/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zw.co.hitrac.support.web.page.admin;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.RequiredTextField;
import org.apache.wicket.markup.html.link.BookmarkablePageLink;
import org.apache.wicket.markup.html.panel.FeedbackPanel;
import org.apache.wicket.model.CompoundPropertyModel;
import org.apache.wicket.request.mapper.parameter.PageParameters;
import org.apache.wicket.spring.injection.annot.SpringBean;
import zw.co.hitrac.support.SupportPageParametersUtil;
import zw.co.hitrac.support.business.domain.Nutrition.TraditionalFoodTaken;
import zw.co.hitrac.support.business.service.TraditionalFoodTakenService;
import zw.co.hitrac.support.web.model.TraditionalFoodTakenModel;

/**
 *
 * @author pchikumba
 */
public class TraditionalFoodTakenEditPage extends WebPage{
  
    private TraditionalFoodTakenModel traditionalFoodTakenModel;

    @SpringBean
    private TraditionalFoodTakenService traditionalFoodTakenService;

    public TraditionalFoodTakenEditPage(PageParameters parameters) {
        super(parameters);
        createTraditionalDishModel(parameters);
        add(new FeedbackPanel("feedback"));
       add(new BookmarkablePageLink("back", TraditionalFoodTakenListPage.class));

        Form<TraditionalFoodTaken> form = new Form<TraditionalFoodTaken>("form", new CompoundPropertyModel<TraditionalFoodTaken>(traditionalFoodTakenModel));;
        form.add(new RequiredTextField("tdFood"));
//        form.add(new CheckBox("retired"));

        form.add(new org.apache.wicket.markup.html.form.Button("submit") {
            @Override
            public void onSubmit() {
                TraditionalFoodTaken traditionalFoodTaken = traditionalFoodTakenModel.getObject();
                traditionalFoodTakenService.save(traditionalFoodTaken);
                setResponsePage(TraditionalFoodTakenListPage.class);
            }
        });
        add(form);

    }

    private void createTraditionalDishModel(PageParameters parameters) {
        Long id = SupportPageParametersUtil.extractId(parameters);
        traditionalFoodTakenModel = new TraditionalFoodTakenModel(id);

    }

}


