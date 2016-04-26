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
import zw.co.hitrac.support.business.domain.Religion;

/**
 *
 * @author pchikumba
 */
public class ReligionListModel extends LoadableDetachableModel<List<Religion>>{

    @Override
    protected List<Religion> load() {
        return Arrays.asList(Religion.values());
    }

    
}
