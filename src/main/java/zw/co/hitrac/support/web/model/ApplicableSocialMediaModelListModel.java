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
import zw.co.hitrac.support.business.domain.Ict.ApplicableSocialMedia;
import zw.co.hitrac.support.business.service.ApplicableSocialMediaService;

/**
 *
 * @author hitrac
 */
public class ApplicableSocialMediaModelListModel extends LoadableDetachableModel<List<ApplicableSocialMedia>> {

    @SpringBean
    private ApplicableSocialMediaService applicableSocialMediaService;

    public ApplicableSocialMediaModelListModel() {
        Injector.get().inject(this);

    }

    @Override
    protected List<ApplicableSocialMedia> load() {

        return applicableSocialMediaService.findAll();
    }

}
