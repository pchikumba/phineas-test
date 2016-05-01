/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zw.co.hitrac.support.web.page;

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
import zw.co.hitrac.support.business.domain.Pysch.PyschSupport;
import zw.co.hitrac.support.business.service.PyschSupportService;
import zw.co.hitrac.support.web.model.PyschSupportModel;

/**
 *
 * @author tonderai ndaNGANA
 * 30/04.2016
 */
public class PyschSupportEditPage extends WebPage {
    
    
    private PyschSupportModel pyschModel;
    
    @SpringBean
    private PyschSupportService pyschSupportService;

    public PyschSupportEditPage(PageParameters parameters) {
        super(parameters);
        createPyschModel(parameters);
        add(new FeedbackPanel("feedback"));
        add(new BookmarkablePageLink("back", PyschSupportListPage.class));
        
        Form<PyschSupport> form = new Form<PyschSupport>("form",new CompoundPropertyModel<PyschSupport>(pyschModel));
        form.add(new RequiredTextField("trainingPsg"));
        form.add(new RequiredTextField("projectdone"));
        form.add(new RequiredTextField("supnetjoined"));
        form.add(new CheckBox("znnnpaffil"));
        form.add(new CheckBox("socialmedia"));
        form.add(new CheckBox("internetacces"));
        form.add(new RequiredTextField("mobileOs"));                                                                                                                                                                                                                                                                                        
        
        form.add(new org.apache.wicket.markup.html.form.Button("submit"){
        
         @Override
        public void onSubmit(){
        PyschSupport pyschSupport = pyschModel.getObject();
        pyschSupportService.save(pyschSupport);
        }});
        add(form);
        
    }

    private void createPyschModel(PageParameters parameters) {
       Long id = SupportPageParametersUtil.extractId(parameters);
       pyschModel = new PyschSupportModel(id);
       
    }
    
    
    
}
