
package zw.co.hitrac.support.web.page.admin;

import java.util.Arrays;
import java.util.List;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.form.CheckBoxMultipleChoice;
import org.apache.wicket.markup.html.form.ChoiceRenderer;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.RequiredTextField;
import org.apache.wicket.markup.html.link.BookmarkablePageLink;
import org.apache.wicket.markup.html.panel.FeedbackPanel;
import org.apache.wicket.model.CompoundPropertyModel;
import org.apache.wicket.request.mapper.parameter.PageParameters;
import org.apache.wicket.spring.injection.annot.SpringBean;
import zw.co.hitrac.support.SupportPageParametersUtil;
import zw.co.hitrac.support.business.domain.Demo.Religion;
import zw.co.hitrac.support.business.domain.Role;
import zw.co.hitrac.support.business.domain.User;
import zw.co.hitrac.support.business.service.UserService;
import zw.co.hitrac.support.web.model.UserModel;
import zw.co.hitrac.support.web.page.HomePage;
import zw.co.hitrac.support.web.page.TemplatePage;

/**
 *
 * @author tonderai ndangana
 * 03/05/2016
 */
public class UserEditPage extends TemplatePage{
    
    
    private UserModel userModel;
    
    @SpringBean
    private UserService userService;

    public UserEditPage(PageParameters parameters) {
        super(parameters);
        createUserModel(parameters);
        add(new FeedbackPanel("feedback"));
        add(new BookmarkablePageLink("back", HomePage.class));
        Form<User> form = new Form<User>("form", new CompoundPropertyModel<User>(userModel));;
        
        form.add(new RequiredTextField("firstname"));
        form.add(new RequiredTextField("lastname"));
        form.add(new RequiredTextField("username"));
        form.add(new RequiredTextField("password"));
        form.add(roleCheckBox());
        
        form.add(new org.apache.wicket.markup.html.form.Button("submit") {
            @Override
            public void onSubmit() {
                User user = userModel.getObject();
                userService.save(user);
                setResponsePage(UserListPage.class);
            }
        });
        add(form);
        
    }

     private CheckBoxMultipleChoice<Role> roleCheckBox() {
        List<Role> roleList = Arrays.asList(Role.values());
        ChoiceRenderer<Role> choiceRenderer = new ChoiceRenderer<Role>("roleName");
        CheckBoxMultipleChoice<Role> roleChoice = new CheckBoxMultipleChoice("roles",
                roleList, choiceRenderer);

        return roleChoice;
     }
        
    private void createUserModel(PageParameters parameters) {
        Long id = SupportPageParametersUtil.extractId(parameters);
        userModel = new UserModel(id);
    }
    
    
    
}
