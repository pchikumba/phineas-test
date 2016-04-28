/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zw.co.hitrac.support.web.model;

import org.apache.wicket.injection.Injector;
import org.apache.wicket.model.LoadableDetachableModel;
import org.apache.wicket.spring.injection.annot.SpringBean;
import zw.co.hitrac.support.business.domain.Accommodation;
import zw.co.hitrac.support.business.service.AccommodationService;

/**
 *
 * @author pchikumba
 */
public class AccommodationModel extends LoadableDetachableModel<Accommodation> {

    private Long id;
    @SpringBean
    private AccommodationService accommodationService;

    public AccommodationModel(Long id) {
        this.id = id;
        Injector.get().inject(this);
    }

    @Override
    protected Accommodation load() {

        if (id == null) {
            return new Accommodation();
        } else {
            return accommodationService.find(id);

        }

    }
}
