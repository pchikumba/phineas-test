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
import zw.co.hitrac.support.business.domain.Demo.Accommodation;
import zw.co.hitrac.support.business.service.AccommodationService;
import zw.co.hitrac.support.web.model.AccommodationModel;
import zw.co.hitrac.support.web.page.HomePage;
import zw.co.hitrac.support.web.page.TemplatePage;

/**
 *
 * @author pchikumba 27/04/2016
 *
 */
public class AccommodationEditPage extends TemplatePage {

    private AccommodationModel accommodationModel;

    @SpringBean
    private AccommodationService accommodationService;

    public AccommodationEditPage(PageParameters parameters) {
        super(parameters);
        createAccommodationModel(parameters);
        add(new FeedbackPanel("feedback"));
        add(new BookmarkablePageLink("back", HomePage.class));
        Form<Accommodation> form = new Form<Accommodation>("form", new CompoundPropertyModel<Accommodation>(accommodationModel));;
        form.add(new RequiredTextField("accommodationtype"));

        form.add(new org.apache.wicket.markup.html.form.Button("submit") {
            @Override
            public void onSubmit() {
                Accommodation accommodation = accommodationModel.getObject();
                accommodationService.save(accommodation);
                setResponsePage(AccommodationListPage.class);
            }
        });
        add(form);

    }

    private void createAccommodationModel(PageParameters parameters) {
        Long id = SupportPageParametersUtil.extractId(parameters);
        accommodationModel = new AccommodationModel(id);

    }

}
