/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zw.co.hitrac.support.web.model;

import org.apache.wicket.injection.Injector;
import org.apache.wicket.model.LoadableDetachableModel;
import org.apache.wicket.spring.injection.annot.SpringBean;
import zw.co.hitrac.support.business.domain.Ict.SocialNetworkBenefits;
import zw.co.hitrac.support.business.service.SocialNetworkBenefitsService;

/**
 *
 * @author hitrac
 */
public class SocialNetworkBenefitsModel extends LoadableDetachableModel<SocialNetworkBenefits> {

    private Long id;
    @SpringBean
    private SocialNetworkBenefitsService socialNetworkBenefitsService;
    
    public SocialNetworkBenefitsModel(Long id) {
        this.id = id;
        Injector.get().inject(id);
    }
    
    @Override
    protected SocialNetworkBenefits load() {
        if (id == null) {
            return new SocialNetworkBenefits();
            
        } else {
            return socialNetworkBenefitsService.find(id);
        }        
        
    }
    
}
