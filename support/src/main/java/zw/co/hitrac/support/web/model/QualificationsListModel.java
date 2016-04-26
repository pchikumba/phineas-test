/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zw.co.hitrac.support.web.model;

import zw.co.hitrac.support.web.model.*;
import java.util.Arrays;
import java.util.List;
import org.apache.wicket.model.LoadableDetachableModel;
import zw.co.hitrac.support.business.domain.Qualifications;

/**
 *
 * @author pchikumba 25/04/2016
 */
public class QualificationsListModel extends LoadableDetachableModel<List<Qualifications>>{

    @Override
    protected List<Qualifications> load() {
        return Arrays.asList(Qualifications.values());
    }

    
}
