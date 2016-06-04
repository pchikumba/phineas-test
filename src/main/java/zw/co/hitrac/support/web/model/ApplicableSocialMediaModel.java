package zw.co.hitrac.support.web.model;

import org.apache.wicket.injection.Injector;
import org.apache.wicket.model.LoadableDetachableModel;
import org.apache.wicket.spring.injection.annot.SpringBean;
import zw.co.hitrac.support.business.domain.Ict.ApplicableSocialMedia;
import zw.co.hitrac.support.business.service.ApplicableSocialMediaService;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author hitrac
 */
public class ApplicableSocialMediaModel extends LoadableDetachableModel<ApplicableSocialMedia> {

    private Long id;
    @SpringBean
    private ApplicableSocialMediaService applicableSocialMediaService;

    public ApplicableSocialMediaModel(Long id) {
        this.id = id;
        Injector.get().inject(id);
    }

    @Override
    protected ApplicableSocialMedia load() {
        if (id == null) {

            return new ApplicableSocialMedia();
        } else {

            return applicableSocialMediaService.find(id);

        }
    }

}
