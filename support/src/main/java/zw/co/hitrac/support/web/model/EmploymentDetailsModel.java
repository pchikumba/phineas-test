package zw.co.hitrac.support.web.model;

import org.apache.wicket.injection.Injector;
import org.apache.wicket.model.LoadableDetachableModel;
import org.apache.wicket.spring.injection.annot.SpringBean;
import zw.co.hitrac.support.business.domain.EmploymentDetail;
import zw.co.hitrac.support.business.service.EmploymentDetailsService;

/**
 *
 * @author tonderai ndangana 27/04/2016
 */
public class EmploymentDetailsModel extends LoadableDetachableModel<EmploymentDetail> {

    private Long id;
    @SpringBean
    private EmploymentDetailsService edservice;

    public EmploymentDetailsModel(Long id) {
        this.id = id;
        Injector.get().inject(this);
    }

    @Override
    protected EmploymentDetail load() {
        if (id == null) {
            return new EmploymentDetail();
        }
            else {
                return edservice.find(id);}

        }

    }


