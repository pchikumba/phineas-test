/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zw.co.hitrac.support.web.model;

import java.util.List;
import org.apache.wicket.injection.Injector;
import org.apache.wicket.model.LoadableDetachableModel;
import org.apache.wicket.spring.injection.annot.SpringBean;
import zw.co.hitrac.support.business.domain.Demo.EmploymentDetail;
import zw.co.hitrac.support.business.service.EmploymentDetailService;

/**
 *
 * @author tonderai ndangana
 * created on 28/04/2016
 */
public class EmploymentDetailListModel extends LoadableDetachableModel<List<EmploymentDetail>> {
    
     @SpringBean
     private EmploymentDetailService edservice;

    public EmploymentDetailListModel() {
       Injector.get().inject(this);
    }
     
     
      
    @Override
   protected List<EmploymentDetail> load(){
       return edservice.findAll();
  
   } 
}
    


