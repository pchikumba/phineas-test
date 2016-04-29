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
import zw.co.hitrac.support.business.domain.Demo.Accommodation;
import zw.co.hitrac.support.business.service.AccommodationService;

/**
 *
 * @author pchikumba
 */
public class AccommodationListModel extends LoadableDetachableModel<List<Accommodation>> {

    @SpringBean
    private AccommodationService accommodationService;

    public AccommodationListModel() {
        Injector.get().inject(this);

    }

    @Override
    protected List<Accommodation> load() {
        return accommodationService.findAll();
    }

}
