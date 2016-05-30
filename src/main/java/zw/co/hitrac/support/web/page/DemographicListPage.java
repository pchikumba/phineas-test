package zw.co.hitrac.support.web.page;

import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.markup.html.link.BookmarkablePageLink;
import org.apache.wicket.markup.html.list.ListItem;
import org.apache.wicket.markup.html.list.PropertyListView;
import org.apache.wicket.model.CompoundPropertyModel;
import org.apache.wicket.request.mapper.parameter.PageParameters;
import org.apache.wicket.util.string.StringValue;
import org.apache.wicket.util.string.Strings;
import zw.co.hitrac.support.SupportPageParametersUtil;
import zw.co.hitrac.support.business.domain.Demo.Demographic;
import zw.co.hitrac.support.web.conf.GeneralSearch;
import zw.co.hitrac.support.web.model.DemographicListModel;
import zw.co.hitrac.support.web.model.GeneralSearchModel;

/**
 *
 * @author pchikumba
 */
public class DemographicListPage extends TemplatePage {
    
    private DemographicListModel demographicListModel;

    public DemographicListPage(PageParameters parameters) {
        super(parameters);
        createDemographicListModel(parameters);
        add(createSearchForm());

        add(new BookmarkablePageLink("back", HomePage.class));
        add(new BookmarkablePageLink("new", DemographicEditPage.class));
        add(new PropertyListView<Demographic>("demographic", new DemographicListModel()) {
        
            @Override
            protected void populateItem(ListItem<Demographic> item) {
                item.add(new Label("name"));
                item.add(new Label("surname"));
//                item.add(new Label("dob"));
                item.add(new Label("gender"));
                 
//                item.add(new Label("maritalstatus.statustype"));
//                item.add(new Label("qualification.qualificationtype"));
//                item.add(new Label("religion.religiontype"));
//                item.add(new Label("residentialaddress"));
//                item.add(new Label("accommodation.accommodationtype"));
//                item.add(new Label("income.incomelevel"));
//                item.add(new Label("occupation"));

                PageParameters pageParameters = new PageParameters();
                pageParameters.add(SupportPageParametersUtil.ID, item.getModelObject().getId());
                item.add(new BookmarkablePageLink("edit", DemographicEditPage.class, pageParameters));
            }

        });

    }
    
    
     private DemographicListModel createDemographicListModel(PageParameters parameters) {
        int page = 1;
        StringValue pageValue = parameters.get(SupportPageParametersUtil.PAGE);
        if (pageValue != null) {
            try {
                page = Integer.valueOf(pageValue.toString());
            } catch (NumberFormatException ex) {
                page = 1;
            }
        }

        demographicListModel = new DemographicListModel(page, parameters.get(SupportPageParametersUtil.SEARCH).toString());
        return demographicListModel;
    }

    private Form<GeneralSearch> createSearchForm() {

        GeneralSearchModel generalSearchModel = new GeneralSearchModel();
        generalSearchModel.getObject().setSearchInput( demographicListModel.getSearchQuery());
        Form<GeneralSearch> searchForm = new Form<GeneralSearch>("searchForm", new CompoundPropertyModel<GeneralSearch>(generalSearchModel)) {
            @Override
            protected void onSubmit() {
                GeneralSearch generalSearch = getModelObject();
                PageParameters pageParameters = new PageParameters();
                pageParameters.add(SupportPageParametersUtil.PAGE, 1);
                String searchInput = generalSearch.getSearchInput();
                if (!Strings.isEmpty(searchInput)) {
                    pageParameters.add(SupportPageParametersUtil.SEARCH, generalSearch.getSearchInput());
                }
                setResponsePage(DemographicListPage.class, pageParameters);
            }
        };
        searchForm.add(createSearchInputField());
        return searchForm;

    }

    private TextField<String> createSearchInputField() {
        TextField<String> searchInputField = new TextField<String>("searchInput");
        return searchInputField;
    }


}
