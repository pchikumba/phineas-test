
package zw.co.hitrac.support.web.page;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.link.BookmarkablePageLink;
import org.apache.wicket.request.mapper.parameter.PageParameters;
import zw.co.hitrac.support.web.page.admin.PrincipalInvestigatorDashBoardPage;
import zw.co.hitrac.support.web.page.admin.UserListPage;



/**
 *
 * @author pchikumba
 */
public class HomePage extends TemplatePage{
    
//     private DemographicListModel demographicListModel;
    public HomePage(PageParameters parameters){
        super(parameters);
//         add(createSearchForm());
       // add(new BookmarkablePageLink("admin",PrincipalInvestigatorDashBoardPage.class));
       // add(new BookmarkablePageLink("user",UserListPage.class));
//        add(new BookmarkablePageLink("demographic",DemographicListPage.class));
//       add(new BookmarkablePageLink("agricactivity", AgricActivityListPage.class));
//        add(new BookmarkablePageLink("nutrition", NutritionListPage.class));
//        add(new BookmarkablePageLink("ps", PyschSupportListPage.class));
//             
        
      
              
    }

//    private Form<GeneralSearch> createSearchForm() {
//
//        GeneralSearchModel generalSearchModel = new GeneralSearchModel();
//        generalSearchModel.getObject().setSearchInput( demographicListModel.getSearchQuery());
//        Form<GeneralSearch> searchForm = new Form<GeneralSearch>("searchForm", new CompoundPropertyModel<GeneralSearch>(generalSearchModel)) {
//            @Override
//            protected void onSubmit() {
//                GeneralSearch generalSearch = getModelObject();
//                PageParameters pageParameters = new PageParameters();
//                pageParameters.add(SupportPageParametersUtil.PAGE, 1);
//                String searchInput = generalSearch.getSearchInput();
//                if (!Strings.isEmpty(searchInput)) {
//                    pageParameters.add(SupportPageParametersUtil.SEARCH, generalSearch.getSearchInput());
//                }
//                setResponsePage(DemographicListPage.class, pageParameters);
//            }
//        };
//        searchForm.add(createSearchInputField());
//        return searchForm;
//
//    }
//
//    private TextField<String> createSearchInputField() {
//        TextField<String> searchInputField = new TextField<String>("searchInput");
//        return searchInputField;
//    }
}
