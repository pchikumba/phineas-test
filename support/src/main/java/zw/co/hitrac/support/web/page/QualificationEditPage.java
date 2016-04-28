
package zw.co.hitrac.support.web.page;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.RequiredTextField;
import org.apache.wicket.markup.html.panel.FeedbackPanel;
import org.apache.wicket.model.CompoundPropertyModel;
import org.apache.wicket.request.mapper.parameter.PageParameters;
import org.apache.wicket.spring.injection.annot.SpringBean;
import zw.co.hitrac.support.SupportPageParametersUtil;
import zw.co.hitrac.support.business.domain.Qualification;
import zw.co.hitrac.support.business.domain.Religion;
import zw.co.hitrac.support.business.service.QualificationService;
import zw.co.hitrac.support.web.model.QualificationModel;

/**
 *
 * @author Tonderai ndangana
 * 28/04/2016
 */
public class QualificationEditPage extends WebPage {
    
    private QualificationModel qualificationmodel;
    
    @SpringBean
    private QualificationService quaService;
    
    public QualificationEditPage(PageParameters parameters){
      super(parameters);
        createQualificatioModel(parameters);
        add(new FeedbackPanel("feedback"));
        
         Form<Qualification> form = new Form<Qualification>("form", new CompoundPropertyModel<Qualification>(qualificationmodel));;
        form.add(new RequiredTextField("qualificationtype"));

        form.add(new org.apache.wicket.markup.html.form.Button("submit") {
            @Override
            public void onSubmit() {
                Qualification qualification = qualificationmodel.getObject();
                quaService.save(qualification);
                setResponsePage(QualificationListPage.class);
            }
        });
        add(form);

        
    }

    private void createQualificatioModel(PageParameters parameters) {
      Long id = SupportPageParametersUtil.extractId(parameters);
     qualificationmodel = new QualificationModel(id);
    }
    
}
