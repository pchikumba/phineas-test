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
import zw.co.hitrac.support.business.domain.Nutrition.TraditionalFood;
import zw.co.hitrac.support.business.service.TraditionalFoodService;
import zw.co.hitrac.support.web.model.TraditionalFoodModel;

/**
 *
 * @author pchikumba
 */
public class TraditionalFoodEditPage extends WebPage {

    private TraditionalFoodModel traditionalFoodModel;

    @SpringBean
    private TraditionalFoodService traditionalFoodService;

    public TraditionalFoodEditPage(PageParameters parameters) {
        super(parameters);
        createTraditionalFoodModel(parameters);
        add(new FeedbackPanel("feedback"));
        add(new BookmarkablePageLink("back", TraditionalFoodListPage.class));

        Form<TraditionalFood> form = new Form<TraditionalFood>("form", new CompoundPropertyModel<TraditionalFood>(traditionalFoodModel));;
        form.add(new RequiredTextField("dishtype"));
//        form.add(new CheckBox("retired"));

        form.add(new org.apache.wicket.markup.html.form.Button("submit") {
            @Override
            public void onSubmit() {
                TraditionalFood traditionalFood = traditionalFoodModel.getObject();
                traditionalFoodService.save(traditionalFood);
                setResponsePage(TraditionalFoodListPage.class);
            }
        });
        add(form);

    }

    private void createTraditionalFoodModel(PageParameters parameters) {
        Long id = SupportPageParametersUtil.extractId(parameters);
        traditionalFoodModel = new TraditionalFoodModel(id);

    }

}
