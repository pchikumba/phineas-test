/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zw.co.hitrac.support.web.model;

import java.util.Arrays;
import java.util.List;
import org.apache.wicket.model.LoadableDetachableModel;
import zw.co.hitrac.support.business.domain.Gender;

/**
 *
 * @author pchikumba
 */
public class GenderListModel extends LoadableDetachableModel<List<Gender>>{

    @Override
    protected List<Gender> load() {
        return Arrays.asList(Gender.values());
    }

    
}
