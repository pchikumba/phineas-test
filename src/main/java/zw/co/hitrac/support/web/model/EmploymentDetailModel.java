package zw.co.hitrac.support.web.model;

import org.apache.wicket.injection.Injector;
import org.apache.wicket.model.LoadableDetachableModel;
import org.apache.wicket.spring.injection.annot.SpringBean;
import zw.co.hitrac.support.business.domain.Demo.EmploymentDetail;
import zw.co.hitrac.support.business.service.EmploymentDetailService;

/**
 *
 * @author tonderai ndangana 27/04/2016
 */
public class EmploymentDetailModel extends LoadableDetachableModel<EmploymentDetail> {

    private Long id;
    @SpringBean
    private EmploymentDetailService edservice;

    public EmploymentDetailModel(Long id) {
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


