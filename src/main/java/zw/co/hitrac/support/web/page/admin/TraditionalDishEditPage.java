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
import zw.co.hitrac.support.SupportPageParametersUtil;
import zw.co.hitrac.support.business.domain.Nutrition.TraditionalDish;
import zw.co.hitrac.support.business.service.TraditionalDishService;
import zw.co.hitrac.support.web.model.TraditionalDishModel;

/**
 *
 * @author pchikumba
 */
public class TraditionalDishEditPage extends WebPage{
  
    private TraditionalDishModel traditionalDishModel;

    @SpringBean
    private TraditionalDishService traditionalDishService;

    public TraditionalDishEditPage(PageParameters parameters) {
        super(parameters);
        createTraditionalDishModel(parameters);
        add(new FeedbackPanel("feedback"));
       add(new BookmarkablePageLink("back", TraditionalDishListPage.class));

        Form<TraditionalDish> form = new Form<TraditionalDish>("form", new CompoundPropertyModel<TraditionalDish>(traditionalDishModel));;
        form.add(new RequiredTextField("dishtype"));
//        form.add(new CheckBox("retired"));

        form.add(new org.apache.wicket.markup.html.form.Button("submit") {
            @Override
            public void onSubmit() {
                TraditionalDish traditionalDish = traditionalDishModel.getObject();
                traditionalDishService.save(traditionalDish);
                setResponsePage(TraditionalDishListPage.class);
            }
        });
        add(form);

    }

    private void createTraditionalDishModel(PageParameters parameters) {
        Long id = SupportPageParametersUtil.extractId(parameters);
        traditionalDishModel = new TraditionalDishModel(id);

    }

}


