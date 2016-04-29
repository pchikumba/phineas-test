
package zw.co.hitrac.support.web.page;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.RequiredTextField;
import org.apache.wicket.markup.html.link.BookmarkablePageLink;
import org.apache.wicket.markup.html.panel.FeedbackPanel;
import org.apache.wicket.model.CompoundPropertyModel;
import org.apache.wicket.request.mapper.parameter.PageParameters;
import org.apache.wicket.spring.injection.annot.SpringBean;
import zw.co.hitrac.support.SupportPageParametersUtil;
import zw.co.hitrac.support.business.domain.Demo.EmploymentDetail;
import zw.co.hitrac.support.business.service.EmploymentDetailService;
import zw.co.hitrac.support.web.model.EmploymentDetailModel;

/**
 *
 * @author tonderai ndangana
 * created on 28/04/2016
 */
public class EmploymentDetailEditPage extends WebPage{
    
    private EmploymentDetailModel edModel;
    
    @SpringBean
    EmploymentDetailService edservice;
    
    public  EmploymentDetailEditPage(PageParameters parameters){
    super(parameters);
        createEmploymentDetailModel(parameters);
        add(new FeedbackPanel("feedback"));
        add(new BookmarkablePageLink("back", HomePage.class));
         Form<EmploymentDetail> form = new Form<EmploymentDetail>("form", new CompoundPropertyModel<EmploymentDetail>(edModel));;
        form.add(new RequiredTextField("firstname"));
        form.add(new RequiredTextField("lastname"));
        form.add(new RequiredTextField("ms"));
         form.add(new RequiredTextField("national_id"));
          form.add(new RequiredTextField("dob"));
           form.add(new RequiredTextField("address"));
             form.add(new RequiredTextField("email"));
               form.add(new RequiredTextField("phonenumber"));
           
        
        
        form.add(new org.apache.wicket.markup.html.form.Button("submit") {
            @Override
            public void onSubmit() {
                EmploymentDetail employmentDetail =  edModel.getObject();
                edservice.save(employmentDetail);
                setResponsePage(EmploymentDetailListPage.class);
            }
        });
        add(form);
        
    
    }

    private void createEmploymentDetailModel(PageParameters parameters) {
        Long id = SupportPageParametersUtil.extractId(parameters);
        edModel = new EmploymentDetailModel(id);
    }
    
    
    
    
}
