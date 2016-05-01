/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zw.co.hitrac.support.web.model;

import org.apache.wicket.model.LoadableDetachableModel;
import org.apache.wicket.spring.injection.annot.SpringBean;
import zw.co.hitrac.support.business.domain.HealthInformation.HerbPrescriber;
import zw.co.hitrac.support.business.service.HerbPrescriberService;

/**
 *
 * @author hitrac
 */
public class HerbPrescriberModel extends LoadableDetachableModel<HerbPrescriber>{
    
    @SpringBean
    private HerbPrescriberService hpservice;
    
    

    @Override
    protected HerbPrescriber load() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
