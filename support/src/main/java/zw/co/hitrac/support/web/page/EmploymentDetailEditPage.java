
package zw.co.hitrac.support.web.page;

import java.util.Date;
import org.apache.wicket.datetime.PatternDateConverter;
import org.apache.wicket.datetime.markup.html.form.DateTextField;
import org.apache.wicket.extensions.yui.calendar.DatePicker;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.form.ChoiceRenderer;
import org.apache.wicket.markup.html.form.DropDownChoice;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.RequiredTextField;
import org.apache.wicket.markup.html.link.BookmarkablePageLink;
import org.apache.wicket.markup.html.panel.FeedbackPanel;
import org.apache.wicket.model.CompoundPropertyModel;
import org.apache.wicket.model.PropertyModel;
import org.apache.wicket.request.mapper.parameter.PageParameters;
import org.apache.wicket.spring.injection.annot.SpringBean;
import zw.co.hitrac.support.SupportPageParametersUtil;
import zw.co.hitrac.support.business.domain.Demo.EmploymentDetail;
import zw.co.hitrac.support.business.domain.Demo.Gender;
import zw.co.hitrac.support.business.domain.Demo.MaritalStatus;
import zw.co.hitrac.support.business.service.EmploymentDetailService;
import zw.co.hitrac.support.web.model.EmploymentDetailModel;
import zw.co.hitrac.support.web.model.GenderListModel;
import zw.co.hitrac.support.web.model.MaritalStatusListModel;
import zw.co.hitrac.support.web.model.MaritalStatusModel;

/**
 *
 * @author tonderai ndangana
 * created on 28/04/2016
 */
public class EmploymentDetailEditPage extends WebPage{
    
    private EmploymentDetailModel edModel;
    
    @SpringBean
    EmploymentDetailService edservice;
    private Date dob;
    
    public  EmploymentDetailEditPage(PageParameters parameters){
    super(parameters);
    this.dob = new Date();
        final PropertyModel<Date> dobModel = new PropertyModel<Date>(this, "dob");
        createEmploymentDetailModel(parameters);
        add(new FeedbackPanel("feedback"));
        add(new BookmarkablePageLink("back", HomePage.class));
        
        
        
        
         Form<EmploymentDetail> form = new Form<EmploymentDetail>("form", new CompoundPropertyModel<EmploymentDetail>(edModel));;
         GenderListModel gModel = new GenderListModel();
  ChoiceRenderer<Gender> gchoice = new ChoiceRenderer<Gender>("gendertype","id");
         
        MaritalStatusListModel mslModel = new MaritalStatusListModel();
        ChoiceRenderer<MaritalStatus> msChoicerenderer = new ChoiceRenderer<MaritalStatus>("statustype","id");
         
        form.add(new DropDownChoice("gender",gModel,gchoice));
         form.add(new DropDownChoice("maritalstatus",mslModel, msChoicerenderer));
        
        form.add(new RequiredTextField("firstname"));
        form.add(new RequiredTextField("lastname"));             
       form.add(new RequiredTextField("national_id"));
           form.add(new DateTextField("dob", dobModel, new PatternDateConverter("dd/MM/yy", true)).add(new DatePicker()));
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
