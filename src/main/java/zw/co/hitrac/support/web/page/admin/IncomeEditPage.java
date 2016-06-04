package zw.co.hitrac.support.web.page.admin;

import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.RequiredTextField;
import org.apache.wicket.markup.html.link.BookmarkablePageLink;
import org.apache.wicket.markup.html.panel.FeedbackPanel;
import org.apache.wicket.model.CompoundPropertyModel;
import org.apache.wicket.request.mapper.parameter.PageParameters;
import org.apache.wicket.spring.injection.annot.SpringBean;
import zw.co.hitrac.support.SupportPageParametersUtil;
import zw.co.hitrac.support.business.domain.Demo.Income;
import zw.co.hitrac.support.business.service.IncomeService;
import zw.co.hitrac.support.web.model.IncomeModel;
import zw.co.hitrac.support.web.page.TemplatePage;

/**
 *
 * @author tonderai ndangana created on 30/04/2016
 */
public class IncomeEditPage extends TemplatePage {

    private IncomeModel incomeModel;

    @SpringBean
    private IncomeService incomeservice;

    public IncomeEditPage(PageParameters parameters) {
        super(parameters);
        createIncomeModel(parameters);

        add(new FeedbackPanel("feedback"));
        add(new BookmarkablePageLink("back", StaticDataPage.class));

        Form<Income> form = new Form<Income>("form", new CompoundPropertyModel<Income>(incomeModel));;
        form.add(new RequiredTextField("incomelevel"));

        form.add(new org.apache.wicket.markup.html.form.Button("submit") {
            @Override
            public void onSubmit() {
                Income income = incomeModel.getObject();
                incomeservice.save(income);
                setResponsePage(IncomeListPage.class);
            }
        });
        add(form);
    }

    private void createIncomeModel(PageParameters parameters) {
        Long id = SupportPageParametersUtil.extractId(parameters);
        incomeModel = new IncomeModel(id);
    }

}
